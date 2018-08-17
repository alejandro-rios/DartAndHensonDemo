package com.f22labs.darthensondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edt_mobile)
    EditText edtMobile;
    @BindView(R.id.edt_name)
    EditText edtName;
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.btn_login)
    Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.btn_login)
    public void onLoginClicked(){

        User user = new User();
        user.setEmail(edtEmail.getText().toString());
        user.setMobile(edtMobile.getText().toString());
        user.setName(edtName.getText().toString());

        // Replace Henson.with to HensonNavigator.goto...
        Intent intent = HensonNavigator.gotoDetailsActivity(this)
                .isSuccess(true)
                .user(user)
                .build();

        startActivity(intent);

    }
}
