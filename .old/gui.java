import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;


 class ReadCVS {
    public static void main(String[] args) {

        ReadCVS obj = new ReadCVS();
        obj.run();

    }

    public void run() {

       
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        File file = new File("C:\\Users\\Prajjwal Mishra\\Desktop\\new\\Marks1.java.csv");
        Scanner in = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter reg_number");
        String reg=sc.nextLine();

        try {

            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] colour = line.split(cvsSplitBy);

                //System.out.println(country[0]+ country[1] + country[2]+ country[3]);

                for (int i = 0; i < colour.length; i++) {
    
                    if (colour[i].equals(reg)) {
                        System.out.println(colour[0] + colour[1] + colour[2]+colour[3]+colour[4]+colour[5]); //Matching    the string and printing.
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

        System.out.println("Done");
    }

}