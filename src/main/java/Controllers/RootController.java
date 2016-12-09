package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "index";
    }
}
