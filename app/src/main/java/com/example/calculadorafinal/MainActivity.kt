@file:Suppress("SyntaxError", "SyntaxError")

package com.example.calculadorafinal

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class MainActivity : AppCompatActivity() {

    private var sumacion: Boolean = false
    private var restacion: Boolean = false
    private var multiplicasion: Boolean = false
    private var divisionacion: Boolean = false
    private var secontara: Boolean = false
    private var num1: Float = 0F
    private var num1binario: Int = 0
    private var num1hexa: String = ""
    private var v2: Float = 0F
    private var bin: Boolean = false
    private var dec: Boolean = true
    private var hex: Boolean = false
    private var memory: Float = 0F





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pantalla.isEnabled = false
        barradeanterior.isEnabled = false

    }


    fun hexadecimalencendido(v: View){
        dec = false
        bin = false
        hex = true
        uno.isEnabled=true
        lacoma.isEnabled = false
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
        dec = true
        bin = false
        hex = false
        cero.isEnabled=true
        uno.isEnabled=true
        lacoma.isEnabled = false
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
        dec = false
        bin = true
        hex = false
        cero.isEnabled=true
        uno.isEnabled=true
        lacoma.isEnabled = false
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
    fun uno (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "1")
        else{
            pantalla.setText("1")
        }
    }
    fun dos (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "2")
    }
    fun tres (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "3")
    }
    fun cuatro (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "4")
    }
    fun cinco (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "5")
    }
    fun cero (v: View){
        if(pantalla.text.toString() != "0" || dec){
            pantalla.setText(pantalla.text.toString() + "0")
        }else{
            pantalla.setText(pantalla.text.toString() + "0")
        }
    }
    fun seis (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "6")
    }
    fun ocho (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "8")
    }
    fun nueve (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "9")
    }
    fun siete (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "7")
    }
    fun lacoma (v: View){
        if (pantalla.text.isNotEmpty()) {
            if (!pantalla.text.toString().contains("."))
                pantalla.setText(pantalla.text.toString() + ".")
        }
    }
    fun letraA (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText("""${pantalla.text}A""")
    }
    fun letraB (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "B")
    }fun letraC(v: View) {
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "C")
    }

    fun LetraD (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "D")
    }

    fun letraF (v: View){
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "F")
    }
    fun borrar (v: View){
        if(pantalla.text.toString() != "0"){
            pantalla.setText(pantalla.text.substring(0, pantalla.text.length -1))
        }
    }
    fun signo (v: View){
        //var pant: Float = pantalla.text.toString().toFloat()
        pantalla.setText("""${pantalla.text.toString().toFloat() * -1}""")

   /*   Las tengo que implementar
    }
    fun mSum (v: View) {

        if (!pantalla.text.isEmpty()) {
            memory = memory + pantalla.text.toString().toFloat()
            pantalla.setText("")
        }

    }
    fun mRest (v: View){
        if (pantalla.text.isNotEmpty()) {
            memory -= pantalla.text.toString().toFloat()
            pantalla.setText("")
        }
    }
    fun mPant (v: View){
        pantalla.setText(""+ memory)
    }
    fun mBorr (v: View){
        memory = 0F
    }

    fun borrarPant (v: View){
        pantalla.setText("")
    }
    fun borrarTotal (v: View){
        pantalla.setText("")
        num1 = 0F
        v2 = 0F
        multiplicasion = false
        secontara = false
        sumacion = false
        divisionacion=  false
        restacion = false
    }*/
    fun seno (v: View){
        if(!pantalla.text.toString().isEmpty()){
            var sin = sin( pantalla.text.toString().toDouble())
            barradeanterior.setText("" + sin)
        }
    }
    fun coseno (v: View){
        if(!pantalla.text.toString().isEmpty()){
            var cos = cos( pantalla.text.toString().toDouble())
            barradeanterior.setText("   cos" + cos)
        }
    }
    fun tangente (v: View){
        if(!pantalla.text.toString().isEmpty()){
            var tan = tan( pantalla.text.toString().toDouble())
            barradeanterior.setText("" + tan)
        }
    }


    fun anterior(v: View) {

    }
    fun letraE(v: View) {
        if(pantalla.text.toString() != "0")
            pantalla.setText(pantalla.text.toString() + "E")

    }

    fun igual(view: View) {
        if(dec) {
            if (sumacion) {
                val num2: Float = pantalla.text.toString().toFloat()
                val sol: Float = num1 + num2
                barradeanterior.setText(sol.toString())
                sumacion = false
                secontara = false
            } else if (restacion) {
                val num2: Float = pantalla.text.toString().toFloat()
                val sol: Float = num1 - num2
                barradeanterior.setText(sol.toString())
                restacion = false
                secontara = false
            } else if (divisionacion) {
                val v2: Float = pantalla.text.toString().toFloat()
                val sol: Float = num1 / v2
                barradeanterior.setText(sol.toString())
                divisionacion = false
                secontara = false
            } else if (multiplicasion) {
                val v2: Float = pantalla.text.toString().toFloat()
                val sol: Float = num1 * v2
                barradeanterior.setText(sol.toString())
                multiplicasion = false
                secontara = false
            }
        } else if(bin){
            if (sumacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 2)
                val t2: Int  = parseInt(v2, 2)
                val solb = (t1 + t2)
                val resultado: String = solb.toString()
                barradeanterior.setText(resultado)
                sumacion = false
                secontara = false
            } else if (restacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 2)
                val t2: Int  = parseInt(v2, 2)
                val solucionBinaria = t1 - t2
                val resultado: String = solucionBinaria.toString(2)
                barradeanterior.setText(resultado)
                restacion = false
                secontara = false
            } else if (divisionacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 2)
                val t2: Int  = parseInt(v2, 2)
                val solb = t1 / t2
                val resultado: String = solb.toString(2)
                barradeanterior.setText(resultado)
                divisionacion = false
                secontara = false
            } else if (multiplicasion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 2)
                val t2: Int  = parseInt(v2, 2)
                val solb = t1 * t2
                val resultado: String = solb.toString(2)
                barradeanterior.setText(resultado)
                multiplicasion = false
                secontara = false
            }
        }else if(hex){
            if (sumacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1hexa, 16)
                val t2: Int  = parseInt(v2, 16)
                val solb = t1 + t2
                val resultado: String = solb.toString(16)
                pantalla.setText(t1+ t2).toString() //esto es lo que he cambiao
                barradeanterior.setText(resultado)
                sumacion = false
                secontara = false
            } else if (restacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 16)
                val t2: Int  = parseInt(v2, 2)
                val solb = t1 - t2
                val resultado: String = solb.toString(16)
                barradeanterior.setText(resultado)
                restacion = false
                secontara = false
            } else if (divisionacion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 16)
                val t2: Int  = parseInt(v2, 2)
                val solb = t1 / t2
                val resultado: String = solb.toString(16)
                barradeanterior.setText(resultado)
                divisionacion = false
                secontara = false
            } else if (multiplicasion) {
                val v2: String = pantalla.text.toString()
                val t1: Int = parseInt(num1binario.toString(), 16)
                val t2: Int  = parseInt(v2, 16)
                val solb = t1 * t2
                val resultado: String = solb.toString(2)
                barradeanterior.setText(resultado)
                multiplicasion = false
                secontara = false
            }
        }
    }
    fun multiplicacion(view: View) {
        if(dec){
            if (pantalla.text.isNotEmpty()){
                multiplicasion = true
                secontara = true
                num1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin) {
            if (pantalla.text.isNotEmpty()) {
                multiplicasion = true
                secontara = true
                num1binario = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex){
            if (pantalla.text.isNotEmpty()) {
                multiplicasion = true
                secontara = true
                num1hexa = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun sumar(view: View) {
        if(dec){
            if (pantalla.text.isNotEmpty()){
                sumacion = true
                secontara = true
                num1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin){
            if (pantalla.text.isNotEmpty()) {
                sumacion = true
                secontara = true
                num1binario = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex){
            if (pantalla.text.isNotEmpty()) {
                sumacion = true
                secontara = true
                num1hexa = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun division(view: View) {
        if(dec){
            if (pantalla.text.isNotEmpty()){
                divisionacion = true
                secontara = true
                num1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin) {
            if (pantalla.text.isNotEmpty()) {
                divisionacion = true
                secontara = true
                num1binario = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex){
            if (pantalla.text.isNotEmpty()) {
                divisionacion = true
                secontara = true
                num1hexa = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }
    fun resta(view: View) {
        if(dec){
            if (pantalla.text.isNotEmpty()){
                restacion = true
                secontara = true
                num1 = pantalla.text.toString().toFloat()
                pantalla.setText("")

            }
        }else if(bin){
            if (pantalla.text.isNotEmpty()) {
                restacion = true
                secontara = true
                num1binario = pantalla.text.toString().toInt()
                pantalla.setText("")
            }
        }else if(hex){
            if (pantalla.text.isNotEmpty()) {
                restacion = true
                secontara = true
                num1hexa = pantalla.text.toString()
                pantalla.setText("")
            }
        }
    }


}