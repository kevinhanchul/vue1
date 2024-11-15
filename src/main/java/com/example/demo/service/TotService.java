package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class TotService {

    public Map<String, Object> add(Map<String, Object> paramMap) throws Exception {
        System.out.println(paramMap);
        int num1 = Integer.parseInt(String.valueOf(paramMap.get("num1")));
        int num2 = Integer.parseInt(String.valueOf(paramMap.get("num2")));
        int numOdd = Integer.parseInt(String.valueOf(paramMap.get("num3")));
        int sum = num1 + num2;
        String oddYn="";

        if(numOdd%2==0){
            oddYn="N";
        }
        else{
            oddYn="Y";
        }
        paramMap.put("sum", sum);
        paramMap.put("oddYn", oddYn);
        return paramMap;
    }
}
