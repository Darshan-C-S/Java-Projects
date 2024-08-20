package com.darshan.jobListing.bean.container;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.JstlUtils;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.security.PublicKey;
import java.util.SortedMap;


@Component("Student")
public class Student {
    public void student(){
        System.out.println("<<<<<<<<<<<<<<<<< This is student bean created >>>>>>>>>>>>>>>>");
    }

    @PostConstruct
    public void initialise(){
        System.out.println("<<<<<<<<<<<<<<<<<< Post Construct or initialising the bean >>>>>>>>>>>>>>>");
    }

    @PreDestroy
    public void PreEDestroy(){
        System.out.println("<<<<<<<<<<<<<<<<<< The method called before Destroying the bean >>>>>>>>>>>>>>> ");
    }


}


