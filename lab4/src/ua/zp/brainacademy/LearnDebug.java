package ua.zp.brainacademy;

import java.util.Scanner;

public class LearnDebug {
    public static void main(String[] args) {
       /*ЗАДАНИЯ
        1.  Решить логические вычисления:
        a.  true && false || true && !false = true
        b.  false || false || !true && false = false
        c.  !false && (false || true && true) = true
        d.  4 > 8 && !(7 == 0) = false
        e.  !(true && false || false && true) && !(true && 4 <= 5) = false */
        System.out.println(true && false || true && !false);
        System.out.println(false || false || !true && false);
        System.out.println(!false && (false || true && true));
        System.out.println(4 > 8 && !(7 == 0));
        System.out.println(!(true && false || false && true) && !(true && 4 <= 5));
        System.out.println();

        /*2.  Написать программу, которая выводит на экран (с новой строки) числа от 0 до 10
        и возле каждого пишет четное это число или нечетное.
                Пример
        1 -> нечетное
        2 -> четное
        и т д.*/
        for (int i = 0; i <= 10; i++) {
            System.out.println(i % 2 == 0 ? "Чётное " + i : "Нечётное " + i);
        }
        System.out.println();
        System.out.println();

       /* 3.  Написать программу, которая выводит информацию о дне неделе.
                Например для понедельника – пятницы выводит сообщение “Это рабочий
        день”, а для субботы и воскресенья выводит “Это выходной!”*/
        Scanner week = new Scanner(System.in);
        String day = week.nextLine();
        switch (day){
            case "Понедельник":
                System.out.println("Это рабочий день"); break;
            case "Вторник":
                System.out.println("Это рабочий день"); break;
            case "Среда":
                System.out.println("Это рабочий день"); break;
            case "Четверг":
                System.out.println("Это рабочий день"); break;
            case "Пятница":
                System.out.println("Это рабочий день"); break;
            case "Суббота":
                System.out.println("Это выходной"); break;
            case "Воскресенье":
                System.out.println("Это выходной"); break;
            default:
                System.out.println("Ошибка");
        }
    }
}
