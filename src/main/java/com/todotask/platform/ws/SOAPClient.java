package com.todotask.platform.ws;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.todotask.platform.model.User;

public class SOAPClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext factory = new ClassPathXmlApplicationContext("/config/spring-ws.xml");
        IUserWService client = (IUserWService) factory.getBean("client");
        
        User user  =new User();
        user.setUsername("liyc");
        user.setPassword("123456");
        user.setBirthday(new Date());
        user.setCreateDate(new Date());
        user.setUserType("1");
        user.setFullname("liyingchao");
        user.setSourceSystem("PC");
        client.createUser(user);
        // System.err.println(client.initClinicAccount("37028300001"));
        // System.err.println(client.getMedicineByTaskId("task_1"));
       // System.err.println(client.hasMedicine("task_25"));
       // System.err.println(client.getMedicineByteSizeByTaskId("task_15"));
        
        
    }
}
