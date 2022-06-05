package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class FigureApi {

        @GetMapping("/calculate")
        public int calculate(@RequestParam String figure,
                             @RequestParam int sideA,
                             @RequestParam int sideB,
                             @RequestParam(required = false) Integer sideC){
            if(figure.equalsIgnoreCase("rectangle")){
                    return 2*sideA + 2*sideB;
            } else  if(figure.equalsIgnoreCase("triangle")){
                    return sideA + sideB + sideC;
            }
                return -1;
        }


}

