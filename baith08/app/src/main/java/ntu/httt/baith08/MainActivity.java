package ntu.httt.baith08;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //
        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);
        //ngồn
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("cơm sườn",20000,"sườn nướng,sườn ram",R.drawable.ct));
        dsMonAn.add(new MonAn("cơm tấm bì",29000,"có thể đổi nguyên liệu",R.drawable.ct));
        dsMonAn.add(new MonAn("cơm chiên",25000,"chọn kèm với 3 món",R.drawable.cst));

        //
        MonAnAdapter adapter = new MonAnAdapter(this,dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        //
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
                MonAn monAnChon = dsMonAn.get(position);
                //
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}