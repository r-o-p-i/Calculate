import java.util.Scanner;

public class InteractRunner {
    public static boolean checkString(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            String first;
            String second;
            Integer a = null;
            while (!exit.equals("yes")) {
                if (a == null) {
                    System.out.println("Enter first args : ");
                    first = reader.next();
                    if (checkString(first)) {
                        a = Integer.valueOf(first);
                    } else {
                        System.out.println("NO Number first args : ");
                        continue;
                    }
                }
                System.out.println("Enter second args : ");
                second = reader.next();
                if (checkString(second)) {
                    calc.add(a, Integer.parseInt(second));
                } else {
                    System.out.println("NO Number Second args : ");
                    continue;
                }
                System.out.println("Result : " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no ?");
                exit = reader.next();

            }
        } finally {
            reader.close();
        }
    }
}
