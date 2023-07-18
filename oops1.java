public class oops
{
   static String Employee_name;
   static float Employee_salary;
   
   static void set(String n ,float s){
       Employee_name = n;
       Employee_salary = s;
       
   }
   static void get(){
       System.out.println("The Employee Name is "+ Employee_name );
       System.out.println("The Employee Salary is" + Employee_salary );
   }
   public static void main(String[] args){
       oops.set("vml",400000.0f);
       oops.get();
   }
}
