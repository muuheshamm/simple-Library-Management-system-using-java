/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1;



import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.sql.DriverManager.println;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;
*/
public class Assignment1Main 
{


    
    
    
    
//   All Arrays
    ArrayList<Books> books = new  ArrayList<Books>();
    ArrayList<Librarians> librarians = new ArrayList<Librarians>();
    ArrayList<Students> students = new  ArrayList<Students>();
    ArrayList<Admins> admins = new  ArrayList<Admins>();
    ArrayList<IssuedBooks> issuedBooks = new  ArrayList<IssuedBooks>();
    ArrayList<Books> searchBooks = new  ArrayList<Books>();
    ArrayList<String> userName = new  ArrayList<String>();
    
    
//    >>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<
    
//    All Files
    File adminsFile = new File("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Admins.txt");
    File librariansFile = new File("/Volumes/Drive/Hesho//Desktop/CSCI217/Assignment1/Librarians.txt");
    File studentFile = new File("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Student.txt");
    File bookFile = new File("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Book.txt");
    File issuedBooksFile = new File("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/IssuedBooks.txt");
    
    
    
    
    
    public String generateRandom(){
        Random rand = new Random();
        int range = 100;
        int int_random = rand.nextInt(range); 
        String string_random ;
        string_random = Integer.toString(int_random);
        return string_random ;
    }
        
