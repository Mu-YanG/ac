package space.lvyang.ac.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("test")
    public String tesLInk(){
        System.out.println("1");
        return "test";
    }
    @RequestMapping("test1")
    @ResponseBody
    public String tesLInk1(){
        System.out.println("2");
        return "test2";
    }
    @RequestMapping("test2")
    @ResponseBody
    public String tesLHttp(){
        System.out.println("2");
        return "test22";
    }
}
