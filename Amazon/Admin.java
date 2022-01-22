import java.util.*;
public class Admin{
    int e;
    String h;
   static ArrayList<Admin>approve=new ArrayList<>();
    
   
    public Admin(int g,String d) {
        this.e=g;
        this.h=d;
}
    public Admin(Merchant merchant) {
    }
    static void approve(){
        for(int i=0;i<Merchant.merchant.size();i++){
                System.out.println(Merchant.merchant.get(i).d);              
                System.out.println("approve");
               String y=Amazon.sc.next();
              if(y.equals("y")){
                approve.add(new Admin(Merchant.merchant.get(i)));                
                   System.out.println("Account Approved");
                   Merchant.merchant.clear();;
                }
            } 
        }
        static void add(){
           System.out.println("Enter the Merchant name");
           String d=Amazon.sc.next();
           System.out.println("Enter the Merchant Password");
           int g=Amazon.sc.nextInt();
           approve.add(new Admin(g, d));

        }
   static void remove(){
          System.out.println("Enter password and username");
          int rem=Amazon.sc.nextInt();
          String rem1=Amazon.sc.next();
          for(int i=0;i<Admin.approve.size();i++){
            if(Merchant.merchant.get(i).d.equals(rem1) && Merchant.merchant.get(i).e==rem){ 
                approve.remove(i);
             System.out.println("Merchant removed successfully");
                
            }
         }
    }
   static void admin(){
        System.out.print("Enter the username :");
        String y=Amazon.sc.next();
        System.out.print("Enter the password:");
        int m=Amazon.sc.nextInt();
        if(m==1234 && y.equals("admin")){
            System.out.println("Welcome");
            t:while(true){
                System.out.println("1.Approve Merchant");
                System.out.println("2.Remove Merchant");
                System.out.println("3.Add Merchant");
                System.out.println("4.Exit");
                int b=Amazon.sc.nextInt();
          switch(b){
                case 1:
                approve();
                break;
                case 2:
                remove();
                break;
                case 3:
                add();
                break;
                case 4:
                break t;
            }
        }
        }
        else{
            System.out.println("Id not found");
        }
       
 }
}