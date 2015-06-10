package armando.actionbarapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MenuPrin extends ActionBarActivity {
TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_prin);
        msg = (TextView)findViewById(R.id.menu1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu_prin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.opc1:
                Intent intent = new Intent(getBaseContext(), Opcion1.class);
                startActivity(intent);
                return true;

            case R.id.opc2:
                Intent a = new Intent(getBaseContext(), Opcion2.class);
                startActivity(a);
                return true;
            case R.id.opc3:
                Intent b = new Intent(getBaseContext(), Opcion3.class);
                startActivity(b);
                return true;
            case R.id.opc4:
                Intent c = new Intent(getBaseContext(), Opcion4.class);
                startActivity(c);
                return true;
            default:

                return super.onOptionsItemSelected(item);

        }
    }
}
