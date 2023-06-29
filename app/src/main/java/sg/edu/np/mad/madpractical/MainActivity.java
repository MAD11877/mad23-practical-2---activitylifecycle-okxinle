package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private String TAG = "Main Activity";
    User user = new User();

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAG, "on Resume...");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "on Destroy...");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "on Create!");
        setContentView(R.layout.activity_main);
        TextView helloWorld = findViewById(R.id.textView2);
        helloWorld.setText("Hello World!");
        TextView content = findViewById(R.id.textView);
        content.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do aiusmod tempor incididunt ut labore et dolore magna aliqua");
        Button following = findViewById(R.id.button);
        Log.v(TAG, "before buttons");
        user.setFollowed(false);
        following.setText("Follow");
        user.setFollowed(true);
        following.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.followed == false){
                    following.setText("Follow");
                    user.setFollowed(true);
                }
                else {
                    following.setText("Unfollow");
                    user.setFollowed(false);
                }
            }
        });

    }
}