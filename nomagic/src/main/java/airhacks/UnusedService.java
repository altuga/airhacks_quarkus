package airhacks;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class UnusedService {

    @Inject
    UnusedDAO dao;

    public String hello() {
        return this.dao.goToJooq();
    }

}