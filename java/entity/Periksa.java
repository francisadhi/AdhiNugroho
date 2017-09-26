/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.entity.ComPekerjaan;

/**
 *
 * @author heri
 */
public class Periksa {

    private final Periksa periksa;
    private Integer periksaId;
    private String periksaTensi;
    private String periksaTanggal;
    private String periksaSuhu;
    private String periksaBeratBadan;
    private String periksaRiwayatMedis;
    private String periksaKeputusan;
    private String periksaAlasan;
    private Pendonor pendonor;
    private GeneralModel gmPeriksa;
    
    public Periksa(){
        periksa = this;
    }

    public Integer getPeriksaId() {
        return this.periksaId;
    }

    public void setPeriksaId(Integer pPeriksaId) {
        this.periksaId = pPeriksaId;
    }

    public String getPeriksaTanggal() {
        return this.periksaTanggal;
    }

    public void setPeriksaTanggal(String pPeriksaTanggal) {
        this.periksaTanggal = pPeriksaTanggal;
    }
    
    public String getPeriksaTensi(){
        return this.periksaTensi;
    }
    
    public void setPeriksaTensi(String pPeriksaTensi){
        this.periksaTensi = pPeriksaTensi;
    }

    public String getPeriksaSuhu() {
        return this.periksaSuhu;
    }

    public void setPeriksaSuhu(String pPeriksaSuhu) {
        this.periksaSuhu = pPeriksaSuhu;
    }

    public String getPeriksaBeratBadan() {
        return this.periksaBeratBadan;
    }

    public void setPeriksaBeratBadan(String pPeriksaBeratBadan) {
        this.periksaBeratBadan = pPeriksaBeratBadan;
    }

    public String getPeriksaRiwayatMedis() {
        return this.periksaRiwayatMedis;
    }

    public void setPeriksaRiwayatMedis(String pPeriksaRiwayatMedis) {
        this.periksaRiwayatMedis = pPeriksaRiwayatMedis;
    }

    public String getPeriksaKeputusan() {
        return this.periksaKeputusan;
    }

    public void setPeriksaKeputusan(String pPeriksaKeputusan) {
        this.periksaKeputusan = pPeriksaKeputusan;
    }

    public String getPeriksaAlasan() {
        return this.periksaAlasan;
    }

    public void setPeriksaAlasan(String pPeriksaAlasan) {
        this.periksaAlasan = pPeriksaAlasan;
    }
    
    public Pendonor getPendonor(){
        return this.pendonor;
    }
    
    public void setPendonor(Pendonor pPendonor){
        this.pendonor = pPendonor;
    }
    
    public GeneralModel getGmPeriksa() {
        gmPeriksa = new GeneralModel(periksa.getPeriksaId(), periksa.getPeriksaSuhu(), "Periksa", periksa);

        return gmPeriksa;
    }    
    
    @Override
    public String toString() {
        return "Periksa[periksaId=" + periksaId 
                + ",periksaTanggal=" + periksaTanggal
                + ",periksaTensi="+ periksaTensi
                + ",periksaSuhu=" + periksaSuhu                 
                + ",periksaBeratBadan=" + periksaBeratBadan
                + ",periksaRiwayatMedis=" + periksaRiwayatMedis
                + ",periksaKeputusan=" + periksaKeputusan
                + ",periksaAlasan=" + periksaAlasan 
                + "]";
    }
}
