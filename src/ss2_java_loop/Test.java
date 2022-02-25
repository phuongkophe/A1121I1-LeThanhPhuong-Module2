package ss2_java_loop;

public class Test {
    public static void main(String[] args) {
        int count = 2, n = 3;
        System.out.print("2  3");
        while (count < 10) {
            n++;
            boolean checkSNT = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    checkSNT = false;
                }
            }
            if (checkSNT) {
//                System.out.print("  "+n);
                System.out.printf("  %d", n);
                count++;
            }
        }
        // %d số, %s chuỗi, %f số thập phân (%5.2f)
        System.out.printf("\nCount = %4d, n = %10d\n", count, n);
    }
}
