package neo.cool.repotutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //documentacion
    fun sum(): Int {
        //sumar dos enteros y mostrar el resultado por pantalla
        return 4
    }
}