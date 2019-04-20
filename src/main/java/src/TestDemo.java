package src;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author tony
 * @date 2019/4/20 2:09 PM
 */
@SpringBootApplication
@Controller
public class TestDemo {

    public static void main(String[] args) {
        SpringApplication.run(TestDemo.class, args);

    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "jenkins部署项目成功！！！";
    }
}
