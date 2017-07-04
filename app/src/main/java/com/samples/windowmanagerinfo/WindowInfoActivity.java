package com.samples.windowmanagerinfo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.TextView;

public class WindowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window_info);
        TextView text = (TextView)findViewById(R.id.text);
        WindowManager manager =
                (WindowManager)getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        text.append("Density:\t" + metrics.density);
        text.append("\nWidth pixels:\t" + metrics.widthPixels);
        text.append("\nHeight pixels:\t" + metrics.heightPixels);
        text.append("\nDensity dpi:\t" + metrics.densityDpi);
        text.append("\nX dpi:\t" + metrics.xdpi);
        text.append("\nY dpi:\t" + metrics.ydpi);
        text.append("\nScaled density:\t" + metrics.scaledDensity);
    }
}
