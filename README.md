## About

Repostory for kitalulus intersip test

## Installation Guide
<!-- UL -->
* Make sure [jdk 8](https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html) installed on your local machine
* Make sure [maven](https://maven.apache.org/download.cgi) installed on your local machine
* Clone this repostory
* Get into this repository through terminal
* Run command ``mvn vertx:run``
* Open your browser and type ``http://localhost:8080/users``

## API Endpoint
<!--- Horizontal Rule -->
___
<!-- Github Markdown -->
<!-- Code Bloks -->
```
/GET/Users
```

### The Result
```javascript
{
    "login": "mojombo",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://avatars0.githubusercontent.com/u/1?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/mojombo",
    "html_url": "https://github.com/mojombo",
    "followers_url": "https://api.github.com/users/mojombo/followers",
    "following_url": "https://api.github.com/users/mojombo/following{/other_user}",
    "gists_url": "https://api.github.com/users/mojombo/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
    "organizations_url": "https://api.github.com/users/mojombo/orgs",
    "repos_url": "https://api.github.com/users/mojombo/repos",
    "events_url": "https://api.github.com/users/mojombo/events{/privacy}",
    "received_events_url": "https://api.github.com/users/mojombo/received_events",
    "type": "User",
    "site_admin": false
  }
```
<!--- Horizontal Rule -->
___
<!-- Github Markdown -->
<!-- Code Bloks -->
```
/GET/Users/:Name
```
## The Result
```java script
{
  "login": "mojombo",
  "id": 1,
  "node_id": "MDQ6VXNlcjE=",
  "avatar_url": "https://avatars0.githubusercontent.com/u/1?v=4",
  "gravatar_id": "",
  "url": "https://api.github.com/users/mojombo",
  "html_url": "https://github.com/mojombo",
  "followers_url": "https://api.github.com/users/mojombo/followers",
  "following_url": "https://api.github.com/users/mojombo/following{/other_user}",
  "gists_url": "https://api.github.com/users/mojombo/gists{/gist_id}",
  "starred_url": "https://api.github.com/users/mojombo/starred{/owner}{/repo}",
  "subscriptions_url": "https://api.github.com/users/mojombo/subscriptions",
  "organizations_url": "https://api.github.com/users/mojombo/orgs",
  "repos_url": "https://api.github.com/users/mojombo/repos",
  "events_url": "https://api.github.com/users/mojombo/events{/privacy}",
  "received_events_url": "https://api.github.com/users/mojombo/received_events",
  "type": "User",
  "site_admin": false,
  "name": "Tom Preston-Werner",
  "company": null,
  "blog": "http://tom.preston-werner.com",
  "location": "San Francisco",
  "email": null,
  "hireable": null,
  "bio": null,
  "twitter_username": null,
  "public_repos": 62,
  "public_gists": 62,
  "followers": 22073,
  "following": 11,
  "created_at": "2007-10-20T05:24:19Z",
  "updated_at": "2020-08-18T23:22:41Z"
}
