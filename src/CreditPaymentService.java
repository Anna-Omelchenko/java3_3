public class CreditPaymentService {
    public int payment(int s1, double iYear1, int n1) {
        int nMonth = n1 * 12;
        double iMonth = iYear1 / 12 / 100;
        double result = s1 * (iMonth + iMonth / (Math.pow(1 + iMonth, nMonth) - 1));
        return (int) result;
    }
}
