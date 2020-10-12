import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String index() {
        return demoService.method1();
    }
}