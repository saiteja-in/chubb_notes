package org.saiteja.simpleblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/teja")
    public String index(){
        return "index.html";
    }

}
