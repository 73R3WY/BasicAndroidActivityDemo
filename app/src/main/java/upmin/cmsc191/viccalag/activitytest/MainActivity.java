package upmin.cmsc191.viccalag.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jeremy Patrick on 5/3/2017.
 * Author: Jeremy Patrick G. Pacabis
 * for upmin.cmsc191.viccalag.activitytest @ ActivityTest
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btn_next;

    // this will be called on application launch
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // sets the content view to main_activity.xml
        setContentView(R.layout.main_activity);

        // initializes the elements of the content view
        initialize();
    }

    private void initialize() {
        // initializes btn_next and sets the onclick listener to this class
        btn_next = (Button) findViewById(R.id.btn_next);
        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {  // implemented by View.OnClickListener
        switch (v.getId()) { // gets the id of the view/element clicked
            case R.id.btn_next: // btn_next of the view was clicked, code below will be executed
                Intent startActivity2 = new Intent(this, Activity2.class); // Intent to execute Activity2 from this class (MainActivity.class)
                startActivity(startActivity2); // Activity2 will be opened
                break;
        }
    }
}
