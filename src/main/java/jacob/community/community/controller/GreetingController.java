package jacob.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {//@Controller注解 允许这个类接受前端请求
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);//key和传过来的值
        return "greeting";//找到同名html文件
    }
}
