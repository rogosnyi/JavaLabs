// zalikova 0521
// C2 = 1
// C3 = 2
// C5 = 1
// C7 = 3
// C = 2
// O1 -
// O2 /
// i and j long

public class lab1 {
    public static void main(String[] args) {
    long a = 4;
    long b = 1;
    int c = 2;
    int n = 9;
    int m = 11;

    if (a > n || b > m) {
        System.out.println("Equation error. Lower bound is bigger than higher bound");
        return;
    }
    // i - c != 0
    if (a <= c && n >= c) {
        System.out.println("Cannot divide by 0");
        return;
    }

    double result = 0;
    double upper;
    double lower;
    for (long i = a; i <= n; i++) {
        lower = (i - c);
        for (long j = b; j <= m; j++) {
            upper = (i / j);
            result += upper / lower;
        }
    }
    System.out.println(result);
    }
}