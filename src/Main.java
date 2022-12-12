import Classes.ImmutablePerson;
import Classes.MyMath;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


//         Task1_1("Lorem ipsum dolor! sit amet 26");
//        Task1_2("Lorem ipsum dolor! sit amet 26");


//        ImmutablePerson person1 = new ImmutablePerson("Vidadi", "Mammadov", 35);
//        ImmutablePerson person2 = person1;
//
//        System.out.println(person2);
//        System.out.println(person1);


//        Task1_4("Jamal Khalilov 9 asd5s");


//        System.out.println("Summ result = " + MyMath.add("18000000", "21999978"));
//        System.out.println("Multiplication result = " + MyMath.multiply("1000", "22"));



//        Task2(33);


    }


    public static void Task1_1(String text){
        String textout = "";

        textout = text.replaceAll("[^a-zA-Z0-9_-]", "");
        System.out.println("Hərflər: "+ textout.replaceAll("[^a-zA-Z]", ""));
        System.out.println("Ədədlər: "+ textout.replaceAll("[^0-9]", ""));
    }

    public static void Task1_2(String text){
        String textout = "";

        textout = text.replaceAll("[0-9]", "");
        System.out.println("Rəqəmsiz mətn: "+ textout);
    }

    public static void Task1_4(String str){

        String[] arrOfStr = str.split("[ _,.!?]");

        String finalString = "";

        int counter = 0;
        for (String str1: arrOfStr){

            if (counter == 0){

                finalString = str1;
            }
            else {
                finalString = finalString + "," + str1;
            }
            counter++;
        }
        System.out.println(finalString);
    }







    public static void Task2(int number){

        String output = "";

        HashMap<Integer, String > numbers = new HashMap<>();

        numbers.put(3, "Fizz");
        numbers.put(5, "Buzz");

        for (Integer key: numbers.keySet()){
            if (number%key == 0){
                output += numbers.get(key);
            }
        }

        System.out.println(output);
    }
}