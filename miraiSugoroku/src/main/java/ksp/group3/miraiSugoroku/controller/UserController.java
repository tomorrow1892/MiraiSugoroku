package ksp.group3.miraiSugoroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @GetMapping("/game")
    public String showGamePage(Model model) {
        model.addAttribute("pnum", 5);
        return "SugorokuGame";
    }

    @GetMapping("/pra")
    public String showpra(Model model) {
        model.addAttribute("pnum", 5);
        model.addAttribute("asobu", "有馬富士公園で遊ぶ");
        return "pra";
    }
}
