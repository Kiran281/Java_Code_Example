/* constructor :In Java, constructors play an important role in object creation. A constructor is a special block of 
code that is called when an object is created. 
rule --> class name and constructor name should same , constructor have no return type, , it can't be static, final,abstract,Sychronize.

Method: it is block of code perform specific task, same as function. 
*/
import java.util.Scanner;
class ConstructorEx1{
int Sr_No ;
String name;
String Address;

 
 // default constructor
ConstructorEx1(){   
}

void getData(){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the person id");
  Sr_No =  sc.nextInt();
System.out.println("Enter the person  name");
 name  =  sc.next();
System.out.println("Enter the person Address");
 Address =  sc.next();
}

void DisplayData(){
	System.out.println("-----The detailes are -----");
System.out.println("Sr.No:" +Sr_No + "Name:" + name + " Address:" +Address);

}
public static void main(String[] args){
ConstructorEx1 e1 = new ConstructorEx1();
e1.getData();
e1.DisplayData();

}
}