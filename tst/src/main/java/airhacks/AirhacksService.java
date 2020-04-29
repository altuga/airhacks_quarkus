package airhacks;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.sound.sampled.SourceDataLine;

import org.eclipse.microprofile.faulttolerance.Bulkhead;
import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.quarkus.scheduler.Scheduled;

@RequestScoped
public class AirhacksService {

    @Inject
    @RestClient
    Airhacks page;


    @Timed
    //@Bulkhead(value = 2, waitingTaskQueue = 10)
    //@CircuitBreaker()
    @Retry(maxRetries = 2)
    @Timeout(unit = ChronoUnit.MILLIS,value = 1000)
    @Fallback(fallbackMethod = "doesNotExist")
    public String getContent() {
        System.out.println("retrying...");
        return this.page.doesNotMatterAtAll();
    }

    public String doesNotExist() {
        System.out.println("AirhacksService.doesNotExist()");
        return "too slow";
    }

    @Scheduled(every = "1s")
    public void check() {
        System.out.println(".... " + LocalTime.now());
    }

    

}