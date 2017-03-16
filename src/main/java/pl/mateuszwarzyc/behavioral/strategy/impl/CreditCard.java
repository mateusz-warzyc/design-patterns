package pl.mateuszwarzyc.behavioral.strategy.impl;

/**
 * Created by Coffee13.
 */
public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy stategy;


    public CreditCard(ValidationStrategy stategy) {
        this.stategy = stategy;
    }

    public boolean isValid() {
        return stategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
}
