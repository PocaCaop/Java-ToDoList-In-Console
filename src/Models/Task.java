package Models;

import java.io.Serializable;

public class Task implements Serializable {
    private String name;
    private String description;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return ". To Do" + " " + name + " " + description + "\n************";
    }
}
