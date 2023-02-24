package cn.gxm.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GXM
 * @version 1.0.0
 * @Description TODO
 * @createTime 2023年02月24日
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/say")
    public String say() {
        return "hello ";
    }
}
