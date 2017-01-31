package com.example.exejan31;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	EditText ed;
	Button zero;
	Button one;
	Button two;
	Button three,four,five,six;
	Button seven,eight,nine,equal;
	Button add,sub,mul,div,del,dot;
	float ValueOne , ValueTwo ;
	 
    boolean mAdd , mSub ,mMul ,mDiv ;
    String operator;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=(EditText) findViewById(R.id.ed2);
        zero=(Button) findViewById(R.id.b0);
        one=(Button) findViewById(R.id.b1);
        two=(Button) findViewById(R.id.b2);
        three=(Button) findViewById(R.id.b3);
        four=(Button) findViewById(R.id.b4);
        five=(Button) findViewById(R.id.b5);
        six=(Button) findViewById(R.id.b6);
        seven=(Button) findViewById(R.id.b7);
        eight=(Button) findViewById(R.id.b8);
        nine=(Button) findViewById(R.id.b9);
        equal=(Button) findViewById(R.id.eq);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.sub);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        del=(Button) findViewById(R.id.clr);
        dot=(Button) findViewById(R.id.dt);
        
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
                ed.setText(ed.getText()+"1");
            }
        });
        	
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"2");
            }
        });
        
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"3");
            }
        });
        
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"4");
            }
        });
        
       five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"5");
            }
        });
       
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"6");
            }
        });
        
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"7");
            }
        });
        
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"8");
            }
        });
        
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	ed.setText(null);
            	ed.setText(ed.getText()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
 
                if (ed == null){
                	
                    ed.setText("");
                }else {
                    ValueOne = Float.parseFloat(ed.getText() + "");
                    mAdd = true;
                    operator="+";
                    ed.setText(operator);
                    //ed.setText(null);
                }
            }
        });
 
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(ed.getText() + "");
                mSub = true ;
                operator="-";
                //ed.setText(null);
                ed.setText(operator);
            }
        });
 
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(ed.getText() + "");
                mMul = true ;
                operator="*";
                //ed.setText(null);
                ed.setText(operator);
            }
        });
 
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueOne = Float.parseFloat(ed.getText()+"");
                mDiv = true ;
                operator="/";
                //ed.setText(null);
                ed.setText(operator);
            }
        });
 
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValueTwo = Float.parseFloat(ed.getText() + "");
 
                if (mAdd == true){
 
                    ed.setText(ValueOne + ValueTwo +"");
                    mAdd=false;
                }
 
 
                if (mSub == true){
                    ed.setText(ValueOne - ValueTwo+"");
                    mSub=false;
                }
 
                if (mMul == true){
                    ed.setText(ValueOne * ValueTwo+"");
                    mMul=false;
                }
 
                if (mDiv == true){
                    ed.setText(ValueOne / ValueTwo+"");
                    mDiv=false;
                }
            }
        });
 
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
            }
        });
 
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+".");
            }
        });
    }
 
}   	
