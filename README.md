# Cacheissue reproducer

## Build and run

```shell
./gradlew bootRun`
```

## Reproduce via Browser

* Open http://localhost:8080 in your favorite browser
  * Make sure caching is NOT disabled, e.g. via DevTools or similar
* Press `F5` couple of times

## Reproduce via curl

```shell
curl -H 'If-None-Match: "0cbb11ed87dc8a95d81400c7f33c7c171"' http://localhost:8080
```
