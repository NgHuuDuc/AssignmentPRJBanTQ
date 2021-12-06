/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Customer {

    private int CusID;
    private String UserName;
    private String Password;
    private String Email;
    private String Phone;
    private int IsAdmin;
    private int IsUser;
    
    public Customer() {
    }

    public Customer(int CusID, String UserName, String Password, String Email, String Phone, int IsAdmin, int IsUser) {
        this.CusID = CusID;
        this.UserName = UserName;
        this.Password = Password;
        this.Email = Email;
        this.Phone = Phone;
        this.IsAdmin = IsAdmin;
        this.IsUser = IsUser;
    }

   

    public int getCusID() {
        return CusID;
    }

    public void setCusID(int CusID) {
        this.CusID = CusID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public int getIsUser() {
        return IsUser;
    }

    public void setIsUser(int IsUser) {
        this.IsUser = IsUser;
    }

    @Override
    public String toString() {
        return "Customer{" + "CusID=" + CusID + ", UserName=" + UserName + ", Password=" + Password + ", Email=" + Email + ", Phone=" + Phone + ", IsAdmin=" + IsAdmin + ", IsUser=" + IsUser + '}';
    }
    
}
