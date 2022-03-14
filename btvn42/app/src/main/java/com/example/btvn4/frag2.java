package com.example.btvn4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class frag2 extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    EditText acc, pass;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag2, container, false);
        acc = view.findViewById(R.id.acc);
        pass = view.findViewById(R.id.pass);
        Button click = getActivity().findViewById(R.id.click);
        EditText tk, mk;
        tk = getActivity().findViewById(R.id.tk);
        mk = getActivity().findViewById(R.id.mk);
        acc.setText(tk.getText());
        pass.setText(mk.getText());
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                acc.setText(tk.getText());
                pass.setText(mk.getText());
            }
        });

        return view;
    }
}