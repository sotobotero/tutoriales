/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.disbiosis.dao;

import com.altamira.disbiosis.entities.Disbiosis;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sotobotero
 */
public interface DisbiosisRepository extends JpaRepository<Disbiosis, String>{
    
}
