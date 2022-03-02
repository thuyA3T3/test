/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan_8;

/**
 *
 * @author thuyd
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<TramRac> tramRacList = nhapTramRac();
        BaiDoRac baiDoRac = new BaiDoRac(57000);
        XeRac xeRac = new XeRac(30,8,10000,2000,tramRacList,baiDoRac);
        xeRac.taiRac();
        System.out.println(xeRac.getSoLanDoRac());
        System.out.println(xeRac.getTongThoiGian());
        double tongChiPhi = xeRac.tongChiPhi();
        System.out.println(tongChiPhi);
    }
    public static List<TramRac> nhapTramRac(){
        System.out.print("Nhap so tram : ");
        int n = sc.nextInt();
        List<TramRac> tramRacList = new ArrayList<>();
        for (int i=0;i<n;i++){
            System.out.printf("Nhap so kg cua tram %d : ",i+1);
            TramRac tramRac = new TramRac(sc.nextDouble());
            tramRacList.add(tramRac);
        }
        return tramRacList;
    }


}
