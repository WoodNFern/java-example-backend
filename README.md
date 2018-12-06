# Example Java Backend

This Java project contains a minimalistic backend with a simple REST controller
and a preconfigured, in-memory database (H2).

You can run it using the following command:
```
gradle appRunWar
```
Instead of `gradle` you can also use the corresponding Gradle wrapper scripts.
The backend API will then be available at `http://localhost:8080/app/api/v1/`

### `web.xml`

The deployment descriptor file `web.xml` contains the most important information
about how the application should be deployed by an application server.

Currently, it only specifies which controllers are loaded into the
`RootApiServlet` and on which path the API is available.

### REST Controller & API

The `ExampleController` listens on the `/example` endpoint. If you want to issue
requests against this controller, you have to concatenate the URL pattern
`/api/v1/`for the `RootApiServlet` (see `web.xml`) with the URL pattern for the
endpoint `/example` resulting in `/api/v1/example`.

### Persistence

A simple H2 database is preconfigured and will automatically be created on
startup. This can easily be swapped out by configuring a different database in
the [`persistence.xml`](src/main/resources/META-INF/persistence.xml) file.

The Java Persistence API (JPA) is used for storing Java objects in a database.
This project contains code for persisting and retrieving objects.
