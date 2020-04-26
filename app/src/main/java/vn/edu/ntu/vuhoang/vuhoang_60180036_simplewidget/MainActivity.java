package vn.edu.ntu.vuhoang.vuhoang_60180036_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edtTen, edtNgaySinh, edtSoThichKhac;
    RadioGroup rdgGioiTinh;
    CheckBox ckbXemPhim, ckbNgheNhac, ckbCafe, ckbONha, ckbNauAn;
    Button btnXacNhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews(){
        edtTen = findViewById(R.id.edtTen);
        edtNgaySinh = findViewById(R.id.edtNgaySinh);
        edtSoThichKhac = findViewById(R.id.edtSoThichKhac);
        rdgGioiTinh = findViewById(R.id.rdgGioiTinh);
        ckbXemPhim = findViewById(R.id.ckbXemPhim);
        ckbNgheNhac = findViewById(R.id.ckbNgheNhac);
        ckbCafe = findViewById(R.id.ckbCafe);
        ckbONha = findViewById(R.id.ckbONha);
        ckbNauAn = findViewById(R.id.ckbNauAn);
        edtSoThichKhac= findViewById(R.id.edtSoThichKhac);
        btnXacNhan = findViewById(R.id.btnXacNhan);
    }
    private void addEvents(){
        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xacNhan();
            }
        });
    }
    private void xacNhan(){
        String str = edtTen.getText().toString() + "\n"
                + "Ngày sinh: " + edtNgaySinh.getText().toString() + "\n";
        switch (rdgGioiTinh.getCheckedRadioButtonId()){
            case R.id.rdbNam:
                str += "Giới tính: Nam";
                break;
            case R.id.rdbNu:
                str += "Giới tính: Nữ";
        }
        str += "\n Sở thích: ";
        if (ckbXemPhim.isChecked()) {
            str += "Xem phim; ";
        }
        if (ckbCafe.isChecked()) {
            str += "Đi cafe với bạn bè; ";
        }
        if (ckbNauAn.isChecked()) {
            str += "Vào bếp nấu ăn; ";
        }
        if (ckbNgheNhac.isChecked()) {
            str += "Nghe nhạc; ";
        }
        if (ckbONha.isChecked()) {
            str += "Ở nhà một mình; ";
        }
        str += edtSoThichKhac.getText().toString();
        Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT).show();

    }
}
