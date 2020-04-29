package airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Hello hello() {
        return new Hello("good afternoon", 42);
    }
}