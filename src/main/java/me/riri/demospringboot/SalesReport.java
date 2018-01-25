package me.riri.demospringboot;

import java.util.Scanner;

public class SalesReport {
    int  tax_code;
    double customer_number,sales_amount, sales_tax;
    String customer_name;

    Scanner reader = new Scanner(System.in);



    public void salesReport() {

        System.out.println("Enter customer_name");
        customer_name = reader.nextLine();

        System.out.println("Enter customer_number");
        customer_number = reader.nextDouble();

        System.out.println("Enter customer_number");
        sales_amount = reader.nextDouble();

        System.out.println("Enter tax code ");
        tax_code = reader.nextInt();

        switch (tax_code)

        {

            case 0:
                sales_tax = 0.0;
                break;
            case 1:
                sales_tax = 0.03;
                break;
            case 2:
                sales_tax = 0.05;
                break;

        }
        double totalAmountDue = sales_amount + (sales_tax * sales_amount);

        System.out.println("customer_number, customer_name, sales_amount, sales_tax, totalAmountDue");
    }

}
