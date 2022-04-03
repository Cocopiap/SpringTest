package com.mengma.annotation;


import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("personAction")
/**
 *使用 @Controller注解标注PersonAction类
 *写法相当于在配置文件中编写 <bean id="personAction" class="com.mengma.annotation.PersonAction"/>
 * */

public class PersonAction {
    @Resource(name = "personService")
    /**
     *使用了 @Resource 注解标注在 personService 上
     *相当于在配置文件内编写 <property name="personService" ref="personService"/>
     * */

    private PersonService personService;
    public PersonService getPersonService() {
        return personService;
    }

    public void add() {
        personService.add();
        System.out.println("Action层的add()方法执行了"); //验证是否成功调用了该方法
    }
}
