package day5;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        st.solve();
        st.eat();
        st.listen();
    }
}
interface Listening {
   void listen();
}
interface Studying{
    void study();
}

class Person implements Listening{
    void eat(){
        System.out.println("I am eating");
    }

    public void listen() {
        System.out.println("I am Listening");
    }
}

class Student extends Person implements Studying{
    void solve(){
        System.out.println("Child of Person");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }
}


//choking exception must be thown by eat method and it must be checked


