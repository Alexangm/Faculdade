package com.example.tentativa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    double num1 = 0, num2 = 0;
    int operador = 5;
    String num="0";

    public void zero(String n){
        if(num.equals("0")){
            num=n;
        }else{
            num+=n;
        }
    }

    public double igual(double num1, double num2, int operador){
        if(operador==1){
            return num1+num2;
        }else if(operador==2){
            return num1-num2;
        }else if(operador==3){
            return num1*num2;
        }else if(operador==4){
            return num1/num2;
        }else if(operador==5){
            return 0;
        }else{
            return num1;
        }
    }

    public String tirarZeros(String num){
        double n1 = Double.parseDouble(num);
        int n2 = (int) n1;

        if(n2==n1) return Integer.toString(n2);
        else return Double.toString(n1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textResultado = findViewById(R.id.textResultado);
        TextView textParcial = findViewById(R.id.textParcial);
        Button buttonZero = findViewById(R.id.buttonZero);
        Button buttonUm = findViewById(R.id.buttonUm);
        Button buttonDois = findViewById(R.id.buttonDois);
        Button buttonTres = findViewById(R.id.buttonTres);
        Button buttonQuatro = findViewById(R.id.buttonQuatro);
        Button buttonCinco = findViewById(R.id.buttonCinco);
        Button buttonSeis = findViewById(R.id.buttonSeis);
        Button buttonSete = findViewById(R.id.buttonSete);
        Button buttonOito = findViewById(R.id.buttonOito);
        Button buttonNove = findViewById(R.id.buttonNove);
        Button buttonSoma = findViewById(R.id.buttonSoma);
        Button buttonSubtracao = findViewById(R.id.buttonSubtracao);
        Button buttonDivisao = findViewById(R.id.buttonDivisao);
        Button buttonMultiplicacao = findViewById(R.id.buttonMultiplicacao);
        Button buttonVirgula = findViewById(R.id.buttonVirgula);
        Button buttonZerar = findViewById(R.id.buttonZerar);
        Button buttonResultado = findViewById(R.id.buttonResultado);


        buttonNove.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("9");
                textParcial.setText(num);
            }
        });

        buttonOito.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("8");
                textParcial.setText(num);
            }
        });

        buttonSete.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("7");
                textParcial.setText(num);
            }
        });

        buttonSeis.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("6");
                textParcial.setText(num);
            }
        });

        buttonCinco.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("5");
                textParcial.setText(num);
            }
        });

        buttonQuatro.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("4");
                textParcial.setText(num);
            }
        });

        buttonTres.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("3");
                textParcial.setText(num);
            }
        });

        buttonDois.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("2");
                textParcial.setText(num);
            }
        });

        buttonUm.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                zero("1");
                textParcial.setText(num);
            }
        });

        buttonZero.setOnClickListener(new View . OnClickListener () {
            public void onClick(View view) {
                if(!num.equals("0")){
                    num += "0";
                }
                textParcial.setText(num);
            }
        });

        buttonVirgula.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(num.equals("")){
                    num="0.";
                }else if(!num.contains(".")){
                    num+=".";
                }
                textParcial.setText(num);

            }
        });

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((operador==5) && (num!="")){
                    num1 = Double.parseDouble(num);
                    textResultado.setText(tirarZeros(num));
                    textParcial.setText("");
                    num = "";
                } else {
                    if (!num.equals("")) {
                        if (num1 == 0) {
                            if (!num.equals("")) {
                                num1 = Double.parseDouble(num);
                                textResultado.setText(tirarZeros(num));
                                textParcial.setText("");
                                num = "";
                            }
                        } else {
                            num2 = Double.parseDouble(num);
                            num1 = igual(num1, num2, operador);
                            num = Double.toString(num1);
                            textResultado.setText(tirarZeros(num));
                            textParcial.setText("");
                            num = "";
                        }
                    }
                }
                operador = 1;
            }
        });

        buttonSubtracao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((operador==5) && (num!="")){
                    num1 = Double.parseDouble(num);
                    textResultado.setText(tirarZeros(num));
                    textParcial.setText("");
                    num = "";
                } else {
                    if (!num.equals("")) {
                        if (num1 == 0) {
                            if (!num.equals("")) {
                                num1 = Double.parseDouble(num);
                                textResultado.setText(tirarZeros(num));
                                textParcial.setText("");
                                num = "";
                            }
                        } else {
                            num2 = Double.parseDouble(num);
                            num1 = igual(num1, num2, operador);
                            num = Double.toString(num1);
                            textResultado.setText(tirarZeros(num));
                            textParcial.setText("");
                            num = "";
                        }
                    }
                }
                operador = 2;
            }
        });

        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((operador==5) && (num!="")){
                    num1 = Double.parseDouble(num);
                    textResultado.setText(tirarZeros(num));
                    textParcial.setText("");
                    num = "";
                } else {
                    if (!num.equals("")) {
                        if (num1 == 0) {
                            if (!num.equals("")) {
                                num1 = Double.parseDouble(num);
                                textResultado.setText(tirarZeros(num));
                                textParcial.setText("");
                                num = "";
                            }
                        } else {
                            num2 = Double.parseDouble(num);
                            num1 = igual(num1, num2, operador);
                            num = Double.toString(num1);
                            textResultado.setText(tirarZeros(num));
                            textParcial.setText("");
                            num = "";
                        }
                    }
                }
                operador = 3;
            }
        });

        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if ((operador==5) && (num!="")){
                    num1 = Double.parseDouble(num);
                    textResultado.setText(tirarZeros(num));
                    textParcial.setText("");
                    num = "";
                } else {
                    if (!num.equals("")) {
                        if (num1 == 0) {
                            if (!num.equals("")) {
                                num1 = Double.parseDouble(num);
                                textResultado.setText(tirarZeros(num));
                                textParcial.setText("");
                                num = "";
                            }
                        } else {
                            num2 = Double.parseDouble(num);
                            num1 = igual(num1, num2, operador);
                            num = Double.toString(num1);
                            textResultado.setText(tirarZeros(num));
                            textParcial.setText("");
                            num = "";
                        }
                    }
                }
                operador = 4;
            }
        });

        buttonZerar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                num = "";
                num1 = 0;
                num2 = 0;
                textParcial.setText("0");
                textResultado.setText(num);
            }
        });

        buttonResultado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if((operador!=5) && (!textResultado.equals(""))){
                    if(operador==5){
                        textResultado.setText(num);
                        if(num=="") textParcial.setText("");
                        else textParcial.setText("0");
                        num="";
                    }else{
                        if (num1 != 0) num2 = Double.parseDouble(num);

                        num1 = igual(num1, num2, operador);
                        textParcial.setText("");
                        num = Double.toString(num1);
                        textResultado.setText(tirarZeros(num));
                        num = "";
                        operador = 5;
                    }
                }
            }
        });

    }
}