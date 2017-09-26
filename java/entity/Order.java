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
public class Order {
    private final Order order;
    private Integer orderId;
    private String orderNo;
    private String orderTanggal;
    private String orderNoKartu;
    private String orderHb;
    private String orderDiagnosa;
    private String orderKelas;
    private String orderBangsal;
    private String orderTanggalMasuk;
    private String orderTanggalDigunakan;
    private String orderJmlMinta;
    private String orderJenisPermintaan;
    private String orderStatus;
    private Hospital hospital;
    private Patient patient;
    private Docter docter;
    private GeneralModel gmOrder;
    
    public Order(){
        order = this;
    }
    
    public Integer getOrderId(){
        return this.orderId;
    }
    
    public void setOrderId(Integer pOrderId){
        this.orderId = pOrderId;
    }
    
    public String getOrderNo(){
        return this.orderNo;
    }
    
    public void setOrderNo(String pOrderNo){
        this.orderNo = pOrderNo;
    }
        
    public String getOrderTanggal(){
        return this.orderTanggal;
    }
        
    public void setOrderTanggal(String pOrderTanggal){
        this.orderTanggal = pOrderTanggal;
    }
    
    public String getOrderNoKartu(){
        return this.orderNoKartu;
    }
    
    public void setOrderNoKartu(String pOrderNoKartu){
        this.orderNoKartu = pOrderNoKartu;
    }
    
    public String getOrderHb(){
        return this.orderHb;
    }
    
    public void setOrderHb(String pOrderHb){
        this.orderHb = pOrderHb;
    }
    
    public String getOrderDiagnosa(){
        return this.orderDiagnosa;
    }
    
    public void setOrderDiagnosa(String pOrderDiagnosa){
        this.orderDiagnosa = pOrderDiagnosa;
    }
    
    public String getOrderKelas(){
        return this.orderKelas;
    }
    
    public void setOrderKelas(String pOrderKelas){
        this.orderKelas = pOrderKelas;
    }
    
    public String getOrderBangsal(){
        return this.orderBangsal;
    }
    
    public void setOrderBangsal(String pOrderBangsal){
        this.orderBangsal = pOrderBangsal;
    }
    
    public String getOrderTanggalMasuk(){
        return this.orderTanggalMasuk;
    }
    
    public void setOrderTanggalMasuk(String pOrderTanggalMasuk){
        this.orderTanggalMasuk = pOrderTanggalMasuk;
    }
    
    public String getOrderTanggalDigunakan(){
        return this.orderTanggalDigunakan;
    }
    
    public void setOrderTanggalDigunakan(String pOrderTanggalDigunakan){
        this.orderTanggalDigunakan = pOrderTanggalDigunakan;
    }
    
    public String getOrderJmlMinta(){
        return this.orderJmlMinta;
    }
    
    public void setOrderJmlMinta(String pOrderJmlMinta){
        this.orderJmlMinta = pOrderJmlMinta;
    }
    
    public String getOrderJenisPermintaan(){
        return this.orderJenisPermintaan;
    }
    
    public void setOrderJenisPermintaan(String pOrderPermintaan){
        this.orderJenisPermintaan = pOrderPermintaan;
    }
    
    public String getOrderStatus(){
        return this.orderStatus;
    }
    
    public void setOrderStatus(String pOrderStatus){
        this.orderStatus = pOrderStatus;
    }
    
    public Hospital getHospital(){
        return this.hospital;
    }
    
    public void setHospital(Hospital pHospital){
        this.hospital = pHospital;
    }
    
    public Patient getPatient(){
        return this.patient;
    }
    
    public void setPatient(Patient pPatient){
        this.patient = pPatient;
    }
    
    public Docter getDocter(){
        return this.docter;
    }
    
    public void setDocter(Docter pDocter){
        this.docter = pDocter;
    }
        
    public GeneralModel getGmOrder() {
        gmOrder = new GeneralModel(order.getOrderId() , order.getOrderNo(), "Order", order);

        return gmOrder;
    }
}
