import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       System.out.println("Feeling clueless on what numbers to buy for CNY? Fret not! Try out this fortune generator that bless you with numbers to FA FA FA!"); 
       System.out.println("How many 4D-numbers do you want to generate?");
       int loopNo = getUserInput();
       ArrayList <NumGenerator> numList = generateNumbers(loopNo);
       viewGeneratedNumbers(numList);
    }

    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int toGenNumber = sc.nextInt();
        return toGenNumber;
    }

    public static ArrayList<NumGenerator> generateNumbers(int loop) {
        ArrayList<NumGenerator> numList = new ArrayList<>();
        for (int x = 0; x < loop; x++) {
            NumGenerator ng = new NumGenerator();
            numList.add(ng.generate());
        }
        return numList;
    }
    public static void viewGeneratedNumbers(ArrayList<NumGenerator> numList) {
        System.out.println("List of lucky numbers:");
        for (int x = 0; x < numList.size(); x++) {
            System.out.println(numList.get(x));
        }
    }
}
