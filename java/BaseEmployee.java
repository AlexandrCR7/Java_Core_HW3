public abstract class BaseEmployee implements Comparable<BaseEmployee>{

    String name;
    private double salary;

//    @Override
//    public int compareTo(BaseEmployee list) {
//        return this.name.compareTo(list.name);
//    }

    @Override
    public int compareTo(BaseEmployee salary) {
        return (int) (this.getSalary() - salary.getSalary());
    }

    public BaseEmployee(String name, int salaryPerMonth) {
        this.salary = salaryPerMonth;
        this.name = name;
    }

    public BaseEmployee(String name, double salary) {
        this.salary = salary * 20.8 * 8;
        this.name = name;
    }

    @Override
    public String toString() {
        return  " Name = " + name +
                " Salary = " + salary + "\n";
    }




    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
