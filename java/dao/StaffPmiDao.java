/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.StaffPmi;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface StaffPmiDao {

    public void Insert(StaffPmi staffPmi) throws Exception;

    public void Update(StaffPmi staffPmi) throws Exception;

    public void Delete(Integer idStaffPmi) throws Exception;

    public List<StaffPmi> selectAll() throws Exception;

    public List<StaffPmi> selectAllWithLimit(int offset, int noOfRecords) throws Exception;

    public Integer getNoOfRecords() throws Exception;

    public StaffPmi getStaffPmiById(Integer idStaffPmi) throws Exception;

    public StaffPmi getStaffPmiByNameAndPass(String Name, String Password) throws Exception;

}
