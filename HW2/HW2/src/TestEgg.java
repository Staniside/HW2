import java.util.ArrayList;
import java.util.Scanner;

public class TestEgg {
    public TestEgg(){
}

    public static void main(String[] args) {
        System.out.println("How many eggs do you want to eat");
        Scanner sc = new Scanner(System.in);
        int numberOfEggs = sc.nextInt();
        ArrayList<Egg> eggs = new ArrayList<Egg>(numberOfEggs);
        EggUtility.WashEggs(eggs);
        EggUtility.coverWithColdWater(eggs);
        EggUtility.putEggsInCookware(eggs);
        EggUtility.startCooking(eggs);
        EggUtility.BoilEggs(eggs);
        EggUtility.pourWithColdWater(eggs);
    }
}
