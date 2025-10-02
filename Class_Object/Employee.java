public class Employee{
int id;
String name;
String company;
int age;


public static void main(String args[]){
Employee e1 =new Employee();   // object created 
e1.id  =1;
e1.name="kiran";               //initialize value
e1.company="Zensar";
e1.age=23;

System.out.println("id of employee :" +e1.id);
System.out.println("name of employee :" +e1.name);                 // print
System.out.println("company of employee :" +e1.company);
System.out.println("age of employee :" +e1.age);

}
}