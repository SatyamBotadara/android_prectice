package com.example.prectice.calcActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.prectice.R;
import com.example.prectice.databinding.ActivityCalcBinding;

public class calc extends AppCompatActivity implements TextWatcher {

    private ActivityCalcBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCalcBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.calcNum1.addTextChangedListener(this);
        binding.calcNum2.addTextChangedListener(this);


        binding.calcRadg.setOnCheckedChangeListener((radioGroup, i) -> {
            calculate();
        });
    }
    public  void calculate(){
        String num1=binding.calcNum1.getText().toString();
        String num2=binding.calcNum2.getText().toString();

        if(num1.isEmpty() || num2.isEmpty())
        {
            binding.calcTv.setText("something went wrong");
        }
        else if(!num1.isEmpty() && !num2.isEmpty()){
            float number1=Float.parseFloat(num1);
            float number2=Float.parseFloat(num2);

            switch (binding.calcRadg.getCheckedRadioButtonId())
            {
                case R.id.calc_sum:
                    binding.calcTv.setText(String.valueOf(number1+number2));
                    break;
                case R.id.calc_div:
                    binding.calcTv.setText(String.valueOf(number1/number2));
                    break;
                case R.id.calc_sub:
                    binding.calcTv.setText(String.valueOf(number1-number2));
                    break;
                case R.id.calc_mul:
                    binding.calcTv.setText(String.valueOf(number1*number2));
                    break;
                default:
                    binding.calcTv.setText("please select opreation");

            }
        }
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            calculate();
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}