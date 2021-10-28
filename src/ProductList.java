import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List array = new ArrayList();
        int actionNum = 1;
        while (actionNum != 0) {
            System.out.println("\nAction:\n1. Show number of commodity\n2. Add commodity in list\nEnter num of action: ");
            actionNum = scanner.nextInt();
            switch (actionNum) {
                case 1:
                    show(array);
                    break;
                case 2:
                    add(array);
                    break;
                default:
                    System.out.println("Choose correct num\n");
                    break;
            }
        }
    }

    static void show(List list) {
        int counter = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(counter + "Product " + list.get(i) + " ");
        }
        if(list.isEmpty()) {System.out.println("List is empty! ");}
    }
    static void add(List list) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose type of commodity:\n1. Normal\n2. Express\n3. Insure\nEnter num: ");
        int num = scan.nextInt();
        switch(num) {
            case 1:
                System.out.print("Enter date in format xx.xx.xxxx: ");
                String date1 = scan.next();
                System.out.print("Enter time: ");
                String time1 = scan.next();
                System.out.print("Enter id: ");
                int id1 = scan.nextInt();
                Normal item1 = new Normal(date1, time1, id1);
                list.add(item1);
                break;
            case 2:
                System.out.print("Enter date in format xx.xx.xxxx: ");
                String date2 = scan.next();
                System.out.print("Enter time: ");
                String time2 = scan.next();
                System.out.print("Enter id: ");
                int id2= scan.nextInt();
                System.out.print("Enter courier name: ");
                String name2 = scan.next();
                System.out.print("Enter delivery date: ");
                String deliveryDate2 = scan.next();
                Express item2 = new Express(date2, time2, id2, name2, deliveryDate2);
                list.add(item2);
                break;
            case 3:
                System.out.print("Enter date in format xx.xx.xxxx: ");
                String date3 = scan.next();
                System.out.print("Enter time: ");
                String time3 = scan.next();
                System.out.print("Enter id: ");
                int id3= scan.nextInt();
                System.out.print("Enter company name: ");
                String name3 = scan.next();
                System.out.print("Enter sum: ");
                int sum3 = scan.nextInt();
                Insured item3 = new Insured(date3, time3, id3, name3, sum3);
                list.add(item3);
                break;
            default:
                break;
        }
    }
}