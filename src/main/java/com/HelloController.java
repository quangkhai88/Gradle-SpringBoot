package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by khaitq
 * Date: 13/10/2018
 * Github:  https://github.com/quangkhai88
 */


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello";
    }


}
