package com.example.tarun.firstlook;

        import android.graphics.Color;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView myTextView;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.mainBtn);
        //myButton.setText(R.string.button_name);
        myButton.setTextColor(Color.RED);

        myTextView = findViewById(R.id.mainTxtView);

        myEditText = findViewById(R.id.mEditText);

//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                myTextView.setVisibility(View.VISIBLE);
//                myTextView.setText(myEditText.getText());
//
//            }
//        });

    }

    public void ShowMe(View view){

        myTextView.setVisibility(View.VISIBLE);
        myTextView.setText(R.string.show_text);
    }

}
