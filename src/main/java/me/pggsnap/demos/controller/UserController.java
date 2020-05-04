package me.pggsnap.demos.controller;

import me.pggsnap.demos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pggsnap
 * @date 2020/5/1
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/test1")
    public void test1() {
        userService.test1();
    }

    @GetMapping("/test2")
    public void test2() {
        userService.test2();
    }

    @GetMapping("/test3")
    public void test3() {
        userService.test3();
    }

    @GetMapping("/test4")
    public void test4() {
        userService.test4();
    }

    @GetMapping("/test5")
    public void test5() {
        userService.test5();
    }

    @GetMapping("/test6")
    public void test6() {
        userService.test6();
    }

    @GetMapping("/test7")
    public void test7() {
        userService.test7();
    }

    @GetMapping("/test8")
    public void test8() {
        userService.test8();
    }
}
