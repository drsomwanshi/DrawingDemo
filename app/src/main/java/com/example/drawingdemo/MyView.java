package com.example.drawingdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyView  extends View {

    public MyView(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint p=new Paint();
        p.setColor(Color.RED);
        canvas.drawRect(10,10,600,400,p);
        canvas.drawCircle(300,600,200,p);
        p.setTextSize(50.0f);
        canvas.rotate(-45);
        canvas.drawText("Affan",50,800,p);
        canvas.save();
        canvas.restore();
    }

}
