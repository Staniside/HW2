import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class EggUtility {
    private EggUtility(){
    }

    public static void WashEggs(ArrayList<Egg> eggs){
        System.out.println("your eggs are clean");
    }

    public static void coverWithColdWater(ArrayList<Egg> eggs){
        System.out.println("Please cover the eggs with cold water so the chance for them to crack while cooking is less");
    }

    public static void putEggsInCookware(ArrayList<Egg> eggs){
        if (eggs.size() == 1){
            System.out.println("You should put boil your egg in kanche");
        } if (eggs.size() > 1 && eggs.size() <= 3){
            System.out.println("You should put boil eggs in djezve");
        } if (eggs.size() > 3){
            System.out.println("You should boil your eggs in tendjera");
        }
    }

    public static void startCooking(ArrayList<Egg> eggs){
        System.out.println("Put your eggs on the hob");
    }



    public static void BoilEggs(ArrayList<Egg> eggs){
        System.out.println("Your eggs have boiled.\nHow much time do you want them to boil");

        String levelOfBoil;
        System.out.println("How much do you want your eggs to be boiled - rare, medium or hard");
        Scanner sc = new Scanner(System.in);
        do {
            levelOfBoil = sc.nextLine();
            System.out.println("please enter one of the 3 options: rare, medium or hard");
        }while(!levelOfBoil.equals("rare") || !levelOfBoil.equals("medium") || !levelOfBoil.equals("hard"));

        System.out.println("you chose your eggs to be boiled " + levelOfBoil);
        System.out.println("I will time your boil so you know when to take the eggs out");
        //launching a stopwatch
        //Instant time = Instant.now();
        long time = Stopwatch();
        if (levelOfBoil.equals("rare")){
            if (time <= 3){
                System.out.println("you can take your eggs away from the cookware they are done easy");
            }
        } if (levelOfBoil.equals("medium")){
            if (time > 3 && time <= 5){
                System.out.println("you can take your eggs away from the cookware they are done medium");
            }
        } if (levelOfBoil.equals("hard")){
            if (time >= 5){
                System.out.println("You can take your eggs away from the cookware they are done hard");
            }
        }
    }

    private static long Stopwatch(){
        long millis = System.currentTimeMillis();
        String.format("%d min",
                TimeUnit.MILLISECONDS.toMinutes(millis) -
                        TimeUnit.MINUTES.toMinutes(TimeUnit.MILLISECONDS.toMinutes(millis))
        );
        return millis;
    }

    public static void pourWithColdWater(ArrayList<Egg> eggs){
        System.out.println("Now you can pour your eggs with cold water so you can peel them off easily");
    }
}
