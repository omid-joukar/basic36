import java.util.Scanner;

/**
 * Created by KPS on 7/8/2020.
 */
public class Main {
    public static double earthRadius =  6371.01;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate: ");
        double x1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate : ");
        double y1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate: ");
        double x2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate : ");
        double y2 = input.nextDouble();
        double result = distance_pro(x1,y1,x2,y2);
        System.out.println("the distance is : "+result);

    }
    public static double distance_pro(double x1, double y1, double x2, double y2){
        double radiusx1= Math.toRadians(x1);
        double radiusy1= Math.toRadians(y1);
        double radiusx2= Math.toRadians(x2);
        double radiusy2= Math.toRadians(y2);
        return earthRadius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

}
