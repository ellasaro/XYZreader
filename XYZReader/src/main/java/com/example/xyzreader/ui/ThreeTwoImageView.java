package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by el-la on 9/3/2017.
 */

public class ThreeTwoImageView extends android.support.v7.widget.AppCompatImageView {

    public ThreeTwoImageView(Context context){
        super(context);
    }

    public ThreeTwoImageView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    public ThreeTwoImageView(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int snHeight = MeasureSpec.getSize(widthMeasureSpec) * 2 / 3;
        int snHeightSpec = MeasureSpec.makeMeasureSpec(snHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, snHeightSpec);
    }
}
