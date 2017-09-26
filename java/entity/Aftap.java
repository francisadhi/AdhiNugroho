/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.entity.ComPekerjaan;
import com.entity.ComVolumeKantong;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author heri
 */
public class Aftap {

    private final Aftap aftap;
    private Integer aftapId;
    private String aftapNoKantong;
    private String aftapTanggal;
    private String aftapStatusAmbil;
    private String aftapReaksi;
    private String aftapStatusDonor;
    private ComVolumeKantong comVolumeKantong;
    private Pendonor pendonor;
    private GeneralModel gmAftap;
    
    public Aftap(){
        aftap = this;
    }

    public Integer getAftapId() {
        return this.aftapId;
    }

    public void setAftapId(Integer pAftapId) {
        this.aftapId = pAftapId;
    }
    
    public String getAftapNoKantong(){
        return this.aftapNoKantong;
    }
    
    public void setAftapNoKantong(String pAftapNoKantong){
        this.aftapNoKantong = pAftapNoKantong;
    }

    public String getAftapTanggal() {
        return this.aftapTanggal;
    }

    public void setAftapTanggal(String pAftapTanggal) {
        this.aftapTanggal = pAftapTanggal;
    }

    public String getAftapStatusAmbil() {
        return this.aftapStatusAmbil;
    }

    public void setAftapStatusAmbil(String pAftapStatusAmbil) {
        this.aftapStatusAmbil = pAftapStatusAmbil;
    }

    public String getAftapReaksi() {
        return this.aftapReaksi;
    }

    public void setAftapReaksi(String pAftapReaksi) {
        this.aftapReaksi = pAftapReaksi;
    }
    
    public String getAftapStatusDonor(){
        return this.aftapStatusDonor;
    }
    
    public void setAftapStatusDonor(String pAftapStatusDonor){
        this.aftapStatusDonor = pAftapStatusDonor;
    }
    
    public ComVolumeKantong getComVolumeKantong(){
        return this.comVolumeKantong;
    }
    
    public void setComVolumeKantong(ComVolumeKantong pComVolumeKantong){
        this.comVolumeKantong = pComVolumeKantong;
    }
    
    public Pendonor getPendonor(){
        return this.pendonor;
    }
    
    public void setPendonor(Pendonor pPendonor){
        this.pendonor = pPendonor;
    }
    
    public GeneralModel getGmAftap() {
        gmAftap = new GeneralModel(aftap.getAftapId(), aftap.getAftapStatusAmbil(), "Aftap", aftap);

        return gmAftap;
    }    
    
    @Override
    public String toString() {
        return "Aftap[aftapId=" + aftapId 
                + ",aftapNoKantong=" + aftapNoKantong
                + ",aftapTanggal=" + aftapTanggal
                + ",aftapStatusAmbil=" + aftapStatusAmbil                 
                + ",aftapReaksi=" + aftapReaksi
                + "]";
    }
}
