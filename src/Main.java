import java.util.Scanner;

public class Main {
    private static final String[] UNITS = {
            "нөл", "бир", "эки", "үч", "төрт", "беш", "алты", "жети", "сегиз", "тогуз"
    };

    private static final String[] TENS = {
            "", "он", "жыйырма", "отуз", "кырк", "элүү", "алтымыш", "жетимиш", "сексен", "токсон"
    };

    private static final String[] HUNDREDS = {
            "", "жүз", "эки жүз", "үч жүз", "төрт жүз", "беш жүз",
            "алты жүз", "жети жүз", "сегиз жүз", "тогуз жүз"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "нөл";
        }

        StringBuilder result = new StringBuilder();

        if (number >= 10_000) {
            int tensOfThousands = number / 10_000;
            int remainder = number % 10_000;
            result.append(TENS[tensOfThousands]).append(" ");
            if (remainder >= 1000) {
                number %= 10_000;
            } else {
                result.append("миң ");
                number %= 10_000;
            }
        }

        if (number >= 1000) {
            int thousands = number / 1000;
            number %= 1000;
            if (thousands > 0) {
                if (thousands > 1) {
                    result.append(UNITS[thousands]).append(" ");
                }
                result.append("миң ");
            }
        }

        if (number >= 100) {
            int hundreds = number / 100;
            number %= 100;
            result.append(HUNDREDS[hundreds]).append(" ");
        }

        if (number >= 10) {
            int tens = number / 10;
            number %= 10;
            result.append(TENS[tens]).append(" ");
        }

        if (number > 0) {
            result.append(UNITS[number]);
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан киргизиңиз (0 - 99999): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 99999) {
            System.out.println("Ката: Сан 0дөн 99999га чейин болушу керек.");
        } else {
            System.out.println("Жазуу түрүндө: " + convert(number));
        }

        scanner.close();
    }
}