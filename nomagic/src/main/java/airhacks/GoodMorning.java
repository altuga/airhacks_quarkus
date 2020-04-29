package airhacks;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class GoodMorning {

    public String message() {
        return "good morning...";
    }
}