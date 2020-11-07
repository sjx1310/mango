package sjx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sjx.demo.service.UserService;

/**
 * @author sjx
 */
@RestController
@RequestMapping("user")
public class UserController{
    @Autowired
    private UserService userService;

    @GetMapping(value = "/findAll")
    public Object findAll(){
        return userService.findAll();
    }
}
