/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class Hospital {

    private final Hospital hospital ;
    private Integer hospitalId;
    private String hospitalName;
    private String hospitalAlamat;
    private String hospitalTelp;
    private String hospitalLokasi;
    private String hospitalUsername;
    private String hospitalPassword;
    private GeneralModel gmHospital;
    
    public Hospital() {
        hospital = this;
    }
        
    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAlamat() {
        return hospitalAlamat;
    }

    public void setHospitalAlamat(String hospitalAlamat) {
        this.hospitalAlamat = hospitalAlamat;
    }

    public String getHospitalTelp() {
        return hospitalTelp;
    }

    public void setHospitalTelp(String hospitalTelp) {
        this.hospitalTelp = hospitalTelp;
    }

    public String getHospitalLokasi() {
        return hospitalLokasi;
    }

    public void setHospitalLokasi(String hospitalLokasi) {
        this.hospitalLokasi = hospitalLokasi;
    }
    
    public String getHospitalUsername(){
        return hospitalUsername;
    }
    
    public void setHospitalUsername(String hospitalUsername){
        this.hospitalUsername = hospitalUsername;
    }
        
    public String getHospitalPassword() {
        return hospitalPassword;
    }

    public void setHospitalPassword(String hospitalPassword) {
        this.hospitalPassword = hospitalPassword;
    }
    
    public GeneralModel getGmHospital() {
        gmHospital = new GeneralModel(hospital.getHospitalId(), hospital.getHospitalName(), "Hospital", hospital);

        return gmHospital;
    }
    
    @Override
    public String toString() {
        return "Hospital[hospitalId=" + hospitalId + 
                ",hospitalName=" + hospitalName + 
                ",hospitalAlamat=" + hospitalAlamat + 
                ",hospitalLokasi=" + hospitalLokasi + "]";
    }
}
