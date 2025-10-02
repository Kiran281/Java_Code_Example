
import java.util.Scanner;
class ConstructorEx2{
// Parameterized Constructor - pass Parameter in  Constructor
int S_id;
String S_name;
String S_course;
String School;
ConstructorEx2(int i , String n , String c ,String s){
S_id = i;
S_name = n;
S_course = c;
School = s;

}

void DisplayData() {
     System.out.println("----- The details are -----");
    System.out.println("ID: " + S_id + "  Name: " + S_name + "  School: " + School + "Course:" +S_course);
    }


public static void main(String[] args ){


Scanner  sc =  new Scanner(System.in);
System.out.println("Enter the Student id:");
int i = sc.nextInt();

System.out.print("Enter the student name: ");
 String n = sc.next();
 
 System.out.print("Enter the student course: ");
  String c = sc.next();
  
 System.out.print("Enter the student School: ");
  String s = sc.next(); 
  
ConstructorEx2 e1 =  new ConstructorEx2(i ,n ,c ,s);
e1.DisplayData();

}
}