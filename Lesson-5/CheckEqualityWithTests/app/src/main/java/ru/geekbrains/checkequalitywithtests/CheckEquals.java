package ru.geekbrains.checkequalitywithtests;

public class CheckEquals {
    public String Compare(String arg1, String arg2) {
        if (arg1 == "" || arg1 == null || arg2 == "" || arg2 == null){
            return "Введите числа!";
        }
        try {
            Integer i1 = Integer.valueOf(arg1);
            Integer i2 = Integer.valueOf(arg2);
            if (i1.equals(i2)) {
                return "Равно!";
            } else {
                return "Не равно!";
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return "Введите числа!";
        }
    }
}
