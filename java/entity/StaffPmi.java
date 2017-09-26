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
public class StaffPmi {

    private final StaffPmi staffPmi ;
    private Integer staffPmiId;
    private String staffPmiName;
    private String staffPmiAlamat;
    private String staffPmiTelp;
    private String staffPmiLokasi;
    private String staffPmiUsername;
    private String staffPmiPassword;
    private GeneralModel gmStaffPmi;
    
    public StaffPmi() {
        staffPmi = this;
    }
        
    public Integer getStaffPmiId() {
        return staffPmiId;
    }

    public void setStaffPmiId(Integer pStaffPmiId) {
        this.staffPmiId = staffPmiId;
    }

    public String getStaffPmiName() {
        return staffPmiName;
    }

    public void setStaffPmiName(String pStaffPmiName) {
        this.staffPmiName = staffPmiName;
    }

    public String getStaffPmiAddress() {
        return staffPmiAlamat;
    }

    public void setStaffPmiAddress(String pStaffPmiAddress) {
        this.staffPmiAlamat = staffPmiAlamat;
    }

    public String getStaffPmiTelp() {
        return staffPmiTelp;
    }

    public void setStaffPmiTelp(String pStaffPmiTelp) {
        this.staffPmiTelp = staffPmiTelp;
    }
    
    public String getStaffPmiUsername(){
        return staffPmiUsername;
    }
    
    public void setStaffPmiUsername(String pStaffPmiUsername){
        this.staffPmiUsername = staffPmiUsername;
    }
        
    public String getStaffPmiPassword() {
        return staffPmiPassword;
    }

    public void setStaffPmiPassword(String pStaffPmiPassword) {
        this.staffPmiPassword = staffPmiPassword;
    }
    
    public GeneralModel getGmStaffPmi() {
        gmStaffPmi = new GeneralModel(staffPmi.getStaffPmiId(), staffPmi.getStaffPmiName(), "StaffPmi", staffPmi);

        return gmStaffPmi;
    }
    
    @Override
    public String toString() {
        return "StaffPmi[staffPmiId=" + staffPmiId + 
                ",staffPmiName=" + staffPmiName + 
                ",staffPmiAlamat=" + staffPmiAlamat + 
                ",staffPmiLokasi=" + staffPmiLokasi + "]";
    }
}
