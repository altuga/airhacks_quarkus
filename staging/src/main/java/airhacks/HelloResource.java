package airhacks;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloResource {

    @Inject
    @ConfigProperty(name = "message")
    String message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello " + this.message;
    }
}