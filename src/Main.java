import Models.Task;
import Models.Agenda;
import Utilities.ReadInt;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Task> list = new ArrayList<>();
    static Agenda agenda = new Agenda(list);
    static File file = new File("listOfTasks.task");
    public static void main(String[] args) {
        if (file.exists()){
            list = readFile();
        }
        mainMenu();
    }



    private static void mainMenu() {
        ReadInt rInt = new ReadInt();
        int option;
        do {
            System.out.println();
            option = rInt.readNum("""
                Welcome! What do you want to do?
                \t1. Insert New Task 🆕
                \t2. Check Tasks 👁️
                \t3. Mark Task as done ✅
                \t4. Modify Task 🔧
                \t5. Quit application ❌""");
            switch (option){
                case 1 -> {
                    list.add(agenda.createTask());
                }
                case 2 -> {
                    agenda.readTasks();
                }
                case 3 -> {
                    list = agenda.changeTaskStatus();
                }
                case 4 -> {
                    list = agenda.modifyTask();
                }
                case 5 ->{
                    System.out.println("Goodbye and thanks!");
                }
                default -> {
                    System.out.println("Error: That's not a valid option!");
                }
            }
        }while (option !=5);
        exportData();
        //read("listOfTasks.task");
    }

    private static void exportData() {
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (int i = 0; i < list.size(); i++) {
                oos.writeObject(list.get(i));
            }

            oos.close();
            fos.close();

            System.out.println("Data was saved succesfully!");
        } catch (IOException e) {
            System.out.println("Oh oh... there was an error: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("Oh no! Something bad happened " + e.getMessage());
        }
    }

    private static ArrayList<Task> readFile() {
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Task t = (Task) ois.readObject();
                    list.add(t);
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }
            }

            ois.close();
            fis.close();

            System.out.println("Data loaded successfully ");
        } catch (IOException e) {
            System.out.println("Oh... : " + e.getMessage());
        }catch (Exception e){
            System.out.println("An error occurred " + e.getMessage());
        }

        return list;
    }
}