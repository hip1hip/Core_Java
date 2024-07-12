package 급여관리프로그램.input;

public class Console {
    private static java.util.Scanner scanner;

    private Console() {

    }

    public static String readLine() {
        return getInstance().nextLine();
    }

    public static String read() {
        return getInstance().next();
    }

    public static int nextInt() {
        return getInstance().nextInt();
    }

    public static void close() {
        if(scanner == null) {
            return;
        }
        scanner.close();
    }

    private static java.util.Scanner getInstance() {
        if (scanner == null) {
            scanner = new java.util.Scanner(System.in);
        }
        return scanner;
    }
}