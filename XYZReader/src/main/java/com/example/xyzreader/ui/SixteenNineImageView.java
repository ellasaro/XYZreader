package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by el-la on 9/3/2017.
 */

public class SixteenNineImageView extends android.support.v7.widget.AppCompatImageView {

    public SixteenNineImageView (Context context){
        super(context);
    }

    public SixteenNineImageView (Context context, AttributeSet attrs){
        super(context, attrs);
    }
    public SixteenNineImageView (Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int snHeight = MeasureSpec.getSize(widthMeasureSpec) * 9 / 16;
        int snHeightSpec = MeasureSpec.makeMeasureSpec(snHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, snHeightSpec);
    }
}
