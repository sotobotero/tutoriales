/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.PatientData.api;


import com.altamira.PatientData.dto.PatientDataRequest;
import com.altamira.PatientData.entities.PatientData;
import com.altamira.PatientData.services.PatientDataServices;
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
            PatientDataServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/patientdata", method = RequestMethod.GET)
    public List<PatientDataRequest> getPerson(){
        List<PatientData> all = demosServices.getAll();
        List<PatientDataRequest> list = new LinkedList<>();
        for(PatientData dto:all){
            PatientDataRequest map = mapper.map(dto, PatientDataRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/patientdata", method= RequestMethod.POST)
    public void savePerson(@RequestBody PatientDataRequest personRequest){
        PatientData map = mapper.map(personRequest, PatientData.class);
        demosServices.save(map);
    }
    
}
