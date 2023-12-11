package dummy.deadlock.controller;

import dummy.deadlock.repository.T2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t2")
@CrossOrigin
@EnableTransactionManagement
public class T2Controller {
    @Autowired
    @Qualifier("t2Repository")
    private T2Repository t2Repository;

    @GetMapping("/changeValue")
    public String changeValue() {
        t2Repository.changeValue();
        return "Value changed - t2";
    }
}
