package jp.ac.shohoku.s18b703.graphicssamples;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class CustomView extends View {
    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
