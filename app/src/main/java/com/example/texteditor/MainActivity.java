package com.example.texteditor;// MainActivity.java

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

import com.example.texteditor.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

   EditText editText;
  // Button Red, Green,Blue,Yellow;
    AutoCompleteTextView autoCompleteTextViewTextColor,autoCompleteTextViewTextStyle,autoCompleteTextViewFont,autoCompleteTextViewAlign;
    ArrayAdapter<String> adapterTextColor,adapterTextStyle,adapterFont,adapterAlign;
    String[] colorsStringArray={"Red","Blue","Green","Yellow","None"};

    String[] fontStringArray={"dhurjati","hedvig","lato","nova","nunito","opensan","roboto","rubik","None"};

    String[] styleStringArray={"Bold","Italics","Underline","None"};

    String[] alignStringArray={"Left","Right","Center"};
   @SuppressLint("MissingInflatedId")
   @Override
    protected void onCreate(Bundle savedInstanceState)
   {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

/*
Drop down code for text color
* */
       editText=findViewById(R.id.EditText);
       autoCompleteTextViewTextColor=findViewById(R.id.autoComplete_textview_selectColor);
       adapterTextColor=new ArrayAdapter<>(this,R.layout.list_items,colorsStringArray);
       autoCompleteTextViewTextColor.setAdapter(adapterTextColor);

       autoCompleteTextViewTextColor.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view,int position,long l){
               String positionOfList=adapterView.getItemAtPosition(position).toString();

               switch (positionOfList) {
                   case "Red":
                       editText.setTextColor(Color.RED);
                       break;
                   case "Blue":
                       editText.setTextColor(Color.BLUE);
                       break;
                   case "Green":
                       editText.setTextColor(Color.GREEN);
                       break;
                   case "Yellow":
                       editText.setTextColor(Color.YELLOW);
                       break;
                   case "None":
                       editText.setTextColor(Color.BLACK);
                       break;
               }
           }
       });
       /*
Drop down code for text style
* */
       autoCompleteTextViewTextStyle=findViewById(R.id.autoComplete_textview_selectStyle);
       adapterTextStyle=new ArrayAdapter<>(this,R.layout.list_items,styleStringArray);
       autoCompleteTextViewTextStyle.setAdapter(adapterTextStyle);

       autoCompleteTextViewTextStyle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view,int position,long l){
               String positionOfList=adapterView.getItemAtPosition(position).toString();

               SpannableString spannableString=new SpannableString(editText.getText());

               switch (positionOfList) {
                   case "Bold":

                       spannableString.setSpan(new StyleSpan(Typeface.BOLD),0,spannableString.length(),0);
                       editText.setText(spannableString);
                       break;
                   case "Italics":

                       spannableString.setSpan(new StyleSpan(Typeface.ITALIC),0,spannableString.length(),0);
                       editText.setText(spannableString);
                       break;
                   case "Underline":

                       spannableString.setSpan(new UnderlineSpan(),0,spannableString.length(),0);
                       editText.setText(spannableString);
                       break;
                   case "None":
                       editText.setText(editText.getText().toString());
                       break;
               }
           }
       });

        /*
Drop down code for font
* */
       autoCompleteTextViewFont=findViewById(R.id.autoComplete_textview_selectFont);
       adapterFont=new ArrayAdapter<>(this,R.layout.list_items,fontStringArray);
       autoCompleteTextViewFont.setAdapter(adapterFont);

       autoCompleteTextViewFont.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view,int position,long l){
               String positionOfList=adapterView.getItemAtPosition(position).toString();



               switch (positionOfList) {
                   case "dhurjati":
                       Typeface typeface=Typeface.createFromAsset(getAssets(),"dhurjati.ttf");
                       editText.setTypeface(typeface);
                       break;
                   case "hedvig":
                       Typeface typeface2=Typeface.createFromAsset(getAssets(),"hedvig.ttf");
                       editText.setTypeface(typeface2);
                       break;
                   case "lato":
                       Typeface typeface3=Typeface.createFromAsset(getAssets(),"lato.ttf");
                       editText.setTypeface(typeface3);
                       break;
                   case "nova":
                       Typeface typeface4=Typeface.createFromAsset(getAssets(),"nova.ttf");
                       editText.setTypeface(typeface4);
                       break;
                   case "nunito":
                       Typeface typeface5=Typeface.createFromAsset(getAssets(),"nunito.ttf");
                       editText.setTypeface(typeface5);
                       break;
                   case "opensan":
                       Typeface typeface6=Typeface.createFromAsset(getAssets(),"opensan.ttf");
                       editText.setTypeface(typeface6);
                       break;
                   case "roboto":
                       Typeface typeface7=Typeface.createFromAsset(getAssets(),"roboto.ttf");
                       editText.setTypeface(typeface7);
                       break;
                   case "rubik.ttf":
                       Typeface typeface8=Typeface.createFromAsset(getAssets(),"rubik.ttf");
                       editText.setTypeface(typeface8);
                       break;
                   case "None":
                       Typeface nofont=Typeface.DEFAULT;
                       editText.setTypeface(nofont);
                       break;

               }
           }
       });

         /*
Drop down code for Text
* */
       autoCompleteTextViewAlign=findViewById(R.id.autoComplete_textview_selectAlignment);
       adapterAlign=new ArrayAdapter<>(this,R.layout.list_items,alignStringArray);
       autoCompleteTextViewAlign.setAdapter(adapterAlign);

       autoCompleteTextViewAlign.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view,int position,long l){
               String positionOfList=adapterView.getItemAtPosition(position).toString();



               switch (positionOfList) {
                   case "Left":
                       editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
                       SpannableString spannableStringLeft=new SpannableString(editText.getText());
                       editText.setText(spannableStringLeft);
                       break;
                   case "Right":
                       editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
                       SpannableString spannableStringRight=new SpannableString(editText.getText());
                       editText.setText(spannableStringRight);
                       break;
                   case "Center":
                       editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                       SpannableString spannableStringCenter=new SpannableString(editText.getText());
                       editText.setText(spannableStringCenter);
                       break;

               }
           }
       });
   }


}
