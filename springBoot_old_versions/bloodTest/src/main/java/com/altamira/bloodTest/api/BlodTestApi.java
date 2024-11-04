/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.bloodTest.api;

import com.altamira.bloodTest.dto.BlodTestRequest;
import com.altamira.bloodTest.entities.BlodTest;
import com.altamira.bloodTest.services.BlodTestServices;
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
public class BlodTestApi {
    @Autowired
            BlodTestServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/bloodtest", method = RequestMethod.GET)
    public List<BlodTestRequest> getPerson(){
        List<BlodTest> all = demosServices.getAll();
        List<BlodTestRequest> list = new LinkedList<>();
        for(BlodTest dto:all){
            BlodTestRequest map = mapper.map(dto, BlodTestRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/bloodtest", method= RequestMethod.POST)
    public void savePerson(@RequestBody BlodTestRequest personRequest){
        BlodTest map = mapper.map(personRequest, BlodTest.class);
        demosServices.save(map);
    }
    
}
