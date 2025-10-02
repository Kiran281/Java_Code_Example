class Student{
String name;
String className;
static int tuitionFee;

Student(String name, String className){
this.name = name;
this.className = className;
}
// static block - alway execute first 
static{
tuitionFee = 30000;
}

public static void display(){
System.out.println("Name:" +name ",className:" +"Tuition fee" +tuitionFee);
}
  public static void main(String[] args) {
    Student s1 = new Student("Kiran Mahajan", "BE Computer");
    Student s2 = new Student("Komal", "BSc IT");
	
	s1.display();
    System.out.println("--------------");
    s2.display();

}