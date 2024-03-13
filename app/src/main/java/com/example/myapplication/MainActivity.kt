package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.
        activity_calculadora)

        val button0: Button = findViewById(R.id.button0)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonClean: Button = findViewById(R.id.buttonClean)
        val buttonDividir: Button = findViewById(R.id.buttonDividir)
        val buttonMulti: Button = findViewById(R.id.buttonMulti)
        val buttonLess: Button = findViewById(R.id.buttonLess)
        val buttonEqual: Button = findViewById(R.id.buttonEqual)
        val textView: TextView = findViewById(R.id.textView)

        fun adicionarValorView(value: String) {
            if (textView.text.toString().equals("0")) {
                if (value == "/" || value.equals("*") || value.equals("+") || value.equals("-")) {
                    return
                } else {
                    textView.text = value
                }
            } else {
                textView.append(value)
            }
        }
        fun verificarExpressao(value : String) {
            if (!textView.text.toString().contains("-") && !textView.text.toString().contains("+") && !textView.text.toString().contains("/") && !textView.text.toString().contains("*")) {
                adicionarValorView(value)
            }
        }
        fun calcular(expressao : String) {
            if (expressao.contains("+")) {
                val partes = expressao.split("+")
                val valor1 =  partes[0]
                val valor2 = partes[1]
                val resultado = valor1.toInt() + valor2.toInt()
                textView.setText(resultado.toString())
            }
            if (expressao.contains("-")) {
                val partes = expressao.split("-")
                val valor1 =  partes[0]
                val valor2 = partes[1]
                val resultado = valor1.toInt() - valor2.toInt()
                textView.setText(resultado.toString())
            }
            if (expressao.contains("/")) {
                val partes = expressao.split("/")
                val valor1 =  partes[0]
                val valor2 = partes[1]
                val resultado = valor1.toFloat() / valor2.toFloat()
                textView.setText(resultado.toString())
            }
            if (expressao.contains("*")) {
                val partes = expressao.split("*")
                val valor1 =  partes[0]
                val valor2 = partes[1]
                val resultado = valor1.toInt() * valor2.toInt()
                textView.setText(resultado.toString())
            }
        }

        button0.setOnClickListener() {
            adicionarValorView("0")
        }
        button1.setOnClickListener() {
            adicionarValorView("1")
        }
        button2.setOnClickListener() {
            adicionarValorView("2")
        }
        button3.setOnClickListener() {
            adicionarValorView("3")
        }
        button4.setOnClickListener() {
            adicionarValorView("4")
        }
        button5.setOnClickListener() {
            adicionarValorView("5")
        }
        button6.setOnClickListener() {
            adicionarValorView("6")
        }
        button7.setOnClickListener() {
            adicionarValorView("7")
        }
        button8.setOnClickListener() {
            adicionarValorView("8")
        }
        button9.setOnClickListener() {
            adicionarValorView("9")
        }
        buttonDividir.setOnClickListener() {
            verificarExpressao("/")
        }
        buttonMulti.setOnClickListener() {
            verificarExpressao("*")
        }
        buttonAdd.setOnClickListener() {
            verificarExpressao("+")
        }
        buttonLess.setOnClickListener() {
            verificarExpressao("-")
        }
        buttonClean.setOnClickListener() {
            textView.setText("0")
        }
        buttonEqual.setOnClickListener() {
            calcular(textView.text.toString())
        }

    }

}