    public  void getAllStoredData() throws FileNotFoundException, IOException//method to collect data from files and add it in arrays when run start
    {

//        read admin file and add all data in admin array 
        FileReader aReader = new FileReader(adminsFile);
        BufferedReader Abr = new BufferedReader(aReader);
        String adminSt;
        while((adminSt = Abr.readLine()) != null)
        {   
        Admins tempAdmins = new Admins();
        String[] arrOfAd = adminSt.split(",", 4);
        if(arrOfAd.length>0)
        {
        int id =Integer.parseInt(arrOfAd[0]);
        tempAdmins.setId(id);
        tempAdmins.setName(arrOfAd[1]);
        tempAdmins.setAdminPassword(arrOfAd[2]);
        tempAdmins.setUserName(arrOfAd[3]);
        admins.add(tempAdmins);
        }
              
        }
//        System.out.println("1st Admin info....");
//        System.out.println(admins.get(0).toString());
//        System.out.println("2nd Admin info....");
//        System.out.println(admins.get(1).toString());
//        read student file and add all data in student array  
        FileReader sRreader = new FileReader(studentFile);
        BufferedReader Sbr = new BufferedReader(sRreader);
        String studentSt;
        while((studentSt = Sbr.readLine()) != null)
        {   
           
        Students tempStudents = new Students();
        
        String[] arrOfSt = studentSt.split(",",5 );
        if(arrOfSt.length>0)
        {
        int Sid =Integer.parseInt(arrOfSt[0]);
        
        tempStudents.setId(Sid);
        tempStudents.setName(arrOfSt[1]);
        tempStudents.setStudentBirthday(arrOfSt[2]);
        tempStudents.setEmail(arrOfSt[3]);
        tempStudents.setMobileNumber(arrOfSt[4]);
        students.add(tempStudents);
        }
        }
//        read librarian file and add all data in student array  

        FileReader lRreader = new FileReader(librariansFile);
        BufferedReader lbr = new BufferedReader(lRreader);
        String librarianSt;
        while((librarianSt = lbr.readLine()) != null)
        {   
            Librarians tempLibrarians = new Librarians();
        String[] arrOfL = librarianSt.split(",",4);
        if(arrOfL.length>0)
        {
        int lid =Integer.parseInt(arrOfL[0]);
        tempLibrarians.setId(lid);
        tempLibrarians.setName(arrOfL[1]);
        tempLibrarians.setLibrarianpassword(arrOfL[2]);
        tempLibrarians.setUserName(arrOfL[3]);
        librarians.add(tempLibrarians);
        }
        }     
//        read book file and add all data in student array  

        FileReader bRreader = new FileReader(bookFile);
        BufferedReader bbr = new BufferedReader(bRreader);
        String bookSt;
        while((bookSt = bbr.readLine()) != null)
        {  
             Books tempBook = new Books();
        String[] arrOfB = bookSt.split(",", 5);
        if(arrOfB.length>0)
        {
        int bid =Integer.parseInt(arrOfB[0]);
        int q =Integer.parseInt(arrOfB[3]);
        int iq =Integer.parseInt(arrOfB[4]);
        tempBook.setBookId(bid);
        tempBook.setBookName(arrOfB[1]);
        tempBook.setAuthorName(arrOfB[2]);
        tempBook.setAavailablQeuantity(q);
        tempBook.setIssuedQuantity(iq);
        books.add(tempBook);
        }
        }         
//        read Issued Book file and add all data in student array  

        FileReader ibRreader = new FileReader(issuedBooksFile);
        BufferedReader ibbr = new BufferedReader(ibRreader);
        String issuedBooksSt;
        while((issuedBooksSt = ibbr.readLine()) != null)
        {  
              IssuedBooks tempIssuedBook = new IssuedBooks();
        String[] arrOfiib = issuedBooksSt.split(",",4);
        if(arrOfiib.length>0)
        {
        int pid =Integer.parseInt(arrOfiib[0]);
        int Bid =Integer.parseInt(arrOfiib[1]);
        int Sid =Integer.parseInt(arrOfiib[2]);
        boolean R=Boolean.parseBoolean(arrOfiib[3]); 
        
        tempIssuedBook.setProcedureId(pid);
        tempIssuedBook.setBookId(Bid);
        tempIssuedBook.setStudentId(Sid);
        tempIssuedBook.setReturned(R);
        issuedBooks.add(tempIssuedBook);
        }
        }    
        
    }
    public void addToFile()//method to collect data from arrays and add it to files at the end of main
    {
         try {
//        add all data from array tl file
        FileWriter Bfw = new FileWriter("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Book.txt", false);
        
        BufferedWriter Bbw = new BufferedWriter(Bfw);
        PrintWriter Bout = new PrintWriter(Bbw);
        Bout.format("");
        
        for(int i=0 ;i<books.size();i++)
        {
        
        Bout.println(books.get(i).toString());
        }
        
        Bout.flush();
        Bout.close();
//        add all data from array tl file
        FileWriter IBfw = new FileWriter("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/IssuedBooks.txt", false);
        BufferedWriter IBbw = new BufferedWriter(IBfw);
        PrintWriter iBout = new PrintWriter(IBbw);
        iBout.format("" );
        for(int i=0 ;i<issuedBooks.size();i++)
        {
        
        iBout.println(issuedBooks.get(i).toString());
        }
        iBout.flush();
        iBout.close();
        
//        add all data from array tl file
        FileWriter Afw = new FileWriter("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Admins.txt", false);
        BufferedWriter Abw = new BufferedWriter(Afw);
        PrintWriter aout = new PrintWriter(Abw);
        aout.format("");
        for(int i=0 ;i<admins.size();i++)
        {
        
        aout.println(admins.get(i).toString());
        }
        
        aout.flush();
        aout.close();
//        add all data from array tl file
        FileWriter Lfw = new FileWriter("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Librarians.txt", false);
        BufferedWriter Lbw = new BufferedWriter(Lfw);
        PrintWriter lout = new PrintWriter(Lbw);
        lout.format("");
        for(int i=0 ;i<librarians.size();i++)
        {
        
        lout.println(librarians.get(i).toString());
        }   
        lout.flush();
        lout.close();
//        add all data from array tl file
        FileWriter  Sfw = new FileWriter("/Volumes/Drive/Hesho/Desktop/CSCI217/Assignment1/Student.txt", false);
        BufferedWriter Sbw = new BufferedWriter(Sfw);
       
        PrintWriter sout = new PrintWriter(Sbw);
        sout.format("");
       
        for(int i=0 ;i<students.size();i++)
        {
        sout.println(students.get(i).toString());
        }
        
         sout.flush();
        sout.close();
        
        
         } catch (IOException ex) {
            Logger.getLogger(Assignment1Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void adminView()//method to switch between admin methods
    {
        Scanner in = new Scanner(System.in);
        int ch ;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Admin View<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>**********<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(" Slect : ");
        System.out.println("1-Add Students");
        System.out.println("2-Remove Students ");
        System.out.println("3-Add librarian");
        System.out.println("4-Remove librarian ");
        System.out.println("5-Add other admins ");
        System.out.println("6-Remove other admins ");
        System.out.println("0-logout");
        ch=in.nextInt();
        switch(ch)
        {
            case 1 -> addStudent();
            case 2 -> removeStudent();
            case 3 -> addLibrarians();
            case 4 -> removeLibrarians();
            case 5 -> addAdmins();
            case 6 -> removeAdmins();
            case 0 -> login();   
        }
        
        
        
    }
    public void librarianView()//method to switch between librarian methods
    {
        Scanner in = new Scanner(System.in);
        int ch ;
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Librarian View<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>**************<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(" Slect : ");
        System.out.println("1-Add Book");
        System.out.println("2-Remove Book ");
        System.out.println("3-Issue Books ");
        System.out.println("4-Return books");
        System.out.println("5-View Books");
        System.out.println("6-View Issued Books ");
        System.out.println("7-Search for the book(ID) ");
        System.out.println("8-Search for the book(NAME) ");
        System.out.println("0-logout");
        ch=in.nextInt();
        switch(ch)
        {
            case 1 :
               addBooks();
               break;
            case 2 :
                removeBook();
                break;
            case 3 :
                issueBook();
                break;
            case 4 :
                returnBook();
                break;
            case 5 :
                viewBooks();
                break;
            case 6:
                viewIssuedBooks();
                break;
            case 7:
                SearchForTheBookID();
                break;
            case 8:
                SearchForTheBookName();                
            case 0 :
                login();
                break;
  
        }
    }

//method to log in
    public void login(){
//        take data from user
        Scanner in =new Scanner(System.in);
        System.out.println("entre your pos :");
        System.out.println("select one");
        System.out.println("1-Admins");
        System.out.println("2-Librarians");
        System.out.println("0-end program");
        int pos=in.nextInt();
        String username="";
        String pass="";
        if(pos!=0) {
            System.out.println("entre your User Name without @nu.edu.eg:");
            username = in.next() + "@nu.edu.eg";
            System.out.println("entre your password :");
            pass = in.next();
        }
//        System.out.println("UserName   "+username);
//        System.out.println("password   "+pass);
       
        boolean  valid = false;//declear boolean var to break the condetion
        String user,userin;
        
        switch (pos)//    switch between admin and librarian
        {
            case 1 -> {
                for (Admins admin : admins) {
                    if (valid!=true )//if valid = false if willbe implemented
                    {
                        user=admin.getUserName().toLowerCase();
                        userin=username.toLowerCase();
                        //if user matches userin and password matches pass -->> valid will be = >>>>>>>>>true and break<<<<<<<
                        valid =(  user.matches(userin)&& admin.getAdminPassword().matches(pass) );
                    }
                }
                
                if (valid==true ) {
                    // Show The Admin View hereeeeee;
                    adminView();
                }
                else {
                    if(valid!=true)
                    {
                        System.out.println("Wrong Password or User Name");
                        login();
                    }
                }
            }
            case 2 -> {
                for (Librarians librarian : librarians) {
                    if (valid!=true ) {
                         user=librarian.getUserName().toLowerCase();
                        userin=username.toLowerCase();
                         //if user matches userin and password matches pass -->> valid will be = >>>>>>>>>true and break<<<<<<<
                        valid =(  user.matches(userin)&& librarian.getLibrarianpassword().matches(pass) );
                        
//                        
//                        System.out.println("======> user match");
//                         System.out.println(user.matches(userin));
//                          System.out.println(librarian.getUserName());
//                          
//                          System.out.println("======> Password match");
//                         System.out.println(librarian.getLibrarianpassword().matches(pass));
                    }
                }
                if (valid == true) {
                    // Show The librarian View hereeeeee;
                    librarianView();
                }
                else {
                    if(valid!=true)
                    {
                        System.out.println("Wrong Password or User Name");
                        login();
                    }
            }
        }
        
            case 0 -> {System.out.println("end..........");
                return;
            }
        
    }
    }

    public void addBooks(){
        
        Books tempBook = new Books();
        
        
        
        Scanner S =new Scanner(System.in);
        
        tempBook.setBookId(books.size() + 1);
        
        System.out.println("Enter Book Name");
        
        tempBook.setBookName(S.nextLine());
        
        System.out.println("Enter Book Author Name");
        tempBook.setAuthorName(S.nextLine());
        
        System.out.println("Enter Book Aavailabl Qeuantity");
        tempBook.setAavailablQeuantity(S.nextInt());
        
        System.out.println("Enter Book Aavailabl Issued Qeuantity");
        tempBook.setIssuedQuantity(S.nextInt());
        
        books.add(tempBook);  
        
        addToFile();
        
        System.out.println("Book added successfully ");
        
        librarianView();
        

}
    public void addLibrarians(){
       Librarians tempLibrarians = new Librarians();
       boolean valid = true;
       String un;
       
       for(int k = 0;k<librarians.size();k++)
       {
           userName.add(librarians.get(k).getUserName());
       }
        
        Scanner sc =new Scanner(System.in);
        
        tempLibrarians.setId(librarians.size() + 1);
        
        System.out.println("Enter Librarian Name ");
        tempLibrarians.setName(sc.nextLine());
        boolean result = tempLibrarians.getName().matches("[a-zA-Z]+");
        while(result!=true)
        {
        System.out.println("\"please enter valid name :)\" ");
        tempLibrarians.setName(sc.nextLine());
        result = tempLibrarians.getName().matches("[a-zA-Z]+");
        }
        
        System.out.println("Enter Librarian Password ");
        tempLibrarians.setLibrarianpassword(sc.nextLine());
        
         System.out.println("Enter Librarian User Name ");
         tempLibrarians.setUserName(sc.next());

        while(userName.contains(tempLibrarians.getUserName()))
        {
                tempLibrarians.setUserName(tempLibrarians.getName()+generateRandom());
                if(!(userName.contains(tempLibrarians.getUserName())))
                {
                    System.out.println("invalid User Name please enter another one or choose"+tempLibrarians.getUserName()+"\nslect : ");
                    System.out.println("1-enter anouther user name");
                    System.out.println("2-or choose "+tempLibrarians.getUserName());
                    int c = sc.nextInt();
                    switch (c){
                        case 1 :
                            System.out.println("Enter anouther user name");
                            tempLibrarians.setUserName(sc.nextLine());
                            break;
                        case 2 :
                            System.out.println("user name added ~SUCCESSFULLY~ as "+tempLibrarians.getUserName());
                            break;
                            
                    }
                }
                

        }


        
        librarians.add(tempLibrarians);
        
        addToFile();
        userName.clear();
        System.out.println("Librarians added successfully ");
        
        adminView();
    }
    public void addStudent() {
        
        Students tempStudents = new Students();

        Scanner a = new Scanner (System.in);
        
        tempStudents.setId(students.size() + 1);
        
        System.out.println("Enter Student Name ");
        tempStudents.setName(a.nextLine());
        boolean result = tempStudents.getName().matches("[a-zA-Z]+");
        while(result!=true)
        {
        System.out.println("\"please enter valid name :)\"");
        tempStudents.setName(a.nextLine());
        result = tempStudents.getName().matches("[a-zA-Z]+");
        }
        System.out.println("Enter Student Email ");
        String email = a.nextLine();
        tempStudents.setEmail(email);
        
        System.out.println("Enter Student Birthday ");
        tempStudents.setStudentBirthday(a.nextLine());
        
        System.out.println("Enter Student Mobile Number ");
        tempStudents.setMobileNumber(a.nextLine());
        while(tempStudents.getMobileNumber().length()!=11)
        {
        System.out.println("Enter Valid Mobile Number ");
        tempStudents.setMobileNumber(a.nextLine());
        }
        

        students.add(tempStudents); 
        //
        addToFile();
        //
        System.out.println("Student added successfully ");
        //
        adminView();

    }
    public void addAdmins(){
        Admins tempAdmins = new Admins();
        Scanner b = new Scanner (System.in);
        
        tempAdmins.setId(admins.size() + 1);
        
        System.out.println("Enter Admin Name ");
        tempAdmins.setName(b.nextLine());
        boolean result = tempAdmins.getName().matches("[a-zA-Z]+");
        while(result!=true)
        {
        System.out.println("please enter valid name :)");
        tempAdmins.setName(b.nextLine());
        result = tempAdmins.getName().matches("[a-zA-Z]+");
        }
        
        System.out.println("Enter Admin User Name ");
        tempAdmins.setUserName(b.nextLine());
//        boolean check = false;
//        for(int i=0;i<admins.size();i++)
//        {
//            while(check==false)
//            {
//                check=(tempAdmins.getUserName().matches(admins.get(i).getUserName()));
//                if(check==true)
//                {
//                    System.out.println("Enter Admin User Name ");
//                    tempAdmins.setUserName(b.nextLine());
//                }
//            }
//        }
        System.out.println("Enter Admins Password");
        tempAdmins.setAdminPassword(b.nextLine());
        
        admins.add(tempAdmins); 
                
        addToFile();
        
        System.out.println("Addmin added successfully ");
        
        adminView();
    }
    public void removeBook(){
        Scanner in = new Scanner(System.in);
        int id ;
        System.out.println("Enter Book ID :");
        id=in.nextInt()-1;
        books.remove(id); 
        addToFile();
        librarianView();
    }
    public void removeStudent(){
        Scanner in = new Scanner(System.in);
        int id ;
        System.out.println("Enter Studen ID :");
        id=in.nextInt()-1;
        students.remove(id);
        addToFile();
        adminView();
    }
    public void removeLibrarians(){
        Scanner in = new Scanner(System.in);
        int id ;
        System.out.println("Enter Librarians ID :");
        id=in.nextInt()-1;
        librarians.remove(id); 
        addToFile();
        adminView();
    }
    public void removeAdmins(){
        Scanner in = new Scanner(System.in);
        int id ;
        System.out.println("Enter Admin ID :");
        id=in.nextInt()-1;
        admins.remove(id); 
        addToFile();
        adminView();        
    }
 
    public void issueBook(){
        IssuedBooks tempIssuedBook = new IssuedBooks();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student Name :");
        String sn = in.nextLine();
        System.out.println("Enter Book Name :");
        String bn = in.nextLine();
        boolean  Svalid = false;
        boolean  Bvalid = false;
        int sindex=0,bindex=0,q;
        for(int j=0;j<students.size();j++)
        {
            if (!Svalid )
            {
                Svalid=(students.get(sindex).getName().toLowerCase().matches(sn.toLowerCase()));
                sindex=j;
            } 
        }
        for(int i=0;i<books.size();i++)
        {
//            System.out.println(books.get(i).getBookName());
//            System.out.println(bn);
           
//            System.out.println(books.get(i).getAavailablQeuantity());
            
            if(!Bvalid)
            {
                Bvalid=(books.get(i).getBookName().toLowerCase().matches(bn.toLowerCase())&&books.get(i).getAavailablQeuantity()>0);
//                System.out.println(books.get(i).getBookName().toLowerCase().matches(bn.toLowerCase()));
                bindex=i;
            }
        }
        if(Svalid&&Bvalid)
        {
//            System.out.println("The AavailablQeuantity is :"+books.get(bindex).getAavailablQeuantity());
            
            System.out.println("Enter The qeuantity");
            q=in.nextInt();
            books.get(bindex).setAavailablQeuantity(books.get(bindex).getAavailablQeuantity()-q);
            books.get(bindex).setIssuedQuantity(books.get(bindex).getIssuedQuantity()+q);
            tempIssuedBook.setStudentId(students.get(sindex).getId());
            tempIssuedBook.setBookId(books.get(bindex).getBookId());
            tempIssuedBook.setReturned(false);
            tempIssuedBook.setProcedureId(issuedBooks.size()+1);
            issuedBooks.add(tempIssuedBook);
            
            addToFile();
        
        System.out.println("Book issued successfully ");
        
        librarianView();
            
        } else{
            System.out.println("Error issuing book ");
            
             librarianView();
        }
    }
    public void returnBook(){
        String bookIn;
        int RQ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Book Name : ");
        bookIn = in.nextLine();
        System.out.println("Enter returned Qeuantity : ");
        RQ = in.nextInt();
        boolean Bvalid = false;
        int bindex=0;
        for(int i=0;i<books.size();i++)
        {            
            if(!Bvalid)
            {
                Bvalid=(books.get(i).getBookName().toLowerCase().matches(bookIn.toLowerCase()));
                System.out.println(books.get(i).getBookName().toLowerCase().matches(bookIn.toLowerCase()));
                bindex=i;
            }
            if(Bvalid)
            {
                books.get(bindex).setAavailablQeuantity(books.get(bindex).getAavailablQeuantity()+RQ);
                books.get(bindex).setIssuedQuantity(books.get(bindex).getIssuedQuantity()-RQ); 

                for(int j = 0 ;j<issuedBooks.size();j++)
                {
                    if(issuedBooks.get(j).getBookId()==books.get(bindex).getBookId())
                    {
                        if(books.get(bindex).getIssuedQuantity()==0){issuedBooks.get(j).setReturned(true);}
                        else{issuedBooks.get(j).setReturned(false);}           
                    }
                }
            }
        
        }
        addToFile();
        System.out.println("Book Returned successfully ");
        librarianView();
    }
    
    public void viewBooks(){
        for(int i=0;i<books.size();i++)
        {
            System.out.println(books.get(i).getBookId()+","+books.get(i).getBookName()+","+books.get(i).getAuthorName()+","+books.get(i).getAavailablQeuantity()+","+books.get(i).getIssuedQuantity());
        }
        librarianView();
    }
    public void viewIssuedBooks(){
         for(int i=0;i<issuedBooks.size();i++)
        {
            System.out.println(issuedBooks.get(i).getProcedureId()+","+issuedBooks.get(i).getBookId()+","+issuedBooks.get(i).isReturned());
        }    
         librarianView();
    } 
    public void SearchForTheBookID(){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter book id ");
       int bookId = in.nextInt();
       System.out.println("Book Id : "+bookId);
       System.out.println("Book Name : "+books.get(bookId-1).getBookName());
       System.out.println("Book Author Name : "+books.get(bookId-1).getAuthorName());
       System.out.println("Book Aavailabl Qeuantity : "+books.get(bookId-1).getAavailablQeuantity());
       System.out.println("Book Issued Quantity : "+books.get(bookId-1).getIssuedQuantity());
       librarianView();
   }
    public void SearchForTheBookName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter book name ");
        String bookName = in.nextLine();
        int index=0;
        for(Books book : books)
        {
            System.out.println(index);
            System.out.println(books.get(index).getBookName().matches(bookName));
            if(books.get(index).getBookName().matches(bookName))
            {
                searchBooks.add(books.get(index));
                
            }
            index++;
            
            
        }
        for(int i=0;index<searchBooks.size();i++)
        {
            System.out.println("Book"+searchBooks.get(i).getBookId());
            System.out.println("Book Id : "+searchBooks.get(i).getBookId());
            System.out.println("Book Name : "+searchBooks.get(i).getBookName());
            System.out.println("Book Author Name : "+searchBooks.get(i).getAuthorName());
            System.out.println("Book Aavailabl Qeuantity : "+searchBooks.get(i).getAavailablQeuantity());
            System.out.println("Book Issued Quantity : "+searchBooks.get(i).getIssuedQuantity());           
        }
        librarianView();
    }
    

    public static void main (String [] args) throws IOException 
    {
        Assignment1Main HESHO = new Assignment1Main();
        HESHO.getAllStoredData();
        HESHO.login();
    }
}
