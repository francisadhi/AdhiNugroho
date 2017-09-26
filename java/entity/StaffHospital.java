/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author heri
 */
public class StaffHospital {
    
    private final StaffHospital staffHospital ;
    private Integer staffHospitalId;
    private String staffHospitalName;
    private String staffHospitalAddress;
    private String staffHospitalTelp;
    private GeneralModel gmStaffHospital;
    
    public StaffHospital(){
        staffHospital = this;
    }
    
    public Integer getStaffHospitalId(){
        return this.staffHospitalId;
    }
    
    public void setStaffHospitalId(Integer pStaffHospitalId){
        this.staffHospitalId = pStaffHospitalId;
    }
    
    public String getStaffHospitalName(){
        return this.staffHospitalName;
    }
    
    public void setStaffHospitalName(String pStaffHospitalName){
        this.staffHospitalName = pStaffHospitalName;
    }
    
    public String getStaffHospitalAddress(){
        return this.staffHospitalAddress;
    }
    
    public void setStaffHospitalAddress(String pStaffHospitalAddress){
        this.staffHospitalAddress = pStaffHospitalAddress;
    }
    
    public String getStaffHospitalTelp(){
        return this.staffHospitalTelp;
    }
    
    public void setStaffHospitalTelp(String pStaffHospitalTelp){
        this.staffHospitalTelp = pStaffHospitalTelp;
    }
        
    public GeneralModel getGmDocter() {
        gmStaffHospital = new GeneralModel(staffHospital.getStaffHospitalId(), staffHospital.getStaffHospitalName(), "StaffHospital", staffHospital);

        return gmStaffHospital;
    }
    
    @Override
    public String toString() {
        return "StaffHospital[staffHospitalId=" + staffHospitalId + ",staffHospitalName=" + staffHospitalName + ",staffHospitalAddress=" + staffHospitalAddress + ",staffHospitalTelp=" + staffHospitalTelp + "]";
    }
}
