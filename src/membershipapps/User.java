/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membershipapps;

/**
 *
 * @author ACER
 */
public abstract class User {
    protected int userID;
    protected String nama;
    protected String alamat;
    protected String email;
    
    public User(int userID, String nama, String alamat, String email) {
        this.userID = userID;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
    }
    
    public abstract void ShowInfo ();
}
