package pl.mateuszwarzyc.behavioral.strategy.impl;

/**
 * Created by Coffee13.
 */
public abstract class ValidationStrategy {

    public abstract boolean isValid(CreditCard card);

    protected boolean passesLuhn(String ccNubmer) {
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNubmer.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(ccNubmer.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;

                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

}
