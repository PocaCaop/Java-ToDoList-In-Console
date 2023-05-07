package Utilities;

import java.util.Scanner;

public class ReadText {
    Scanner scanner = new Scanner(System.in);

    public String readLine(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
