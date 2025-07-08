package SnipRun.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/test")
public class TestController {

    private Judge0Client judge0Client;

    public TestController(Judge0Client judge0Client) {
        this.judge0Client = judge0Client;
    }

    @GetMapping
    public String test() {
        return judge0Client.createSubmission();
    }
}
