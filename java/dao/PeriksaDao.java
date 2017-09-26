/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Periksa;
import java.util.List;

/**
 *
 * @author heri
 */
public interface PeriksaDao {

    public void insert(Periksa pPeriksa);

    public void update(Periksa pPeriksa);

    public void delete(Integer pPeriksaId);

    public List<Periksa> selectAll() throws Exception;
    
    public Periksa getPeriksaById(Integer id) throws Exception;
    
    public boolean isAvailableDonatorPerToday(String pPendonorNo) throws Exception;
}
