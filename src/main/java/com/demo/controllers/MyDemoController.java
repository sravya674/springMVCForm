package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Account;

@Controller
public class MyDemoController {

      @RequestMapping(value="/createAccount")
     public String createAccount(@ModelAttribute ("aNewAccount") Account account){
    	  
    	  System.out.println(account.getFirstName() +" "  +account.getLastName()+" "+account.getAddress() +" "+account.getEmail());
		return "createAccount";
    	  
              

   
}
}