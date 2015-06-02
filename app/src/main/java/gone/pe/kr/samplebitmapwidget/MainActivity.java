package gone.pe.kr.samplebitmapwidget;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //액션바에 대한 컨트롤를 얻는다.
        //getSupportActionBar()는 이전 버전까지도 작동하게 만들기 위함.
        //getActionBar()도 있음
        getSupportActionBar().hide();

        TitleBitmapButton arrowLeftBtn = (TitleBitmapButton)findViewById(R.id.arrowLeftBtn);

        BitmapDrawable drawable = (BitmapDrawable)getResources().getDrawable(R.drawable.arrow_left);
        Bitmap normalBitmap = drawable.getBitmap();

        BitmapDrawable drawable1 = (BitmapDrawable)getResources().getDrawable(R.drawable.arrow_left_clicked);
        Bitmap clickedBitmap = drawable1.getBitmap();

        arrowLeftBtn.setIconBitmap(normalBitmap, clickedBitmap);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
