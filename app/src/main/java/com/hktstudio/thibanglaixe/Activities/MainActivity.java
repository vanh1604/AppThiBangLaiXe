package com.hktstudio.thibanglaixe.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.hktstudio.thibanglaixe.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText tf_ten_nguoi_dung, tf_mat_khau;
    LinearLayout bt_thiSatHach, bt_bienBao, bt_lyThuyet, bt_meoGhiNho, bt_meoThucHanh, bt_lichSuBaiThi, bt_dang_nhap;
    Button bt_a121, bt_b121, bt_cancel1, bt_a122, bt_b122, bt_cancel2;
    Dialog dialogThiSatHach, dialogMeoThucHanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
    }

    public void setControl(){
        bt_thiSatHach = findViewById(R.id.bt_thiSatHach);
        bt_bienBao = findViewById(R.id.bt_bienBao);
        bt_lyThuyet = findViewById(R.id.bt_lyThuyet);
        bt_meoGhiNho = findViewById(R.id.bt_meoGhiNho);
        bt_meoThucHanh = findViewById(R.id.bt_meoThucHanh);
        bt_lichSuBaiThi = findViewById(R.id.bt_lichSuBaiThi);
        bt_thiSatHach.setOnClickListener(this);
        bt_bienBao.setOnClickListener(this);
        bt_lyThuyet.setOnClickListener(this);
        bt_meoGhiNho.setOnClickListener(this);
        bt_meoThucHanh.setOnClickListener(this);
        bt_lichSuBaiThi.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void setDialogThiSatHach(){
        dialogThiSatHach = new Dialog(this);
        dialogThiSatHach.setContentView(R.layout.custom_dialog_thisathach);
        dialogThiSatHach.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogThiSatHach.setCanceledOnTouchOutside(true);
        dialogThiSatHach.show();
        bt_a121 = dialogThiSatHach.findViewById(R.id.bt_a121);
        bt_b121 = dialogThiSatHach.findViewById(R.id.bt_b121);
        bt_cancel1 = dialogThiSatHach.findViewById(R.id.bt_cancel1);
        bt_a121.setOnClickListener(this);
        bt_b121.setOnClickListener(this);
        bt_cancel1.setOnClickListener(this);
    }

    public void setDialogMeoThucHanh(){
        dialogMeoThucHanh = new Dialog(this);
        dialogMeoThucHanh.setContentView(R.layout.custom_dialog_meothuchanh);
        dialogMeoThucHanh.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogMeoThucHanh.setCanceledOnTouchOutside(true);
        dialogMeoThucHanh.show();
        bt_a122 = dialogMeoThucHanh.findViewById(R.id.bt_a122);
        bt_b122 = dialogMeoThucHanh.findViewById(R.id.bt_b122);
        bt_cancel2 = dialogMeoThucHanh.findViewById(R.id.bt_cancel2);
        bt_a122.setOnClickListener(this);
        bt_b122.setOnClickListener(this);
        bt_cancel2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_thiSatHach:
                setDialogThiSatHach();
                break;
            case R.id.bt_bienBao:
                Intent intentBienBao = new Intent(this,BienBaoActivity.class);
                startActivity(intentBienBao);

                break;
            case R.id.bt_lyThuyet:
                Intent intentLyThuyet = new Intent(this,LyThuyetActivity.class);
                startActivity(intentLyThuyet);
                break;
            case R.id.bt_meoGhiNho:
                Intent intentMeoGhiNho = new Intent(this,MeoGhiNhoActivity.class);
                startActivity(intentMeoGhiNho);
                break;
            case R.id.bt_meoThucHanh:
                setDialogMeoThucHanh();
                break;
            case R.id.bt_lichSuBaiThi:
                Intent intent_lichsu = new Intent(MainActivity.this,LichSuBaiThiActivity.class);
                startActivity(intent_lichsu);
                break;
            case R.id.bt_a121:
                Intent intentThiSatHachA = new Intent(MainActivity.this,ThiSatHachActivity.class);
                intentThiSatHachA.putExtra("tenBaiThi",'a');
                startActivity(intentThiSatHachA);
                dialogThiSatHach.dismiss();
                break;
            case R.id.bt_b121:
                Intent intentThiSatHachB = new Intent(MainActivity.this,ThiSatHachActivity.class);
                intentThiSatHachB.putExtra("tenBaiThi",'b');
                startActivity(intentThiSatHachB);
                dialogThiSatHach.dismiss();
                break;
            case R.id.bt_cancel1:
                dialogThiSatHach.dismiss();
                break;
            case R.id.bt_a122:
                Intent intentThucHanhA = new Intent(this,MeoThucHanhAActivity.class);
                startActivity(intentThucHanhA);
                dialogMeoThucHanh.dismiss();
                break;
            case R.id.bt_b122:
                Intent intentThucHanhB = new Intent(this,MeoThucHanhBActivity.class);
                startActivity(intentThucHanhB);
                dialogMeoThucHanh.dismiss();
                break;
            case R.id.bt_cancel2:
                dialogMeoThucHanh.dismiss();
                break;
            default:
                break;
        }
    }
}
