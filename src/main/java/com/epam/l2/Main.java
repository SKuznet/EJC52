package com.epam.l2;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Количество котов: " + getCount(10));

        Main main = new Main();
//        System.out.println(main.getCharacter());

        Integer num1 = 10;
        Number num2 = 10;

        long a = 2_000_000_000L;
        int x;
        x = (int) a;
        System.out.println(x);

        Long num5 = Long.valueOf(100000_000);
        int num7 = (int) num2;

        Short num8 = 10;
        int num9 = num8;
        short num10 = (short) num9;

        System.out.println(num1.equals(num2));

        Integer num3 = 128;
        Integer num4 = 128;

        System.out.println(num3.equals(num4));
    }

    public static Long getCount(int catWeight) {
        long startCount = 10;
        Long secondCount = 10L;

        if (catWeight > 10) {
            secondCount = secondCount * 2;
        }

        return secondCount + startCount;
    }

    private Character getCharacter() {
        Character character = new Character('9');
        return character;
    }
}
