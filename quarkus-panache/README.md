docker rm -f pgsql
docker run -p 5432:5432 --name pgsql airhacks/postgres
curl localhost:8080/workshops/sample
mvn quarkus:list-extensions
mvn quarkus:add-extension -Dextensions="quarkus-resteasy-jsonb"
mvn quarkus:add-extension -Dextensions="panache"
mvn quarkus:add-extension -Dextensions="jdbc-postgres"
mvn compile quarkus:dev
curl -H"Accept: application/json" localhost:8080/workshops/sample
curl -XPOST -H"Content-type: application/json" -d'{"date":"2019-10-16","description":"endless hacking","name":"sample"}' localhost:8080/workshops/
curl localhost:8080/workshops/

        

# List extensions

[agroal, cdi, hibernate-orm, jdbc-postgresql, narayana-jta, resteasy, resteasy-jsonb]