package br.com.vinighub.gsestudo.views

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import br.com.vinighub.gsestudo.MainActivity
import br.com.vinighub.gsestudo.R

class ReportActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)

        val buttonBackToMain: Button = findViewById(R.id.button_back_to_main)
        buttonBackToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}