package in.blogspot.tecnopandit.brilliantbuy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mobileact extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobileact);
        getSupportActionBar().setTitle("Your Mobile Destination");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView=findViewById(R.id.imageView25);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void viewpro(View view)
    {
        Intent intent=new Intent(getApplicationContext(),ProductAct.class);
        startActivity(intent);
    }
}
