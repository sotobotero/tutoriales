/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.demo_spring_boot.services;

import com.altamira.demo_spring_boot.entities.Person;
import com.altamira.demo_spring_boot.dao.DemoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sotobotero
 */
@Service
public class DemosServices {
    @Autowired     
    DemoRepository demoRepository;
    
    public void save(Person person){
        demoRepository.save(person);
    }
    
    public  List<Person> getAll(){
        return demoRepository.findAll();
    }
    
}
