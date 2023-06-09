/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.componentfolder.Service.Impl;

import com.componentfolder.ViewModel.KhachHangViewModel;
import com.componentfolder.Model.KhachHangModel;
import com.componentfolder.Repository.KhachHangRepo;
import com.componentfolder.Service.KhachHangService;
import java.util.ArrayList;

/**
 *
 * @author HA NGUYEN
 */
public class KhachHangServiceImpl implements KhachHangService {

    KhachHangRepo khrp = new KhachHangRepo();

    @Override
    public ArrayList<KhachHangViewModel> getListKH() {
        return khrp.getListKh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean addKH(KhachHangModel kh) {
        return khrp.add(kh); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateKH(KhachHangModel kh) {
        return khrp.update(kh);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getcountDB() {
        return khrp.getcountDB(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<KhachHangViewModel> search(String tenn) {
        return khrp.search(tenn);//To change body of generated methods, choose Tools | Templates.
    }

}
