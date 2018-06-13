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
        return "hello";
    }
}
