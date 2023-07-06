/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;





public class Librarians extends Person 
{
    private String librarianpassword;

    
    public String getLibrarianpassword() {return librarianpassword;}
    public void setLibrarianpassword(String librarianpassword) {this.librarianpassword = librarianpassword;}
    
        @Override
    public String toString() {return super.toString()+","+librarianpassword+","+userName;}
}
