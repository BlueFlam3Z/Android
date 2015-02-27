package alevel100magikarp.pong;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.koushikdutta.ion.Ion;


public class MainActivity extends ActionBarActivity {

    private ImageView imageView;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this ,R.raw.menuprincipal);
        mediaPlayer.start();

        //ImageView gif = (ImageView) findViewById(R.id.imageView);
        //Ion.with(gif).load("android.resource://com.example.test/" + R.drawable.snoopy);
        //Ion.with(gif).load("android.resource://com.example.test/" + R.drawable.snoopy);
    }
   // sei como da load em gif não, foda-se
   /* private void loadGIF(int drawableID) {
        Ion.with(this)
                .placeholder(R.drawable.snoopy)
                .load("android.resource://" + getPackageName() +"/" + drawableID );
    }*/

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

    public void startGame(View view) {
        Intent intent = new Intent(this, game.class);
        startActivity(intent);
    }
}
