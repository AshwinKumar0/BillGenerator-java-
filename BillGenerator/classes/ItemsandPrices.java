package mrkool.BillGenerator.classes;
import java.util.ArrayList;
import java.util.Iterator;

public class ItemsandPrices {
static String item;
static int price;
static int choice;
static int quantity;
static int subTotal;
static float TotalPayable;
static ArrayList<Item> itemList = new ArrayList();
public ItemsandPrices() {

}
public static void decideItems(int c, int q) {
    choice = c;
    quantity = q;

    switch(choice) {

        case 1:
            item = "Coffee";
            price = 10;
            break;

        case 2:
            item = "Tea";
            price = 8;
            break;

        case 3:
            item = "Idli";
            price = 25;
            break;

        case 4:
            item = "Vada";
            price = 25;
            break;

        case 5:
            item = "Dosa";
            price = 50;
            break;

        case 6:
            item = "Water";
            price = 20;
    }
    subTotal = price * quantity;
    itemList.add(new Item(item,price,quantity,subTotal));
    TotalPayable = (float) subTotal + TotalPayable;
}
static void FinalBill() {
    System.out.println("Item      price     Quantity     subTotal");
    for(Item i: itemList) {
        System.out.println(i);
    }
    System.out.println("GrandTotal: "+TotalPayable);
}
}
