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
public class Member extends User{
    private String tanggal_daftar;
    private String status;
    
    public Member(int userID, String nama, String alamat, String email, String tanggal, String status) {
        super(userID, nama, alamat, email);
        this.tanggal_daftar = tanggal;
        this.status = status;
    }
    
    @Override
    public void ShowInfo() {
        System.out.println("ID Member      : "+userID);
        System.out.println("Nama Member    : "+nama);
        System.out.println("Alamat Member  : "+alamat);
        System.out.println("Email Member   : "+email);
        System.out.println("Tanggal Daftar : "+email);
        System.out.println("Status Member   : "+email);
    }
}
