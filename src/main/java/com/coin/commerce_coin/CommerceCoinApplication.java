package com.coin.commerce_coin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CommerceCoinApplication {

    @GetMapping("/")
    public String index(){
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(CommerceCoinApplication.class, args);
    }

}
