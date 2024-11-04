/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.PatientData.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sotobotero
 */
@Entity
@Table(name = "patient_data", schema = "public")
public class PatientData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private long id;
    
    private String patientDocumentNumber;
    
    private String name;
    
    private String phone;
    
    private String addres;
    
    private String surname;
    
    private Date birdDate;
    
    private String team;
    
    private double weight;
    
    private double size;
    
    private double IMC;
    
    private double folds;
    
    private double perimeters;
    
    private double diameters;
    
    private String allergiesMedical;
    
    private String food;
    
    private String other;
     
    private String pastMedical;
    
    private String surgical;
    
    private String traumatiInjuries;

    public PatientData() {
    }
       

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirdDate() {
        return birdDate;
    }

    public void setBirdDate(Date birdDate) {
        this.birdDate = birdDate;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public double getFolds() {
        return folds;
    }

    public void setFolds(double folds) {
        this.folds = folds;
    }

    public double getPerimeters() {
        return perimeters;
    }

    public void setPerimeters(double perimeters) {
        this.perimeters = perimeters;
    }

    public double getDiameters() {
        return diameters;
    }

    public void setDiameters(double diameters) {
        this.diameters = diameters;
    }

    public String getAllergiesMedical() {
        return allergiesMedical;
    }

    public void setAllergiesMedical(String allergiesMedical) {
        this.allergiesMedical = allergiesMedical;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getPastMedical() {
        return pastMedical;
    }

    public void setPastMedical(String pastMedical) {
        this.pastMedical = pastMedical;
    }

    public String getSurgical() {
        return surgical;
    }

    public void setSurgical(String surgical) {
        this.surgical = surgical;
    }

    public String getTraumatiInjuries() {
        return traumatiInjuries;
    }

    public void setTraumatiInjuries(String traumatiInjuries) {
        this.traumatiInjuries = traumatiInjuries;
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

    public String getPatientDocumentNumber() {
        return patientDocumentNumber;
    }

    public void setPatientDocumentNumber(String patientDocumentNumber) {
        this.patientDocumentNumber = patientDocumentNumber;
    }

    
    @Override
    public String toString() {
        return "com.altamira.demo_spring_boot.entities.Person[ id=" + id + " ]";
    }
    
}
