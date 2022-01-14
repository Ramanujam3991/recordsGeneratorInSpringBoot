package com.recordsgenerator.records;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RecordsRestController {

    @GetMapping("/users")
    public String getAllUsers() {
        List users = new ArrayList<String>();
        return "[{name:'Ramanujam',age:28,email:'ramanujam3991@gmail.com'}]";

    }

    @GetMapping("/users/{num}")
    @ResponseBody
    public String[] getSpecificUsers(@PathVariable  int num) {
        //int num = Integer.parseInt(number);
        System.out.println("num:::"+num);
        List users = new ArrayList<String>();
        String jsonObjStr = "{name:'Ramanujam',age:28,email:'ramanujam3991@gmail.com'}";
        String[] finalStr = new String[num];
        for(int i=0;i<num;i++){
            finalStr[i]=jsonObjStr;
        }
        return finalStr;

    }
}
