/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.symtomspatient.entities;

import java.io.Serializable;
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
@Table(name = "habits_symtom", schema = "public")
public class HabitsSymtom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double sleepHours;
    private String diet;
    private String nutritionalSupplements;
    private double bristol;
    private double dailyDepositions;
    private double weeklyDepositions;
    private String abdominalPain;
    private String abdominalDistension;
    private int defecatoryHabitHappy;
    private double IBSSeverityScore;
    private long patientId;

    public HabitsSymtom() {
    }
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(double sleepHours) {
        this.sleepHours = sleepHours;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getNutritionalSupplements() {
        return nutritionalSupplements;
    }

    public void setNutritionalSupplements(String nutritionalSupplements) {
        this.nutritionalSupplements = nutritionalSupplements;
    }

    public double getBristol() {
        return bristol;
    }

    public void setBristol(double bristol) {
        this.bristol = bristol;
    }

    public double getDailyDepositions() {
        return dailyDepositions;
    }

    public void setDailyDepositions(double dailyDepositions) {
        this.dailyDepositions = dailyDepositions;
    }

    public double getWeeklyDepositions() {
        return weeklyDepositions;
    }

    public void setWeeklyDepositions(double weeklyDepositions) {
        this.weeklyDepositions = weeklyDepositions;
    }

    public String getAbdominalPain() {
        return abdominalPain;
    }

    public void setAbdominalPain(String abdominalPain) {
        this.abdominalPain = abdominalPain;
    }

    public String getAbdominalDistension() {
        return abdominalDistension;
    }

    public void setAbdominalDistension(String abdominalDistension) {
        this.abdominalDistension = abdominalDistension;
    }

    public int getDefecatoryHabitHappy() {
        return defecatoryHabitHappy;
    }

    public void setDefecatoryHabitHappy(int defecatoryHabitHappy) {
        this.defecatoryHabitHappy = defecatoryHabitHappy;
    }

    public double getIBSSeverityScore() {
        return IBSSeverityScore;
    }

    public void setIBSSeverityScore(double IBSSeverityScore) {
        this.IBSSeverityScore = IBSSeverityScore;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }
    
    
    

    @Override
    public String toString() {
        return "com.altamira.demo_spring_boot.entities.HabitsSymtoms[ id=" + id + " ]";
    }
    
}
