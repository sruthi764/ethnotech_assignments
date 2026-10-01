import java.util.*;

public class Assignment {

    public static Map<String, Integer> countSnackThefts(String[] grabLog) {
        Map<String, Integer> map = new HashMap<>();

        // Count snacks taken by each student
        for (String name : grabLog) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {

        String[] grabLog = {"Sruthi", "Suma", "Thanvitha", "Varshini", "Vyshu", "Supraja"};

        Map<String, Integer> result = countSnackThefts(grabLog);

        // Find student with highest count
        String maxStudent = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount ||
                (count == maxCount && name.compareTo(maxStudent) < 0)) {

                maxStudent = name;
                maxCount = count;
            }
        }

        System.out.println(result);
        System.out.println("Prime suspect: " + maxStudent +
                           " (" + maxCount + " snacks)");
    }
}