package bill.manager.feign;

import model.manager.user.User;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author 10281
 * @title 人员远程服务
 * @Date 2020-11-21 1:22
 * @Description
 */
@FeignClient("user-manager-service")
public interface UserFeign {
    @GetMapping("/user")
    List<User> getAllUser();

}
