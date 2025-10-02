import java.util.Scanner;
class ConstructorEx6{
String mobileModel;
double  price ;
 static int TotalMobileBuy = 0;


 
  ConstructorEx6(String mobileModel , double price){
  this.mobileModel = mobileModel;
  this.price  =  price;
  TotalMobileBuy ++;
  }
  
  static void showTotalMobileBuy(){
  System.out.println("TotalMobileBuy :" +TotalMobileBuy);
  }
  
  
  void Display(){
   System.out.println("Mobile model:" +mobileModel + "Price:" +price);

  }
 
  
  
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Mobile model:");
   String mobileModel1 =  sc.next();
   System.out.println("Enter the Mobile price:");
   double price1 =  sc.nextDouble();
  
  ConstructorEx6 e1 = new ConstructorEx6( mobileModel1 , price1);
  e1.Display();
  
  
  
   System.out.println("Enter the Mobile model:");
   String mobileModel2 =  sc.next();
   System.out.println("Enter the Mobile price:");
   double price2 =  sc.nextDouble();
  
  ConstructorEx6 e2 = new ConstructorEx6(mobileModel2,  price2);
  e1.Display();
  // for all 
  showTotalMobileBuy();
  
}
}