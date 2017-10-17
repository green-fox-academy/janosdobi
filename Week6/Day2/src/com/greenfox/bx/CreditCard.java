package com.greenfox.bx;

public class CreditCard implements CreditCardy {

    private StringBuilder codeAccount;
    private String name;
    
    public CreditCard(int i) {
        this.name = String.format("ABC%d", i);
        generateNumber();
    }

    private void generateNumber() {
        codeAccount = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            codeAccount.append((int) (Math.random() * 9));
        }
    }

    @Override
    public int getSumCVV() {
        return cumeSumCVV(getCodeAccount());
    }

    @Override
    public String getNameCardholder() {
        return name;
    }

    @Override
    public String getCodeAccount() {
        return codeAccount.toString();
    }

    @Override
    public int cumeSumCVV(String codeAccount) {
        int i = 0;
        for (int j = 0; j < this.codeAccount.length() - 1; j++) {
            i += this.codeAccount.charAt(j);
        }
        return i;
    }

    @Override
    public String toString() {
        return String.format("Name=%s CC#=%s CVV=%d", getNameCardholder(), getCodeAccount(), getSumCVV());
    }
}