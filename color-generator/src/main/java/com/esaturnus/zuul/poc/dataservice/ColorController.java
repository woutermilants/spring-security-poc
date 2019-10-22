package com.esaturnus.zuul.poc.dataservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(path = "/api/color")
public class ColorController {

    @GetMapping()
    public String generateRandomColor() {
        final String[] colors = "RED,GREEN,BLUE,BLACK,YELLOW,WHITE,ORANGE".split(",");
        return colors[new Random().nextInt(colors.length)];
    }
}
