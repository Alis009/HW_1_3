public class Main {
    public static void main(String[] args) {
        double[] nambers = {2.3, 1.5, -2.8, 7.4, -3.7, 9.2, -1.9, 5.8, 3.1, -4.9, 1.7, 9.4, -6.9, 2.5, -7.5};

        boolean digit = false;
        int sam = 0;
        int nam = 0;

        for (double namber : nambers) {
            if (namber < 0) {
                digit = true;
            } else if (namber > 0 && digit) {
                nam += 1;
                sam += namber;
            }
        }
        System.out.println(sam / nam);
    }
}