package com.mengma.annotation;

import org.springframework.stereotype.Repository;

@Repository("personDao")
/**
 * 使用@Repository注解将PersonDaoImpl类标识为Spring中的Bean
 * 写法相当于配置文件中的<bean id="personDao" class ="com.mengma.annotation.PersonDaoImpl"/>的书写
 * */

public class PersonDaoImpl implements PersonDao {
    @Override
    public void add() {
        System.out.println("Dao层的add()方法执行了"); //验证是否成功调用了该方法
    }
}
