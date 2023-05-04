package Models;

import java.util.Date;

public class Task {
    private String name;
    private String description;
    private boolean done;

    public Task(String name, String description, Date date) {
        this.name = name;
        this.description = description;
        this.done = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        System.out.println("*****************");
        if (done){
            return "To Do" + " " + name + "\n\t" + description;
        }else {
            return "Done" + " " + name + "\n\t" + description;
        }
    }
}
