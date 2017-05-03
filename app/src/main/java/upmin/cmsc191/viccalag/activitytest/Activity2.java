package upmin.cmsc191.viccalag.activitytest;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jeremy Patrick on 5/3/2017.
 * Author: Jeremy Patrick G. Pacabis
 * for upmin.cmsc191.viccalag.activitytest @ ActivityTest
 */

public class Activity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // activity_2.xml will be displayed
        setContentView(R.layout.activity_2);
    }
}
