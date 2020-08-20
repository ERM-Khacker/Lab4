package ua.zp.brainacademy;
/*4.Написать программу, которая считает факториал числа и выводит
       промежуточные значения на экран.
       Условие: если промежуточное значение >1000, завершить цикл предварительно
       написав в консоли “Достигнут максимально возможный результат”.
       Факториал числа — это произведение натуральных чисел от 1 до самого числа (включая данное число).*/
public class Zad4 {
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i ++){
            result = result * i;
            if(result > 1000){
                System.out.println("Достигнут максимально возможный результат");
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(calculateFactorial(7));
    }
}
