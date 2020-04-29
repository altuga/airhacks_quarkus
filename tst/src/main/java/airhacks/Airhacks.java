package airhacks;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "airhacks")
public interface Airhacks {

    @GET
    @Produces("text/plain")
    public String doesNotMatterAtAll();

}