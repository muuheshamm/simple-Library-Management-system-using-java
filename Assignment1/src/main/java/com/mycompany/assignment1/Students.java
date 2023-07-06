/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;


public class Students extends Person
{
    private String studentBirthday ;
    private String email ;
    private String mobileNumber;
    
        
    public String getStudentBirthday(){return studentBirthday;}
    public void setStudentBirthday(String studentBirthday){this.studentBirthday = studentBirthday;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}
    public String getMobileNumber(){return mobileNumber;}
    public void setMobileNumber(String mobileNumber){this.mobileNumber = mobileNumber;}

    @Override
    public String toString(){return super.toString() +","+ studentBirthday + "," + email + "," + mobileNumber;}
}
