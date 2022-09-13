package core;

import java.util.Scanner;

public class View {

    Scanner scan = new Scanner(System.in);

    public double getValue(String phrase) {
        System.out.println("Введите " + phrase + ": ");
        return this.scan.nextDouble();
    }

    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void printComplexResult(ImaginaryModel result) {
        if (result.a < 0) {
            System.out.println(result.x + " - i" + result.a * (-1));
        } else {
            System.out.println(result.x + " i" + result.a);
        }
    }
}
