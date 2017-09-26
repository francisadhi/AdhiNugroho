package service;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import dao.*;
import com.dao.*;
import dao.implementation.*;
import com.dao.implementation.*;
import dao.PendonorDao;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author joker
 */
public class ConnectionMySQL {

    private static Connection connection;
    
    private static StaffHospitalDao staffHospitalDao;
    private static HospitalDao hospitalDao;
    private static StaffPmiDao staffPmiDao;
    private static PatientDao patientDao;
    private static DocterDao docterDao;
    private static OrderDao orderDao;
    
    private static PendonorDao pendonorDao;
    private static PeriksaDao periksaDao;
    private static AftapDao aftapDao;
    private static ScreeningDao screeningDao;
    private static KomponenDao komponenDao;
    
    private static ComGolonganDarahDao comGolonganDarahDao;
    private static ComKomponenDarahDao comKomponenDarahDao;
    private static ComJaminanDao comJaminanDao;
    private static ComVolumeKantongDao comVolumeKantongDao;
    private static ComPekerjaanDao comPekerjaanDao;
    

    public ConnectionMySQL() {
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                /**
                 * THIS IS CONECCTION CONFIGURATION, PLEASE FIX WITH YOUR DB
                 * SETTING
                 *
                 */
//                dataSource.setUrl("jdbc:mysql://localhost/adhinugroho?autoReconnect=true");
                dataSource.setUrl("jdbc:mysql://localhost:3306/pmitemanggung");
                dataSource.setUser("root");
                dataSource.setPassword("");

                connection = dataSource.getConnection();
            } catch (SQLException e) {
                System.out.println("Database connection Error " + e.getMessage());
            }

        }

        return connection;
    }
    
    // <editor-fold defaultstate="collapsed" desc="*** Connection Master ***"> 
    
    public static ComGolonganDarahDao getComGolonganDarahDao() throws SQLException {
        if (comGolonganDarahDao == null) {
            comGolonganDarahDao = new ComGolonganDarahImplementation(getConnection());
        }
        return comGolonganDarahDao;
    }
    
    public static ComKomponenDarahDao getComKomponenDarahDao() throws SQLException {
        if (comKomponenDarahDao == null) {
            comKomponenDarahDao = new ComKomponenDarahImplementation(getConnection());
        }
        return comKomponenDarahDao;
    }
    
    public static ComJaminanDao getComJaminanDao() throws SQLException {
        if (comJaminanDao == null) {
            comJaminanDao = new ComJaminanImplementation(getConnection());
        }
        return comJaminanDao;
    }

    public static ComVolumeKantongDao getComVolumeKantongDao() throws SQLException {
        if (comVolumeKantongDao == null) {
            comVolumeKantongDao = new ComVolumeKantongImplementation(getConnection());
        }
        return comVolumeKantongDao;
    }
        
    public static ComPekerjaanDao getComPekerjaanDao() throws SQLException {
        if (comPekerjaanDao == null) {
            comPekerjaanDao = new ComPekerjaanImplementation(getConnection());
        }
        return comPekerjaanDao;
    }
    
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="*** Connection Hospital ***"> 
    public static HospitalDao getHospitalDao() throws SQLException {
        if (hospitalDao == null) {
            hospitalDao = new HospitalImplementation(getConnection());
        }
        return hospitalDao;
    }  

    public static PatientDao getPatientDao() throws SQLException {
        if (patientDao == null) {
            patientDao = new PatientImplementation(getConnection());
        }
        return patientDao;
    }  
    
    public static StaffHospitalDao getStaffHospitalDao() throws SQLException {
        if (staffHospitalDao == null) {
            staffHospitalDao = new StaffHospitalImplementation(getConnection());
        }
        return staffHospitalDao;
    }
    
    public static DocterDao getDocterDao() throws SQLException {
        if (docterDao == null) {
            docterDao = new DocterImplementation(getConnection());
        }
        return docterDao;
    }
    
    public static OrderDao getOrderDao() throws SQLException {
        if (orderDao == null) {
            orderDao = new OrderImplementation(getConnection());
        }
        return orderDao;
    }
    // </editor-fold>       
    
    // <editor-fold defaultstate="collapsed" desc="*** Connection Staff PMI ***"> 
    public static StaffPmiDao getStaffPmiDao() throws SQLException {
        if (staffPmiDao == null) {
            staffPmiDao = new StaffPmiImplementation(getConnection());
        }
        return staffPmiDao;
    }
    
    public static PendonorDao getPendonorDao() throws SQLException {
        if (pendonorDao == null) {
            pendonorDao = new PendonorImplementation(getConnection());
        }
        return pendonorDao;
    }    
    
    public static PeriksaDao getPeriksaDao() throws SQLException {
        if (periksaDao == null) {
            periksaDao = new PeriksaImplementation(getConnection());
        }
        return periksaDao;
    }
    
    public static AftapDao getAftapDao() throws SQLException {
        if (aftapDao == null) {
            aftapDao = new AftapImplementation(getConnection());
        }
        return aftapDao;
    }
    
    public static ScreeningDao getScreeningDao() throws SQLException {
        if (screeningDao == null) {
            screeningDao = new ScreeningImplementation(getConnection());
        }
        return screeningDao;
    }
    
    public static KomponenDao getKomponenDao() throws SQLException {
        if (komponenDao == null) {
            komponenDao = new KomponenImplementation(getConnection());
        }
        return komponenDao;
    }
    // </editor-fold>
}
