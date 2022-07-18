package ex09_2_exercise;


public class Customer {
    
    private String name;
    private String ssn;
   
    //Add a custom constructor
    public Customer(String name, String ssn){
        setName(name);
        setSSN(ssn);
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
    
    public void setSSN(String s){
        ssn = s;
    }
}
