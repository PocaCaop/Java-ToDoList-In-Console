package Models;

import Utilities.ReadInt;
import Utilities.ReadText;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Task> tList;

    public Agenda(ArrayList<Task> task) {
        this.tList = task;
    }

    public Task createTask() {
        ReadText rText = new ReadText();
        String name = rText.readLine("Insert the name of your task.");
        String description = rText.readLine("Insert the description of your task.");
        return new Task(name, description);
    }

    public void readTasks() {
        if (tList.size() == 0) {
            System.out.println("Your ToDo List is empty :(");
        } else {
            for (int i = 0; i < tList.size(); i++) {
                System.out.print(i + 1);
                System.out.println(tList.get(i));
                System.out.println();
            }
        }
    }

    public ArrayList changeTaskStatus() {
        if (tList.size() == 0) {
            System.out.println("Your ToDo List is empty :(");
        } else {
            readTasks();
            ReadInt rInt = new ReadInt();
            int opt = rInt.readNum("Insert the number from the task");
            try {
                tList.remove(opt - 1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR: There's no task in the number you inserted");
            }
        }
        return tList;
    }

    public ArrayList modifyTask(){
        if (tList.isEmpty()) {
            System.out.println("Your ToDo List is empty :(");
        } else {
            for (int i = 0; i < tList.size(); i++) {
                System.out.print(i + 1);
                System.out.println(tList.get(i));
                System.out.println();
            }
            ReadInt rInt = new ReadInt();
            ReadText rText = new ReadText();
            int option = rInt.readNum("Choose the task you want to modify");
            Task task2Mod = tList.get(option-1);
            String name = rText.readLine("Insert a new name for your task");
            String descr = rText.readLine("Insert a new description for your task");
            task2Mod.setName(name);
            task2Mod.setDescription(descr);
            tList.remove(option-1);
            tList.add(option-1, task2Mod);

        }
        return tList;
    }

}
