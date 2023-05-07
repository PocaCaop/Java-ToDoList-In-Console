package Models;

public class Task {
    private String name;
    private String description;
    private boolean status = false;

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

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String v;
        if (!status){
            return ". To Do" + " " + name + " " + description + "\n************";


        }else {
            return ". Done" + " " + name + "\n\t" + description + "\n************";
        }

    }
}
