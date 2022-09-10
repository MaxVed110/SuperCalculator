import java.util.Scanner;

public class App {
    public void start() {
        View view = new View();
        Presenter pres = new Presenter(view);
        RealCalcModel modelR = new RealCalcModel();
        ComplexCalcModel modelC = new ComplexCalcModel();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберете режим: R / I");
                String key = scan.next();
                switch (key) {
                    case "R" -> pres.startReal(modelR);
                    case "I" -> pres.startComplex(modelC);
                    default -> System.out.println("Неверная команда");
                }
            }
        }
    }
}
