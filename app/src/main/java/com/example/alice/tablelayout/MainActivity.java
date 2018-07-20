package com.example.alice.tablelayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {

    private String[][] titleDate = new String[][]{
            {"ID","Name","Email","Address"},
            {"itlty","李铁英","lty106@163.com","哈尔滨南岗区"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout layout = new TableLayout(this);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT
        );
        layout.setBackgroundResource(R.drawable.bg2);
        for (int x = 0; x < this.titleDate.length; x++){
            TableRow row = new TableRow(this);
            for (int y = 0; y < this.titleDate[x].length; y++){
                TextView text = new TextView(this);
                text.setText(this.titleDate[x][y]);
                row.addView(text, y);
            }
            layout.addView(row);
        }
        setContentView(layout, layoutParams);
    }
}
