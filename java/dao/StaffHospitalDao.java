/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Docter;
import entity.StaffHospital;
import entity.StaffHospital;
import java.util.List;

/**
 *
 * @author heri
 */
public interface StaffHospitalDao {

    public void insert(StaffHospital pStaffHospital);

    public void update(StaffHospital pStaffHospital);

    public void delete(Integer pStaffHospitalId);

    public List<StaffHospital> selectAll() throws Exception;

    public Integer getNoOfRecords() throws Exception;
        
    public StaffHospital getStaffHospitalById(Integer id) throws Exception;
    
    public List<StaffHospital> selectAllWithLimit(int offset, int noOfRecords) throws Exception;
}
