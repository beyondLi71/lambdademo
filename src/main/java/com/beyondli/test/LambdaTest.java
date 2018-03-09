package com.beyondli.test;

import com.beyondli.dto.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by beyondLi
 * Date 2018/3/9
 * Desc .
 */
public class LambdaTest {
    /**
     * 使用map
     * 1.map的作用是对传入的对象进行中间操作
     * 2.map中的内容一定是要有返回的内容
     * 3.单行有返回可不写return,多行则要通过return来指定返回
     * 需求：将List<User> 中的所有User的age改为1
     */
    @Test
    public void useMap() {
        //数据初始化
        List<User> userList = new ArrayList<>();
        User userOne = new User("beyondLi", 23);
        User userTwo = new User("ZYT", 24);
        User userThree = new User("beyondLi", 24);
        userList.add(userOne);
        userList.add(userTwo);
        userList.add(userThree);

        //使用map进行数据操作
        userList = userList.stream().map(user -> {
            user.setAge(1);
            return user;
        }).collect(Collectors.toList());

        System.out.println(userList);
    }
}
