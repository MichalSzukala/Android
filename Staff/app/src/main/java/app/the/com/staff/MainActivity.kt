package app.the.com.staff

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.squareup.picasso.Picasso
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
            imageViewPicasso.setImageResource(0)
        }

        buttonPicture.setOnClickListener {
            addingPictureFromInternet()
        }

        
        addPicture()
    }


    //Sending a Toast
    fun sendToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


    //Adding picture with Picasso
    fun addingPictureFromInternet(){
        val address: String = "https://upload.wikimedia.org/wikipedia/commons/7/79/Noon%2C_rest_from_work_-_Van_Gogh.jpeg"
         Picasso.get().load(address).fit().centerCrop().into(imageViewPicasso)
    }


    //Adding picture with android setImageResource
    fun addPicture(){
        imageViewPicasso.setImageResource(R.drawable.duck)
    }

}