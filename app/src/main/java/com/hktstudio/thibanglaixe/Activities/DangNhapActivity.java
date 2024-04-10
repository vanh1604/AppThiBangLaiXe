package com.hktstudio.thibanglaixe.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.hktstudio.thibanglaixe.DAO.NguoiDungDAO;
import com.hktstudio.thibanglaixe.R;
import com.hktstudio.thibanglaixe.databinding.ActivityLoginBinding;

public class DangNhapActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    NguoiDungDAO dao;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dao = new NguoiDungDAO(this);
        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String username = binding.username.getText().toString();
                        String password = binding.password.getText().toString();
                        boolean checkCredential = dao.login(username, password)!=null;
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if(checkCredential){
                                    Toast.makeText(DangNhapActivity.this,"Đăng nhập Thành công, đang chuyển tới trang chủ", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                }
                                else{
                                    Toast.makeText(DangNhapActivity.this,"Đăng nhập thất bại! hãy kiểm tra lại tên tài khoản và mật khẩu", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }).start();
            }
        });

    }
}
