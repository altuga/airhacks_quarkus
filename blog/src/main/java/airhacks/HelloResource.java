package airhacks;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RequestScoped
@Path("/hello")
public class HelloResource {

    @Inject
    Hello hello;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        this.hello.createHello();
        return "created";
    }
}