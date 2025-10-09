public class Question_10 {
    static int binaryToDecimal(String bin) {
        int num = 0, base = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') num += base;
            base *= 2;
        }
        return num;
    }

    static String decimalToBinary(int num) {
        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num /= 2;
        }
        return res.equals("") ? "0" : res;
    }

    public static void main(String[] args) {
        String bin = "1010";
        int dec = 10;
        System.out.println("Binary to Decimal: " + binaryToDecimal(bin));
        System.out.println("Decimal to Binary: " + decimalToBinary(dec));
    }
}
