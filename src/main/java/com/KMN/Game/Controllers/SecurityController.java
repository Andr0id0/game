package com.KMN.Game.Controllers;


import com.KMN.Game.Enams.Role;
import com.KMN.Game.Models.Player;
//import com.KMN.Game.Repositorys.PlayerRepository;
import com.KMN.Game.Models.User;

import com.KMN.Game.Repositorys.PlayerRepository;
import com.KMN.Game.Repositorys.UserRRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Objects;

@Controller
public class SecurityController {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;




    @Autowired
    public UserRRepository u123serRRepository;

    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/reg")
    public String reg(@RequestParam(name = "error", defaultValue = "", required = false) String error, Model model){
        if(error.equals("username")) {
            model.addAttribute("error", "Такой пользователь уже занят");
        }
        return "registration";
    }


@PostMapping("/reg")
public String registration(@RequestParam String username,
                           @RequestParam String email,
                           @RequestParam String password,
                           Model model) {
    String u = passwordEncoder.encode(password);
     User newUser = new User(username, u, email, true, Collections.singleton(Role.USER));
     u123serRRepository.save(newUser);

    return "redirect:/login";
}

@GetMapping("/main")
    public String main(){
        return "mainPage";
}














//    @PostMapping("/reg")
//    public String registration(@RequestParam String nik,
//                               @RequestParam String email,
//                               @RequestParam String password,
//                               @RequestParam String password2,
//                               Model model) {
//
//
//
//            Player player = new Player(nik, password, email, "USER", true);
//            playerRepository.save(player);
//
//
//            return "redirect:/login";

}
