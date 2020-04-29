oc delete all,cm -l app=quarkus-openshift
oc create -f service.yml
mvn package
oc start-build quarkus-openshift --from-dir=. --follow