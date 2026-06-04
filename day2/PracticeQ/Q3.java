package day2.PracticeQ;
class Student1 {
    private String name;

    void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student1 stud = new Student1();
        stud.setName("Nikhil");

        System.out.println("The Name is" +" " +stud.getName());
    }
}
