import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BessieAndHaybales {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Read input
    int N = sc.nextInt();
    long T = sc.nextLong();    
    Map<Long, Long> deliveries = new HashMap<Long, Long>();

    // Iterate through deliveries
    for (int i = 0; i < N; i++) {
           long deliveryDay = sc.nextLong();
           long haybales = sc.nextLong();
           deliveries.put(deliveryDay, haybales);
    }

    System.out.println("INPUT:");
    System.out.println("N=" +N);
    System.out.println("T=" +T);
    System.out.println("deliveries=" + deliveries);



    // Initialize variables
    long totalAvailable = 0;
    long totalEaten = 0;
    long currentDay = 1;
    
    while (currentDay <= T) {
           for (Map.Entry<Long, Long> delivery : deliveries.entrySet()) {
                 if (currentDay == delivery.getKey()) {
                   
                        //add delivery to total available
                        totalAvailable += delivery.getValue();
                 }

           }

           if (totalAvailable > 0) {
                 totalEaten += 1;
                 totalAvailable--;

           }

           currentDay += 1;
    }

    // Print the result
    System.out.println("OUTPUT:");
    System.out.println(totalEaten);
      sc.close();
   }
}
