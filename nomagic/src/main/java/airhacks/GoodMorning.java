package airhacks;

import javax.enterprise.context.RequestScoped;

import org.eclipse.microprofile.metrics.annotation.Counted;

@RequestScoped
public class GoodMorning {

    @Counted
    public String message() {
        return "good morning USA 2...";
    }
}