package airhacks;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class HelloResource {

    @Inject
    @RestClient
    Airhacks page;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.page.doesNotMatterAtAll();
    }
}