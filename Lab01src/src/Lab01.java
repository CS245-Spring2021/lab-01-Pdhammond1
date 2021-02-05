import java.util.Arrays;
import java.util.Scanner;

public class Lab01 {

    public int highestAltitude(int[] gain) {
        int ans = gain[1];
        for (int i = 0; i <= gain.length-1; i++) {
            int num = gain[i];
            if (num > ans) {
                ans = num;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Lab01 p1 = new Lab01();
        int high;
        int [] gain= new int[2];
        gain[0]=1; gain[1]=2;
        high = p1.highestAltitude(gain);
        System.out.print(high);
    }
}