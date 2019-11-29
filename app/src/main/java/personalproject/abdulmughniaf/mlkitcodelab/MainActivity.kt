package personalproject.abdulmughniaf.mlkitcodelab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/** Base activity that requests all needed permission at launch */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_still_image)
    }
}
