package thigk2.VuDoanThanhDat;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ChucNang1 extends AppCompatActivity {
    private EditText edtVND;
    private Button btnConvert;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chuc_nang_1);

        edtVND = findViewById(R.id.edtVND);
        btnConvert = findViewById(R.id.btnConvert);
        txtResult = findViewById(R.id.txtResult);

        btnConvert.setOnClickListener(v -> {
            String input = edtVND.getText().toString().trim();

            if (input.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập số tiền!", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    double vnd = Double.parseDouble(input);
                    double usd = vnd / 25000;

                    // Hiển thị kết quả lấy 2 số thập phân
                    txtResult.setText(String.format("Kết quả: %.2f USD", usd));
                } catch (NumberFormatException e) {
                    Toast.makeText(this, "Vui lòng nhập số hợp lệ!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
