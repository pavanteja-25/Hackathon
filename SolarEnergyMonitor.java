import java.util.Scanner;

public class SolarEnergyMonitor {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the energy generated in kWh: ");
        double energyGenerated = sc.nextDouble();
        if (energyGenerated <= 10.0) {
            System.out.println("good Energy Generation");
        } else {
            System.out.println("low Energy Generation");
        }
 sc.close();
    }
}










