import java.util.*;

public class Atm{
    static int a = 0;
    static Scanner sc = new Scanner(System.in);
    static int arr[] = { 0, 0, 0, 0 };
    static ArrayList<Integer> with = new ArrayList<>();
    static ArrayList<Integer> integer = new ArrayList<>();
    static ArrayList<String> str = new ArrayList<>();

    static void addMoney() {
        System.out.println("avalaible balance is");
        System.out.println("2000,500,200,100");

        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                a = a + (arr[0] * 2000);

            } else if (i == 1) {
                a = a + (arr[1] * 500);
            } else if (i == 2) {
                a = a + (arr[2] * 200);
            } else if (i == 3) {
                a = a + (arr[3] * 100);
            }
        }
        System.out.println("Your amount " + a + " is added successfully");
    }

    static void showMoney() {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println("No.of 2000 rupees " + arr[0]);
            } else if (i == 1) {
                System.out.println("No.of 500 rupees " + arr[1]);
            } else if (i == 2) {
                System.out.println("No.of 200 rupees " + arr[2]);
            } else if (i == 3) {
                System.out.println("No.of 100 rupees " + arr[3]);
            }

        }
        System.out.println("Total Amount is " + a);
    }

    static int tra[] = { 0, 0, 0, 0 };

    static void note(int w) {
        if (w / 2000 != 0) {
            tra[0] = w / 2000;
            w = w % 2000;
            arr[0] = arr[0] - tra[0];
        }
        if (w / 500 != 0) {
            tra[1] = w / 500;
            w = w % 500;
            arr[1] = arr[1] - tra[1];
        }
        if (w / 200 != 0) {
            tra[2] = w / 200;
            w = w % 200;
            arr[2] = arr[2] - tra[2];
        }
        if (w / 100 != 0) {
            tra[3] = w / 100;
            w = w % 100;
            arr[3] = arr[3] - tra[3];
        }
    }

    static int avalaibleBalance = 20000;
    static int store;
    static int count = 1;
    static int w;
    static int mini[];

    static void withdraw() {
        System.out.println("Enter the amount you want to withdraw");
        w = sc.nextInt();
        if (w < avalaibleBalance && w <= a) {
            with.add(w);
            Date date = java.util.Calendar.getInstance().getTime();
            str.add(date.toString());
            if (bank.equals("Canara")) {
                avalaibleBalance = avalaibleBalance - w;
                integer.add(avalaibleBalance);

            } else {
                avalaibleBalance = (avalaibleBalance - w) - 30;
                integer.add(avalaibleBalance);
            }
            System.out.println("Collect your cash");
            note(w);
            System.out.println("2000" + " " + tra[0]);
            System.out.println("500 " + " " + tra[1]);
            System.out.println("200 " + " " + tra[2]);
            System.out.println("100 " + " " + tra[3]);

            System.out.println("Do you want to see your balance");
            String k = sc.next();
            if (k.equals("y")) {
                viewBalance();
            }

        }

        else {
            System.out.println("The amount you enter is not avalaible");
        }
    }

    static void viewBalance() {
        System.out.println("your balance is " + (avalaibleBalance));
    }

    static void balance() {
        System.out.println(avalaibleBalance);

    }

    static void miniStatement() {
        for (int i = 0; i < integer.size(); i++) {

            System.out.println(str.get(i) + " " + with.get(i) + " " + integer.get(i));

        }
    }

    static void pinChange() {
        System.out.println("Enter your current pin");
        int pin = sc.nextInt();
        if (pin == checkPin) {
            System.out.println("Enter the new pin");
            int newPin = sc.nextInt();
            System.out.println("Confirm the new pin");
            int newPin1 = sc.nextInt();
            if (newPin == newPin1) {
                checkPin = newPin;
                System.out.println("Pin changed Successfully");
            }
        }
    }

    static int ad;
    static int checkPin = 1234;
    static int attempt;
    static String bank;

    public static void main(String ar[]) {
        sc = new Scanner(System.in);
        int n = 0;

        do {
            System.out.println("-----ATM-----");
            System.out.println("1.admin login");
            System.out.println("2.User login");
            System.out.println("3.Exit");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the Username and Password");
                    String s = sc.next();
                    int a = sc.nextInt();

                    if (s.equals("admin") && a == 1234) {
                        System.out.println("-----Welcome Admin-----");
                        t: while (true) {
                            System.out.println("1.AddMoney");
                            System.out.println("2.ShowMoney");
                            System.out.println("3.Exit");
                            ad = sc.nextInt();
                            switch (ad) {
                                case 1:
                                    addMoney();
                                    break;
                                case 2:
                                    showMoney();
                                    break;
                                case 3:
                                    break t;

                            }
                        }
                    } else {
                        System.out.println("Invalid input");

                    }

                    break;
                case 2:
                    System.out.println("Please enter your Username and Password and BankName");
                    String name = sc.next();
                    int oldpin = sc.nextInt();
                    sc.nextLine();
                    bank = sc.next();
                    if ((name.equals("dhivya")) && (oldpin == checkPin)) {
                        t: while (true) {
                            System.out.println("Welcome " + name);
                            System.out.println("1.withdraw");
                            System.out.println("2.Balance");
                            System.out.println("3.Mini Statement");
                            System.out.println("4 Pin Change");
                            System.out.println("5.Exit");
                            int b = sc.nextInt();
                            switch (b) {
                                case 1:
                                    withdraw();
                                    break;
                                case 2:
                                    balance();
                                    break;
                                case 3:
                                    miniStatement();
                                    break;
                                case 4:
                                    pinChange();
                                    break;
                                case 5:
                                    break t;
                            }

                        }
                    } else {

                        System.out.println("Please check your username and password");
                        attempt++;
                    }
                    if (attempt > 2) {
                        System.out.println("You have exceed your limit");
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        } while (n != 3);

    }
}