package gb.javaproject;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Stack;
public class Task4_3 {
    static Stack<Double> result;
    static Stack<Character> operations;
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scn = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            if (scn.hasNextDouble()) {
                double num1 = scn.nextDouble();
                System.out.print("Введите знак операции (+, -, * или /): ");
                char operation = scan.nextLine().charAt(0);
                System.out.print("Введите второе число: ");
                if (scn.hasNextDouble()) {
                    double num2 = scn.nextDouble();
                    result = new Stack<>();
                    operations = new Stack<>();
                    operations.push(operation);
                    double res = 0;
                    switch (operation) {
                        case '+':
                            res = num1 + num2;
                            result.push(res);
                            System.out.printf("Сумма = %.2f", res);
                            break;
                        case '-':
                            res = num1 - num2;
                            result.push(res);
                            System.out.printf("Разность = %.2f", res);
                            break;
                        case '*':
                            res = num1 * num2;
                            result.push(res);
                            System.out.printf("Произведение = %.2f", res);
                            break;
                        case '/':
                            if (num2 == 0) {
                                System.out.println("\nНа 0 делить нельзя");
                                break;
                            }
                            res = num1 / num2;
                            result.push(res);
                            System.out.printf("Частное = %.2f", res);
                            break;
                    }
                } else {
                    System.out.println("\nВведено неверное число");
                }
            } else {
                System.out.println("\nВведено неверное число");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("\n1 - продолжить\n2 - отменить последнюю операцию\n3 - выход");
            String task = sc.nextLine();
            switch (task) {
                case "1":
                    break;
                case "2":
                    if (!result.isEmpty() && !operations.isEmpty()) {
                        result.pop();
                        operations.pop();
                    } else {
                        System.out.println("\nНет операции для отмены");
                    }
                    break;
                case "3":

                default:
                   flag = false;
                   break;
            }
              if (!flag) break;
        }
    }
}
