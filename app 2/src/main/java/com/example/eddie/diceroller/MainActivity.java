package com.example.eddie.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPercent, buttonRoll, buttonClear, buttonD4, buttonD6, buttonD8, buttonD10, buttonD12, buttonD20;
    TextView input, output, response;
    String StringOutput = "";
    String StringInput = "";
    String StringResponse = "";
    int loop;
    int diceNumber;
    Random random;
    int array[];
    int result = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.button0=(Button)this.findViewById(R.id.Button0);
        this.button1=(Button)this.findViewById(R.id.button1);
        this.button2=(Button)this.findViewById(R.id.button2);
        this.button3=(Button)this.findViewById(R.id.button3);
        this.button4=(Button)this.findViewById(R.id.button4);
        this.button5=(Button)this.findViewById(R.id.button5);
        this.button6=(Button)this.findViewById(R.id.button6);
        this.button7=(Button)this.findViewById(R.id.button7);
        this.button8=(Button)this.findViewById(R.id.button8);
        this.button9=(Button)this.findViewById(R.id.button9);
        this.buttonRoll=(Button)this.findViewById(R.id.buttonRoll);
        this.buttonPercent=(Button)this.findViewById(R.id.buttonPercent);
        this.buttonClear=(Button)this.findViewById(R.id.buttonClear);
        this.buttonD4=(Button)this.findViewById(R.id.buttonD4);
        this.buttonD6=(Button)this.findViewById(R.id.buttonD6);
        this.buttonD8=(Button)this.findViewById(R.id.buttonD8);
        this.buttonD10=(Button)this.findViewById(R.id.buttonD10);
        this.buttonD12=(Button)this.findViewById(R.id.buttonD12);
        this.buttonD20=(Button)this.findViewById(R.id.buttonD20);
        this.input=(TextView)this.findViewById(R.id.Input);
        this.output=(TextView)this.findViewById(R.id.Output);
        this.response=(TextView)this.findViewById(R.id.reponse);
    }

    public void actionOnClick(View sender)
    {
        if (sender==this.button0)
        {
            this.StringResponse = StringResponse + 0;
            this.response.setText(StringResponse);
            loop = 0;
        }
        else if (sender==this.button1)
            {
                this.StringResponse = StringResponse + 1;
                this.response.setText(StringResponse);
                loop = 1;
            }
        else if (sender==this.button2)
        {
            this.StringResponse = StringResponse + 2;
            this.response.setText(StringResponse);
            loop = 2;
        }
        else if (sender==this.button3)
        {
            this.StringResponse = StringResponse + 3;
            this.response.setText(StringResponse);
            loop = 3;
        }
        else if (sender==this.button4)
        {
            this.StringResponse = StringResponse + 4;
            this.response.setText(StringResponse);
            loop = 4;
        }
        else if (sender==this.button5)
        {
            this.StringResponse = StringResponse + 5;
            this.response.setText(StringResponse);
            loop = 5;
        }
        else if (sender==this.button6)
        {
            this.StringResponse = StringResponse + 6;
            this.response.setText(StringResponse);
            loop = 6;
        }
        else if (sender==this.button7)
        {
            this.StringResponse = StringResponse + 7;
            this.response.setText(StringResponse);
            loop = 7;
        }
        else if (sender==this.button8)
        {
            this.StringResponse = StringResponse + 8;
            this.response.setText(StringResponse);
            loop = 8;
        }
        else if (sender==this.button9)
        {
            this.StringResponse = StringResponse + 9;
            this.response.setText(StringResponse);
            loop = 9;
        }

        if (sender==this.buttonD4)
        {
            this.StringResponse = StringResponse + "D4";
            this.response.setText(StringResponse);
            diceNumber = 4;
        }
        else if (sender==this.buttonD6)
        {
            this.StringResponse = StringResponse + "D6";
            this.response.setText(StringResponse);
            diceNumber = 6;
        }
        else if (sender==this.buttonD8)
        {
            this.StringResponse = StringResponse + "D8";
            this.response.setText(StringResponse);
            diceNumber = 8;
        }
        else if (sender==this.buttonD10)
        {
            this.StringResponse = StringResponse + "D10";
            this.response.setText(StringResponse);
            diceNumber = 10;
        }
        else if (sender==this.buttonD12)
        {
            this.StringResponse = StringResponse + "D12";
            this.response.setText(StringResponse);
            diceNumber = 12;
        }
        else if (sender==this.buttonD20)
        {
            this.StringResponse = StringResponse + "D20";
            this.response.setText(StringResponse);
            diceNumber = 20;
        }
        if (sender==this.buttonRoll)
        {
            array= new int[loop];
            for (int i=0; i<loop; i++)
         {
             array[i]= random.nextInt(diceNumber)+1;
             if (i == loop)
             {
                 StringInput =StringInput + array[i];
                 this.input.setText(StringInput);
             }
             else {
                 StringInput = StringInput + random.nextInt(diceNumber) + 1;
                 StringInput = StringInput + "+";
                 this.input.setText(StringInput);
             }
         }
            for (int i=0; i<loop; i++)
            {
                result = result + array[i];
            }
            this.output.setText(result);
        }
    }
}
