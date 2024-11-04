/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.bloodTest.services;

import com.altamira.bloodTest.entities.BlodTest;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.altamira.bloodTest.dao.BlodTestRepository;

/**
 *
 * @author sotobotero
 */
@Service
public class BlodTestServices {
    @Autowired     
    BlodTestRepository demoRepository;
    
    public void save(BlodTest person){
        demoRepository.save(person);
    }
    
    public  List<BlodTest> getAll(){
        return demoRepository.findAll();
    }
    
}
