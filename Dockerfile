FROM jboss/wildfly
ADD target/springbootwildfly-0.0.1-SNAPSHOT.war /opt/jboss/wildfly/standalone/deployments/spring.war
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "--debug"]
