package com.systop;

import org.junit.Test;

import com.systop.bean.User;

public class test {

    @Test
    public void test() {

        User user = new User();
        user.setUserName("张三");
        user.setUserSex("男");
        user.setUserAge("12");


        User user1 = new User();

//        try {
//            user1 = BeanUtil.deepCopy(user);
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }

        user1 = user;
        user.setUserAge("14");


        System.out.println(user);
        System.out.println(user1);



    }

}
