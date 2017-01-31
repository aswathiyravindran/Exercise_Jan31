package com.example.exejan31;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity 
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,add,eql,mul,sub,div,c,dt;
	EditText ed1;
	float ValueOne , ValueTwo ;
	 
    boolean mAdd , mSub ,mMul ,mDiv ;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed2);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        
        add=(Button) findViewById(R.id.add);
        mul=(Button) findViewById(R.id.mul);
        div=(Button) findViewById(R.id.div);
        eql=(Button) findViewById(R.id.eq);
        c=(Button) findViewById(R.id.clr);
        dt=(Button) findViewById(R.id.dt);
        
        b0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				ed1.setText(ed1.getText()+"0");
				
			
			}
		});
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				ed1.setText(ed1.getText()+"1");
				
			
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		
		ed1.setText(ed1.getText()+"2");
	
	}
});
b3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		
		ed1.setText(ed1.getText()+"3");
	
	}
});
b4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		ed1.setText(ed1.getText()+"4");
		
	
	}
});
b5.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		
		ed1.setText(ed1.getText()+"5");
	
	}
});
b6.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		
		ed1.setText(ed1.getText()+"6");
	
	}
});

b7.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		ed1.setText(ed1.getText()+"7");
		
	
	}
});
b8.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		ed1.setText(ed1.getText()+"8");
		
	
	}
});
b9.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		ed1.setText(ed1.getText()+"9");
		
	
	}
});
dt.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
		ed1.setText(ed1.getText()+"9");
		
	
	}
});
sub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ValueOne = Float.parseFloat(ed1.getText() + "");
        mSub = true ;
        ed1.setText(null);
    }
});

mul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ValueOne = Float.parseFloat(ed1.getText() + "");
        mMul = true ;
        ed1.setText(null);
    }
});
div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ValueOne = Float.parseFloat(ed1.getText() + "");
        mDiv = true ;
        ed1.setText(null);
    }
});

add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ValueOne = Float.parseFloat(ed1.getText() + "");
        mAdd= true ;
        ed1.setText(null);
    }
});

    

    eql.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ValueTwo = Float.parseFloat(ed1.getText() + "");

            if (mAdd == true){

                ed1.setText(ValueOne + ValueTwo +"");
                mAdd=false;
            }


            if (mSub == true){
                ed1.setText(ValueOne - ValueTwo+"");
                mSub=false;
            }

            if (mMul == true){
                ed1.setText(ValueOne * ValueTwo+"");
                mMul=false;
            }

            if (mDiv == true){
                ed1.setText(ValueOne / ValueTwo+"");
                mDiv=false;
            }
        }
    });

    c.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText("");
        }
    });

    dt.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ed1.setText(ed1.getText()+".");
        }
    });

    
}
}