package mrkool.BillGenerator.classes;

public class Item {
    String item;
    int price;
    int quantity;
    int subTotal;
    Item(String item, int price, int quantity, int subTotal) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

        public String toString() {
            return item+ "        "+price+"          "+quantity+"        "+subTotal;

        }
    }

