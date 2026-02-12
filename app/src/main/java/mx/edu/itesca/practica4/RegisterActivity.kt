package mx.edu.itesca.practica4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super. onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val button: Button=findViewById(R.id.btn_sign_in)
        button.setOnClickListener {
            var intent: Intent= Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        }
    }
