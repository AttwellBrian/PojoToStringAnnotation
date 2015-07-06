package com.brianattwell.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SamplePojo2 pojoA = new SamplePojo2("valueA", "valueB");
        SamplePojo pojoB = new SamplePojo("valueC", "valueD", 22, pojoA);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(pojoB.toString());
    }
}
