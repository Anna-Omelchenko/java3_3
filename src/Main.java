public class Main {
    public static void main(String[] args) {
        int s = 1_000_000;
        int n = 3;
        double iYear = 9.99;
        CreditPaymentService monthPayment = new CreditPaymentService();
        System.out.println("Месячный платеж по кредиту (формула): " + monthPayment.payment(s, iYear, n));
        System.out.println();
        System.out.println("Месячный платеж по кредиту: " + monthPayment.payment(1000000, 9.99, 1));
        System.out.println();
        System.out.println("Месячный платеж по кредиту: " + monthPayment.payment(1000000, 9.99, 2));
        System.out.println();
        System.out.println("Месячный платеж по кредиту: " + monthPayment.payment(1000000, 9.99, 3));


    }
}