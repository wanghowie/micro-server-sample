package bill.manager.controller;

import bill.manager.feign.UserFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import model.manager.bill.OrderBill;
import model.manager.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 10281
 * @title   单据控制层
 * @Date 2020-11-21 1:12
 * @Description
 */

@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private UserFeign userFeign;

    @GetMapping()
    @HystrixCommand(fallbackMethod = "fallbackGetAllUser")
    public List<User> getAllUser(){
        return userFeign.getAllUser();
    }

    public List<User> fallbackGetAllUser(){
        OrderBill orderBill = new OrderBill();
        User user = User.builder().id(-1L).build();
        return Collections.singletonList(user);
    }
}
