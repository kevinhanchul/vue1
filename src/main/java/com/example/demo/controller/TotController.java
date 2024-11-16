
package com.example.demo.controller;
import com.example.demo.service.TotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class TotController {
    @Autowired
    private TotService totService;

    @GetMapping("/vue1")
    private ModelAndView vue1() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("vue1");
        return mav;
    }

    @GetMapping("/vue2")
    private ModelAndView vue2() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("vue2");
        return mav;
    }

    @GetMapping("/sum")
    private ModelAndView sum() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sum");
        return mav;
    }

    @PostMapping("/api/sum")
    public Map<String, Object> getSum(@RequestBody Map<String, Object> paramMap) throws Exception {
        return totService.add(paramMap);
    }

}
