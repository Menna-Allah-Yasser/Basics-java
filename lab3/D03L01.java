import java.util.Scanner;
import java.util.function.Function;

public class D03L01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int degree= in.nextInt();

        Function<Integer , Double> convertCToF= (d) -> (d*1.8)+32;

        System.out.println(convertCToF.apply(degree));


    }
}