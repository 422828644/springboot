package com.huikao.demo.controller;

import com.huikao.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by admin on 2018/2/23.
 */
@RestController
@RequestMapping(value = "/users")
public class UserController {

    // 创建线程安全的Map
    static Map<Integer, UserInfo> users = Collections.synchronizedMap(new HashMap<Integer, UserInfo>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<UserInfo> getUserList() {
        // 处理"/users/"的GET请求，用来获取用户列表;
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<UserInfo> r = new ArrayList<>(users.values());
        return r;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute UserInfo userInfo) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(userInfo.getId(), userInfo);
        return "success";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public UserInfo getUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public String putUser(@PathVariable Integer id, @ModelAttribute UserInfo userInfo) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        UserInfo u = users.get(id);
        u.setName(userInfo.getName());
        u.setAddress(userInfo.getAddress());
        u.setAge(userInfo.getAge());
        u.setBirthday(userInfo.getBirthday());
        u.setJob(userInfo.getJob());
        u.setSex(userInfo.getSex());
        return "success";
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Integer id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }
}
