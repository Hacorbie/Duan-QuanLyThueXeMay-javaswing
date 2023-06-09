/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.componentfolder.ViewModel;

import com.componentfolder.Model.ViPhamModel;
import java.util.Date;

/**
 *
 * @author lilyp
 */
public class HoaDonTraXeViewModel {

    private String id, idhd, idkh;
    Date Ngaytra;
    double phiphatsinh, tongtien;
    ViPhamModel vpm;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdhd() {
        return idhd;
    }

    public void setIdhd(String idhd) {
        this.idhd = idhd;
    }

    public Date getNgaytra() {
        return Ngaytra;
    }

    public String getIdkh() {
        return idkh;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public void setNgaytra(Date Ngaytra) {
        this.Ngaytra = Ngaytra;
    }

    public double getTongtien() {
        return tongtien;
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }

    public double getPhiphatsinh() {
        return phiphatsinh;
    }

    public void setPhiphatsinh(double phiphatsinh) {
        this.phiphatsinh = phiphatsinh;
    }

    public ViPhamModel getVpm() {
        return vpm;
    }

    public void setVpm(ViPhamModel vpm) {
        this.vpm = vpm;
    }
}
