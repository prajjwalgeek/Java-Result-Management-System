import java.util.*;
import java.io.*;

abstract class result_management
{
    abstract void input();
    abstract void run();
}

class Student extends result_management
{
    File f1=new File("C:\\Users\\Prajjwal Mishra\\Desktop\\new\\Marks1.java.csv");   
    String name;
    int reg_no;
    int maths, phy, comp, eng;
    
    String cont;
    void input()
    {
        do{
        Scanner sc=new Scanner(System.in);
        System.out.print("Name: ");
        name=sc.nextLine();
        System.out.print("Registration Number: ");
        reg_no=sc.nextInt();
        System.out.println("Enter Subject Marks");
        System.out.print("Maths: ");
        maths=sc.nextInt();
        System.out.print("Physics: ");
        phy=sc.nextInt();
        System.out.print("Computer: ");
        comp=sc.nextInt();
        System.out.print("English: ");
        eng=sc.nextInt();
        
try{
        PrintWriter pw=new PrintWriter(new FileOutputStream(f1,true));
        pw.append("\n"+reg_no+","+name+","+maths+","+phy+","+comp+","+eng);
        pw.close();}
        catch (Exception e) {}
        
    
    System.out.println("Press N for main window or Press Y for another input:");
        
                 cont = sc.next();
        
        }       
        while(cont.equalsIgnoreCase("y"));
    }
    
     void run() {

       do{
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        File file = new File("C:\\Users\\DIVYENDU JHA\\Desktop\\new\\Marks1.java.csv");
        Scanner in = null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Registration Number: ");
        String reg=sc.nextLine();

        try {

            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                String[] student = line.split(cvsSplitBy);

                

                for (int i = 0; i < student.length; i++) {
    
                    if (student[i].equals(reg)) {
                        System.out.println("\tReg_no: "+student[0] +"\tName: "+ student[1] +"\tMaths:" +student[2]+"\tPhysics: "+student[3]+"\tComputer: "+student[4]+"\tEnglish: "+student[5]); //Matching the string and printing.
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Press N for main window or Press Y for another input:");
        
                 cont = sc.next();
        
        }   
        while(cont.equalsIgnoreCase("y"));

        
    }
}
class find
{
    public static void main(String[] args) {
        
        do{
        System.out.println("Welcome to Result Management System");
        Student s=new Student();
        System.out.println("\t\t1. Input the result");
        System.out.println("\t\t2. Fetch the result");
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice=scan.nextInt();
        switch (choice) {
            case 1:
                  s.input();
                break;
            case 2:
                  s.run();
            default:
                break;
            }
        }while(true);
    }
}