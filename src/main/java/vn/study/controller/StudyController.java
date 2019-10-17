package vn.study.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.ls.LSOutput;

@Controller
public class StudyController {
    @GetMapping("/home")
    public String GreetingController() {
        System.out.println(">>> call  home controller");
        return "home";
    }

    @GetMapping("/hello")
    public String greeting(@RequestParam String name, Model model) {
        System.out.println(">>>Call greeting controller");
        model.addAttribute("_name", name);
        return "hello";  // response page: hello.jsp
    }
}

