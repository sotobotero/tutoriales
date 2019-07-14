/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.demo_spring_boot.api;

import com.altamira.demo_spring_boot.dto.PersonRequest;
import com.altamira.demo_spring_boot.entities.Person;
import com.altamira.demo_spring_boot.services.DemosServices;
import java.util.LinkedList;
import java.util.List;
import org.dozer.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sotobotero
 */
@RestController
public class PersonApi {
    @Autowired
            DemosServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public List<PersonRequest> getPerson(){
        List<Person> all = demosServices.getAll();
        List<PersonRequest> list = new LinkedList<>();
        for(Person dto:all){
            PersonRequest map = mapper.map(dto, PersonRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/person", method= RequestMethod.POST)
    public void savePerson(@RequestBody PersonRequest personRequest){
        Person map = mapper.map(personRequest, Person.class);
        demosServices.save(map);
    }
    
}
