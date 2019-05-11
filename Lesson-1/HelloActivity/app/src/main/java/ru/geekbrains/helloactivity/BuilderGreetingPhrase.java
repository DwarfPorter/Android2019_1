package ru.geekbrains.helloactivity;

// Построитель фразы приветствия
public class BuilderGreetingPhrase {
    private GreetingStrings greetingPhrases;    // строки приветствия

    // Конструктор, здесь передадим ресурсы из активити и получим текущий час
    public BuilderGreetingPhrase(GreetingStrings greetingPhrases){
        this.greetingPhrases = greetingPhrases;
    }

    // Определение, какую-же строку надо сформировать
    public String get(int currentHour){
        String helloer = greetingPhrases.getHelloer();
        if (5 <= currentHour && currentHour < 12 ){         // Если утро
            return String.format("%s %s!", greetingPhrases.getMorning(), helloer);
        }
        else if (12 <= currentHour && currentHour < 6){     // Если день
            return String.format("%s %s!", greetingPhrases.getAfternoon(), helloer);
        }
        else if (6 <= currentHour && currentHour < 9){      // Если вечер
            return String.format("%s %s!", greetingPhrases.getEvening(), helloer);
        }
        else {                                              // Если поздний вечер или ночь
            return String.format("%s %s!", greetingPhrases.getNight(), helloer);
        }
    }
}
