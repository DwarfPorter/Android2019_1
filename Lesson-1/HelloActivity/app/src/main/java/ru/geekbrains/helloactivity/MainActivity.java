package ru.geekbrains.helloactivity;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {// Наследуем класс Activity
    // или его потомка
    // Этот метод вызывается при создании Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greeting = (TextView) findViewById(R.id.greeting); // Получить элемент
        BuilderGreetingPhrase builderGreetingPhrase = new BuilderGreetingPhrase(getResources());
        greeting.setText(builderGreetingPhrase.get());
    }
}
