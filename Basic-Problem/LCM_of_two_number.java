// LCM of Two Numbers

class LCM_of_two_number {
    public static void main(String[] args) {
        int a = 15, b = 25;

        // Start from the maximum of a and b
        int ans = (a > b) ? a : b;

        // Keep increasing ans until it's divisible by both a and b
        while (true) {
            if (ans % a == 0 && ans % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " : " + ans);
                break;
            }
            ans++;
        }
    }
}
