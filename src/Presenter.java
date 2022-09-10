import java.util.Scanner;

public class Presenter {
    View view;
    RealModel model;

    public Presenter(View view) {
        this.view = view;
    }

    public void startReal(RealCalcModel model) {
        this.model = model;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите необходимую операцию: + - * / ...");
        String key = scan.next();
        model.setX(view.getValue("первое число"));
        model.setY(view.getValue("второе число"));
        switch (key) {
            case "+" -> view.printResult(model.resultSum());
            case "-" -> view.printResult(model.resultDif());
            case "/" -> view.printResult(model.resultDiv());
            case "*" -> view.printResult(model.resultMult());
            default -> System.out.println("Такой орерации не существует");
        }
    }

    public void startComplex(ComplexCalcModel model) {
        this.model = model;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите необходимую операцию: + - * / ...");
        String key = scan.next();
        model.setX(view.getValue("действительную часть первого числа"));
        model.setA(view.getValue("мнимую часть первого числа"));
        model.setY(view.getValue("действительную часть второго числа"));
        model.setB(view.getValue("мнимую часть второго числа"));
        switch (key) {
            case "+" -> view.printComplexResult(model.resultSum());
            case "-" -> view.printComplexResult(model.resultDif());
            case "/" -> view.printComplexResult(model.resultDiv());
            case "*" -> view.printComplexResult(model.resultMult());
            default -> System.out.println("Такой орерации не существует");
        }
    }
}
