package com.promact.calculator;

import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    public int temp1=0,temp2=0,op=0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.setText("");
        TextView t2=(TextView)findViewById(R.id.textView2);
        t2.setText("");
    }

    public void press1(View V)
    {
        temp2=temp2*10+1;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("1");
    }
    public void press2(View V)
    {
        temp2=temp2*10+2;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("2");
    }
    public void press3(View V)
    {
        temp2=temp2*10+3;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("3");
    }
    public void press4(View V)
    {
        temp2=temp2*10+4;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("4");
    }
    public void press5(View V)
    {
        temp2=temp2*10+5;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("5");
    }
    public void press6(View V)
    {
        temp2=temp2*10+6;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("6");
    }
    public void press7(View V)
    {
        temp2=temp2*10+7;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("7");
    }
    public void press8(View V)
    {
        temp2=temp2*10+8;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("8");
    }
    public void press9(View V)
    {
        temp2=temp2*10+9;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("9");
    }
    public void press0(View V)
    {
        temp2=temp2*10+0;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("0");
    }
    public void pressplus(View V)
    {
        oper(op);
        temp2=0;
        op=1;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("+");
    }
    public void pressminus(View V)
    {
        oper(op);
        temp2=0;
        op=2;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("-");
    }
    public void pressmul(View V)
    {
        oper(op);
        temp2=0;
        op=3;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("*");
    }
    public void pressdiv(View V)
    {
        oper(op);
        temp2=0;
        op=4;
        TextView t1=(TextView)findViewById(R.id.textView);
        t1.append("/");
    }
    public void pressclear(View V)
    {
        TextView t1=(TextView)findViewById(R.id.textView);
        TextView t2=(TextView)findViewById(R.id.textView2);
        t1.setText("");
        t2.setText("");
    }
    public void pressequ(View V)
    {
        TextView t2=(TextView)findViewById(R.id.textView2);
        oper(op);
        t2.setText(String.valueOf(temp1));
        op=0;
        temp1=0;
        temp2=0;

    }
    public void oper(int op)
    {
        try {
            switch (op) {
                case 0:
                    temp1 = temp2;
                    temp2 = 0;
                    break;
                case 1:
                    temp1 = temp1 + temp2;
                    break;
                case 2:
                    temp1 = temp1 - temp2;
                    break;
                case 3:
                    temp1 = temp1 * temp2;
                    break;
                case 4:
                    temp1 = temp1 / temp2;
                    break;
                default:
                    break;
            }
        }
        catch(ArithmeticException e)
        {
            Toast.makeText(getApplicationContext(), "Can't divide by 0", Toast.LENGTH_LONG).show();
            temp1=0;
        }
    }
}
