package newAjax.dao;

import newAjax.domain.City;
import newAjax.domain.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CountryDao {

    private City city = new City();

    public ArrayList<Country> selectAllCountry() {
        ArrayList<Country> countryList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cons?serverTimezone=CST&characterEncoding=utf-8",
                    "root",
                    "root"
            );
            PreparedStatement pstat = conn.prepareStatement(
                    "select * from country");
            ResultSet rs = pstat.executeQuery();
            while (rs.next()) {
                Country country = new Country();
                country.setCid(rs.getInt("cid"));
                country.setCname(rs.getString("cname"));
                countryList.add(country);
            }
            rs.close();
            pstat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
