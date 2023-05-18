import Models.Task;
import Models.Agenda;
import Utilities.ReadInt;

import java.util.ArrayList;

public class Main {
    static ArrayList<Task> list = new ArrayList<>();
    static Agenda agenda = new Agenda(list);
    public static void main(String[] args) {
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
    }
}