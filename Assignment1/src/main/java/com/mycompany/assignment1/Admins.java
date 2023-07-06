/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;



public class Admins extends Person
{
    private String adminPassword;


    
    
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public String getAdminPassword() {return adminPassword;}

    @Override
    public String toString() {return super.toString()+","+adminPassword+","+userName;}
 

}
