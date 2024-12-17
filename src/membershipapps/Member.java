/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membershipapps;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Member{
    private String tanggal_daftar;
    private String status;
    
    public Member(String nama, String alamat) {
        this.tanggal_daftar = nama;
        this.status = alamat;
    }

    public String getTanggal_daftar() {
        return tanggal_daftar;
    }

    public void setTanggal_daftar(String tanggal_daftar) {
        this.tanggal_daftar = tanggal_daftar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
