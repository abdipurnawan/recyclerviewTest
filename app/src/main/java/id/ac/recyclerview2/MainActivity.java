package id.ac.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];

    int image[] = {R.drawable.samsung, R.drawable.apple, R.drawable.xiaomi, R.drawable.oppo,
            R.drawable.vivo, R.drawable.htc, R.drawable.oneplus, R.drawable.asus, R.drawable.dell,
            R.drawable.meizu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.brand);
        s2 = getResources().getStringArray(R.array.deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
