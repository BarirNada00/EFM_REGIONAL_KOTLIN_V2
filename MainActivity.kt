package ma.projet.android.efmkotlinxml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputText = findViewById<EditText>(R.id.edt_chaine)
        val resultText1 = findViewById<TextView>(R.id.textview1)
        val resultText2 =findViewById<TextView>(R.id.textview2)

        val inputString = inputText.text.toString().trim()

        if (inputString.isBlank()||inputString.isEmpty()) {
            resultText1.text = "La chaîne saisie est vide ou ne contient que des espaces."
        } else {
            val words = inputString.split(" ")
            val sigle = StringBuilder()

            for (word in words) {
                if (word.isNotEmpty()) {
                    sigle.append(word[0].toUpperCase())
                }
            }

            resultText2.text = "L'acronyme de la chaîne saisie est : $sigle"
        }
    }
}