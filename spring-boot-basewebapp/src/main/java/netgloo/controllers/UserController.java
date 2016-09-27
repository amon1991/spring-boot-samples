package netgloo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * yaming.chen@siemens.com
 * Created by chenyaming on 2016/9/26.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/{myid}", method = RequestMethod.GET)
    public User view(@PathVariable("myid")Long id){

        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;

    }

}
