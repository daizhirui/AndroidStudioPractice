package com.daizhirui.scrollviewtest;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by daizhirui on 2017/3/22.
 */

public class ScrollViewActivity extends Activity {

    private LinearLayout layout;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scrollview);

        layout = (LinearLayout) findViewById(R.id.layout);

        for(int i=0;i<20;i++){
            //通过资源文件来获得指定一个Drawable对象
            Drawable drawable = getResources().getDrawable(R.drawable.apple_pic);
            ImageView imageView = new ImageView(this);
            imageView.setImageDrawable(drawable);
            layout.addView(imageView);
        }
    }

}
