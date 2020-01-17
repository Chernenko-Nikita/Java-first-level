package ru.geekbrains;

public class HelloWorld5 {
    public static void main(String[] args) {
        float a = 3;

        if (a % 400 == 0) {
            System.out.println("Год высокосный");
        } else if (a % 100 == 0) {
             System.out.println("Год невысокосный");
        } else if (a % 4 == 0) {
             System.out.println("Год высокосный");
        } else if (a > 0) {
            System.out.println("Год невысокосный");
        }
    }
}

/* Честно признаюсь, эту задачу мне помог решить коллега по работе, разработчик.
Саму систему придумал я и изначально она выглядела так
public static void main(String[] args) {
        float a = 800;

        if (a % 4 == 0) {
            System.out.println("Год высокосный");
        } else if (a % 100 == 0) {
            {
                System.out.println("Год невысокосный");
            }
        } else if (a % 400 == 0) {
                System.out.println("Год высокосный");
        }
    }

При этом она работала неккоректно, и я не мог понять в чем причина.
В любом случае год был высокосным
Но коллега подсказал пойти по уменьшению в обратную сторону.
В общем я немного недокрутил эту задачу и честно об этом пишу:)
 */