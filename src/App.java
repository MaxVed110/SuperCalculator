import java.util.Scanner;

public class App {

    private final Log log = new Log("App");

    public void start() {
        log.LogInfo("Start calculator");
        View view = new View();
        Presenter pres = new Presenter(view);
        RealCalcModel modelR = new RealCalcModel();
        ComplexCalcModel modelC = new ComplexCalcModel();

        try (Scanner scan = new Scanner(System.in)) {
            while (true) {
                System.out.println("Выберете режим: R / I\nВыйти из программы - Е");
                String key = scan.next();
                if (key.equals("E")){
                    System.out.println("Выход...");
                    log.LogInfo("Exit program");
                    break;
                }
                switch (key) {
                    case "R" -> pres.startReal(modelR);
                    case "I" -> pres.startComplex(modelC);
                    default -> System.out.println("Неверная команда");
                }
            }
        }
    }
}
