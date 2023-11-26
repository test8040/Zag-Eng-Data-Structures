import java.util.ArrayList;

public class General {
    /////**Method return the reverse of a number**/////
    public int reverse(int num) { //4
        int reverse=0;

        while (num>0){
            int temp=num%10;
            reverse=reverse*10+temp;
            num=num/10;
        }

        return reverse;

    }


}