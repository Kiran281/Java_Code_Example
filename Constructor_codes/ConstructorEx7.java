class ConstructorEx7{
String title;
String author;
boolean issued;
static int totalBookIssue = 0;

ConstructorEx7(String title, String author , boolean issued){
this.title = title;
this.author = author;
this.issued = issued;
if (issued) {
    totalBookIssue++;  
    }
}

static void showTotalBook(){
System.out.println("Total book issue:" +totalBookIssue);
}

void show(){
System.out.println("Title:" +title + ",Auther:" +author + ",isIssue:" +issued);
}


public static void main(String[] args){
ConstructorEx7 e1 = new ConstructorEx7("Java" ,"km" , true);
ConstructorEx7 e2 = new ConstructorEx7("python" ,"mk" , false);
ConstructorEx7 e3 = new ConstructorEx7("C++" ,"pm" , true);

e1.show();
e2.show();
e3.show();

 System.out.println("\nAfter issuing all book:");
  showTotalBook();



}
}