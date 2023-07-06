/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;



public class Person
{
    protected String name ;
    protected int id ;
    protected String userName;

    public String getUserName() {return userName+"@nu.edu.eg";}

    public void setUserName(String userName) {this.userName = userName;}
    

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    @Override
    public String toString() {
        
        String Sid;
        Sid = Integer.toString(id);
        return  Sid+","+name;
    }
}
