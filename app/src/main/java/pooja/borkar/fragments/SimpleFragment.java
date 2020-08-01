package pooja.borkar.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static pooja.borkar.fragments.MainActivity.textview;


public class SimpleFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }
 View view;
    Button button;
    EditText editText1;
 String edtxt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    view= inflater.inflate(R.layout.fragment_simple, container, false);
        button=view.findViewById(R.id.button);
        editText1=view.findViewById(R.id.editText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"It's Fragement" , Toast.LENGTH_SHORT).show();
                edtxt = editText1.getText().toString().toUpperCase().trim();
                textview.setText(edtxt);
            }
        });
        return view;
    }
}
