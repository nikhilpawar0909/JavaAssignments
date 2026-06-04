package day2.PracticeQ;

class Employee{
    private String companyName;

    void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public String getCompanyName(){
        return companyName;
    }
}

class Developer extends Employee{
    void setNames(){
        Employee obj = new Employee();
        obj.setCompanyName("Infosys");
        System.out.println("The Company Name is" +" " +obj.getCompanyName());
    }
}

public class Q5 {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setNames();
    }
}
