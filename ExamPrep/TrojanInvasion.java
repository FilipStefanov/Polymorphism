package ExamPrep;


import java.util.*;

public class TrojanInvasion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waves = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> spartans = new ArrayDeque<>();
        int[] data = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : data) {
            spartans.offer(i);
        }


        ArrayDeque<Integer> trojans = new ArrayDeque<>();
        int count = 1;

        while (waves-- > 0) {

            if (spartans.size() == 0) {
                break;
            }

            int[] trojanData = Arrays.stream(scanner.nextLine()
                    .split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int i = trojanData.length - 1; i >= 0; i--) {
                trojans.offer(trojanData[i]);
            }
            if (count == 3) {
                int plateToAdd = Integer.parseInt(scanner.nextLine());
                spartans.offer(plateToAdd);
                count = 0;
            }

            while (trojans.size() != 0 && spartans.size() != 0) {
                int plate = spartans.pop();
                int warrior = trojans.pop();

                int result = plate - warrior;

                if (result > 0) {
                    spartans.push(result);
                } else if (result == 0) {
                    continue;
                } else {
                    trojans.push(Math.abs(result));
                }
            }
            count++;

        }
       if (trojans.size() == 0){
           System.out.println("The Spartans successfully repulsed the Trojan attack.");
           StringBuilder builder = new StringBuilder();
           builder.append("Plates left: ");
           for (Integer spartan : spartans) {
               builder.append(spartan.toString())
                       .append(", ");
           }

           builder.deleteCharAt(builder.lastIndexOf(","));
           System.out.println(builder.toString().trim());

       }else{
           System.out.println("The Trojans successfully destroyed the Spartan defense.");
           StringBuilder builder = new StringBuilder();
           builder.append("Warriors left: ");
           for (Integer trojan : trojans) {
               builder.append(trojan.toString())
                       .append(", ");
           }

           builder.deleteCharAt(builder.lastIndexOf(","));
           System.out.println(builder.toString().trim());

       }
    }
}
