package space.lvyang.ac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import space.lvyang.ac.entities.LocalUser;
import space.lvyang.ac.service.LocalUserService;

@Controller
public class LoginController {
    @Autowired
    LocalUserService localUserService;

    @RequestMapping("loginAc")
    @ResponseBody
    public String LoginAc(LocalUser usr){


        if (localUserService.selectUserByName(usr)){


            return "sucess";
        }else
            return  "error";

    }
    @RequestMapping("login")
    public String toLogin(){
       return "login";
    }

}
