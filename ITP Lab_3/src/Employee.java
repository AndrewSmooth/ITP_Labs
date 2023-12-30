public class Employee {

    private String name;
    private String job;
    private int salary;


    public Employee(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }


    public String getName(){
        return name;
    }


    public String getJob(){
        return job;
    }


    public int getSalary(){
        return salary;
    }


    public void setName(String name){
        this.name = name;
    }


    public void setJob(String job){
        this.job = job;
    }


    public void setSalary(int salary){
        this.salary = salary;
    }
}
