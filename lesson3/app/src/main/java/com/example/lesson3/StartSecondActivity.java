package com.example.lesson3;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class StartSecondActivity implements View.OnClickListener {

    private Activity sourceActivity;
    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        EditText txt = (EditText) sourceActivity.findViewById(R.id.editText);
        EditText num = (EditText) sourceActivity.findViewById(R.id.editText2);
        Parcel parcel = new Parcel();
        parcel.text = txt.getText().toString();
        parcel.number = Integer.parseInt(num.getText().toString());
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra(Intent.ACTION_PROCESS_TEXT, parcel);
        sourceActivity.startActivity(intent);
    }
}
