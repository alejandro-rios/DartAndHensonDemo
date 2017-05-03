package com.f22labs.darthensondemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.txt_mobile)
    TextView txtMobile;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.txt_email)
    TextView txtEmail;
    @BindView(R.id.btn_click_me)
    Button btnClickMe;


    @InjectExtra User user;

    @Nullable
    @InjectExtra String fromScreen;

    @InjectExtra boolean isSuccess = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        Dart.inject(this);

        updateFields();
    }

    private void updateFields() {

        txtMobile.setText(user.getMobile());

        txtEmail.setText(user.getEmail());

        txtName.setText(user.getName());

    }

    @OnClick(R.id.btn_click_me)
    public void onClickMeClicked(){

        if(isSuccess){
            Toast.makeText(DetailsActivity.this, "Dart and Henson is really working!", Toast.LENGTH_SHORT).show();
        }
    }

}
