package lecture02;

public class Keisan {
    int sum(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }
    void hantei(int sum){
        if(sum>=100){
            System.out.println("great!!");
        }
        else if(sum>=50){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }
    }
}
