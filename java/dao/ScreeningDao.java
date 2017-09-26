/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Screening;
import java.util.List;

/**
 *
 * @author heri
 */
public interface ScreeningDao {

    public void insert(Screening pScreening);

    public void update(Screening pScreening);

    public void delete(Integer pScreeningId);

    public List<Screening> selectAll() throws Exception;
    
    public Screening getScreeningById(Integer id) throws Exception;
}
