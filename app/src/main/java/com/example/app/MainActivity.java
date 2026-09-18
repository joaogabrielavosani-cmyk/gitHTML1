package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int posicao=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        /*Button b=  findViewById(R.id.button);

        TextView tv= findViewById(R.id.textView2);

        b.setOnClickListener(view -> {
            c++;
            tv.setText(Integer.toString(c));
        }); */

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Associar componetes da IU

        Integer[] images = new Integer[]{
                R.drawable.cachorro;
                R.drawable.gardem;
                R.drawable.happy;
                R.drawable.patinho;
                R.drawable.porquinho;
        }
       Button botaovoltar, botaoavancar;
       botaovoltar=findViewById(R.id.btn2);
       botaoavancar=findViewById(R.id.btn2);
        ImageView imageview - findViewById(R.id.imageView);

       botaoavancar.setOnClickListener(View v -> {
                   imageview.setImageResource(images[posicao]);


               }
               );

    }
}