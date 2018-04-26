package bertking.com.bertcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * @author king
 */
public class MainActivity extends AppCompatActivity {
    public final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"-------onCreate()-------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"--------onResume---------");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"---------onStop()---------");
    }
}
