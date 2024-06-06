package assn2;

public class FooCorporation {
    public static void main(String[] args) {
        System.out.println(calculate_paid(7.5, 35));
        System.out.println(calculate_paid(8.2, 47));
        System.out.println(calculate_paid(10.0, 73));
    }

    public static double calculate_paid(double base_pay, int hours) {
        if (base_pay < 8.0 || hours > 60) {
            System.out.println("error!");
            return -1;
        }
        double total_pay;
        if (hours > 40) {
            total_pay = 40 * base_pay + (hours - 40) * base_pay * 1.5;
        } else {
            total_pay = hours * base_pay;
        }
        return total_pay;
    }

}
