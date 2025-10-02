class Demo{
String passangerName;
static long TicketNo = 123436;

Demo(String passangerName){
this.passangerName = passangerName;
TicketNo++;
}
void Display(){
System.out.println("TicketNo:" +TicketNo + ",Passanger:" +passangerName);
}
}
class ConstructoeEx8{
public static void main(String[] args){
Demo e1 = new Demo("kiran");
e1.Display();
Demo e2 = new Demo("kiran");
e2.Display();
Demo e3 = new Demo("kiran");
e3.Display();


}
}