
package moneycalculator_v2.model;

/**
 *
 * @author FernandoSanfielReyes
 */
public class Money {
    
    private final double amount;
    private final Currency currency;

    public Money(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }
    
}
