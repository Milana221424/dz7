
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dz7.R
import com.example.zhibek_romanbekova_hw7_3m.MusicListFragment


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.music_container, MusicFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.music_list_container, MusicListFragment()).commit()
    }
}