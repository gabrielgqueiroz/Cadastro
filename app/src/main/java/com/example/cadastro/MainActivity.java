package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private Formulario form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        form = new Formulario();
        activityMainBinding.saveBt.setOnClickListener(view -> this.submit());
        activityMainBinding.cleanBt.setOnClickListener(view -> this.clear());
        /*activityMainBinding.nameEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                form.setFullName(editable.toString());
            }
        });

        activityMainBinding.telEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                form.setTel(editable.toString());
            }
        });

        activityMainBinding.emailEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                form.setEmail(editable.toString());
            }
        });

        *//*activityMainBinding.listEmailCb.setOnClickListener(view -> {
            form.setSignEmail(((CheckBox) view).isChecked());
        });*//*

        activityMainBinding.cidadeEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                form.setCity(editable.toString());
            }
        });*/


    }

    private void submit(){
        form.setFullName(activityMainBinding.nameEt.getText().toString());
        form.setTel(activityMainBinding.telEt.getText().toString());
        form.setEmail(activityMainBinding.emailEt.getText().toString());
        form.setSignEmail(activityMainBinding.listEmailCb.isChecked());
        form.setMale(activityMainBinding.mascRb.isChecked());
        form.setCity(activityMainBinding.cidadeEt.getText().toString());
        form.setState(activityMainBinding.estadoSp.getSelectedItem().toString());
        Toast.makeText(this, form.toString(), Toast.LENGTH_SHORT).show();
    }

    private void clear(){
        activityMainBinding.nameEt.getText().clear();
        activityMainBinding.telEt.getText().clear();
        activityMainBinding.emailEt.getText().clear();
        activityMainBinding.listEmailCb.setChecked(false);
        activityMainBinding.mascRb.setChecked(false);
        activityMainBinding.femRb.setChecked(false);
        activityMainBinding.cidadeEt.getText().clear();
        activityMainBinding.estadoSp.setSelection(0);
    }
}