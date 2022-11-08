/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import JDBC.JdbcUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.hocKy;

/**
 *
 * @author PC
 */
public class hocKyRepo {

    public void insert(hocKy hk) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "INSERT INTO hoc_ky" + "(ten, co_so, so_sv_nhap_hoc)"
                    + "VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hk.getTen());
            ps.setString(2, hk.getCoSo());
            ps.setInt(3, hk.getSoSV());
            ps.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void update(int id, hocKy hk) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "UPDATE hoc_ky SET ten=?, co_so=?, so_sv_nhap_hoc=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hk.getTen());
            ps.setString(2, hk.getCoSo());
            ps.setInt(3, hk.getSoSV());
            ps.setInt(4, hk.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "DELETE FROM hoc_ky WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<hocKy> all() {
        ArrayList<hocKy> listHK = new ArrayList<>();
        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "SELECT * FROM hoc_ky";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ten = rs.getString("ten");
                String coSo = rs.getString("co_so");
                int soSV = rs.getInt("so_sv_nhap_hoc");
                hocKy hk = new hocKy(id, ten, coSo, soSV);
                listHK.add(hk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listHK;
    }
}
