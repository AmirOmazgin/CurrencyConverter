import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {

        ArrayList<Double> myList = new ArrayList<Double>();


        System.out.println("Welcome to currency converter");

        String answer = "Y";
        while (answer.equalsIgnoreCase("Y")) {
            myCalculator(myList);
            System.out.println("would you like to start over? Y/N ");
            Scanner s2 = new Scanner(System.in);
            answer = s2.next();

        }
        System.out.println("thank you for using currency converter");
        System.out.println(myList);
        try {
            File logFile = new File("C:\\Users\\amiro\\Desktop\\results.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(logFile));
            writer.write(String.valueOf(myList));
            writer.close();
        }catch (Exception e){
            e.printStackTrace();
        }




    }

    static void myCalculator(ArrayList<Double> myList) {

        System.out.println("please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");

        Scanner s1 = new Scanner(System.in);
        int number = s1.nextInt();

        System.out.println("please enter an amount to convert: ");
        double input = s1.nextInt();
        USD usd = new USD();
        ILS ils = new ILS();
        if (number == 1) {
            System.out.println("  for " + input + " " + Coins.USD + " the result is: " + usd.calculate(input) + " " + Coins.ILS);
            myList.add(usd.calculate(input));
        }
        if (number == 2) {
            System.out.println("  for " + input + " " + Coins.ILS + " the result is: " + ils.calculate(input) + " " + Coins.USD);
            myList.add(ils.calculate(input));
        }


    }
}

