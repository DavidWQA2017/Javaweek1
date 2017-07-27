/**
 * Created by Administrator on 19/07/2017.
 */


public class Factorials {
public static void main(String [ ] args) {

    double factorNumber = 120;
    int count = 1;
    int storedFactor = (int) factorNumber;

    while (factorNumber > 1) {


        count = count + 1;
        factorNumber = factorNumber / count;

        System.out.println(count);
        System.out.println(factorNumber);}

    if (factorNumber == 1) {
        System.out.println(storedFactor + " = " + count + "!");}
        else {
        System.out.println(storedFactor + " NONE");}

}

}



