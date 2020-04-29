package airhacks;

import javax.enterprise.context.Dependent;

@Dependent
public class UnusedDAO {

    public String goToJooq() {
        return "data from db";
    }
}