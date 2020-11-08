package newAjax.dao;

import newAjax.domain.Area;
import newAjax.domain.Country;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AreaDao {
    public ArrayList<Area> selectAreaByCid(int cid) {
        ArrayList<Area> areaList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cons?serverTimezone=CST&characterEncoding=utf-8",
                    "root",
                    "root"
            );
            PreparedStatement pstat = conn.prepareStatement(
                    "select * from area where cid=?");
            pstat.setInt(1,cid);
            ResultSet rs = pstat.executeQuery();
            while (rs.next()) {
                Area area = new Area();
                area.setAid(rs.getInt("cid"));
                area.setAname(rs.getString("aname"));
                area.setCountry(new Country(rs.getInt("cid"),null));
                areaList.add(area);
            }
            rs.close();
            pstat.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return areaList;
    }
}
