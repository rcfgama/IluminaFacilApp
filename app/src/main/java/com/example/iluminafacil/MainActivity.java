package com.example.iluminafacil;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3, edt4, edt5, edt6, edt7;
    RadioButton rdb1, rdb2, rdb3, rdb4, rdb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.editText2);
        edt2 = (EditText) findViewById(R.id.editText3);
        edt3 = (EditText) findViewById(R.id.editText4);
        edt4 = (EditText) findViewById(R.id.editText5);
        edt5 = (EditText) findViewById(R.id.editText6);
        edt6 = (EditText) findViewById(R.id.editText7);
        edt7 = (EditText) findViewById(R.id.editText8);
        rdb1 = (RadioButton) findViewById(R.id.radioButton5);
        rdb2 = (RadioButton) findViewById(R.id.radioButton4);
        rdb3 = (RadioButton) findViewById(R.id.radioButton3);
        rdb4 = (RadioButton) findViewById(R.id.radioButton2);
        rdb5 = (RadioButton) findViewById(R.id.radioButton);
    }

    public void calcular (View v) {
        // Declaração de variáveis:
        // var
        // ambiente, lux, quantidade, disjuntor : inteiro
        int ambiente, lux, quantidade, disjuntor;
        // comprimento, largura, distancia, area, lumens, lulamp, potlamp, potencia, corrente, fio : real
        double comprimento, largura, distancia, area, lumens, lulamp, potlamp, potencia, corrente, fio, queda, capacidade;

        //Entrada de dados:
        //radioButton:
        if(rdb1.isChecked()) {
            ambiente = 1;
        }
        else {
            if(rdb2.isChecked()) {
                ambiente = 2;
            }
            else {
                if(rdb3.isChecked()) {
                    ambiente = 3;
                }
                else {
                    if(rdb4.isChecked()) {
                        ambiente = 4;
                    }
                    else {
                        ambiente = 5;
                    }
                }
            }
        }
        //editText:
        comprimento = Double.parseDouble(edt1.getText().toString());
        largura = Double.parseDouble(edt2.getText().toString());
        quantidade = Integer.parseInt(edt3.getText().toString());
        distancia = Double.parseDouble(edt4.getText().toString());

        //Processamento
        if(ambiente == 1) {
            lux = 300;
        }
        else {
            if(ambiente == 2) {
                lux = 750;
            }
            else {
                if(ambiente == 3) {
                    lux = 200;
                }
                else {
                    if(ambiente == 4) {
                        lux = 800;
                    }
                    else {
                        lux = 500;
                    }
                }
            }
        }
        area = comprimento * largura;
        lumens = area * lux;
        lulamp = lumens / quantidade;
        if(lulamp <= 90) {
            potlamp = 1;
        }
        else {
            if(lulamp <= 270) {
                potlamp = 3;
            }
            else {
                if(lulamp <= 360) {
                    potlamp = 4;
                }
                else {
                    if(lulamp <= 400) {
                        potlamp = 5;
                    }
                    else {
                        if(lulamp <= 480) {
                            potlamp = 5.5;
                        }
                        else {
                            if(lulamp <= 600) {
                                potlamp = 6;
                            }
                            else {
                                if(lulamp <= 700) {
                                    potlamp = 7;
                                }
                                else {
                                    if(lulamp <= 810) {
                                        potlamp = 8;
                                    }
                                    else {
                                        if(lulamp <= 900) {
                                            potlamp = 9;
                                        }
                                        else {
                                            if(lulamp <= 1018) {
                                                potlamp = 10;
                                            }
                                            else {
                                                if(lulamp <= 1311) {
                                                    potlamp = 12;
                                                }
                                                else {
                                                    if(lulamp <= 1507) {
                                                        potlamp = 15;
                                                    }
                                                    else {
                                                        if(lulamp <= 2000) {
                                                            potlamp = 20;
                                                        }
                                                        else {
                                                            if(lulamp <= 2700) {
                                                                potlamp = 25;
                                                            }
                                                            else {
                                                                if(lulamp <= 3000) {
                                                                    potlamp = 30;
                                                                }
                                                                else {
                                                                    if(lulamp <= 3605) {
                                                                        potlamp = 35;
                                                                    }
                                                                    else {
                                                                        if(lulamp <= 4120) {
                                                                            potlamp = 40;
                                                                        }
                                                                        else {
                                                                            if(lulamp <= 5000) {
                                                                                potlamp = 60;
                                                                            }
                                                                            else {
                                                                                if(lulamp <= 6000) {
                                                                                    potlamp = 65;
                                                                                }
                                                                                else {
                                                                                    if(lulamp <= 7000) {
                                                                                        potlamp = 70;
                                                                                    }
                                                                                    else {
                                                                                        if(lulamp <= 7200) {
                                                                                            potlamp = 80;
                                                                                        }
                                                                                        else {
                                                                                            if(lulamp <= 7650) {
                                                                                                potlamp = 85;
                                                                                            }
                                                                                            else {
                                                                                                if(lulamp <= 9500) {
                                                                                                    potlamp = 100;
                                                                                                }
                                                                                                else {
                                                                                                    if(lulamp <= 11500) {
                                                                                                        potlamp = 120;
                                                                                                    }
                                                                                                    else {
                                                                                                        if(lulamp <= 14500) {
                                                                                                            potlamp = 150;
                                                                                                        }
                                                                                                        else {
                                                                                                            potlamp = 151;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        potencia = quantidade * potlamp;
        corrente = potencia / 127;
        if(potlamp == 151) {
            disjuntor = 0;
        }
        else {
            if(corrente <=2) {
                disjuntor = 2;
            }
            else {
                if(corrente <= 4) {
                    disjuntor = 4;
                }
                else {
                    if(corrente <= 6) {
                        disjuntor = 6;
                    }
                    else {
                        if(corrente <= 10) {
                            disjuntor = 10;
                        }
                        else {
                            if(corrente <= 16) {
                                disjuntor = 16;
                            }
                            else {
                                if(corrente <= 20) {
                                    disjuntor = 20;
                                }
                                else {
                                    if(corrente <= 25) {
                                        disjuntor = 25;
                                    }
                                    else {
                                        if(corrente <= 32) {
                                            disjuntor = 32;
                                        }
                                        else {
                                            if(corrente <= 40) {
                                                disjuntor = 40;
                                            }
                                            else {
                                                if (corrente <= 50) {
                                                    disjuntor = 50;
                                                }
                                                else {
                                                    if (corrente <= 63) {
                                                        disjuntor = 63;
                                                    }
                                                    else {
                                                        disjuntor = 64;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if((127 - (distancia * (corrente * 0.0276))) > 121.92) {
            queda = 1.5;
        }
        else {
            if((127 - (distancia * (corrente * 0.0169))) > 121.92) {
                queda = 2.5;
            }
            else {
                if((127 - (distancia * (corrente * 0.0106))) > 121.92) {
                    queda = 4;
                }
                else {
                    if((127 - (distancia * (corrente * 0.00707))) > 121.92) {
                        queda = 6;
                    }
                    else {
                        if((127 - (distancia * (corrente * 0.00423))) > 121.92) {
                            queda = 10;
                        }
                        else {
                            if ((127 - (distancia * (corrente * 0.00268))) > 121.92) {
                                queda = 16;
                            }
                            else {
                                if ((127 - (distancia * (corrente * 0.00171))) > 121.92) {
                                    queda = 25;
                                }
                                else {
                                    queda = 26;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(corrente <= 15) {
            capacidade = 1.5;
        }
        else {
            if(corrente <= 20) {
                capacidade = 2.5;
            }
            else {
                if(corrente <= 27) {
                    capacidade = 4;
                }
                else {
                    if(corrente <= 34) {
                        capacidade = 6;
                    }
                    else {
                        if(corrente <= 46) {
                            capacidade = 10;
                        }
                        else {
                            if(corrente <= 62) {
                                capacidade = 16;
                            }
                            else {
                                if(corrente <= 80) {
                                    capacidade = 25;
                                }
                                else {
                                    capacidade = 26;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(potlamp == 151) {
            fio = 0;
        }
        else {
            if(disjuntor == 64) {
                fio = 0;
            }
            else {
                if(queda > capacidade) {
                    fio = queda;
                }
                else {
                    fio = capacidade;
                }
            }
        }
        //Saída de Dados:
        if(potlamp == 151) {
            edt5.setText(String.valueOf("Erro"));
        }
        else {
            edt5.setText(String.valueOf(potlamp));
        }
        if(disjuntor == 64) {
            edt6.setText(String.valueOf("Erro"));
        }
        else {
            edt6.setText(String.valueOf(disjuntor));
        }
        if(fio == 26) {
            edt7.setText(String.valueOf("Erro"));
        }
        else{
            edt7.setText(String.valueOf(fio));
        }
    }
}
