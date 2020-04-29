
package com.airhacks;

import io.smallrye.reactive.messaging.annotations.Broadcast;
import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

/**
 *
 * @author airhacks.com
 */
@ApplicationScoped
public class TopologyProducer {

    @Incoming("airhacks-topic")
    @Outgoing("airhacks-output-topic")
    @Broadcast
    public String process(String input) {
        return "processed " + input + " in ...-mapper";
    }


}
