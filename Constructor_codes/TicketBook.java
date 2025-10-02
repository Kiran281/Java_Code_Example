// constructor overloading - when more than one  constructor are used is called constructor overloading
class TicketBook
{
int age;
String name;
String seatType;
static int totalTicketbook;

TicketBook(String name ,int age){
this.name = name;
this.age = age;
}

TicketBook(String name ,int age,String seatType){
this(name ,age);
this.seatType = seatType;
}
static void counter(){
totalTicketbook++;
}

public void display(){
System.out.println("Name:" +name +"|Age:" +age +"|Seat:" +seatType);
}

public static void main (String[] args){
TicketBook t  = new TicketBook("kiran",23 ,"2nd Ac");
t.display();
counter();

TicketBook t1  = new TicketBook("karan",23 ,"3rd Ac");
t1.display();
counter();

TicketBook t2  = new TicketBook("siya",2 ,"2nd Ac");
t2.display();
counter();
System.out.println("Total Tickets Booked: " + totalTicketbook);

}

}