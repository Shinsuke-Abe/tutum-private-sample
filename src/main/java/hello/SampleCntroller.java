package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by shinsuke-abe on 2015/11/17.
 */
@Controller
@EnableAutoConfiguration
public class SampleCntroller {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleCntroller.class, args);
    }
}
