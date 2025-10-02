// Class is collection of object or we can say that is a blueprint. class can contain  feilds,constructor ,methods blocks, superclass, sub class .
// object is a instance of class  and we can said that object is a real time, run time entity . it cobtain  state ,identity and behaviour

class LeptopClassEx1{
// data member or feilds
int SeriesNo;
String ModelName;
String Gen;
float price;

public static void main(String[] args){
 LeptopClassEx1  l = new  LeptopClassEx1();   // e - object of EmployeeClassEx class
 l.SeriesNo =5675;
 l.ModelName = "Hp";
 l.Gen = "7th";
 l.price = 68000.67f;
System.out.println(l.SeriesNo);
System.out.println(l.ModelName);
System.out.println(l.Gen);
System.out.println(l.price);

}}