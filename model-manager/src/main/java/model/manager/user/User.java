package model.manager.user;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author 10281
 * @title 人员实体
 * @Date 2020-11-20 22:49
 * @Description 人员信息实体
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class User implements Serializable {
    @Id
    private Long id;
    @NonNull
    @Size(min = 1, max = 64, message = "用户名长度介于1到64之间")
    private String userName;
    @NonNull
    @Size(min = 6, max = 16, message = "密码长度6到16位")
    private String pwd;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
