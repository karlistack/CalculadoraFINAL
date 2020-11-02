package com.example.calculadorafinal

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
private    var nohaynumero = true
 private   var numeroantiguo = ""
   private var operacionbase = "+"
    private var contsum: Boolean = false
    private var contrest: Boolean = false
    private var contmult: Boolean = false
    private var contdiv: Boolean = false
    private var cont: Boolean = false
    private var v1: Float = 0F
    private var v1b: Int = 0
    private var v1c: String = ""
    private var v2: Float = 0F
    private var memory: Float = 0F
    private var bin: Boolean = false
    private var dec: Boolean = true
    private var hex: Boolean = false



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
                letraA.id->{botonpulsado+"A"}
                letraB.id->{botonpulsado+"B"}
                letraC.id->{botonpulsado+"C"}
                letraD.id->{botonpulsado+"D"}
                letraE.id->{botonpulsado+"E"}
                letraF.id->{botonpulsado+"F"}


                negativopostivo.id->{botonpulsado ="-$botonpulsado"}

            }
            pantalla.setText(botonpulsado)
        }




    //para la parte de la calculadora cientifica
    fun sumar (v: View){
        if(dec){
            if (!pantalla.text.isEmpty()){
                contsum = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin){
            if (!pantalla.text.isEmpty()) {
                contsum = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex){
            if (!pantalla.text.isEmpty()) {
                contsum = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }

    }

    fun resta (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contrest = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true){
            if (!pantalla.text.isEmpty()) {
                contrest = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contrest = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun division (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contdiv = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true) {
            if (!pantalla.text.isEmpty()) {
                contdiv = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contdiv = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun multiplicacion (v: View){
        if(dec==true){
            if (!pantalla.text.isEmpty()){
                contmult = true
                cont = true
                v1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin== true) {
            if (!pantalla.text.isEmpty()) {
                contmult = true
                cont = true
                v1b = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex == true){
            if (!pantalla.text.isEmpty()) {
                contmult = true
                cont = true
                v1c = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }








    //para el layout simple

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

    fun hexadecimalencendido(v: View){
        dec = false;
        bin = false;
        hex = true;
        uno.isEnabled=true
        lacoma.isEnabled = false
        //signo.isEnabled = false
        dos.isEnabled = true
        tres.isEnabled = true
        cuatro.isEnabled = true
        cinco.isEnabled = true
        seis.isEnabled = true
        siete.isEnabled = true
        ocho.isEnabled = true
        nueve.isEnabled = true
        letraA.isEnabled = true
        letraB.isEnabled = true
        letraC.isEnabled = true
        letraD.isEnabled = true
       letraE.isEnabled = true
        letraF.isEnabled = true
    }

    fun decimalencendido(view: View) {
        dec = true;
        bin = false;
        hex = false;
        cero.isEnabled=true
        uno.isEnabled=true
        lacoma.isEnabled = false
        //signo.isEnabled = false
        dos.isEnabled = true
        tres.isEnabled = true
        cuatro.isEnabled = true
        cinco.isEnabled = true
        seis.isEnabled = true
        siete.isEnabled = true
        ocho.isEnabled = true
        nueve.isEnabled = true
        letraA.isEnabled = false
        letraB.isEnabled = false
        letraC.isEnabled = false
        letraD.isEnabled = false
        letraE.isEnabled = false
        letraF.isEnabled = false




    }
    fun binariovino(view: View) {
        dec = false;
        bin = true;
        hex = false;
        cero.isEnabled=true;
        uno.isEnabled=true
        lacoma.isEnabled = false
        //signo.isEnabled = false
        dos.isEnabled = false
        tres.isEnabled = false
        cuatro.isEnabled = false
        cinco.isEnabled = false
        seis.isEnabled = false
        siete.isEnabled = false
        ocho.isEnabled = false
        nueve.isEnabled = false
        letraA.isEnabled = false
        letraB.isEnabled = false
        letraC.isEnabled = false
        letraD.isEnabled = false
        letraE.isEnabled = false
        letraF.isEnabled = false



    }


}