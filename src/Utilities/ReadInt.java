package Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInt {
    Scanner read = new Scanner(System.in);

    public int readNum(String message){
        int num = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println(message);
            try {
                num = read.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: You have to input a number");
                read.nextLine();
            }
        }
        return num;
    }
    public void nextLine(){
        read.nextLine();
    }
}
