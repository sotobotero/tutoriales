/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.disbiosis.dto;

/**
 *
 * @author sotobotero
 */
public class DisbiosisRequest {
    
  private byte[] file;  
  private long patientId;
    
    public DisbiosisRequest() {
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    
}
