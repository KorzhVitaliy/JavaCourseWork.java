package views;


import utils.Validator;

import java.util.Scanner;

// View
public class SalesView {


    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;
    Validator validator;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.

    public SalesView(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите наименование товара: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        validator.validateName(scanner);


        title = "Введите количество: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        validator.validateQuantityInput(scanner);

        title = "Введите цену: ";
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.
        validator.validatePriceInput(scanner);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
