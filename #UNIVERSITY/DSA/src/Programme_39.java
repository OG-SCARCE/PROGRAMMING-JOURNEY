public class Programme_39 {
    public static void main(String[] args) {
        int count = 0;

        for (int n = 2; n < 25; n++) {
            boolean prime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println("Prime numbers under 25 = " + count);
    }
}
