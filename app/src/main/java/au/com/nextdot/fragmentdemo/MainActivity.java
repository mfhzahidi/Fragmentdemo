package au.com.nextdot.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements Communicator{

    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* editText=(EditText) findViewById(R.id.ed1);
        textView=(TextView)findViewById(R.id.text3);
        button =(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=null;
                s=editText.getText().toString();
                textView.setText(s);
            }
        });*/
    }

    @Override
    public void response(String text) {
        //for fragment communication

        android.app.FragmentManager fragmentManager=getFragmentManager();
        FragmentTwo fragmentTwo= (FragmentTwo) fragmentManager.findFragmentById(R.id.fragment_holder1);
        fragmentTwo.onChange(text);


    }
    /*public void changeFragment(View view)
    {
        Fragment fragment;
        if(view==findViewById(R.id.button))
        {
            fragment= new FragmentOne();
            android.app.FragmentManager fm=getFragmentManager();
            android.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_holder,fragment);
            ft.commit();
        }
        if(view==findViewById(R.id.button2))
        {
            fragment= new FragmentTwo();
            android.app.FragmentManager fm=getFragmentManager();
            android.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragment_holder,fragment);
            ft.commit();
        }
    }*/

}
