package controllers;

import models.Product;
import utils.Rounder;
import utils.Validator;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        model.getName();

        // 2) вызов методов расчетов доходов и налога;
        double income = model.productIncome(model.getQuantity(), model.getPrice());
        double tax = model.taxSum();
        double netIncome = model.productIncome(income, tax);

        // 3) округление расчетных значений;
        double incomeRounded = Rounder.roundInputNumber(income);
        double taxRounded = Rounder.roundInputNumber(tax);
        double netIncomeRounded = Rounder.roundInputNumber(netIncome);

        // 4) вывод расчетов по заданному формату.
        String output = "Наименование товара: " + model.getName() + "\n" +
                "Общий доход (грн.): " + incomeRounded + "\n" +
                "Сумма налога (грн.): " + taxRounded + "\n" +
                "Чистый доход (грн.): " + netIncomeRounded;
        view.getOutput(output);
    }
}
