package com.example.icm_juegogato;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno, contador, acum_x=0, acum_o=0, s=9;
    TextView tv_ganador,puntosx, puntoso;
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9;
    Button boton_salir, boton_reiniciar;


    Drawable myDrawable, myDrawable2,myDrawable3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        myDrawable = getResources().getDrawable(R.mipmap.cruz);
        myDrawable2 = getResources().getDrawable(R.mipmap.circulo);
        myDrawable3 = getResources().getDrawable(R.mipmap.reset);

        tv_ganador = (TextView) (findViewById(R.id.ganador));
        puntosx = (TextView) (findViewById(R.id.puntos_x));
        puntoso = (TextView) (findViewById(R.id.puntos_o));

        ib1 = (ImageButton) (findViewById(R.id.imagen1));
        ib2 = (ImageButton) (findViewById(R.id.imagen2));
        ib3 = (ImageButton) (findViewById(R.id.imagen3));
        ib4 = (ImageButton) (findViewById(R.id.imagen4));
        ib5 = (ImageButton) (findViewById(R.id.imagen5));
        ib6 = (ImageButton) (findViewById(R.id.imagen6));
        ib7 = (ImageButton) (findViewById(R.id.imagen7));
        ib8 = (ImageButton) (findViewById(R.id.imagen8));
        ib9 = (ImageButton) (findViewById(R.id.imagen9));

        boton_salir = (Button) (findViewById(R.id.terminar));
        boton_reiniciar = (Button) (findViewById(R.id.reiniciar));

        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        ib5.setOnClickListener(this);
        ib6.setOnClickListener(this);
        ib7.setOnClickListener(this);
        ib8.setOnClickListener(this);
        ib9.setOnClickListener(this);
        boton_reiniciar.setOnClickListener(this);
        boton_salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.reiniciar) {
            tv_ganador.setText(" ");
            ib1.setEnabled(true);
            ib1.setImageDrawable(myDrawable3);
            ib2.setEnabled(true);
            ib2.setImageDrawable(myDrawable3);
            ib3.setEnabled(true);
            ib3.setImageDrawable(myDrawable3);
            ib4.setEnabled(true);
            ib4.setImageDrawable(myDrawable3);
            ib5.setEnabled(true);
            ib5.setImageDrawable(myDrawable3);
            ib6.setEnabled(true);
            ib6.setImageDrawable(myDrawable3);
            ib7.setEnabled(true);
            ib7.setImageDrawable(myDrawable3);
            ib8.setEnabled(true);
            ib8.setImageDrawable(myDrawable3);
            ib9.setEnabled(true);
            ib9.setImageDrawable(myDrawable3);

        }

        if (v.getId() == R.id.terminar) {
            System.exit(0);
        }

        contador++;
        turno = contador % 2;

        //Jugador 1 X
        if (turno == 1) {

            imprimirX(v);

            if(ib1.getDrawable()==myDrawable && ib2.getDrawable()==myDrawable && ib3.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib4.getDrawable()==myDrawable && ib5.getDrawable()==myDrawable && ib6.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib7.getDrawable()==myDrawable && ib8.getDrawable()==myDrawable && ib9.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib1.getDrawable()==myDrawable && ib4.getDrawable()==myDrawable && ib7.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib2.getDrawable()==myDrawable && ib5.getDrawable()==myDrawable && ib8.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib1.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib9.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib3.getDrawable()==myDrawable && ib6.getDrawable()==myDrawable && ib9.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib7.getDrawable()==myDrawable && ib5.getDrawable()==myDrawable && ib3.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }
            else if(ib1.getDrawable()==myDrawable && ib5.getDrawable()==myDrawable && ib9.getDrawable()==myDrawable){
                tv_ganador.setText("X");
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                acum_x += 10;
                puntosx.setText(""+acum_x);
            }

            else if (ib1.isEnabled()==false && ib2.isEnabled()==false && ib3.isEnabled()==false && ib4.isEnabled()==false && ib5.isEnabled()==false
                    && ib6.isEnabled()==false && ib7.isEnabled()==false && ib8.isEnabled()==false && ib9.isEnabled()==false){
                tv_ganador.setText("EMPATE");
            }


        }

        //Jugador 2 O
        else {
            imprimirO(v);

            if(ib1.getDrawable()==myDrawable2 && ib2.getDrawable()==myDrawable2 && ib3.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib4.getDrawable()==myDrawable2 && ib5.getDrawable()==myDrawable2 && ib6.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib7.getDrawable()==myDrawable2 && ib8.getDrawable()==myDrawable2 && ib9.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib1.getDrawable()==myDrawable2 && ib4.getDrawable()==myDrawable2 && ib7.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib5.setEnabled(false);
                ib6.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib2.getDrawable()==myDrawable2 && ib5.getDrawable()==myDrawable2 && ib8.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib1.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib9.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib3.getDrawable()==myDrawable2 && ib6.getDrawable()==myDrawable2 && ib9.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib4.setEnabled(false);
                ib5.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib7.getDrawable()==myDrawable2 && ib5.getDrawable()==myDrawable2 && ib3.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib1.setEnabled(false);
                ib2.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib8.setEnabled(false);
                ib9.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }
            else if(ib1.getDrawable()==myDrawable2 && ib5.getDrawable()==myDrawable2 && ib9.getDrawable()==myDrawable2){
                tv_ganador.setText("O");
                ib2.setEnabled(false);
                ib3.setEnabled(false);
                ib4.setEnabled(false);
                ib6.setEnabled(false);
                ib7.setEnabled(false);
                ib8.setEnabled(false);
                acum_o += 10;
                puntoso.setText(""+acum_o);
            }

            else if (ib1.isEnabled()==false && ib2.isEnabled()==false && ib3.isEnabled()==false && ib4.isEnabled()==false && ib5.isEnabled()==false
            && ib6.isEnabled()==false && ib7.isEnabled()==false && ib8.isEnabled()==false && ib9.isEnabled()==false){
                tv_ganador.setText("EMPATE");
            }

        }



    }

    public void imprimirX (View v) {

        if (v.getId() == R.id.imagen1) {
            ib1.setImageDrawable(myDrawable);
            ib1.setEnabled(false);
        } else if (v.getId() == R.id.imagen2) {
            ib2.setImageDrawable(myDrawable);
            ib2.setEnabled(false);
        } else if (v.getId() == R.id.imagen3) {
            ib3.setImageDrawable(myDrawable);
            ib3.setEnabled(false);
        } else if (v.getId() == R.id.imagen4) {
            ib4.setImageDrawable(myDrawable);
            ib4.setEnabled(false);
        } else if (v.getId() == R.id.imagen5) {
            ib5.setImageDrawable(myDrawable);
            ib5.setEnabled(false);
        } else if (v.getId() == R.id.imagen6) {
            ib6.setImageDrawable(myDrawable);
            ib6.setEnabled(false);
        } else if (v.getId() == R.id.imagen7) {
            ib7.setImageDrawable(myDrawable);
            ib7.setEnabled(false);
        } else if (v.getId() == R.id.imagen8) {
            ib8.setImageDrawable(myDrawable);
            ib8.setEnabled(false);
        } else if (v.getId() == R.id.imagen9) {
            ib9.setImageDrawable(myDrawable);
            ib9.setEnabled(false);
        }

    }


    public void imprimirO (View v){


        if(v.getId()==R.id.imagen1){
            ib1.setImageDrawable(myDrawable2);
            ib1.setEnabled(false);
        }

        else if(v.getId() == R.id.imagen2){
            ib2.setImageDrawable(myDrawable2);
            ib2.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen3){
            ib3.setImageDrawable(myDrawable2);
            ib3.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen4){
            ib4.setImageDrawable(myDrawable2);
            ib4.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen5){
            ib5.setImageDrawable(myDrawable2);
            ib5.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen6){
            ib6.setImageDrawable(myDrawable2);
            ib6.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen7){
            ib7.setImageDrawable(myDrawable2);
            ib7.setEnabled(false);
        }
        else if(v.getId() == R.id.imagen8){
            ib8.setImageDrawable(myDrawable2);
            ib8.setEnabled(false);
        }
        else if (v.getId() == R.id.imagen9){
            ib9.setImageDrawable(myDrawable2);
            ib9.setEnabled(false);
        }
    }


}