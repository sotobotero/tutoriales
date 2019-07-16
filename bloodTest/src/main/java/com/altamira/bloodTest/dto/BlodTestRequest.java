/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.altamira.bloodTest.dto;

/**
 *
 * @author sotobotero
 */
public class BlodTestRequest {
    
    private Long id;
    private String leukocytes;
    private String hematies;
    private String hemoglobin;
    private String hematocrit;
    private String VCM;
    private String HCM;
    private String CMCH;
    private String RDW;
    private String platelets;
    private String VPM;
    private String glucose;
    private String urea;
    private String creatinine;
    private String sodium;
    private String potassium;
    private String totalCholesterol;
    private String HDLcholesterol;
    private String VLDLcholesterol;
    private String LDLcholesterol;
    private String TG;
    private String lipoproteins;
    private String acAscorbic;
    private String vitaE;
    private String vitaA;
    private String vitaB;
    private String vitaD;
    private String iodo;
    private String faith;
    private String znc;
    private String Mg;
    private String albumin;
    private String prealbumin;
    private String transferrin;
    private String igAsecretor;
    private String Igdosage;
    private String IgGsubclasses;
    private long patientId;
    
    public BlodTestRequest() {
    }

    public BlodTestRequest(Long id, String leukocytes, String hematies, String hemoglobin, String hematocrit, String VCM, String HCM, String CMCH, String RDW, String platelets, String VPM, String glucose, String urea, String creatinine, String sodium, String potassium, String totalCholesterol, String HDLcholesterol, String VLDLcholesterol, String LDLcholesterol, String TG, String lipoproteins, String acAscorbic, String vitaE, String vitaA, String vitaB, String vitaD, String iodo, String faith, String znc, String Mg, String albumin, String prealbumin, String transferrin, String igAsecretor, String Igdosage, String IgGsubclasses, long patientId) {
        this.id = id;
        this.leukocytes = leukocytes;
        this.hematies = hematies;
        this.hemoglobin = hemoglobin;
        this.hematocrit = hematocrit;
        this.VCM = VCM;
        this.HCM = HCM;
        this.CMCH = CMCH;
        this.RDW = RDW;
        this.platelets = platelets;
        this.VPM = VPM;
        this.glucose = glucose;
        this.urea = urea;
        this.creatinine = creatinine;
        this.sodium = sodium;
        this.potassium = potassium;
        this.totalCholesterol = totalCholesterol;
        this.HDLcholesterol = HDLcholesterol;
        this.VLDLcholesterol = VLDLcholesterol;
        this.LDLcholesterol = LDLcholesterol;
        this.TG = TG;
        this.lipoproteins = lipoproteins;
        this.acAscorbic = acAscorbic;
        this.vitaE = vitaE;
        this.vitaA = vitaA;
        this.vitaB = vitaB;
        this.vitaD = vitaD;
        this.iodo = iodo;
        this.faith = faith;
        this.znc = znc;
        this.Mg = Mg;
        this.albumin = albumin;
        this.prealbumin = prealbumin;
        this.transferrin = transferrin;
        this.igAsecretor = igAsecretor;
        this.Igdosage = Igdosage;
        this.IgGsubclasses = IgGsubclasses;
        this.patientId = patientId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLeukocytes() {
        return leukocytes;
    }

    public void setLeukocytes(String leukocytes) {
        this.leukocytes = leukocytes;
    }

    public String getHematies() {
        return hematies;
    }

    public void setHematies(String hematies) {
        this.hematies = hematies;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public String getHematocrit() {
        return hematocrit;
    }

    public void setHematocrit(String hematocrit) {
        this.hematocrit = hematocrit;
    }

    public String getVCM() {
        return VCM;
    }

    public void setVCM(String VCM) {
        this.VCM = VCM;
    }

    public String getHCM() {
        return HCM;
    }

    public void setHCM(String HCM) {
        this.HCM = HCM;
    }

    public String getCMCH() {
        return CMCH;
    }

    public void setCMCH(String CMCH) {
        this.CMCH = CMCH;
    }

    public String getRDW() {
        return RDW;
    }

    public void setRDW(String RDW) {
        this.RDW = RDW;
    }

    public String getPlatelets() {
        return platelets;
    }

    public void setPlatelets(String platelets) {
        this.platelets = platelets;
    }

    public String getVPM() {
        return VPM;
    }

    public void setVPM(String VPM) {
        this.VPM = VPM;
    }

    public String getGlucose() {
        return glucose;
    }

    public void setGlucose(String glucose) {
        this.glucose = glucose;
    }

    public String getUrea() {
        return urea;
    }

    public void setUrea(String urea) {
        this.urea = urea;
    }

    public String getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(String creatinine) {
        this.creatinine = creatinine;
    }

    public String getSodium() {
        return sodium;
    }

    public void setSodium(String sodium) {
        this.sodium = sodium;
    }

    public String getPotassium() {
        return potassium;
    }

    public void setPotassium(String potassium) {
        this.potassium = potassium;
    }

    public String getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(String totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public String getHDLcholesterol() {
        return HDLcholesterol;
    }

    public void setHDLcholesterol(String HDLcholesterol) {
        this.HDLcholesterol = HDLcholesterol;
    }

    public String getVLDLcholesterol() {
        return VLDLcholesterol;
    }

    public void setVLDLcholesterol(String VLDLcholesterol) {
        this.VLDLcholesterol = VLDLcholesterol;
    }

    public String getLDLcholesterol() {
        return LDLcholesterol;
    }

    public void setLDLcholesterol(String LDLcholesterol) {
        this.LDLcholesterol = LDLcholesterol;
    }

    public String getTG() {
        return TG;
    }

    public void setTG(String TG) {
        this.TG = TG;
    }

    public String getLipoproteins() {
        return lipoproteins;
    }

    public void setLipoproteins(String lipoproteins) {
        this.lipoproteins = lipoproteins;
    }

    public String getAcAscorbic() {
        return acAscorbic;
    }

    public void setAcAscorbic(String acAscorbic) {
        this.acAscorbic = acAscorbic;
    }

    public String getVitaE() {
        return vitaE;
    }

    public void setVitaE(String vitaE) {
        this.vitaE = vitaE;
    }

    public String getVitaA() {
        return vitaA;
    }

    public void setVitaA(String vitaA) {
        this.vitaA = vitaA;
    }

    public String getVitaB() {
        return vitaB;
    }

    public void setVitaB(String vitaB) {
        this.vitaB = vitaB;
    }

    public String getVitaD() {
        return vitaD;
    }

    public void setVitaD(String vitaD) {
        this.vitaD = vitaD;
    }

    public String getIodo() {
        return iodo;
    }

    public void setIodo(String iodo) {
        this.iodo = iodo;
    }

    public String getFaith() {
        return faith;
    }

    public void setFaith(String faith) {
        this.faith = faith;
    }

    public String getZnc() {
        return znc;
    }

    public void setZnc(String znc) {
        this.znc = znc;
    }

    public String getMg() {
        return Mg;
    }

    public void setMg(String Mg) {
        this.Mg = Mg;
    }

    public String getAlbumin() {
        return albumin;
    }

    public void setAlbumin(String albumin) {
        this.albumin = albumin;
    }

    public String getPrealbumin() {
        return prealbumin;
    }

    public void setPrealbumin(String prealbumin) {
        this.prealbumin = prealbumin;
    }

    public String getTransferrin() {
        return transferrin;
    }

    public void setTransferrin(String transferrin) {
        this.transferrin = transferrin;
    }

    public String getIgAsecretor() {
        return igAsecretor;
    }

    public void setIgAsecretor(String igAsecretor) {
        this.igAsecretor = igAsecretor;
    }

    public String getIgdosage() {
        return Igdosage;
    }

    public void setIgdosage(String Igdosage) {
        this.Igdosage = Igdosage;
    }

    public String getIgGsubclasses() {
        return IgGsubclasses;
    }

    public void setIgGsubclasses(String IgGsubclasses) {
        this.IgGsubclasses = IgGsubclasses;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

     
    
    
}
