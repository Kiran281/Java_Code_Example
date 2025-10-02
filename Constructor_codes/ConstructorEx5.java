class  ConstructorEx5{
String teaType;
static int totalCups;

 ConstructorEx5(String TeaType){
 this.teaType = TeaType;
 totalCups++;
 }
 static void showTotalCup(){
 System.out.println("totalCups:" + totalCups);
 }
 void Dispaly(){
	System.out.println("teaType :" + teaType);
		
 }

public static void main(String[] args){
 ConstructorEx5 e1 = new  ConstructorEx5("Masalatea");
 ConstructorEx5 e2 = new  ConstructorEx5("Blacktea");
 ConstructorEx5 e3 = new  ConstructorEx5("Gingertea");
 ConstructorEx5 e4 = new  ConstructorEx5("Greentea");


 e1.Dispaly();
 e2.Dispaly();
 e3.Dispaly();
 e4.Dispaly();
 
 showTotalCup();
 


}
}