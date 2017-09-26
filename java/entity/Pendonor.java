/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.entity.ComGolonganDarah;
import com.entity.ComPekerjaan;

/**
 *
 * @author heri
 */
public class Pendonor {

    private final Pendonor pendonor;
    private Integer pendonorId;
    private String pendonorNo;
    private String pendonorName;
    private String pendonorGender;
    private String pendonorBirthPlace;
    private String pendonorBirthDate;
    private String pendonorAddress;
    private String pendonorTelp;
    private String pendonorPassword;
    private String pendonorEmail;
    private ComPekerjaan comPekerjaan;
    private ComGolonganDarah comGolonganDarah;
    private GeneralModel gmPendonor;
    
    public Pendonor(){
        pendonor = this;
    }

    public Integer getPendonorId() {
        return this.pendonorId;
    }

    public void setPendonorId(Integer pPendonorId) {
        this.pendonorId = pPendonorId;
    }

    public String getPendonorNo() {
        return this.pendonorNo;
    }

    public void setPendonorNo(String pPendonorNo) {
        this.pendonorNo = pPendonorNo;
    }

    public String getPendonorName() {
        return this.pendonorName;
    }

    public void setPendonorName(String pPendonorName) {
        this.pendonorName = pPendonorName;
    }

    public String getPendonorGender() {
        return this.pendonorGender;
    }

    public void setPendonorGender(String pPendonorGender) {
        this.pendonorGender = pPendonorGender;
    }

    public String getPendonorBirthPlace() {
        return this.pendonorBirthPlace;
    }

    public void setPendonorBirthPlace(String pPendonorBirthPlace) {
        this.pendonorBirthPlace = pPendonorBirthPlace;
    }

    public String getPendonorBirthDate() {
        return this.pendonorBirthDate;
    }

    public void setPendonorBirthDate(String pPendonorBirthDate) {
        this.pendonorBirthDate = pPendonorBirthDate;
    }

    public String getPendonorAddress() {
        return this.pendonorAddress;
    }

    public void setPendonorAddress(String pPendonorAddress) {
        this.pendonorAddress = pPendonorAddress;
    }

    public String getPendonorTelp() {
        return this.pendonorTelp;
    }
    
    public void setPendonorTelp(String pPendonorTelp){
        this.pendonorTelp = pPendonorTelp;
    }
    
    public String getPendonorPassword(){
        return this.pendonorPassword;
    }
    
    public void setPendonorPassword(String pPendonorPassword){
        this.pendonorPassword = pPendonorPassword;
    }
    
    public String getPendonorEmail(){
        return this.pendonorEmail;
    }
    
    public void setPendonorEmail(String pPendonorEmail){
        this.pendonorEmail = pPendonorEmail;
    }    
    
    public ComPekerjaan getComPekerjaan(){
        return this.comPekerjaan;
    }
    
    public void setComPekerjaan(ComPekerjaan pComPekerjaan){
        this.comPekerjaan = pComPekerjaan;
    }
    
    public ComGolonganDarah getComGolonganDarah(){
        return this.comGolonganDarah;
    }
    
    public void setComGolonganDarah(ComGolonganDarah pComGolonganDarah){
        this.comGolonganDarah = pComGolonganDarah;
    }
    
    public GeneralModel getGmPendonor() {
        gmPendonor = new GeneralModel(pendonor.getPendonorId(), pendonor.getPendonorName(), "Pendonor", pendonor);

        return gmPendonor;
    }    
    
    @Override
    public String toString() {
        return "{pendonorId=" + pendonorId 
                + ",pendonorNo=" + pendonorNo
                + ",pendonorName=" + pendonorName                 
                + ",pendonorGender=" + pendonorGender
                + ",pendonorBirthPlace=" + pendonorBirthPlace
                + ",pendonorBirthDate=" + pendonorBirthDate
                + ",pendonorAddress=" + pendonorAddress 
                + ",pendonorTelp=" + pendonorTelp
                + ",pendonorPassword=" + pendonorPassword
                + ",pendonorEmail=" + pendonorEmail
                + "}";
    }
}
