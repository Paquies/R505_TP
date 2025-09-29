package com.paqui.tp_api;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorld {
    @GetMapping("/bonjour")
    public String bonjour() {
      return "Bonjour, le Monde!";
    }
}
