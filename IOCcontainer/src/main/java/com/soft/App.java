package com.soft;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.soft.test.Welcome;
import com.soft.test.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/soft/cnfg/applicationContext.xml");
       
      WishMessageGenerator generator = (WishMessageGenerator) context.getBean("wishMessage");
     
     System.out.println("Hello "+generator.messageGenerator(" Rushi"));
    }
}