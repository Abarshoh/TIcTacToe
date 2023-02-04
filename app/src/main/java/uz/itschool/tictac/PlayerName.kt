package uz.itschool.tictac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_player_name.*

class PlayerName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_name)
        next.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            if (edit1.text.isNotEmpty()) {
                intent.putExtra ("playerX", edit1.text.toString())
            }
            else {
                intent.putExtra ("playerX", "Player X")
            }

            if (edit2.text.isNotEmpty()) {
                intent.putExtra ("player0", edit2.text.toString())
            }
            else {
                intent.putExtra ("player0", "Player O")
            }

            startActivity(intent)
        }
    }
}