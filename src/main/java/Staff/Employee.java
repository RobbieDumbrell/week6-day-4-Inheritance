package Staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    protected double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        if (newName != null){
        this.name = newName;
    }}

    public int getNiNumber(){
        return this.niNumber;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double amount){
        if(amount >= 0) {
            this.salary += amount;
        }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }

}
