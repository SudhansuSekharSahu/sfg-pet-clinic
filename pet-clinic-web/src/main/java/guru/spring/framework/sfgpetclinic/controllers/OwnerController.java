package guru.spring.framework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/owners/index.xml"})
    public String listOwners(){
        return "owners/index";
    }
}
