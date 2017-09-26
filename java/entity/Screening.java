/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import entity.Aftap;

/**
 *
 * @author heri
 */
public class Screening {

    private final Screening screening;
    private Integer screeningId;
    private String screeningNo;
    private String screeningTanggal;
    private String screeningHbsag;
    private String screeningAntiHiv;
    private String screeningAntiHcv;
    private String screeningVprl;
    private Aftap aftap;
    private GeneralModel gmScreening;
    
    public Screening(){
        screening = this;
    }

    public Integer getScreeningId() {
        return this.screeningId;
    }

    public void setScreeningId(Integer pScreeningId) {
        this.screeningId = pScreeningId;
    }

    public String getScreeningNo() {
        return this.screeningNo;
    }

    public void setScreeningNo(String pScreeningNo) {
        this.screeningNo = pScreeningNo;
    }

    public String getScreeningTanggal() {
        return this.screeningTanggal;
    }

    public void setScreeningTanggal(String pScreeningTanggal) {
        this.screeningTanggal = pScreeningTanggal;
    }

    public String getScreeningHbsag() {
        return this.screeningHbsag;
    }

    public void setScreeningHbsag(String pScreeningHbsag) {
        this.screeningHbsag = pScreeningHbsag;
    }

    public String getScreeningAntiHiv() {
        return this.screeningAntiHiv;
    }

    public void setScreeningAntiHiv(String pScreeningAntiHiv) {
        this.screeningAntiHiv = pScreeningAntiHiv;
    }

    public String getScreeningAntiHcv() {
        return this.screeningAntiHcv;
    }
    
    public void setScreeningAntiHcv(String pScreeningAntiHcv){
        this.screeningAntiHcv = pScreeningAntiHcv;
    }
    
    public String getScreeningVprl(){
        return this.screeningVprl;
    }
    
    public void setScreeningVprl(String pScreeningVprl){
        this.screeningVprl = pScreeningVprl;
    }  
    
    public Aftap getAftap(){
        return this.aftap;
    }
    
    public void setAftap(Aftap pAftap){
        this.aftap = pAftap;
    }
    
    public GeneralModel getGmScreening() {
        gmScreening = new GeneralModel(screening.getScreeningId(), screening.getScreeningTanggal(), "Screening", screening);

        return gmScreening;
    }    
    
    @Override
    public String toString() {
        return "Screening[screeningId=" + screeningId 
                + ",screeningNo=" + screeningNo
                + ",screeningTanggal=" + screeningTanggal                 
                + ",screeningHbsag=" + screeningHbsag
                + ",screeningAntiHiv=" + screeningAntiHiv 
                + ",screeningAntiHcv=" + screeningAntiHcv
                + ",screeningVprl=" + screeningVprl
                + "]";
    }
}
