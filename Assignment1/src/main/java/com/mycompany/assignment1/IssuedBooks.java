/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;


public class IssuedBooks 
{
    int procedureId;
    int bookId;
    int studentId;
    boolean returned;

    public int getProcedureId() {return procedureId;}
    public void setProcedureId(int procedureId) {this.procedureId = procedureId;}
    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {this.bookId = bookId;}
    public int getStudentId() {return studentId;}
    public void setStudentId(int studentId) {this.studentId = studentId;}
    public boolean isReturned() {return returned;}
    public void setReturned(boolean returned) {this.returned = returned;}
    
    
        @Override
        public String toString() {
        String PID,BID,SID;
        PID=Integer.toString(procedureId);
        BID=Integer.toString(bookId);
        SID=Integer.toString(studentId);
        return PID+","+BID+","+SID+","+ returned;
    }
    
}
