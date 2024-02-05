package com.example.linearlayoutbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var messageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontrar o botão pelo id no .XML
        messageButton = findViewById(R.id.message_button)
        // Adicionando a ação para o botão
        messageButton.setOnClickListener {
            showMessage("Mensagem para o usuário!")
        }
    }

    private fun showMessage(message: String) {
        Snackbar
            .make(findViewById(R.id.layout_container), message, Snackbar.LENGTH_LONG)
            .setAction("Fechar") {}
            .show()
    }
}