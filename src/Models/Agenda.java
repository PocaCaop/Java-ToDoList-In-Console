package Models;

import Utilities.ReadText;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Task> tList;

    public Agenda(ArrayList<Task> task) {
        this.tList = task;
    }

    public Task createTask(){
        ReadText rText = new ReadText();
        String name = rText.readLine("Insert the name of your task.");
        String descript = rText.readLine("Insert the description of your task.");
        return new Task(name, descript);
    }

    public void readTasks(){
        for (int i = 0; i < tList.size(); i++) {
            System.out.print(i+1);
            System.out.println(tList.get(i));
            System.out.println();
        }
    }
}
