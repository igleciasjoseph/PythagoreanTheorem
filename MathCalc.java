import java.lang.Math;


public class MathCalc {

    public double hypotenuseCalc(int legA, int legB) {
        double legC;

        legA *= legA;
        legB *= legB;

        legC = Math.sqrt(legA + legB);

        System.out.println(legC);
        return legC;
    }


}