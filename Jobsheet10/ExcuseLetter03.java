package Jobsheet10;

public class ExcuseLetter03 {
    String id;
    String name;
    String className;
    char typeOfExcuse; // S = Sick, I = Other
    int duration;

    public ExcuseLetter03() {}

    public ExcuseLetter03(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }
}