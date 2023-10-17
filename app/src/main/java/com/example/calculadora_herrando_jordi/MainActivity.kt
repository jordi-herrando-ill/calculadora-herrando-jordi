package com.example.calculadora_herrando_jordi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var textNumber: EditText
    private var input = ""
    private var num1 = 0.0
    private var num2 = 0.0
    private var operator = 0.toChar()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textNumber = findViewById(R.id.TextNumber)

        // Definir los botones numéricos y operadores
        val button0 = findViewById<Button>(R.id.button0)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val buttonMas = findViewById<Button>(R.id.buttonMas)
        val buttonIgual = findViewById<Button>(R.id.buttonIgual)
        val buttonC = findViewById<Button>(R.id.buttonC)

        // Configurar listeners para los botones numéricos y operadores
        button0.setOnClickListener {
            input += "0"
            textNumber.setText(input)
        }


        button1.setOnClickListener {
            input += "1"
            textNumber.setText(input)
        }

        button2.setOnClickListener {
            input += "2"
            textNumber.setText(input)
        }

        button3.setOnClickListener {
            input += "3"
            textNumber.setText(input)
        }

        button4.setOnClickListener {
            input += "4"
            textNumber.setText(input)
        }

        button5.setOnClickListener {
            input += "5"
            textNumber.setText(input)
        }

        button6.setOnClickListener {
            input += "6"
            textNumber.setText(input)
        }

        button7.setOnClickListener {
            input += "7"
            textNumber.setText(input)
        }

        button8.setOnClickListener {
            input += "8"
            textNumber.setText(input)
        }

        button9.setOnClickListener {
            input += "9"
            textNumber.setText(input)
        }

        buttonMas.setOnClickListener {
            operator = '+'
            num1 = input.toDouble()
            input = ""
        }
        buttonIgual.setOnClickListener {
            num2 = input.toDouble()
            val result = performOperation(num1, num2, operator)
            textNumber.setText(result.toString())
            input = result.toString()
        }
        buttonC.setOnClickListener {
            input = ""
            textNumber.setText("")
        }
    }

    // Método para realizar la operación
    private fun performOperation(num1: Double, num2: Double, operator: Char): Double {
        return when (operator) {
            '+' -> num1 + num2
            else -> 0.0
        }
    }
}