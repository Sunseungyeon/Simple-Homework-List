package com.example.user.hw2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    TextView result;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button button_e, button_c, button_d, button_multi, button_p, button_minus;
    Float num = new Float(-1);
    String res = new String("");
    String sign = new String("");

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        result = (TextView)findViewById(R.id.result);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button_e = (Button)findViewById(R.id.button_e);
        button_c = (Button)findViewById(R.id.button_c);
        button_d = (Button)findViewById(R.id.button_d);
        button_p = (Button)findViewById(R.id.button_p);
        button_multi = (Button)findViewById(R.id.button_multi);
        button_minus = (Button)findViewById(R.id.button_minus);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button_e.setOnClickListener(this);
        button_c.setOnClickListener(this);
        button_d.setOnClickListener(this);
        button_p.setOnClickListener(this);
        button_multi.setOnClickListener(this);
        button_minus.setOnClickListener(this);
    }

    public float cal(String sign) // calculate function
    {
        if(sign.charAt(0) == '+')
            return (num + Float.valueOf(res));
        else if(sign.charAt(0) == '-')
            return (num - Float.valueOf(res));
        else if(sign.charAt(0) == '*')
            return (num * Float.valueOf(res));
        else if(sign.charAt(0) == '/')
            return (num / Float.valueOf(res));
        else
            return -1;
    }
    public void onClick(View view) // onclick handler function
    {
        switch (view.getId())
        {
            case R.id.button0: //click 0
                if(res.isEmpty() == false) { //first can't input 0
                    res = res + "0";
                    result.setText(res);
                }
                break;
            case R.id.button1:
                res = res + "1";
                result.setText(res);
                break;
            case R.id.button2:
                res = res + "2";
                result.setText(res);
                break;
            case R.id.button3:
                res = res + "3";
                result.setText(res);
                break;
            case R.id.button4:
                res = res + "4";
                result.setText(res);
                break;
            case R.id.button5:
                res = res + "5";
                result.setText(res);
                break;
            case R.id.button6:
                res = res + "6";
                result.setText(res);
                break;
            case R.id.button7:
                res = res + "7";
                result.setText(res);
                break;
            case R.id.button8:
                res = res + "8";
                result.setText(res);
                break;
            case R.id.button9:
                res = res + "9";
                result.setText(res);
                break;
            case R.id.button_c:
                res = "";
                result.setText("0");
                res="";
                break;
            case R.id.button_d:
                if(res.isEmpty() == false && num == -1) { //first can't input sign
                    num = Float.valueOf(res);
                    result.setText(res + '/');
                    res = "";
                    sign = "/";
                }
                else if(res.isEmpty() == true)
                { //숫자가 입력 안됬을때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() == false && sign.isEmpty() == false && num != -1)
                { // ex) 10+23-5 같은 경우 -가 눌렸을 때
                    num = cal(sign);
                    result.setText(String.valueOf(num) + "/");
                    sign = "/";
                    res = "";
                }
                else if(res.isEmpty() && sign.isEmpty() == false && num != -1)
                { //기호가 연속으로 두번 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_p: // 더하기
                if(res.isEmpty() == false && num == -1) { //일반 경우
                    num = Float.valueOf(res);
                    result.setText(res + '+');
                    res = "";
                    sign = "+";
                }
                else if(res.isEmpty() == true)
                { //숫자가 입력 안됬는데 기호가 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() == false && sign.isEmpty() == false && num != -1)
                { // ex) 10+23-5 같은 경우 -가 눌렸을 때
                    num = cal(sign);
                    result.setText(String.valueOf(num) + "+");
                    sign = "+";
                    res = "";
                }
                else if(res.isEmpty() && sign.isEmpty() == false && num != -1)
                { //기호가 연속으로 두번 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_multi:
                if(res.isEmpty() == false && num == -1) {
                    num = Float.valueOf(res);
                    result.setText(res + '*');
                    res = "";
                    sign = "*";
                }
                else if(res.isEmpty() == true && num == -1)
                { //숫자가 입력 안됬는데 기호가 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() == false && sign.isEmpty() == false && num != -1)
                {// ex) 10+23-5 같은 경우 -가 눌렸을 때
                    num = cal(sign);
                    result.setText(String.valueOf(num) + "*");
                    sign = "*";
                    res = "";
                }
                else if(res.isEmpty() && sign.isEmpty() == false && num != -1)
                { //기호가 연속으로 두번 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_minus:
                if(res.isEmpty() == false && num == -1) {
                    num = Float.valueOf(res);
                    result.setText(res + '-');
                    res = "";
                    sign = "-";
                }
                else if(res.isEmpty() == true)
                { //숫자가 입력 안됬는데 기호가 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() == false && sign.isEmpty() == false && num != -1)
                {// ex) 10+23-5 같은 경우 -가 눌렸을 때
                    num = cal(sign);
                    result.setText(String.valueOf(num) + "-");
                    sign = "-";
                    res = "";
                }
                else if(res.isEmpty() && sign.isEmpty() == false && num != -1)
                { //기호가 연속으로 두번 입력될 때
                    Toast.makeText(getApplicationContext(), "incorrect value.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.button_e:
                if(res.isEmpty() == false && sign.isEmpty() == false && num != -1)
                { // = 눌렀을때 이전화면으로 돌아가면서 결과값 전달
                   // result.setText(String.valueOf(cal(sign)));
                    String res = String.valueOf(cal(sign));
                    Intent intent = getIntent();
                    intent.putExtra("var",res);
                    setResult(Activity.RESULT_OK, intent);
                    finish();
                    res="";
                    sign="";
                    num = Float.valueOf(-1);
                }
                else if(res.isEmpty() && sign.isEmpty() && num == -1)
                { //제일 처음부터 =을 눌렀을 때
                    Toast.makeText(getApplicationContext(), "invalied value", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() && sign.isEmpty() == false)
                { //연산기호를 누르고 숫자를 안누르고 =을 눌렀을 때
                    Toast.makeText(getApplicationContext(), "invalied value", Toast.LENGTH_SHORT).show();
                }
                else if(res.isEmpty() == false && sign.isEmpty())
                { //숫자만 누르고 바로 =을 눌렀을 때
                    Toast.makeText(getApplicationContext(), "invalied value", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}