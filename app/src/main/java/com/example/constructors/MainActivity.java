package com.example.constructors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextX, editTextY;
    public static int x, y;
    TextView result;
    TextView defcon;
    TextView paracon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextX = findViewById(R.id.editTextX);
        editTextY = findViewById(R.id.editTextY);
        result = findViewById(R.id.result);
        defcon = findViewById(R.id.defcon);
        paracon = findViewById(R.id.paracon);

    }

    public void OnSum(View view) {
        x = Integer.parseInt(editTextX.getText().toString());
        y = Integer.parseInt(editTextY.getText().toString());
        Manipulation mani = new Manipulation();
        defcon.setText("mx value " + Integer.toString(mani.mx) + "my value " + Integer.toString(mani.my) + "Result : " + mani.cal_display());
        // int sum = x + y;
         mani.read_data();
         int value = mani.cal_display();
        // result.setText(Integer.toString(sum));
        result.setText(Integer.toString(value));
       //  result.setText (" Sum is " + Integer.toString(value));
        Manipulation manil = new Manipulation(x,y);
        paracon.setText("mx value " + Integer.toString(manil.mx) + "my value " + Integer.toString(manil.my) + "Result : " + manil.cal_display());
    }
}

class Manipulation {

    int mx, my;

    Manipulation()
    {
        mx = 1;
        my = 1;
    }
    Manipulation(int a, int b)
    {
        mx = a;
        mx = b;
    }

    public void read_data()
    {
        mx = MainActivity.x;
        my = MainActivity.y;
    }

    public int cal_display()
    {
        int sum = mx + my;
        return sum;
    }
}