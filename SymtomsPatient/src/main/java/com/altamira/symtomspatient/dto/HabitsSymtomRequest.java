/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.symtomspatient.dto;

/**
 *
 * @author sotobotero
 */
public class HabitsSymtomRequest {
    
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
    
    public HabitsSymtomRequest() {
    }

    public HabitsSymtomRequest(Long id, double sleepHours, String diet, String nutritionalSupplements, double bristol, double dailyDepositions, double weeklyDepositions, String abdominalPain, String abdominalDistension, int defecatoryHabitHappy, double IBSSeverityScore) {
        this.id = id;
        this.sleepHours = sleepHours;
        this.diet = diet;
        this.nutritionalSupplements = nutritionalSupplements;
        this.bristol = bristol;
        this.dailyDepositions = dailyDepositions;
        this.weeklyDepositions = weeklyDepositions;
        this.abdominalPain = abdominalPain;
        this.abdominalDistension = abdominalDistension;
        this.defecatoryHabitHappy = defecatoryHabitHappy;
        this.IBSSeverityScore = IBSSeverityScore;
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
    
    
    
}
