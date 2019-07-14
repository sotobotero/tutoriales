/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.demo_spring_boot.api;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sotobotero
 */
@Configuration
public class DozerMapping {
    
    @Bean
    public Mapper mapperDozer(){
        return new DozerBeanMapper();
    }
    
}
