package com.example.casio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String s = "", x = "";
    char operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, del, C, CE;
        Button plus, div, equal, abs, dot;
        ImageView multi, minus;
        TextView screen1, screen2, sqrt, sqr,x1;
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        C = findViewById(R.id.C);
        CE = findViewById(R.id.CE);
        dot = findViewById(R.id.dot);
        del = findViewById(R.id.del);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multi = findViewById(R.id.multi);
        div = findViewById(R.id.div);
        equal = findViewById(R.id.equal);
        abs = findViewById(R.id.abs);
        sqr = findViewById(R.id.sqr);
        sqrt = findViewById(R.id.sqrt);
        x1 = findViewById(R.id.x1);
        screen1 = findViewById(R.id.screen1);
        screen2 = findViewById(R.id.screen2);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "0";
                screen2.setText(s);
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "1";
                screen2.setText(s);
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "2";
                screen2.setText(s);
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "3";
                screen2.setText(s);
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "4";
                screen2.setText(s);
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "5";
                screen2.setText(s);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "6";
                screen2.setText(s);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "7";
                screen2.setText(s);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "8";
                screen2.setText(s);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += "9";
                screen2.setText(s);
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.length() <= 10) s += ".";
                screen2.setText(s);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";
                for (int i = 0; i < s.length() - 1; i++) str += s.charAt(i);
                s = str;
                if (s == "")
                    screen2.setText("0");
                else
                    screen2.setText(s);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen1.setText("");
                screen2.setText("0");
                s = "";
            }
        });
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen1.setText("");
                screen2.setText("0");
                s = "";
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '+';
                if (s != "") x = s;
                screen1.setText(x + "+");
                screen2.setText("");
                s = "";
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '-';
                if (s != "") x = s;
                screen1.setText(x + "-");
                screen2.setText("");
                s = "";
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = 'x';
                if (s != "") x = s;
                screen1.setText(x + "x");
                screen2.setText("");
                s = "";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operator = '/';
                if (s != "") x = s;
                screen1.setText(x + "/");
                screen2.setText("");
                s = "";
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = '-' + s;
                screen2.setText(s);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = Double.toString(1.0*Math.round(calc(x, s, operator)*100000)/100000);
                while (ans.charAt(ans.length() - 1) == '0') ans = ans.substring(0, ans.length() - 1);
                if (ans.charAt(ans.length() - 1) == '.') ans = ans.substring(0, ans.length() - 1);
                screen1.setText(x + operator + s + "=");
                screen2.setText(ans);
                s = ans;
            }
        });
        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (s.charAt(0) == '-') s = s.substring(1, s.length());
                else s = '-' + s;
                screen2.setText(s);
            }
        });
        sqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = Double.toString(1.0*Math.round(calc(s, s, 'x')*100000)/100000);
                while (ans.charAt(ans.length() - 1) == '0') ans = ans.substring(0, ans.length() - 1);
                if (ans.charAt(ans.length() - 1) == '.') ans = ans.substring(0, ans.length() - 1);
                screen1.setText("sqr(" + s + ")=");
                screen2.setText(ans);
                s = ans;
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = Double.toString(1.0*Math.round(calc(s, s, '.')*100000)/100000);
                while (ans.charAt(ans.length() - 1) == '0') ans = ans.substring(0, ans.length() - 1);
                if (ans.charAt(ans.length() - 1) == '.') ans = ans.substring(0, ans.length() - 1);
                screen1.setText("sqrt(" + s + ")=");
                screen2.setText(ans);
                s = ans;
            }
        });
        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = Double.toString(1.0*Math.round(calc("1", s, '/')*100000)/100000);
                while (ans.charAt(ans.length() - 1) == '0') ans = ans.substring(0, ans.length() - 1);
                if (ans.charAt(ans.length() - 1) == '.') ans = ans.substring(0, ans.length() - 1);
                screen1.setText("1/" + s + "=");
                screen2.setText(ans);
                s = ans;
            }
        });
    }

    public static Double calc(String x, String y, char operator) {
        int key = 0;
        if (operator == '+') key = 1;
        if (operator == '-') key = 2;
        if (operator == 'x') key = 3;
        if (operator == '/') key = 4;
        if (operator == '.') key = 5;
        switch (key) {
            case 1 :
                return Double.valueOf(x) + Double.valueOf(y);
            case 2 :
                return Double.valueOf(x) - Double.valueOf(y);
            case 3 :
                return Double.valueOf(x) * Double.valueOf(y);
            case 4 :
                return Double.valueOf(x) / Double.valueOf(y);
            case 5 :
                return Math.sqrt(Double.valueOf(x));
        }
        return 0.0;
    }

}