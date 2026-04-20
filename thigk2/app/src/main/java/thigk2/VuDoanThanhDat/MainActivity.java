package thigk2.VuDoanThanhDat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang1.class);
            startActivity(intent);
        });

        btn2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang2.class);
            startActivity(intent);
        });

        btn3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang3.class);
            startActivity(intent);
        });

        btn4.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChucNang4.class);
            startActivity(intent);
        });
    }
}