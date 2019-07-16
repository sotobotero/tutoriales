/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.symtomspatient.dao;

import com.altamira.symtomspatient.entities.HabitsSymtom;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sotobotero
 */
public interface DemoRepository extends JpaRepository<HabitsSymtom, String>{
    
}
