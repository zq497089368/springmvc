package com.test.controller;

import com.test.entity.LeisuMatchBasePO;
import com.test.service.AopService;
import com.test.service.LeisuMatchBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Controller
public class LeisuMatchBaseController {
    @Autowired
    LeisuMatchBaseService leisuMatchBaseService;
    @Autowired
    AopService aopService;
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping("/findById")
    public ModelAndView userList(Model model){
        testRestTemplate();
        System.out.println(aopService.sayHello("账上"));
        aopService.eat("习惯");
        System.out.println(aopService.getClass());
        leisuMatchBaseService.test();
        System.out.println("test");
        Future<String> future = leisuMatchBaseService.test2();
//        try {
//            Future<String> future = leisuMatchBaseService.test2();
//            while (true){
//                if(future.isDone()){
//                    System.out.println(future.get());
//                    break;
//                }
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        System.out.println("aa");
        LeisuMatchBasePO leisuMatchBasePO = leisuMatchBaseService.findById(213185504L);
        model.addAttribute("leisuMatchBasePO", leisuMatchBasePO);
        return new ModelAndView("success","model",model);
    }

    private void testRestTemplate(){
        restTemplate.getForObject("http://101.201.211.208:48080/v1/indexQuery", String.class);
    }

    @RequestMapping("/index")
    public ModelAndView index(Model model){
        return new ModelAndView("index","model",model);
    }
}
