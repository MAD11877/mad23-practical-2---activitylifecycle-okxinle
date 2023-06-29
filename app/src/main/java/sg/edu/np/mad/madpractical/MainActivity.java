package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String TITLE = "Main Activity";

    User myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myUser = new User("Hello World", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", 1, false);

        TextView greeting = findViewById(R.id.nameTextView);
        greeting.setText(myUser.getName());

        TextView description = findViewById(R.id.descriptionTextView);
        description.setText(myUser.getDescription());
        Button fllwBtn = findViewById(R.id.followButton);
        fllwBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TITLE, "Button A clicked");
                if (myUser.isFollowed()) {
                    myUser.setFollowed(false);
                    Log.v(TITLE, "Followed");
                    fllwBtn.setText("Unfollow");
                } else {
                    myUser.setFollowed(true);
                    Log.v(TITLE, "Unfollowed");
                    fllwBtn.setText("Follow");
                }
            };
        });
    };
};