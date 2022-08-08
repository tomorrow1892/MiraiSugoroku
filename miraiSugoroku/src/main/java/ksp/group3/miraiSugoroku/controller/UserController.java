package ksp.group3.miraiSugoroku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/")
    public String showIndexPage(){
        return "index";
    }
    @GetMapping("/game")
    public String showGamePage(){
        return "SugorokuGame";
    }
}
