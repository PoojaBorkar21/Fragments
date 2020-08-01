package pooja.borkar.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;



public class FirstFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
  Button button;
  ToggleButton toggleButton,toggleButton1;
   View view;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_first, container, false);
        toggleButton=view.findViewById(R.id.toggleButton2);
        toggleButton1=view.findViewById(R.id.toggleButton);
        button=view.findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status="Togglebutton->"+toggleButton.getText()+"\n"+"Togglebutton1-> "+toggleButton1.getText()+"\n";
                Toast.makeText(getActivity(), status, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
