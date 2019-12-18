package com.cay.wastesupervision.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.cay.wastesupervision.MainActivity;
import com.cay.wastesupervision.R;
import com.cay.wastesupervision.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    private String TAG ="CHEN";
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //隐藏状态栏
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login);
     //   setContentView(R.layout.activity_login);

        /*关闭标题栏*/
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        binding.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.accountNm.getText().toString().trim().isEmpty()){
                    Toast.makeText(LoginActivity.this,getString(R.string.toastAccount),Toast.LENGTH_LONG).show();
                }else {
                    if (binding.password.getText().toString().trim().isEmpty()){
                        Toast.makeText(LoginActivity.this,getString(R.string.toastPwd),Toast.LENGTH_LONG).show();
                    }else {
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        finish();
                    }
                }

            }
        });

    }
}
