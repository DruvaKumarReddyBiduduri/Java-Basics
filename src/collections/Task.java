package collections;

public class Task {
    static int idIncrementer;
    int id;
    String name;
    boolean completed=false;

    public Task(String name) {
        idIncrementer++;
        this.id = idIncrementer;
        this.name = name;
    }
}
