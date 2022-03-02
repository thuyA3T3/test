/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan_8;

/**
 *
 * @author thuyd
 */


import java.util.List;

public class XeRac {
    private int tgTBDiVeDoRac;
    private int tgTBTaiRac;
    private double taiTrongToiDa ;
    private double chiPhiTrenPhut;
    private double soRacTrenXe;
    private int tongThoiGian;
    private int soLanDoRac;
    private List<TramRac> tramRac;
    private BaiDoRac baiDoRac;

    public XeRac(int tgTBDiVeDoRac, int tgTBTaiRac, double taiTrongToiDa, double chiPhiTrenPhut, List<TramRac> tramRac, BaiDoRac baiDoRac) {
        this.tgTBDiVeDoRac = tgTBDiVeDoRac;
        this.tgTBTaiRac = tgTBTaiRac;
        this.taiTrongToiDa = taiTrongToiDa;
        this.chiPhiTrenPhut = chiPhiTrenPhut;
        this.tramRac = tramRac;
        this.baiDoRac = baiDoRac;
    }

    public XeRac() {
    }

    public void tongThoiGianTaiRac(){
        this.tongThoiGian += tgTBTaiRac;
    }

    public void taiRac(){
        double soRacConLai;
        for (TramRac rac : tramRac) {
            soRacConLai = rac.getSoKg();
            if (this.soRacTrenXe + soRacConLai > this.taiTrongToiDa) {
                soRacConLai = (soRacConLai - (this.taiTrongToiDa - this.soRacTrenXe));
                doRac();
                tongThoiGianTaiRac();
            }

            if (this.soRacTrenXe + soRacConLai <= this.taiTrongToiDa) {
                soRacTrenXe += soRacConLai;
                tongThoiGianTaiRac();
            }
        }
        doRac();
    }


    public void doRac(){
        this.soRacTrenXe = 0;
        this.tongThoiGian += tgTBDiVeDoRac;
        this.soLanDoRac ++;
    }


    public double chiPhiDoRac(){
        return this.baiDoRac.getSoTienMoiLanDo() * this.soLanDoRac;
    }

    public double chiPhiNhanCong(){
        return this.tongThoiGian * this.chiPhiTrenPhut;
    }
    public double tongChiPhi(){
        return chiPhiDoRac()+chiPhiNhanCong();
    }




    public int getTgTBDiVeDoRac() {
        return tgTBDiVeDoRac;
    }

    public void setTgTBDiVeDoRac(int tgTBDiVeDoRac) {
        this.tgTBDiVeDoRac = tgTBDiVeDoRac;
    }

    public int getTgTBTaiRac() {
        return tgTBTaiRac;
    }

    public void setTgTBTaiRac(int tgTBTaiRac) {
        this.tgTBTaiRac = tgTBTaiRac;
    }

    public double getTaiTrongToiDa() {
        return taiTrongToiDa;
    }

    public void setTaiTrongToiDa(double taiTrongToiDa) {
        this.taiTrongToiDa = taiTrongToiDa;
    }

    public double getSoRacTrenXe() {
        return soRacTrenXe;
    }

    public void setSoRacTrenXe(double soRacTrenXe) {
        this.soRacTrenXe = soRacTrenXe;
    }

    public int getTongThoiGian() {
        return tongThoiGian;
    }

    public void setTongThoiGian(int tongThoiGian) {
        this.tongThoiGian = tongThoiGian;
    }

    public int getSoLanDoRac() {
        return soLanDoRac;
    }

    public void setSoLanDoRac(int soLanDoRac) {
        this.soLanDoRac = soLanDoRac;
    }

    public double getChiPhiTrenPhut() {
        return chiPhiTrenPhut;
    }

    public void setChiPhiTrenPhut(double chiPhiTrenPhut) {
        this.chiPhiTrenPhut = chiPhiTrenPhut;
    }

    public List<TramRac> getTramRac() {
        return tramRac;
    }

    public void setTramRac(List<TramRac> tramRac) {
        this.tramRac = tramRac;
    }

    public BaiDoRac getBaiDoRac() {
        return baiDoRac;
    }
    
    public void setBaiDoRac(BaiDoRac baiDoRac) {
        this.baiDoRac = baiDoRac;
    }
}