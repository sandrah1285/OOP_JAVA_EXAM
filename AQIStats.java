import java.util.*;

public class AQIStats {
    public static void main(String[] args) {
        List<Integer> readings = new ArrayList<>();
        Random rnd = new Random();
        
        // i) Generate 30 readings
        for (int i = 0; i < 30; i++) {
            readings.add(1 + rnd.nextInt(300)); // 1 to 300 inclusive
        }
        
        // ii) Median
        Collections.sort(readings);
        double median = (readings.get(14) + readings.get(15)) / 2.0;

        // iii) Hazardous days
        long hazardous = readings.stream().filter(v -> v > 200).count();

        System.out.println("Readings: " + readings);
        System.out.printf("Median AQI: %.1f%n", median); // Fixed the space after %. 
        System.out.println("Hazardous days (>200): " + hazardous);
    }
}
