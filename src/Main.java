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
            option = rInt.readNum("""
                Welcome! What do you want to do?
                \t1. Insert New Task 🆕
                \t2. Check Tasks 👁️
                \t3. Mark Task as done ✅
                \t4. Quit application ❌""");
            switch (option){
                case 1 -> {
                    list.add(agenda.createTask());
                }
                case 2 -> {
                    agenda.readTasks();
                }
            }
        }while (option !=4);
    }
}