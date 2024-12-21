import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class D03L02 {

    public static void main(String[] args) {

        Function<Double[] , Double[]>  quadraticEquation= (arr) ->{
            double a=arr[0];
            double b=arr[1];
            double c=arr[2];

            double d=Math.sqrt((b*b)-(4*a*c));

            Double res[]= new Double[2];
            double root1 = (-b +d) / (2*a);
            double root2 = (-b -d) / (2*a);
            res[0]=root1;
            res[1]=root2;
            return res;
        };


        Arrays.stream(quadraticEquation.apply(introView()))
                .collect(Collectors.toList())
                .forEach((x) -> System.out.println(x));




    }

    public static Double[] introView(){
        Double res[]= new Double[3];
        Scanner in = new Scanner (System.in);

        System.out.print("Enter a : ");
        res[0]= in.nextDouble();
        System.out.print("Enter b : ");
        res[1]= in.nextDouble();
        System.out.print("Enter c : ");
        res[2]= in.nextDouble();

        return res;
    }

}
