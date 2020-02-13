/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.altamira.soccerprotocol;

import java.io.Serializable;
import java.text.ParseException;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.json.JSONObject;

/**
 *
 * @author sotobotero
 */
@Entity
public class DisbiosisRequest implements Serializable {
    
    private byte[] file;
    private long patientId;
    @Id
    private Long id;

    public DisbiosisRequest(String JSONString) {
        JSONObject job = new JSONObject(JSONString);
        this.id = job.getLong("id");
        this.patientId = job.getInt("patientId");
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
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
