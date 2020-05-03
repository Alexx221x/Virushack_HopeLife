package org.sk.hopelife

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        findViewById<Button>(R.id.next).setOnClickListener {
            var intent = Intent(this, Form2Actvity::class.java)
            startActivity(intent)
        }
    }
}
