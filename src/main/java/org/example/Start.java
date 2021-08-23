package org.example;

import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private UserService userService;
    public Start (UserService userService){
        this.userService=userService;
    }

    @Bean
    public void init(){
        userService.saveOrUpdate(new User("Tom",(byte)30,"Tom@mail.ru"));
        userService.saveOrUpdate(new User("Jek",(byte)33,"Jek@mail.ru"));
        userService.saveOrUpdate(new User("Donald",(byte)20,"Donald@mail.ru"));
        userService.saveOrUpdate(new User("Mark",(byte)47,"Mark@mail.ru"));
    }
}
