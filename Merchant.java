
import java.util.*;

public class Merchant {
    String d;
    int e;
    static String sts;
    static ArrayList<Merchant>merchant=new ArrayList<>();
    static ArrayList<String>product=new ArrayList<>();
    static ArrayList<String>product1=new ArrayList<>();
    static ArrayList<Integer>price=new ArrayList<>();
    static ArrayList<Integer>price1=new ArrayList<>();
   public Merchant(int num, String str) {
        this.e=num;
        this.d=str;

    }
   static void newUser(){
       
        System.out.println("1.Enter the Password and username");
            int num=Amazon.sc.nextInt();
            String str=Amazon.sc.next();
           merchant.add(new Merchant(num,str));
           System.out.println("Waiting for the approval");
        }
    static void login(){
         System.out.println("Enter username And Password");
        String a=Amazon.sc.next();
        int b=Amazon.sc.nextInt();
        int count=0;
        for(int i=0;i<Admin.approve.size();i++){
            if(Admin.approve.get(i).h.equals(a) && Admin.approve.get(i).e==b){
                count++;
                System.out.println("Login Successful");
                       product(); 
                    }
                    
                }
                if(count==0){
                    System.out.println("Not Found");
                }
            }
            static void addProduct(){
                System.out.println("Do you want to add the products in the list");
                 String s=Amazon.sc.next();
                 if(s.equals("y")){
                     System.out.println("Enter the product name  and Price you want to added");
                     String s2=Amazon.sc.next();
                     int x=Amazon.sc.nextInt();
                     product.add(s2);
                     price.add(x);
                     System.out.println("Product Added successfully");
                 }
         
                
              }   
              static void removeProduct(){
                  System.out.println("Enter the product name and price");
                  Amazon.sc.nextLine();
                String f=Amazon.sc.next();
                int z=Amazon.sc.nextInt();
                for(int i=0;i<product.size();i++){
                    if(f.equals(product.get(i))&&(z==price.get(i))){
                        product.remove(i);
                        price.remove(i);
                        System.out.println("Product removed Sucessfully");
                    }
                }
       
            }
            static void seeList(){
                int count=0;
                 System.out.println("The Avalaible Products are");
                 for(int i=0;i<product.size();i++){
                     count++;
                     System.out.println(count+" "+product.get(i)+" "+price.get(i));
                 }
                 if(count==0){
                     System.out.println("No items found");
                 }
             }
              static void accessories(){
                t:while(true){
                    System.out.println("1.Add the product");
                    System.out.println("2.Remove the Product");
                    System.out.println("3.See the List");
                    System.out.println("4.Exit");
                    int f=Amazon.sc.nextInt();
                    switch(f){
                        case 1:
                        addProduct();
                        break;
                        case 2:
                        removeProduct();
                        break;
                        case 3:
                        seeList();
                        break;
                        case 4:
                        break t;
                        
                    }
                    }
            }
            static void addProduct1(){
                System.out.println("Do you want to add the products in the list");
                 String s=Amazon.sc.next();
                 if(s.equals("y")){
                     System.out.println("Enter the product name and Price you want to added");
                     String s1=Amazon.sc.next();
                     int g=Amazon.sc.nextInt();
                     System.out.println("Product Added successfully");
                     product1.add(s1);
                     price1.add(g);
                 }
         
                
              }   
              static void removeProduct1(){
                String f=Amazon.sc.next();
                int y=Amazon.sc.nextInt();
                for(int i=0;i<product1.size();i++){
                    if(f.equals(product1.get(i))&& (y==price1.get(i))){
                        product1.remove(i);
                        price1.remove(i);
                        System.out.println("Product removed Sucessfully");
                    }
                }
       
            }
            static void seeList1(){
                int count=0;
                 System.out.println("The Avalaible Products are");
                 for(int i=0;i<product1.size();i++){
                     count++;
                     System.out.println(count+" "+product1.get(i)+" "+price1.get(i));
                 }
                 if(count==0){
                     System.out.println("No items found");
                 }
             }
           
        static void dresses(){
            t:while(true){
                System.out.println("1.Add the product");
                System.out.println("2.Remove the Product");
                System.out.println("3.See the List");
                System.out.println("4.Exit");
                int f=Amazon.sc.nextInt();
                switch(f){
                    case 1:
                    addProduct1();
                    break;
                    case 2:
                    removeProduct1();
                    break;
                    case 3:
                    seeList1();
                    break;
                    case 4:
                    break t;
                    
                }
                }
        }
      
            static void product(){
                t:while(true){
                System.out.println("1.Accessories");
                System.out.println("2.Dresses");
                System.out.println("3.Exit");
                int w=Amazon.sc.nextInt();
                switch(w){
                    case 1:
                    accessories();
                    break;
                    case 2:
                    dresses();
                     break;
                     case 3:
                     break t;
                }
                }       
        }
    
    static void merchant(){
    t:while(true){
        System.out.println("1.New User");
        System.out.println("2.Existing User");
        System.out.println("3.Exit");
        int a=Amazon.sc.nextInt();
        switch(a){
            case 1:
            newUser();
            break;
            case 2:
            login();
            break;
            case 3:
            break t;
        }
      }
    }
}
