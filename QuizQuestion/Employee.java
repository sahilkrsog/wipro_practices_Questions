class Employee extends Person {
    Employee(String name){
        super(name);
    }

    double salary;
    int year;
    
        
    String getName(){
        return member;
    }
    String insuNum;
    void setSalary(double sal){
        
        salary=sal;

    }
    double getSalary(){
        return salary;
    } 
    void setYear(int yer){
        year = yer;
    }
    double getYear(){
        return year;
    }
    void setinsuNum(String insur){
        insuNum = insur;
    }
    String getInsuranceNum(){
        return insuNum;
    }
}
    
