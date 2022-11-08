/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class hocKy {
    private int Id;
    private String ten;
    private String coSo;
    private int soSV;

    public hocKy() {
    }

    public hocKy(int Id, String ten, String coSo, int soSV) {
        this.Id = Id;
        this.ten = ten;
        this.coSo = coSo;
        this.soSV = soSV;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCoSo() {
        return coSo;
    }

    public void setCoSo(String coSo) {
        this.coSo = coSo;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }
    
}
