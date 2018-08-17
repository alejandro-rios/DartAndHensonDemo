package com.f22labs.darthensondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dart.Dart;
import dart.DartModel;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.txt_mobile)
    TextView txtMobile;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.txt_email)
    TextView txtEmail;
    @BindView(R.id.btn_click_me)
    Button btnClickMe;

    // Navigation model declaration
    @DartModel
    DetailsActivityNavigationModel detailsActivityNavigationModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        Dart.bind(this);

        updateFields();
    }

    private void updateFields() {
        // Since the User model is parceable, we can get it with this
        User user = (User) detailsActivityNavigationModel.user;

        txtMobile.setText(user.getMobile());

        txtEmail.setText(user.getEmail());

        txtName.setText(user.getName());

    }

    @OnClick(R.id.btn_click_me)
    public void onClickMeClicked(){

        if(detailsActivityNavigationModel.isSuccess){
            Toast.makeText(DetailsActivity.this, "Dart and Henson is really working!", Toast.LENGTH_SHORT).show();
        }
    }

}
