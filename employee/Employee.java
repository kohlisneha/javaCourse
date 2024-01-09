package employee;

public class Employee{
    private String fn,ln;
    private int empid;
    private String gender;
    

    public void setName(String fn,String ln){
        this.fn=fn;
        this.ln=ln;
    }
    public void setEmpid(int empid){
        this.empid=empid;
        
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public String getName(){
        return ln+fn;
    }
    public int getEmpid(){
        return empid;
    }
    public String getGender(){
        return gender;
    }
    
}