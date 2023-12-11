package dummy.deadlock.controller;

import dummy.deadlock.repository.T1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t1")
@CrossOrigin
@EnableTransactionManagement
public class T1Controller {
    @Autowired
    @Qualifier("t1Repository")
    private T1Repository t1Repository;

    @GetMapping("/changeValue")
    public String changeValue() {
        t1Repository.changeValue();
        return "Value changed - t1";
    }
}
