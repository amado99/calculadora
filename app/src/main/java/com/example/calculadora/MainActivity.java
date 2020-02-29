package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double numero1,numero2,resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void onClickIgual(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtResultado) ;
        numero2 = Double.parseDouble(tv.getText().toString());

        if(operador.equals("+"))
        {
            resultado= numero1+numero2;
        }
        else if(operador.equals("-"))
        {
            resultado= numero1-numero2;
        }
        else if(operador.equals("*"))
        {
            resultado= numero1*numero2;
        }
        else if(operador.equals("/"))
        {
            resultado= numero1/numero2;
        }
        tv.setText(resultado.toString());
    }

    public void suma(View miView)
    {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void resta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void multiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void division(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickOperacionCapturaNumero1(View miView)
    {
        TextView tv = (TextView) findViewById(R.id.txtResultado) ;
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickLimpia(View miView)
    {
        numero1=0.0;
        numero2=0.0;
        TextView tv = (TextView) findViewById(R.id.txtResultado) ;
        tv.setText("");
    }


    private void agregarValorText(String operador){
        TextView tv = (TextView) findViewById(R.id.txtResultado) ;
        tv.setText(tv.getText() + operador);
    }

    public void btn1(View miView)
    {
        this.agregarValorText("1");
    }
    public void btn2(View miView)
    {
        this.agregarValorText("2");

    }
    public void btn3(View miView)
    {
        this.agregarValorText("3");
    }
    public void btn4(View miView)
    {
        this.agregarValorText("4");
    }
    public void btn5(View miView)
    {
        this.agregarValorText("5");
    }
    public void btn6(View miView)
    {
        this.agregarValorText("6");
    }
    public void btn7(View miView)
    {
        this.agregarValorText("7");
    }
    public void btn8(View miView)
    {
        this.agregarValorText("8");
}
    public void btn9(View miView)
    {
        this.agregarValorText("9");
    }
    public void btn0(View miView)
    {
        this.agregarValorText("0");
    }
    public void onClickBtnPunto(View miView)
    {
        this.agregarValorText(".");
    }

}
//numeros








