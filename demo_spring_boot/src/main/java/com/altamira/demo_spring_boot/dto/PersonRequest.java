/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.demo_spring_boot.dto;

/**
 *
 * @author sotobotero
 */
public class PersonRequest {
    
    private String id;
    
    private String name;
    
    private String phone;
    
    private String addres;

    public PersonRequest() {
    }
    
    
    public PersonRequest(String id, String name, String phone, String addres) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.addres = addres;
    }
        

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    
    
    
}
