/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Patient;
import java.util.List;

/**
 *
 * @author heri
 */
public interface PatientDao {

    public void insert(Patient pPatient);

    public void update(Patient pPatient);

    public void delete(Integer pPatientId);

    public List<Patient> selectAll() throws Exception;

    public Integer getNoOfRecords() throws Exception;
    
    public Patient getPatientById(Integer id) throws Exception;
    
    public Patient selectPatientById(Integer pPatientId) throws Exception;
}
