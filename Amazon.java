import java.util.*;
public class Amazon{
     static Scanner sc=new Scanner(System.in);
     public static void main(String ar[]){
         int a=0;
        do{
     System.out.println("1.Admin");
     System.out.println("2.Merchant");
     System.out.println("3.Customer");
     System.out.println("4.Exit");
     a=sc.nextInt();
     switch(a){
         case 1:
             Admin.admin();
             break;
         case 2:
             Merchant.merchant();
         break;
         case 3:
             Customer.customer();
         break;
         case 4:
             System.exit(0);
         break;
     }
    }while(a!=4);
    }
}
