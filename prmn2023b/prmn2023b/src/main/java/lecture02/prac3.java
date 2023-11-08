package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
//        String[][] gakuseki = new String[2][];
//        gakuseki[0] = new String[5];
//        gakuseki[1] = new String[5];
//
//        gakuseki[0][0] = "B2001000";
//        gakuseki[0][1] = "B2001001";
//        gakuseki[0][2] = "B2001002";
//        gakuseki[0][3] = "B2001003";
//        gakuseki[0][4] = "B2001004";
//
//        gakuseki[1][0] = "1000";
//        gakuseki[1][1] = "1001";
//        gakuseki[1][2] = "1002";
//        gakuseki[1][3] = "1003";
//        gakuseki[1][4] = "1004";

        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        GakusekiPass gp = new GakusekiPass();
        int x = gp.hantei(input);

        input = scan.next();

        gp.login(x, input);

    }
}
