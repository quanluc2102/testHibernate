/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domainmodel;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.Generated;

/**
 *
 * @author quanl
 */
@Entity(name = "sinh_vien")
@Table(name = "sinh_vien")
public class SinhVien implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mssv", length = 100, nullable = false)
    private String mssv;

    @Column(name = "ten", length = 100, nullable = false)
    private String ten;

    @Column(name = "ma_lop_học", nullable = false)
    private int maLop;

    @Column(name = "nam_sinh", nullable = false)
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(int id, String mssv, String ten, int maLop, int namSinh) {
        this.id = id;
        this.mssv = mssv;
        this.ten = ten;
        this.maLop = maLop;
        this.namSinh = namSinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", mssv=" + mssv + ", ten=" + ten + ", maLop=" + maLop + ", namSinh=" + namSinh + '}';
    }

}
