/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author adhi
 */

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DummyDB {
//	private int totalCountries;
//	private String data = "Afghanistan, Albania, Zimbabwe";
//        MysqlDataSource dataSource = new MysqlDataSource();
//        /**
//         * THIS IS CONECCTION CONFIGURATION, PLEASE FIX WITH YOUR DB SETTING
//         *
//         */
//        dataSource.setUrl("jdbc:mysql://localhost:3306/pmitemanggung");
//        dataSource.setUser("root");
//        dataSource.setPassword("adhi");
//
//        Connection con = dataSource.getConnection();
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery("select * from pendonor");
//              
//        
//        ArrayList list = new ArrayList<>();
//            connection.setAutoCommit(false);
//            
//	private List<String> countries;
//	public DummyDB() {
//		countries = new ArrayList<String>();
//		StringTokenizer st = new StringTokenizer(data, ",");
//		
//		while(st.hasMoreTokens()) {
//			countries.add(st.nextToken().trim());
//		}
//		totalCountries = countries.size();
//	}
//	
//	public List<String> getData(String query) {
//		String country = null;
//		query = query.toLowerCase();
//		List<String> matched = new ArrayList<String>();
//		for(int i=0; i<totalCountries; i++) {
//			country = countries.get(i).toLowerCase();
//			if(country.startsWith(query)) {
//				matched.add(countries.get(i));
//			}
//		}
//		return matched;
//	}
}
