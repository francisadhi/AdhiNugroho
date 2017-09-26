/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Pendonor;
import java.util.List;

/**
 *
 * @author heri
 */
public interface PendonorDao {

    public void insert(Pendonor pPendonor);

    public void update(Pendonor pPendonor);

    public void delete(Integer pPendonorId);

    public List<Pendonor> selectAll() throws Exception;
    
    public Pendonor selectPendonorById(Integer pPendonorId) throws Exception;
    
    public List<Pendonor> selectAllForAutoCompleteComboBox(String pPendonorName) throws Exception;
        
    public Pendonor getPendonorById(Integer id) throws Exception;
}
