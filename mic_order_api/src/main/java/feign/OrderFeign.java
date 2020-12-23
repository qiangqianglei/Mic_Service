package feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "mic-order")
@RequestMapping("/order")
public interface OrderFeign {

    @GetMapping("/getOrder")
    String getOrder();

    /**
     * 测试超时
     * @return
     */
    @GetMapping("/timeout")
    String timeout();
}
