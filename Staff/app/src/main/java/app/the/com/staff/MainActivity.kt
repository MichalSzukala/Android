package app.the.com.staff

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Adding text from EditTextField to TextView
        buttonOK.setOnClickListener {
            textHaba.text = "Haba Haba " + editTextName.text.toString()
            sendToast("You pushed it")

        }

        //Clearing the text
        buttonClear.setOnClickListener {
            textHaba.text = ""
            editTextName.setText("")
        }


    }


    //Sending a Toast
    fun sendToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}