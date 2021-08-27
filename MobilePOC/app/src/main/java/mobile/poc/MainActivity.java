package mobile.poc;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    Button submit;
    ImageView log_image;
    EditText amount_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        submit = (Button) findViewById(R.id.submit_button);
        log_image = (ImageView) findViewById(R.id.log_image);
        amount_txt = (EditText) findViewById(R.id.amount_txt);

          /*
            Submit Button
        */

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("MY_TAG", "hello world");
                linearLayout.setVisibility((linearLayout.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);
                log_image.setVisibility((log_image.getVisibility() == View.VISIBLE)
                        ? View.GONE : View.VISIBLE);
                amount_txt.setText("0");
            }
        });


    }


}