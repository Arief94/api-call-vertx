package org.example;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.client.HttpResponse;
import io.vertx.ext.web.client.WebClient;

public class MainVerticle extends AbstractVerticle {

	private WebClient client;

	@Override
	public void start(Promise<Void> promise) {
		startHttpServer().setHandler(promise);
	}

	private Future<Void> startHttpServer() {
		Promise<Void> promise = Promise.promise();
		HttpServer server = vertx.createHttpServer();

		Router router = Router.router(vertx);
		router.get("/users").handler(this::userHandler);
		router.get("/users/:userName").handler(this::userByNameHandler);

		client = WebClient.create(vertx);

		server.requestHandler(router).listen(8080, ar -> {
			if (ar.succeeded()) {
				promise.complete();
			} else {
				promise.fail(ar.cause());
			}
		});

		return promise.future();
	}

	private void userHandler(RoutingContext context) {

		client.get(443, "api.github.com", "/users").ssl(true).putHeader("Accept", "application/json").send(ar -> {
			if (ar.succeeded()) {
				HttpResponse<Buffer> response = ar.result();

				context.response().putHeader("content-type", "application/json").end(response.bodyAsString());
			} else {
				context.fail(ar.cause());
			}
		});

	}

	private void userByNameHandler(RoutingContext context) {
		String userName = context.request().getParam("userName");

		client.get(443, "api.github.com", "/users/" + userName).ssl(true).putHeader("Accept", "application/json")
				.send(ar -> {
					if (ar.succeeded()) {
						// Obtain response
						HttpResponse<Buffer> response = ar.result();

						context.response().putHeader("content-type", "application/json").end(response.bodyAsString());
					} else {
						context.fail(ar.cause());
					}
				});
	}
}
