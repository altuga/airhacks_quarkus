package airhacks;

import io.quarkus.test.junit.QuarkusTest;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

import javax.inject.Inject;

@QuarkusTest
public class HelloResourceTest {

    @Inject
    @RestClient
    Airhacks page;

    @Test
    public void content() {
        String content = page.doesNotMatterAtAll();
        System.out.println("-- " + content);
    }

}