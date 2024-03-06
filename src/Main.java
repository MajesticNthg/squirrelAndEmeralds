public class Main {
    public static int squirrel(int N) {
        int factorial = 1;

        for (int x = 1; x <= N; x++) {
            factorial *= x;
        }

        while (factorial > 10)
            factorial /= 10;

        return factorial;
    }

}


