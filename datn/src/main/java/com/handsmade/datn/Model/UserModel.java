package com.handsmade.datn.Model;

public class UserModel{
    private String fullname;
    private String address;
    private String email;
    private String phone;
    private String username;
    private String password;  

    public UserModel() {        
    }
    public UserModel(String fullname, String address, String email,
                     String phone, String username, String password) {
        this.fullname = fullname;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel [fullname=" + fullname + ", address=" + address + ", email=" + email
                + ", phone=" + phone + ", username=" + username + "]";
    }

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
