package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;

/* JADX INFO: loaded from: classes.dex */
public class ColorProtection extends Protection {
    private int mColor;
    private final ColorDrawable mDrawable;
    private boolean mHasColor;

    public ColorProtection(int i2) {
        super(i2);
        this.mDrawable = new ColorDrawable();
        this.mColor = 0;
    }

    private void setColorInner(int i2) {
        if (this.mColor != i2) {
            this.mColor = i2;
            this.mDrawable.setColor(i2);
            setDrawable(this.mDrawable);
        }
    }

    @Override // androidx.core.view.insets.Protection
    public void dispatchColorHint(int i2) {
        if (this.mHasColor) {
            return;
        }
        setColorInner(i2);
    }

    public int getColor() {
        return this.mColor;
    }

    @Override // androidx.core.view.insets.Protection
    public boolean occupiesCorners() {
        return true;
    }

    public void setColor(int i2) {
        this.mHasColor = true;
        setColorInner(i2);
    }

    public ColorProtection(int i2, int i3) {
        this(i2);
        setColor(i3);
    }
}
