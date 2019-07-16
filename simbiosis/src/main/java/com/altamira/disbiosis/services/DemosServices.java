/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.disbiosis.services;

import com.altamira.disbiosis.entities.Disbiosis;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.altamira.disbiosis.dao.DisbiosisRepository;

/**
 *
 * @author sotobotero
 */
@Service
public class DemosServices {
    @Autowired     
    DisbiosisRepository demoRepository;
    
    public void save(Disbiosis person){
        demoRepository.save(person);
    }
    
    public  List<Disbiosis> getAll(){
        return demoRepository.findAll();
    }
    
}
