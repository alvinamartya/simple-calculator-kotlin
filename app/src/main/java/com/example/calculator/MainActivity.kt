package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var firstNumber = ""
    private var secondNumber = ""
    private var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_zero_main.setOnClickListener {
            addToNumber("0")
            printToView()
        }

        btn_one_main.setOnClickListener {
            addToNumber("1")
            printToView()
        }

        btn_two_main.setOnClickListener {
            addToNumber("2")
            printToView()
        }

        btn_three_main.setOnClickListener {
            addToNumber("3")
            printToView()
        }

        btn_four_main.setOnClickListener {
            addToNumber("4")
            printToView()
        }

        btn_five_main.setOnClickListener {
            addToNumber("5")
            printToView()
        }

        btn_six_main.setOnClickListener {
            addToNumber("6")
            printToView()
        }

        btn_seven_main.setOnClickListener {
            addToNumber("7")
            printToView()
        }

        btn_eight_main.setOnClickListener {
            addToNumber("8")
            printToView()
        }

        btn_nine_main.setOnClickListener {
            addToNumber("9")
            printToView()
        }

        btn_add_main.setOnClickListener {
            changeOperation("+")
            printToView()
        }

        btn_sub_main.setOnClickListener {
            changeOperation("-")
            printToView()
        }

        btn_div_main.setOnClickListener {
            changeOperation("/")
            printToView()
        }

        btn_mul_main.setOnClickListener {
            changeOperation("x")
            printToView()
        }

        btn_clear_main.setOnClickListener {
            operation = ""
            firstNumber = ""
            secondNumber = ""
            tv_operation_main.text = ""
            tv_result_main.text = "=0"
        }

        btn_result_main.setOnClickListener {
            if (firstNumber != "" && secondNumber != "") {
                val num1 = firstNumber.toInt()
                val num2 = secondNumber.toInt()

                val result = when (operation) {
                    "x" -> "=${num1 * num2}"
                    "/" -> "=${num1 / num2}"
                    "+" -> "=${num1 + num2}"
                    "-" -> "=${num1 - num2}"
                    else -> "=0"
                }

                tv_result_main.text = result
            }
        }
    }

    private fun printToView() {
        if (firstNumber != "" && secondNumber == "" && operation == "")
            tv_operation_main.text = firstNumber.toInt().toString()
        else if (firstNumber != "" && operation != "" && secondNumber == "")
            tv_operation_main.text = "${firstNumber.toInt()}$operation"
        else
            tv_operation_main.text = "${firstNumber.toInt()}$operation${secondNumber.toInt()}"
    }

    private fun changeOperation(op: String) {
        if (operation == "") operation = op
    }

    private fun addToNumber(numb: String) {
        if (operation != "") secondNumber += numb
        else firstNumber += numb
    }
}
