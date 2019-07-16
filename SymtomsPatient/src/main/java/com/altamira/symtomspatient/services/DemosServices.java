/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.symtomspatient.services;

import com.altamira.symtomspatient.entities.HabitsSymtom;
import com.altamira.symtomspatient.dao.DemoRepository;
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
    
    public void save(HabitsSymtom person){
        demoRepository.save(person);
    }
    
    public  List<HabitsSymtom> getAll(){
        return demoRepository.findAll();
    }
    
}
