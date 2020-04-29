package airhacks;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@Liveness
@ApplicationScoped
public class Probes implements HealthCheck {
    
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("quarkus-openshift");
    }

}