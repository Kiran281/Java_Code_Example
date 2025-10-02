class Main{    
 int id;    
 String name;    
}    
public class Student{    
 public static void main(String args[]){    
  //Creating instance of Student class  
  Main s1=new Main();    
  //assigning values through reference variable  
  s1.id=101;    
  s1.name="Sonoo";    
  //printing values of s1 object  
  System.out.println(s1.id+" "+s1.name);    
 }    
} 