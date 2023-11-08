package lecture02;

import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int x = 0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.printf("数字%dつ目" ,i);
            num[i] = scan.nextInt();
            System.out.println("");//改行
        }

        Keisan k = new Keisan();
        x = k.sum(num);

//        for(int j=0;j<5;j++){
//            x += num[j];
//        }

        System.out.printf("合計値：%d\n", x);
        k.hantei(x);

//        if(x>=100){
//            System.out.println("great!!");
//        }
//        else if(x>=50){
//            System.out.println("big");
//        }
//        else{
//            System.out.println("small");
//        }

    }
}
