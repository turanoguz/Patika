public class Employee implements IEmployee{

    private String name;

    private int salary;

    private int workHours;

    private int hireYear;
    

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public int tax() {
        
        return getSalary()<1000 ? 0: getSalary()*3/100 ;
    }

    @Override
    public int bonus() {
        return getWorkHours()>40 ? (getWorkHours()-40)*30 : 0;
    }

    @Override
    public int raiseSalary() {
        int year = 2021;
        if(year-getHireYear()<10){
            return (getSalary()+tax()+bonus())*5/100;
        }
        else if(year-getHireYear()>9 && year-getHireYear()<20){
            return (getSalary()+tax()+bonus())*10/100;
        }
        else{
            return (getSalary()+tax()+bonus())*15/100;
        }
    }

    @Override
    public String toString() {
        return "Adı : "+getName()+"\n"+
                "Maaşı : "+getSalary()+"\n"+
                "Çalışma saati : "+ getWorkHours()+"\n"+
                "Başlangıç yılı : "+ getHireYear()+"\n"+
                "Vergi : "+ tax()+"\n"+
                "Bonus : "+bonus()+"\n"+
                "Maaş artışı : "+raiseSalary()+"\n"+
                "Vergi ve bonularla birlikte maaş : "+(getSalary()+tax()+bonus())+"\n"+
                "Toplam maaş : "+(getSalary()+tax()+bonus()+raiseSalary());
        
        
    } 
}
