package com.apps.wagner.leadmeeting;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends Activity {
    boolean canSend = true;
    boolean alertShown = false;
    String body;
    final Context context = this;
    long tsStart = 0;
    long tsEnd;
    long tsTotal;
    String ts;
    boolean hitEnd = false;
    ScrollView checklistScroll;
    ScrollView scriptScroll;
    Button backButton;
    Button scriptButton;
    RadioGroup radioGroup1;
    RadioButton radioButton1_1;
    RadioButton radioButton1_2;
    RadioButton radioButton1_3;
    RadioButton radioButton1_4;
    RadioGroup radioGroup2;
    RadioButton radioButton2_1;
    RadioButton radioButton2_2;
    RadioButton radioButton2_3;
    RadioButton radioButton2_4;
    RadioGroup radioGroup3;
    RadioButton radioButton3_1;
    RadioButton radioButton3_2;
    RadioButton radioButton3_3;
    RadioButton radioButton3_4;
    RadioGroup radioGroup4;
    RadioButton radioButton4_1;
    RadioButton radioButton4_2;
    RadioButton radioButton4_3;
    RadioButton radioButton4_4;
    RadioGroup radioGroup5;
    RadioButton radioButton5_1;
    RadioButton radioButton5_2;
    RadioButton radioButton5_3;
    RadioButton radioButton5_4;
    RadioGroup radioGroup6;
    RadioButton radioButton6_1;
    RadioButton radioButton6_2;
    RadioButton radioButton6_3;
    RadioButton radioButton6_4;
    RadioGroup radioGroup7;
    RadioButton radioButton7_1;
    RadioButton radioButton7_2;
    RadioButton radioButton7_3;
    RadioButton radioButton7_4;
    RadioGroup radioGroup8;
    RadioButton radioButton8_1;
    RadioButton radioButton8_2;
    RadioButton radioButton8_3;
    RadioButton radioButton8_4;
    RadioGroup radioGroup9;
    RadioButton radioButton9_1;
    RadioButton radioButton9_2;
    RadioButton radioButton9_3;
    RadioButton radioButton9_4;
    RadioGroup radioGroup10;
    RadioButton radioButton10_1;
    RadioButton radioButton10_2;
    RadioButton radioButton10_3;
    RadioButton radioButton10_4;
    RadioGroup radioGroup11;
    RadioButton radioButton11_1;
    RadioButton radioButton11_2;
    RadioButton radioButton11_3;
    RadioButton radioButton11_4;
    RadioButton radioButton11_5;
    RadioGroup radioGroup12;
    RadioButton radioButton12_1;
    RadioButton radioButton12_2;
    RadioButton radioButton12_3;

    public boolean startPressed = false;
    public boolean endPressed = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
        //rg.setBackgroundResource(R.drawable.ic_launcher);
        checklistScroll = (ScrollView)findViewById(R.id.scrollView1);
        scriptScroll = (ScrollView)findViewById(R.id.scrollView2);
        backButton = (Button)findViewById(R.id.backButton);
        scriptButton = (Button)findViewById(R.id.scriptButton);

        radioGroup1 = (RadioGroup)findViewById(R.id.radio_group_1);
        radioButton1_1 = (RadioButton)findViewById(R.id.radio_button_1_1);
        radioButton1_2 = (RadioButton)findViewById(R.id.radio_button_1_2);
        radioButton1_3 = (RadioButton)findViewById(R.id.radio_button_1_3);
        radioButton1_4 = (RadioButton)findViewById(R.id.radio_button_1_4);

        radioGroup2 = (RadioGroup)findViewById(R.id.radio_group_2);
        radioButton2_1 = (RadioButton)findViewById(R.id.radio_button_2_1);
        radioButton2_2 = (RadioButton)findViewById(R.id.radio_button_2_2);
        radioButton2_3 = (RadioButton)findViewById(R.id.radio_button_2_3);
        radioButton2_4 = (RadioButton)findViewById(R.id.radio_button_2_4);

        radioGroup3 = (RadioGroup)findViewById(R.id.radio_group_3);
        radioButton3_1 = (RadioButton)findViewById(R.id.radio_button_3_1);
        radioButton3_2 = (RadioButton)findViewById(R.id.radio_button_3_2);
        radioButton3_3 = (RadioButton)findViewById(R.id.radio_button_3_3);
        radioButton3_4 = (RadioButton)findViewById(R.id.radio_button_3_4);

        radioGroup4 = (RadioGroup)findViewById(R.id.radio_group_4);
        radioButton4_1 = (RadioButton)findViewById(R.id.radio_button_4_1);
        radioButton4_2 = (RadioButton)findViewById(R.id.radio_button_4_2);
        radioButton4_3 = (RadioButton)findViewById(R.id.radio_button_4_3);
        radioButton4_4 = (RadioButton)findViewById(R.id.radio_button_4_4);

        radioGroup5 = (RadioGroup)findViewById(R.id.radio_group_5);
        radioButton5_1 = (RadioButton)findViewById(R.id.radio_button_5_1);
        radioButton5_2 = (RadioButton)findViewById(R.id.radio_button_5_2);
        radioButton5_3 = (RadioButton)findViewById(R.id.radio_button_5_3);
        radioButton5_4 = (RadioButton)findViewById(R.id.radio_button_5_4);

        radioGroup6 = (RadioGroup)findViewById(R.id.radio_group_6);
        radioButton6_1 = (RadioButton)findViewById(R.id.radio_button_6_1);
        radioButton6_2 = (RadioButton)findViewById(R.id.radio_button_6_2);
        radioButton6_3 = (RadioButton)findViewById(R.id.radio_button_6_3);
        radioButton6_4 = (RadioButton)findViewById(R.id.radio_button_6_4);

        radioGroup7 = (RadioGroup)findViewById(R.id.radio_group_7);
        radioButton1_1 = (RadioButton)findViewById(R.id.radio_button_7_1);
        radioButton1_2 = (RadioButton)findViewById(R.id.radio_button_7_2);
        radioButton1_3 = (RadioButton)findViewById(R.id.radio_button_7_3);
        radioButton1_4 = (RadioButton)findViewById(R.id.radio_button_7_4);

        radioGroup8 = (RadioGroup)findViewById(R.id.radio_group_8);
        radioButton8_1 = (RadioButton)findViewById(R.id.radio_button_8_1);
        radioButton8_2 = (RadioButton)findViewById(R.id.radio_button_8_2);
        radioButton8_3 = (RadioButton)findViewById(R.id.radio_button_8_3);
        radioButton8_4 = (RadioButton)findViewById(R.id.radio_button_8_4);

        radioGroup9 = (RadioGroup)findViewById(R.id.radio_group_9);
        radioButton9_1 = (RadioButton)findViewById(R.id.radio_button_9_1);
        radioButton9_2 = (RadioButton)findViewById(R.id.radio_button_9_2);
        radioButton9_3 = (RadioButton)findViewById(R.id.radio_button_9_3);
        radioButton9_4 = (RadioButton)findViewById(R.id.radio_button_9_4);

        radioGroup10 = (RadioGroup)findViewById(R.id.radio_group_10);
        radioButton10_1 = (RadioButton)findViewById(R.id.radio_button_10_1);
        radioButton10_2 = (RadioButton)findViewById(R.id.radio_button_10_2);
        radioButton10_3 = (RadioButton)findViewById(R.id.radio_button_10_3);
        radioButton10_4 = (RadioButton)findViewById(R.id.radio_button_10_4);

        radioGroup11 = (RadioGroup)findViewById(R.id.radio_group_11);
        radioButton11_1 = (RadioButton)findViewById(R.id.radio_button_11_1);
        radioButton11_2 = (RadioButton)findViewById(R.id.radio_button_11_2);
        radioButton11_3 = (RadioButton)findViewById(R.id.radio_button_11_3);
        radioButton11_4 = (RadioButton)findViewById(R.id.radio_button_11_4);
        radioButton11_5 = (RadioButton)findViewById(R.id.radio_button_11_5);

        radioGroup12 = (RadioGroup)findViewById(R.id.radio_group_12);
        radioButton12_1 = (RadioButton)findViewById(R.id.radio_button_12_1);
        radioButton12_2 = (RadioButton)findViewById(R.id.radio_button_12_2);
        radioButton12_3 = (RadioButton)findViewById(R.id.radio_button_12_3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.form, menu);
        return true;
    }

    public void submitClick(View v) {
        if (hitEnd == false) {
            tsEnd = System.currentTimeMillis()/1000;
            hitEnd = true;
        }
        body = "";

        int score = 0;
        int selected = 0;


        selected = radioGroup1.getCheckedRadioButtonId();
        body = body + "1. Did discussion start with process closest to customer (Assembly) and pull through each subsequent process?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_1_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "yes, clearly and without interruption\n\n";
        } else if (selected == R.id.radio_button_1_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "yes, but jumped around a bit\n\n";
        } else if (selected == R.id.radio_button_1_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "sort of; jumped around quite a bit\n\n";
        } else if (selected == R.id.radio_button_1_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "no\n\n";
        }

        selected = radioGroup2.getCheckedRadioButtonId();
        body = body + "2. Did Assembly say whether or not goals were met yesterday, and if not, what was not met and why, and what they’re doing about it?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_2_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "yes.  Kept it succinct - only described items that exceeded or didn’t meet goal. If goal exceeded or not met, described why and resolution (if not met) or how to leverage (if exceeded).\n\n";
        } else if (selected == R.id.radio_button_2_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "yes, but it took a lot of discussion to get there.\n\n";
        } else if (selected == R.id.radio_button_2_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "yes, but didn’t describe why or discuss resolution of barriers\n\n";
        } else if (selected == R.id.radio_button_2_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "no, there weren’t any specific numerical goals for yesterday &/or we didn’t talk about them.\n\n";
        }

        selected = radioGroup3.getCheckedRadioButtonId();
        body = body + "3. Did Assembly set goals for today?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_3_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "Yes, numerical goals for each product/area.\n\n";
        } else if (selected == R.id.radio_button_3_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "Numerical goals were set for some products/areas but not all.\n\n";
        } else if (selected == R.id.radio_button_3_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "Goals were set for what products to work on, but no numerical goals.\n\n";
        } else if (selected == R.id.radio_button_3_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "No, didn’t discuss goals\n\n";
        }

        selected = radioGroup4.getCheckedRadioButtonId();
        body = body + "4. Did Paint say whether or not goals were met yesterday, and if not, what was not met and why, and what they’re doing about it?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_4_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "yes.  Kept it succinct - only described items that exceeded or didn’t meet goal. If goal exceeded or not met, described why and resolution (if not met) or how to leverage (if exceeded).\n\n";
        } else if (selected == R.id.radio_button_4_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "yes, but it took a lot of discussion to get there.\n\n";
        } else if (selected == R.id.radio_button_4_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "yes, but didn’t describe why or discuss resolution of barriers\n\n";
        } else if (selected == R.id.radio_button_4_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "no, there weren’t any specific numerical goals for yesterday &/or we didn’t talk about them.\n\n";
        }

        selected = radioGroup5.getCheckedRadioButtonId();
        body = body + "5. Did Paint set goals for today?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_5_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "Yes, numerical goals for each product/area.\n\n";
        } else if (selected == R.id.radio_button_5_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "Numerical goals were set for some products/areas but not all.\n\n";
        } else if (selected == R.id.radio_button_5_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "Goals were set for what products to work on, but no numerical goals.\n\n";
        } else if (selected == R.id.radio_button_5_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "No, didn’t discuss goals\n\n";
        }

        selected = radioGroup6.getCheckedRadioButtonId();
        body = body + "6. Did Weld say whether or not goals were met yesterday, and if not, what was not met and why, and what they’re doing about it?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_6_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "yes.  Kept it succinct - only described items that exceeded or didn’t meet goal. If goal exceeded or not met, described why and resolution (if not met) or how to leverage (if exceeded).\n\n";
        } else if (selected == R.id.radio_button_6_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "yes, but it took a lot of discussion to get there.\n\n";
        } else if (selected == R.id.radio_button_6_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "yes, but didn’t describe why or discuss resolution of barriers\n\n";
        } else if (selected == R.id.radio_button_6_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "no, there weren’t any specific numerical goals for yesterday &/or we didn’t talk about them.\n\n";
        }

        selected = radioGroup7.getCheckedRadioButtonId();
        body = body + "7. Did Weld set goals for today?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_7_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "Yes, numerical goals for each product/area.\n\n";
        } else if (selected == R.id.radio_button_7_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "Numerical goals were set for some products/areas but not all.\n\n";
        } else if (selected == R.id.radio_button_7_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "Goals were set for what products to work on, but no numerical goals.\n\n";
        } else if (selected == R.id.radio_button_7_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "No, didn’t discuss goals\n\n";
        }

        selected = radioGroup8.getCheckedRadioButtonId();
        body = body + "8. Did Fab say whether or not goals were met yesterday, and if not, what was not met and why, and what they’re doing about it?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_8_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "yes.  Kept it succinct - only described items that exceeded or didn’t meet goal. If goal exceeded or not met, described why and resolution (if not met) or how to leverage (if exceeded).\n\n";
        } else if (selected == R.id.radio_button_8_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "yes, but it took a lot of discussion to get there.\n\n";
        } else if (selected == R.id.radio_button_8_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "yes, but didn’t describe why or discuss resolution of barriers\n\n";
        } else if (selected == R.id.radio_button_8_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "no, there weren’t any specific numerical goals for yesterday &/or we didn’t talk about them.\n\n";
        }

        selected = radioGroup9.getCheckedRadioButtonId();
        body = body + "9. Did Fab set goals for today?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_9_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "Yes, numerical goals for each product/area.\n\n";
        } else if (selected == R.id.radio_button_9_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "Numerical goals were set for some products/areas but not all.\n\n";
        } else if (selected == R.id.radio_button_9_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "Goals were set for what products to work on, but no numerical goals.\n\n";
        } else if (selected == R.id.radio_button_9_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "No, didn’t discuss goals\n\n";
        }

        selected = radioGroup10.getCheckedRadioButtonId();
        body = body + "10. Was the meeting a good use of time?\n\n";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_10_1) {
            score = score + 10;
            body = body + "10 points\n";
            body = body + "Other specific items discussed (LSW, announcements) and meeting took under 20 minutes\n\n";
        } else if (selected == R.id.radio_button_10_2) {
            score = score + 7;
            body = body + "7 points\n";
            body = body + "Other specific items discussed but meeting went over 20 minutes\n\n";
        } else if (selected == R.id.radio_button_10_3) {
            score = score + 4;
            body = body + "4 points\n";
            body = body + "Didn’t discuss other items and meeting took under 20 minutes\n\n";
        } else if (selected == R.id.radio_button_10_4) {
            score = score + 0;
            body = body + "0 points\n";
            body = body + "Didn’t discuss other items and meeting took over 20 minutes\n\n";
        }

        selected = radioGroup11.getCheckedRadioButtonId();
        body = body + "Building: ";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_11_1) {
            body = body + "631\n\n";
        } else if (selected == R.id.radio_button_11_2) {
            body = body + "862\n\n";
        } else if (selected == R.id.radio_button_11_3) {
            body = body + "874\n\n";
        } else if (selected == R.id.radio_button_11_4) {
            body = body + "NE\n\n";
        } else if (selected == R.id.radio_button_11_5) {
            body = body + "Windom\n\n";
        }

        selected = radioGroup12.getCheckedRadioButtonId();
        body = body + "Shift: ";
        if (selected == -1) {
            showAlert();
            return;
        } else if (selected == R.id.radio_button_12_1) {
            body = body + "1st\n\n";
        } else if (selected == R.id.radio_button_12_2) {
            body = body + "2nd\n\n";
        } else if (selected == R.id.radio_button_12_3) {
            body = body + "Weekend\n\n";
        }

        body = body + "Score: " + String.valueOf(score) + "\n" + "\n";

        EditText comments = (EditText)findViewById(R.id.editText2);
        body = body + "Comments: " + comments.getText().toString() + "\n" + "\n";

        tsTotal = tsEnd-tsStart;
        if (tsTotal > 60){
            long minutes = tsTotal / 60;
            long seconds = tsTotal % 60;
            if (seconds < 10) {
                ts = minutes +":"+"0"+seconds;
            }
            else {
                ts = minutes +":"+ seconds;
            }
        }

        else {
            if (tsTotal < 10) {
                ts = "0:0"+tsTotal;
            }
            else {
                ts = "0:"+tsTotal;
            }
        }

        if (tsStart == 0) {
            ts = "Timer was not started.";
        }
        body = body + "Meeting duration: " + ts;
        //System.out.println(body);

        if (canSend == true) {
            Intent email = new Intent(Intent.ACTION_SEND);
            email.putExtra(Intent.EXTRA_EMAIL, new String[]{"swagner@waspinc.com"});
            email.putExtra(Intent.EXTRA_SUBJECT, "Lead Meeting Feedback");
            email.putExtra(Intent.EXTRA_TEXT, body);
            email.setType("message/rfc822");
            startActivity(Intent.createChooser(email, "Choose an Email client :"));
        }

        canSend = true;
        alertShown = false;

    }

    public void startTime(View v) {
        Button startButton = (Button) findViewById(R.id.button1);
        Button endButton = (Button) findViewById(R.id.button3);
        tsStart = System.currentTimeMillis()/1000;
        hitEnd = false;
        startButton.setBackgroundColor(Color.GREEN);
        endButton.setBackgroundColor(Color.GREEN);
        startPressed = true;
    }

    public void endTime(View v) {
        Button startButton = (Button) findViewById(R.id.button1);
        Button endButton = (Button) findViewById(R.id.button3);
        tsEnd = System.currentTimeMillis()/1000;
        hitEnd = true;
        startButton.setBackgroundColor(Color.RED);
        endButton.setBackgroundColor(Color.RED);
        endPressed = true;
//		tsTotal = tsEnd-tsStart;
//		if (tsTotal > 60){
//			long minutes = tsTotal / 60;
//			long seconds = tsTotal % 60;
//			if (seconds < 10) {
//				ts = minutes +":"+"0"+seconds;
//			}
//			else {
//				ts = minutes +":"+ seconds;
//			}
//		}

    }

    public void showAlert() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set title
        alertDialogBuilder.setTitle("Invalid Form");

        // set dialog message
        alertDialogBuilder
                .setMessage("One or more required fields were left blank.")
                .setCancelable(true);
        alertDialogBuilder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                dialog.cancel();
            }
        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
        canSend = false;
        alertShown = true;
    }

    public void scriptClick(View v) {

        View view = this.getCurrentFocus();
        if (view != null) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        scriptButton.setVisibility(View.GONE);
        backButton.setVisibility(View.VISIBLE);
        checklistScroll.setVisibility(View.GONE);
        scriptScroll.setVisibility(View.VISIBLE);
    }

    public void backClick(View v) {
        scriptButton.setVisibility(View.VISIBLE);
        backButton.setVisibility(View.GONE);
        checklistScroll.setVisibility(View.VISIBLE);
        scriptScroll.setVisibility(View.GONE);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (startPressed && !endPressed) {
            Button startButton = (Button) findViewById(R.id.button1);
            Button endButton = (Button) findViewById(R.id.button3);
            startButton.setBackgroundColor(Color.GREEN);
            endButton.setBackgroundColor(Color.GREEN);
        } else if (startPressed && endPressed) {
            Button startButton = (Button) findViewById(R.id.button1);
            Button endButton = (Button) findViewById(R.id.button3);
            startButton.setBackgroundColor(Color.RED);
            endButton.setBackgroundColor(Color.RED);
        }
    }

}