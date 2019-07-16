/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.disbiosis.api;

import com.altamira.disbiosis.dto.DisbiosisRequest;
import com.altamira.disbiosis.entities.Disbiosis;
import com.altamira.disbiosis.services.DemosServices;
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
public class DisbiosisApi {
    @Autowired
            DemosServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/disbiosis", method = RequestMethod.GET)
    public List<DisbiosisRequest> getPerson(){
        List<Disbiosis> all = demosServices.getAll();
        List<DisbiosisRequest> list = new LinkedList<>();
        for(Disbiosis dto:all){
            DisbiosisRequest map = mapper.map(dto, DisbiosisRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/disbiosis", method= RequestMethod.POST)
    public void savePerson(@RequestBody DisbiosisRequest personRequest){
        Disbiosis map = mapper.map(personRequest, Disbiosis.class);
        demosServices.save(map);
    }
    
}
