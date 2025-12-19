package kr.co.kongjicoffee.menu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        System.out.println("콘솔 테스트");
        return "바디테스트";

    }
}
