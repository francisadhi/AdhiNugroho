/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.entity.ComGolonganDarah;

/**
 *
 * @author heri
 */
public class Patient {
    
    private final Patient patient ;
    private Integer patientId;
    private String patientNo;
    private String patientName;
    private String patientAddress;
    private ComGolonganDarah comGolonganDarah;
    private GeneralModel gmPatient;
    
    public Patient(){
        patient = this;
    }
    
    public Integer getPatientId(){
        return this.patientId;
    }
    
    public void setPatientId(Integer pPatientId){
        this.patientId = pPatientId;
    }
    
    public String getPatientNo(){
        return this.patientNo;
    }
    
    public void setPatientNo(String pPatientNo){
        this.patientNo = pPatientNo;
    }
    
    public String getPatientName(){
        return this.patientName;
    }
    
    public void setPatientName(String pPatientName){
        this.patientName = pPatientName;
    }
    
    public String getPatientAddress(){
        return this.patientAddress;
    }
    
    public void setPatientAddress(String pPatientAddress){
        this.patientAddress = pPatientAddress;
    }
    
    public ComGolonganDarah getComGolonganDarah(){
        return this.comGolonganDarah;
    }
    
    public void setComGolonganDarah(ComGolonganDarah pComGolonganDarah){
        this.comGolonganDarah = pComGolonganDarah;
    }
        
    public GeneralModel getGmPatient() {
        gmPatient = new GeneralModel(patient.getPatientId(), patient.getPatientName(), "Patient", patient);

        return gmPatient;
    }
    
    @Override
    public String toString() {
        return "Patient[patientId=" + patientId 
                + ",patientNo=" + patientNo 
                + ",patientName=" + patientName 
                + ",patientAddress=" + patientAddress 
                + "]";
    }
}
