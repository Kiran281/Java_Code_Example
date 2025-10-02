import java .util.Scanner;
class ConstructorEx3{
int price;
String Model_name;
String Color;

ConstructorEx3(int price , String Model_name, String Color ){
this.price = price;
this.Model_name =  Model_name;
this.Color = Color;
}

 void display() {
        System.out.println("----- Mobile Details -----");
        System.out.println("Model Name: " + Model_name);
        System.out.println("Price: " + price);
        System.out.println("Color: " + Color);
    }
public static void main(String[] args){
ConstructorEx3 e1 = new ConstructorEx3(10000, "Realme 11 pro" ,"black");
e1.display();
}
}