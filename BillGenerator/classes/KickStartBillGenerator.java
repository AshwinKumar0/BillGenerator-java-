package mrkool.BillGenerator.classes;
import mrkool.BillGenerator.interfaces.BillGenerator;
import mrkool.pakage.string;

import java.util.Scanner;

public class KickStartBillGenerator implements BillGenerator{
    Scanner sc = new Scanner(System.in);
    string item;
    int price;
    int choice;
    int quantity;
    float totalPayable;


    public void ShowMenu() {
            System.out.println("--------------------------------");
            System.out.println("|            XYZ Hotel         |");
            System.out.println("|         Select from Menu     |");
            System.out.println("|------------------------------|");
            System.out.println("| Sl No.   |  Item  |   Price  |");
            System.out.println("|          |        |          |");
            System.out.println("|------------------------------|");
            System.out.println("| 1        | Coffee |       10 |");
            System.out.println("| 2        | Tea    |       08 |");
            System.out.println("| 3        | Idli   |       30 |");
            System.out.println("| 4        | Vada   |       25 |");
            System.out.println("| 5        | Dosa   |       50 |");
            System.out.println("| 6        | Water  |       20 |");
            System.out.println("|__________|________|__________|");

    }
    public void acceptInput() {
       String ch;
       for(char c = 'Y'; c =='Y'; c=ch.charAt(0) ) {
           for (char c1 = 'Y'; c1 == 'Y'; c1 = ch.charAt(0)) {
               System.out.println("Please enter your choice: (based on sl no.)");
               for (this.choice = sc.nextInt(); this.choice < 1 || this.choice > 6; this.choice = sc.nextInt()) {
                   System.out.println("No such item: Please choose again");
               }
               System.out.println("Please enter the Quantity");
               this.quantity = sc.nextInt();
               ItemsandPrices.decideItems(this.choice, this.quantity);
               System.out.println("Do you want anything else");
               ch = sc.next();
               ch = ch.toUpperCase();
           }
           ItemsandPrices.FinalBill();
           System.out.println("\n\n\n\n Do you want to CheckOut: Add More?(Y/N)");
           ch = sc.next();
           ch = ch.toUpperCase();
       }
       System.out.println("Grand Total after taxes is: " +(double)ItemsandPrices.TotalPayable*1.18);


           }



       }
