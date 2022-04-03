package com.mengma.annotation;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("personService")
/**
 *使用 @Service 注解将 PersonServiceImpl 类标识为 Spring 中的 Bean
 *写法相当于配置文件中 <bean id="personService" class="com.mengma.annotation.PersonServiceImpl"/> 的书写
 * */

public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    /**
     *使用 @Resource 注解标注在属性 personDao 上（也可标注在 personDao 的 setPersonDao() 方法上）
     *相当于配置文件中 <property name="personDao" ref="personDao"/> 的写法
     * */

    private PersonDao personDao;
    public PersonDao getPersonDao() {
        return personDao;
    }
    @Override
    public void add() {
        personDao.add();
        System.out.println("Service层的add()方法执行了"); //验证是否成功调用了该方法
    }
}
