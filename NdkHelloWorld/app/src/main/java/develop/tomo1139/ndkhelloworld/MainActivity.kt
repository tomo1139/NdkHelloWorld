package develop.tomo1139.ndkhelloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private external fun helloWorld(): String;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("dbg", helloWorld());
    }

    companion object {
        init {
            System.loadLibrary("hello")
        }
    }
}
