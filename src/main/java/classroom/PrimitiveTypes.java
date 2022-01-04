package classroom;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class PrimitiveTypes {
    public static void main(String[] args) {

        // floating point example

        float floatExample = 99999.9999F;
        System.out.println(floatExample);
        System.out.println(9999.9999F);

        double doubleExample = 2000000.987D;
        System.out.println(doubleExample);
        System.out.println(2000000);

        //integral example

        byte handCount = 2;
        System.out.println(handCount);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short distanceBetweenRigaAndKiev = 1011;
        System.out.println(distanceBetweenRigaAndKiev);

        int populationOfLatvia = 1900000;
        System.out.println(populationOfLatvia);

        long currentPopulation = 79000000000L;
        System.out.println(currentPopulation);

        char ch = 'a';
        System.out.println(ch);

        int[] arrayOfPeopleAges = {21, 22, 23, 24};
        System.out.println(Arrays.toString(arrayOfPeopleAges));

        String myName = ("Natalja");
        System.out.println(myName);

        String mySurname ="Lakida";
        String myNameAndSurname = myName + " " + mySurname;
        System.out.println(myNameAndSurname);

        System.out.printf("My name is %s. My surname is %s.",myName, mySurname);



    }
    }

