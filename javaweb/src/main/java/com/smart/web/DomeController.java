package com.smart.web;

import com.smart.pojo.Dome;
import com.smart.service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName DomeController
 * @Description: TODO
 * @Author Administrator
 * @Date 2019/8/30
 * @Version V1.0
 **/
@RequestMapping("/")
@Controller
public class DomeController {
    @Autowired
    private DomeService domeService;
    @RequestMapping(value ="index.html")
    public ModelAndView index(){
        List list=domeService.index();
        ModelAndView mav =new ModelAndView();
        mav.setViewName("indexxxx");
        mav.addObject("userList",list);
        return mav;
    }
//@RequestMapping(value ="index.html")
//@ResponseBody
//public String index(ModelAndView mav){
//    List list=domeService.index();
//    mav.setViewName("indexxxx");
//    mav.addObject("userList",list);
//    return "indexxxx";
//}
//    @Autowired
//    private DomeService service;
//
//    @RequestMapping("/index.html")
//    public ModelAndView index(){
//        List<Dome> list=service.index();
//        ModelAndView mav=new ModelAndView();
//        mav.addObject("userList",list);
//        mav.setViewName("index");
//        return mav;
//    }
}
