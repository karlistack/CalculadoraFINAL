package com.example.calculadorafinal

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nohaynumero = true
    var numeroantiguo = ""
    var operacionbase = "+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

        fun numberEvent(view: View) {
            if(nohaynumero)
                pantalla.setText("")
            nohaynumero = false
            var botonpulsado = pantalla.text.toString()
            var botonseleccionado = view as Button

            when(botonseleccionado.id){
                uno.id->{botonpulsado+= "1"}
                dos.id->{botonpulsado+= "2"}
                tres.id->{botonpulsado+= "3"}
                cuatro.id->{botonpulsado+= "4"}
                cinco.id->{botonpulsado+= "5"}
                seis.id->{botonpulsado+= "6"}
                siete.id->{botonpulsado+= "7"}
                ocho.id->{botonpulsado+= "8"}
                nueve.id->{botonpulsado+= "9"}
                cero.id->{botonpulsado+="0"}
                lacoma.id->{botonpulsado+","}
                negativopostivo.id->{botonpulsado ="-$botonpulsado"}

            }
            pantalla.setText(botonpulsado)
        }

    fun evOperador(view: View) {
        nohaynumero = true
        numeroantiguo = pantalla.text.toString()
        var botonseleccionado = view as Button
        when(botonseleccionado.id){
           multplicacion.id->{operacionbase="*"}
            sumar.id->{operacionbase="+"}
            restar.id->{operacionbase="-"}
            divison.id->{operacionbase="/"}
        }


    }

    fun evIgualalo(view: View) {
        var numeronuevo = pantalla.text.toString()
        var resultado = 0.0
        when(operacionbase){
            "+"-> {resultado = numeroantiguo.toDouble()+ numeronuevo.toDouble()}
            "-"-> {resultado = numeroantiguo.toDouble()- numeronuevo.toDouble()}
            "*"-> {resultado = numeroantiguo.toDouble()* numeronuevo.toDouble()}
            "/"-> {resultado = numeroantiguo.toDouble()/ numeronuevo.toDouble()}
        }

        barradeanterior.setText(resultado.toString())

    }

    fun evBorra(view: View) {
       pantalla.setText("0")
        nohaynumero = true
        barradeanterior.setText("0")

    }




}