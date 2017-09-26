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
public class KantongDarah {
    private Integer kantongId;
    private String kantongNo;
    private String kantongDate;
    private String kantongPrice;
    
    
    public Integer getKantongId(){
        return this.kantongId;
    }
    
    public void setKantongId(Integer pKantongId){
        this.kantongId = pKantongId;
    }
    
    public String getKantongNo(){
        return this.kantongNo;
    }
    
    public void setKantongNo(String pKantongNo){
        this.kantongNo = pKantongNo;
    }
    
    public String getKantongDate(){
        return this.kantongDate;
    }
    
    public void setKantongDate(String pKantongDate){
        this.kantongDate = pKantongDate;
    }
    
    public String getKantongPrice(){
        return this.kantongPrice;
    }
    
    public void setKantongPrice(String pKantongPrice){
        this.kantongPrice = pKantongPrice;
    }    
}
