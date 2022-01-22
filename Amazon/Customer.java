import java.util.*;
class Customer {
    int a;
    String b;
    public Customer(int s1,String s){
        this.a=s1;
        this.b=s;
    }
    static ArrayList<Customer>customer=new ArrayList<>();
    static ArrayList<String>cartName=new ArrayList<>();
    static ArrayList<Integer>cartInt=new ArrayList<>();
    static ArrayList<String>cartName1=new ArrayList<>();
    static ArrayList<Integer>cartInt1=new ArrayList<>();
    static ArrayList<String>rev1=new ArrayList<>();
    static ArrayList<String>rev=new ArrayList<>();
    
    static void newUser(){
    
      System.out.println("Enter the Name");
      String s=Amazon.sc.next();
      System.out.println("Enter the Password");
      int s1=Amazon.sc.nextInt();
      customer.add(new Customer(s1,s));
      System.out.println("Account Created");
    }
    static void existingUser(){
        System.out.println("Enter the user name");
        String d=Amazon.sc.next();
        System.out.println("Enter the Password");
        int d1=Amazon.sc.nextInt();
        
        for(int i=0;i<customer.size();i++){
            if(d.equals(customer.get(i).b)&& (d1==(customer.get(i).a))){
                System.out.println("Login Sucessfully");
                showList();
            }
        }
    }
    static void showList(){
        int q;
        do{
               System.out.println("1.Accessories");
                System.out.println("2.Dresses");
                System.out.println("3.Exit");
                q=Amazon.sc.nextInt();
                    switch(q){
                        case 1:
                        accessories();
                        break;
                        case 2:
                        dresses();
                        break;
                        
                    }
              }while(q!=3);
    }
    static void dresses() {
         int o;
         t:while(true){
        for(int i=0;i<Merchant.product1.size();i++){
             System.out.println(Merchant.product1.get(i)+" "+Merchant.price1.get(i));
          do{ 
             System.out.println("1.Buy Product");
             System.out.println("2.Add to cart");
             System.out.println("3.Review");
             System.out.println("4.Exit");
             System.out.println("5.Main menu");
                o=Amazon.sc.nextInt();
               switch(o){
                 case 1:
                 buyProduct();
                 break;
                 case 2:
                 cartName.add(Merchant.product1.get(i));
                 cartInt.add(Merchant.price1.get(i));
                 cart();
                 break;
                 case 3:
                 review();
                 break;
                 case 5:
                 break t;                 
                 
                }
            }while(o!=4);
        }  
    } 
        
     }
    
    static void cart() {

    System.out.println("Your Product is successfully added to cart");
   

    }
    static void buyProduct() {
        t:while(true){
            Amazon.sc.nextLine();
        System.out.println("Enter the Address : ");
        Amazon.sc.nextLine();
        System.out.println("Phone  number : ");
        Amazon.sc.nextInt();
        System.out.println("Payment");
        System.out.println("  1.UPI");
        System.out.println("  2.Cash on delivery");
        System.out.println("  3.Exit");
          int j=Amazon.sc.nextInt();
        switch(j){
            case 1:
            System.out.println("Your Payment is Successfully");
            System.out.println("Our Product will Reach you soon");
            System.exit(0);
            break;
            case 2:
            System.out.println("Thank you for your order our Product will reach you soon");
            System.exit(0);
            case 3:
            break t;
        }
    }  
    }
    static void review(){
        System.out.println("Share your review about this product");
        String s=Amazon.sc.next();
        rev.add(s);
        
    }
    static void review1(){
        System.out.println("Share your review about this product");
        String s=Amazon.sc.next();
        rev1.add(s);
        
    }
    static void cart1() {

        System.out.println("Your Product is successfully added to cart");
       
    }
        
    static void buyProduct1() {
        t:while(true){
            Amazon.sc.nextLine();
        System.out.println("Enter the Address : ");
        Amazon.sc.nextLine();
        System.out.println("Phone  number : ");
        Amazon.sc.nextInt();
        System.out.println("Payment"); 
        System.out.println("  1.UPI");
        System.out.println("  2.Cash On delivery");
        System.out.println("  3.Exit ");
        int y=Amazon.sc.nextInt();
        switch(y){
            case 1:
            System.out.println("Your Payment is Successfully");
            System.out.println("Our Product will Reach you soon");
            System.exit(0);
            break;
            case 2:
            System.out.println("Thank you for your order our Product will reach you soon");
            System.exit(0);
            case 3:
            break t;
        }
    }  
    }
    
    static void accessories() {
        int h;
            t:while (true) {
                
            
            for(int i=0;i<Merchant.product.size();i++){
            System.out.println(Merchant.product.get(i)+" "+Merchant.price.get(i));
         do{
            System.out.println("1.Buy Product");
            System.out.println("2.Add to cart");
            System.out.println("3.Review");
            System.out.println("4.Exit");
            System.out.println("5.Main menu");
               h=Amazon.sc.nextInt();
              switch(h){
                case 1:
                buyProduct1();
                break;
                case 2:
                cartName1.add(Merchant.product.get(i));
                cartInt1.add(Merchant.price.get(i));
                cart1();
                break;
                case 3:
                review1();
                break;
                case 5:
                 break t;
            }
        }while(h!=4);
        
    }
}
    }
    
    static void customer(){
    t:while(true){
        System.out.println("1.Existing User");
        System.out.println("2.New User");
        System.out.println("3.Exit");
        int n=Amazon.sc.nextInt();
        switch(n){
            case 1:
            existingUser();
            break;
            case 2:
            newUser();
            break;
            case 3:
            break t;
        }

    }
}
}
