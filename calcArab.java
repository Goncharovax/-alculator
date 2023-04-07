import java.util.Scanner;

public class calcArab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] option = {"+", "-", "*", "/"};
        String[] zapas = {"\\+", "-", "\\*", "/"};


        System.out.println("Enter numbers :");
        String str = sc.nextLine();


        //проверяем наличие элемента
        int optionsInd = -1;
        for (int i = 0; i < option.length; i++) {
            if (str.contains(option[i])) {
                optionsInd = i;
                break;
            }
        }

        if (optionsInd == -1) {
            System.out.println("Incorrect expression");
            return;
        }
        /////////
        String[] arr = new String[0];
        if (sc.hasNextInt()) {
            arr = str.split(zapas[optionsInd]);
            for (String word : arr) {
                System.out.println(word);

            }
        } else {
            System.out.println("You entered not an integer");
        }


        //ковертанция строки в число
        int a, b;
        a = Integer.parseInt(arr[0]);
        b = Integer.parseInt(arr[1]);


        //сам калькулятор
        int rez = 0;
        switch (option[optionsInd]) {
            case "+":
                rez = a + b;
                break;
            case "-":
                rez = a - b;
                break;
            case "*":
                rez = a * b;
                break;
            default:
                try {
                    rez = a / b;
                } catch (Exception ex) {
                    System.out.println("Can't divide by zero");
                }
                break;
        }
        System.out.println(rez);

    }
    }

