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
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sotobotero
 */
@RestController
@RequestMapping(value = "/medical")
public class HabitsSymtomsApi {
    @Autowired
            PatientDataServices demosServices;
    @Autowired
            Mapper mapper;
    
    
    @RequestMapping(value = "/patients", method = RequestMethod.GET)
    public List<PatientDataRequest> getPerson(){
        List<PatientData> all = demosServices.getAll();
        List<PatientDataRequest> list = new LinkedList<>();
        for(PatientData dto:all){
            PatientDataRequest map = mapper.map(dto, PatientDataRequest.class);
            list.add(map);
        }
        return list;       
    }
    
    @RequestMapping(value = "/patient", method= RequestMethod.POST)
    public void savePerson(@RequestBody PatientDataRequest personRequest){
        PatientData map = mapper.map(personRequest, PatientData.class);
        demosServices.save(map);
    }
    
    
    @RequestMapping(value = "/patient", method= RequestMethod.GET)
    public PatientDataRequest getPatient(@RequestParam("id") long id){        
        PatientData patient = demosServices.getPatient(id);
        PatientDataRequest map = mapper.map(patient, PatientDataRequest.class);
        return map;
    }
    
    @RequestMapping(value = "/patient/{name}", method= RequestMethod.GET)
    public PatientDataRequest getPatient(@PathVariable("name") String name){        
        PatientData patient = demosServices.getPatientbyName(name);
        PatientDataRequest map = mapper.map(patient, PatientDataRequest.class);
        return map;
    }
    
}
