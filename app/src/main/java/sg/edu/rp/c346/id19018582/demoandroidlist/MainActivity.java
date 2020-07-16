package sg.edu.rp.c346.id19018582.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAndroidVersion;
    //ArrayAdapter<AndroidVersion> aaAndroidVersion;
    CustomAdapter adapter;
    ArrayList<AndroidVersion> alAndroidVersion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroidVersion = findViewById(R.id.listViewAndroidVersion);
        alAndroidVersion = new ArrayList<>();
        AndroidVersion av1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion av2 = new AndroidVersion("Oreo", "8.0");
        alAndroidVersion.add(av1);
        alAndroidVersion.add(av2);
        //or
        alAndroidVersion.add(new AndroidVersion("Nougat", "7.0"));
        alAndroidVersion.add(new AndroidVersion("Marshmallow", "6.0"));

        //aaAndroidVersion = new ArrayAdapter<>(this,
                //android.R.layout.simple_list_item_1,alAndroidVersion);
        adapter = new CustomAdapter(this, R.layout.row, alAndroidVersion);
        lvAndroidVersion.setAdapter(adapter);
    }
}
