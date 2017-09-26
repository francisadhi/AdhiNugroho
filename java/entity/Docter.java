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
public class Docter {
    
    private final Docter docter ;
    private Integer docterId;
    private String docterName;
    private String docterAddress;
    private String docterTelp;
    private GeneralModel gmDocter;
    
    public Docter(){
        docter = this;
    }
    
    public Integer getDocterId(){
        return this.docterId;
    }
    
    public void setDocterId(Integer pDocterId){
        this.docterId = pDocterId;
    }
    
    public String getDocterName(){
        return this.docterName;
    }
    
    public void setDocterName(String pDocterName){
        this.docterName = pDocterName;
    }
    
    public String getDocterAddress(){
        return this.docterAddress;
    }
    
    public void setDocterAddress(String pDocterAddress){
        this.docterAddress = pDocterAddress;
    }
    
    public String getDocterTelp(){
        return this.docterTelp;
    }
    
    public void setDocterTelp(String pDocterTelp){
        this.docterTelp = pDocterTelp;
    }
        
    public GeneralModel getGmDocter() {
        gmDocter = new GeneralModel(docter.getDocterId(), docter.getDocterName(), "Docter", docter);

        return gmDocter;
    }
    
    @Override
    public String toString() {
        return "Docter[docterId=" + docterId + ",docterName=" + docterName + ",docterAddress=" + docterAddress + ",docterTelp=" + docterTelp + "]";
    }
}
