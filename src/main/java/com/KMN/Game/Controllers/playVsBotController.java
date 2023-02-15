package com.KMN.Game.Controllers;


import com.KMN.Game.Logicks.BOT;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller

public class playVsBotController {

    @PostMapping
    public String play(@RequestParam String choice, Model model){
        model.addAttribute("choice", BOT.WhoWin(choice));
        return "PlayVsBot";
    }

    @GetMapping
    public String play(){
        return "PlayVsBot";
    }

}
