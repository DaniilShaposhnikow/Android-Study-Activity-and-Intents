package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private ImageView Login;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Мы зашли в приложение. Создана новая активность onCreate()", Toast.LENGTH_SHORT).show();
        Login = findViewById(R.id.login);
        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }

    @Override protected void onStart()
    {
        super.onStart();
        Toast.makeText(this, "Код в данной активности начал работать onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onResume()
    {
        super.onResume();
        Toast.makeText(this, "Весь фокус пользователя сейчас на данной активности onResume()", Toast.LENGTH_SHORT).show();
    }

    @Override protected void onPause()
    {
        Toast.makeText(this, " Пришло уведомление или произошло что-то onPause()", Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override protected void onStop() {
        Toast.makeText(this, "Конец активности onStop()", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override protected void onDestroy() {
        Toast.makeText(this, "Ее уничтожение onDestroy()", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
