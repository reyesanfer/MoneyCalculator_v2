
package moneycalculator_v2;

import java.util.Scanner;
import moneycalculator_v2.model.*;

/**
 *
 * @author FernandoSanfielReyes
 */
public class MoneyCalculator {

    private Money money;
    private ExchangeRate exchangeRate;
    private Currency currency;

    public MoneyCalculator() {
    }
    
    public void control(){
        input();
        process();
        output();
    }
    
    private void input(){
        System.out.println("Introduce una cantidad de dinero: ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.next());
        
        System.out.println("Introduce la divisa correspondiente a la anterior cantidad: ");
        String isoCode = scanner.next();
        
        currency = new Currency(isoCode, "...", "...");
        money = new Money(amount, currency);
    }
    
    private void process(){
        exchangeRate = new ExchangeRate(currency, new Currency("EUR", "...", "..."));
    }
    
    private void output(){
        System.out.println(money.getAmount() + " " + currency.getIsoCode() + " equivale a " + money.getAmount() * exchangeRate.getRate() + " EUR");
    }
}
