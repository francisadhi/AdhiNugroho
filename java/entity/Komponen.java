/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.entity.ComKomponenDarah;
import entity.Aftap;

/**
 *
 * @author heri
 */
public class Komponen {

    private final Komponen komponen;
    private Integer komponenId;
    private String komponenNo;
    private String komponenTanggal;
    private ComKomponenDarah comKomponenDarah;
    private Aftap aftap;
    private GeneralModel gmKomponen;
    
    public Komponen(){
        komponen = this;
    }

    public Integer getKomponenId() {
        return this.komponenId;
    }

    public void setKomponenId(Integer pKomponenId) {
        this.komponenId = pKomponenId;
    }

    public String getKomponenNo() {
        return this.komponenNo;
    }

    public void setKomponenNo(String pKomponenNo) {
        this.komponenNo = pKomponenNo;
    }

    public String getKomponenTanggal() {
        return this.komponenTanggal;
    }

    public void setKomponenTanggal(String pKomponenTanggal) {
        this.komponenTanggal = pKomponenTanggal;
    }
    
    public ComKomponenDarah getComKomponenDarah(){
        return this.comKomponenDarah;
    }
    
    public void setComKomponenDarah(ComKomponenDarah pComKomponenDarah){
        this.comKomponenDarah = pComKomponenDarah;
    }
    
    public Aftap getAftap(){
        return this.aftap;
    }
    
    public void setAftap(Aftap pAftap){
        this.aftap = pAftap;
    }
    
    public GeneralModel getGmKomponen() {
        gmKomponen = new GeneralModel(komponen.getKomponenId(), komponen.getKomponenTanggal(), "Komponen", comKomponenDarah);

        return gmKomponen;
    }    
    
    @Override
    public String toString() {
        return "Komponen[comKomponenDarahId=" + komponenId 
                + ",comKomponenDarahNo=" + komponenNo
                + ",comKomponenDarahTanggal=" + komponenTanggal       
                + "]";
    }
}
