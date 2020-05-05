package com.example.order;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox pizza,coffee,burger;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClick();
    }
    public void onClick()
    {
        pizza=(CheckBox)findViewById(R.id.checkBox);
        coffee=(CheckBox) findViewById(R.id.checkBox2);
        burger=(CheckBox)findViewById(R.id.checkBox3);

        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total=0;
                StringBuilder result=new StringBuilder();
                if (pizza.isChecked())
                    total+=100;
                if (coffee.isChecked())
                    total+=50;
                if (burger.isChecked())
                    total+=120;
                result.append("selected items: "+total+"rs");
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
