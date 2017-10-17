package com.greenfox.bx;

public class CreditCardReservation extends CreditCard implements Reservationy {

    private String code;
    private String dow;
    private String[] dows;

    public CreditCardReservation(int i) {
        super(i);
        super.name = String.format("DEF%d", i);
        createCode();
        dows = new String[] {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        createDow();
    }

    private void createCode() {
        code = "";
        for (int i = 0; i < 8; i++) {
            int n = (int) (65 + Math.random() * 25 );
            char c = (char) n;
            code += c;
        }
    }

    private void createDow() {
        dow = dows[(int) (Math.random() * 7)];
    }

    @Override
    public String getDowBooking() {
        return code;
    }

    @Override
    public String getCodeBooking() {
        return dow;
    }

    @Override
    public String toString() {
        return String.format("BOOKING# %s for %s paid by Name=%s CC#=%s CVV=%d", code, dow, getNameCardholder(), getCodeAccount(), getSumCVV());
    }

}
