package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyDemoController {
private String[] quotes = {"To be or not to be -Shakespeare",
                            "Stay hungry you're alone -Dee Snider",
                            "Might as well jump! -David Lee Roth"};

//http://localhost:8080/sprinMVCDemo/getQuote.html
@RequestMapping(value="/getQuote")
public String getRandomQuote(Model model) {
    int rand = new Random().nextInt(quotes.length);
    String randomQuote = quotes[rand];

    model.addAttribute("randomQuote", randomQuote);
    return "quote";
}
}