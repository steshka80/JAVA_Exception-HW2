import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) {
        space();
    }

    public static void space() {
        System.out.print("Введите данные: ");
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        if (!data.isEmpty()) {
            System.out.println("Вы ввели: " + data);
        } else {
            throw new RuntimeException("Пустые сроки вводить нельзя");
        }
    }
}
