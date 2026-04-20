package thigk2.VuDoanThanhDat;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang2 extends AppCompatActivity {
    private ListView lvBaiHat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chuc_nang_2);

        lvBaiHat = findViewById(R.id.lvBaiHat);

        // Danh sách 10 bài hát
        String[] data = {
                "Tiến Quân Ca",
                "Vũ Đoàn Thành Đạt - 65130454", 
                "Trường Sơn Đông Trường Sơn Tây",
                "Hò Kéo Pháo",
                "Giải Phóng Miền Nam",
                "Cô Gái Sài Gòn Đi Tải Đạn",
                "Hát Mãi Khúc Quân Hành",
                "Tự Nguyện",
                "Lá Đỏ",
                "Nối Vòng Tay Lớn"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                data
        );

        lvBaiHat.setAdapter(adapter);
    }
}
