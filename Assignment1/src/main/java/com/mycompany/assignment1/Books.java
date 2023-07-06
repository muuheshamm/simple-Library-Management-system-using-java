/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;




public class Books
{
    private  int bookId;
    private  String bookName;
    private  String authorName;
    private  int AavailablQeuantity;
    private  int issuedQuantity;

    
    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {this.bookId = bookId;}
    public String getBookName() {return bookName;}
    public void setBookName(String bookName) {this.bookName = bookName;}
    public String getAuthorName() {return authorName;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}
    public int getAavailablQeuantity() {return AavailablQeuantity;}
    public void setAavailablQeuantity(int AavailablQeuantity) {this.AavailablQeuantity = AavailablQeuantity;}
    public int getIssuedQuantity() {return issuedQuantity;}
    public void setIssuedQuantity(int issuedQuantity) {this.issuedQuantity = issuedQuantity;}

    @Override
    public String toString() {
        String Bid,AQ,IQ;
        AQ= Integer.toString(AavailablQeuantity);
        IQ=Integer.toString(issuedQuantity);
        Bid = Integer.toString(bookId);
        return  Bid + "," + bookName + "," + authorName + "," + AQ + "," + IQ;
    }





}
