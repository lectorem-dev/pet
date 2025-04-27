package su.listener;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getAnalyticShowDTO() {
        return "Hello, listener is alive!";
    }
}
