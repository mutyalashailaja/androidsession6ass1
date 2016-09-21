package com.example.admin.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Admin on 19-09-2016.
 */
public class SimpleAddition extends Fragment implements View.OnClickListener {
    EditText editText;
    Button button;
    MessagePasser messagePasser;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.simple_addition,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        messagePasser=(MessagePasser)getActivity();

        button=(Button)getActivity().findViewById(R.id.button);
        editText=(EditText)getActivity().findViewById(R.id.editText);
        button.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        String message = editText.getText().toString();
       messagePasser.OnMessage(String.valueOf(message));
    }
}
