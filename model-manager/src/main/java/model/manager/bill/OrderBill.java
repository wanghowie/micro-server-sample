package model.manager.bill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author 10281
 * @title 订单
 * @Date 2020-11-22 21:57
 * @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderBill implements Serializable {
    private Long id;
    private String orderBillNo;
    private Long userId;

    @Override
    public String toString() {
        return "OrderBill{" +
                "id=" + id +
                ", orderBillNo='" + orderBillNo + '\'' +
                ", userId=" + userId +
                '}';
    }
}
