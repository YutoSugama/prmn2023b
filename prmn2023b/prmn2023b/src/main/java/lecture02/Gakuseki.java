package lecture02;

public class Gakuseki {
    String number = "B2001000";
    void hantei(String num){
        if(number.equals(num)){
            System.out.println("complete!!");
        }
        else {
            System.out.println("error!!");
        }
    }
}
