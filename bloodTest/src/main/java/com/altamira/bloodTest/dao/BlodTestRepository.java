/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.bloodTest.dao;


import com.altamira.bloodTest.entities.BlodTest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sotobotero
 */
public interface BlodTestRepository extends JpaRepository<BlodTest, String>{
    
}
