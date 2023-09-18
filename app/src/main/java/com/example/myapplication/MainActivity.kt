package com.example.myapplication

import kotlin.random.Random
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// Find UI elements by their IDs and assign them to variables
		val btnGenerate = findViewById<Button>(R.id.btnGenerate)
		val txtvArrayGenerated = findViewById<TextView>(R.id.txtvArrayGenerated)
		val txtvLowerNumber = findViewById<TextView>(R.id.txtvLowerNumber)
		val txtvAverage = findViewById<TextView>(R.id.txtvAverage)
		val txtvHigherNumber = findViewById<TextView>(R.id.txtvHigherNumber)
		val btnCloseApp = findViewById<Button>(R.id.btnCloseApp)
		btnGenerate.setOnClickListener {
			// Create an array of 10 random integers between 1 and 100
			val arrayGenerated = IntArray(10) { Random.nextInt(1, 101) }

			txtvArrayGenerated.text = "[ ${arrayGenerated.joinToString(", ")}]"
			txtvLowerNumber.text = "The lowest number is: ${arrayGenerated.minOrNull().toString()}" // Calculate and display the lowest number in the array
			txtvAverage.text = "The average is: ${arrayGenerated.average()}" // Calculate and display the average of the numbers in the array
			txtvHigherNumber.text = "The highest number is: ${arrayGenerated.maxOrNull().toString()}" // Calculate and display the average of the numbers in the array
		}

		btnCloseApp.setOnClickListener {
			// Close app
			finish()
		}
	}
}
