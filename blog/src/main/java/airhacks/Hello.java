package airhacks;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.metrics.MetricRegistry;
import org.eclipse.microprofile.metrics.annotation.RegistryType;

@Dependent
public class Hello {


    @Inject
    @RegistryType(type=MetricRegistry.Type.APPLICATION)
    MetricRegistry registry;
    

    public void createHello() {
        registry.counter("hello_created").inc();
    }

}