package lecture02;

import java.util.Objects;

public class GakusekiPass {
    String[][] gakuseki = {{"B2001000","B2001001","B2001002","B2001003","B2001004"},
            {"1000","1001","1002","1003","1004"}};

//    String[][] gakuseki = new String[2][5];
//    gakuseki[0] = new String[5];
//    gakuseki[1] = new String[5];
//
//    gakuseki[0][0] = "B2001000";
//    gakuseki[0][1] = "B2001001";
//    gakuseki[0][2] = "B2001002";
//    gakuseki[0][3] = "B2001003";
//    gakuseki[0][4] = "B2001004";
//
//    gakuseki[1][0] = "1000";
//    gakuseki[1][1] = "1001";
//    gakuseki[1][2] = "1002";
//    gakuseki[1][3] = "1003";
//    gakuseki[1][4] = "1004";

    int hantei(String input){
        int x = -1;
        for(int i=0;i<5;i++){
            if(input.equals(gakuseki[0][i])){
                x = i;
                break;
            }
            else{
                System.out.println("error!!");
                System.exit(0);
            }
        }
        return x;
    }
    void login(int x, String input){
        if(gakuseki[1][x].equals(input)){
            System.out.println("ログイン完了");
        }
        else{
            System.out.println("不正アクセス");
            System.exit(0);
        }

    }
}
