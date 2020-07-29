/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.PatientData.dao;


import com.altamira.PatientData.entities.PatientData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author sotobotero
 */
public interface PatientDataRepository extends JpaRepository<PatientData, String>{
    
   
  @Query(value = "SELECT * FROM patient_data WHERE id = ?1", nativeQuery = true)
  public PatientData findById(long id);
    
  @Query(value = "SELECT * FROM patient_data WHERE name ilike  ?1", nativeQuery = true)
  public PatientData findByName(String name);
}
