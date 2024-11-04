/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.PatientData.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author sotobotero
 */
public class PatientDataRequest implements Serializable {
    
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

    public PatientDataRequest() {
    }

    public PatientDataRequest(long id, String patientDocumentNumber, String name, String phone, String addres, String surname, Date birdDate, String team, double weight, double size, double IMC, double folds, double perimeters, double diameters, String allergiesMedical, String food, String other, String pastMedical, String surgical, String traumatiInjuries) {
        this.id = id;
        this.patientDocumentNumber = patientDocumentNumber;
        this.name = name;
        this.phone = phone;
        this.addres = addres;
        this.surname = surname;
        this.birdDate = birdDate;
        this.team = team;
        this.weight = weight;
        this.size = size;
        this.IMC = IMC;
        this.folds = folds;
        this.perimeters = perimeters;
        this.diameters = diameters;
        this.allergiesMedical = allergiesMedical;
        this.food = food;
        this.other = other;
        this.pastMedical = pastMedical;
        this.surgical = surgical;
        this.traumatiInjuries = traumatiInjuries;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatientDocumentNumber() {
        return patientDocumentNumber;
    }

    public void setPatientDocumentNumber(String patientDocumentNumber) {
        this.patientDocumentNumber = patientDocumentNumber;
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
    
  
    
    
}
