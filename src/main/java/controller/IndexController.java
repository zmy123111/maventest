package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ZMY on 2018/6/12.
 */
@Controller
@RequestMapping("/home")
public class IndexController {

@RequestMapping("/index")
    public String index() {
    System.out.println("啊啊啊");
        return "hello";
    }

}
