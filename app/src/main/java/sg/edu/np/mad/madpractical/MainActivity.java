package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    final String TITLE = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a User object and load name and description values into their respective views
        User user = new User();
        user.setFollowed(false);

        // set text base on value of the followed variable
        Button followButton = findViewById(R.id.button);

        // Set an OnClickListener to toggle the button text and update the followed variable
        followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.isFollowed() == false) {
                    followButton.setText("Unfollow");
                    user.setFollowed(true);
                } else {
                    followButton.setText("Follow");
                    user.setFollowed(false);
                }
            }
        });
    }
}
