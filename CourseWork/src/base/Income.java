package base;

import models.Product;

public interface Income {
    //Доход = Количество товара х Цена.
    double productIncome(int quantity, double price);

    //Чистый доход = Доход - Налог.
    double productIncome(double productIncome, double taxSummery);



}
