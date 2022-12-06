package mrkool.BillGenerator.classes;

public class Launcher {
    public static void main(String[] args) {
        KickStartBillGenerator  ksb = new KickStartBillGenerator();
        ksb.ShowMenu();
        ksb.acceptInput();
    }
}
