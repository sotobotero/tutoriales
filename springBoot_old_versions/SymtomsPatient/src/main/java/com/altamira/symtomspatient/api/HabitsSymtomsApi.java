/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.symtomspatient.api;

import com.altamira.symtomspatient.dto.HabitsSymtomRequest;
import com.altamira.symtomspatient.entities.HabitsSymtom;
import com.altamira.symtomspatient.services.DemosServices;
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
public class HabitsSymtomsApi {
    @Autowired
            DemosServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/habitssymtom", method = RequestMethod.GET)
    public List<HabitsSymtomRequest> getPerson(){
        List<HabitsSymtom> all = demosServices.getAll();
        List<HabitsSymtomRequest> list = new LinkedList<>();
        for(HabitsSymtom dto:all){
            HabitsSymtomRequest map = mapper.map(dto, HabitsSymtomRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/habitssymtom", method= RequestMethod.POST)
    public void savePerson(@RequestBody HabitsSymtomRequest personRequest){
        HabitsSymtom map = mapper.map(personRequest, HabitsSymtom.class);
        demosServices.save(map);
    }
    
}
