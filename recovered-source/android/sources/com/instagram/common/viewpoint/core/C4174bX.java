package com.instagram.common.viewpoint.core;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4174bX extends View {
    public static byte[] A0E;
    public static String[] A0F = {"6CPTD", "fXgP9xh", "ib2e4in6DthWL0Q8yAPc5xfntbPyX", "G2AJONpeKHBBwjt4Sz8dsS7zReejT0Uv", "ehyeN", "WBwJl6", "LCSmLTdRFMhZrs9WeNkLEUS62n49AyUU", "TtqxlXaAwuHndX0DwnqxXM3nrIfVxGxz"};
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public float A00;
    public int A01;
    public int A02;
    public ObjectAnimator A03;
    public Bitmap A04;
    public boolean A05;
    public final float A06;
    public final float A07;
    public final Paint A08;
    public final Paint A09;
    public final Paint A0A;
    public final Paint A0B;
    public final RectF A0C;
    public final RectF A0D;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "SahMn6yRzkp23Kmva3Z5gQPUDBgZr";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 123);
            i5++;
        }
    }

    public static void A01() {
        A0E = new byte[]{96, 98, 127, 119, 98, 117, 99, 99};
    }

    static {
        A01();
        A0G = (int) (AbstractC3926XX.A02 * 5.0f);
        A0H = (int) (AbstractC3926XX.A02 * 4.0f);
        A0I = (int) (AbstractC3926XX.A02 * 10.0f);
    }

    public C4174bX(C4494gi c4494gi, boolean z) {
        super(c4494gi);
        this.A07 = Resources.getSystem().getDisplayMetrics().density * 3.0f;
        this.A06 = Resources.getSystem().getDisplayMetrics().density * 2.0f;
        this.A00 = 0.0f;
        this.A03 = null;
        this.A02 = -1;
        this.A05 = z;
        this.A0C = new RectF();
        this.A0D = new RectF();
        this.A08 = new Paint(1);
        this.A08.setStyle(Paint.Style.STROKE);
        this.A08.setStrokeWidth(!this.A05 ? this.A07 : this.A06);
        this.A09 = new Paint(1);
        this.A09.setStyle(Paint.Style.STROKE);
        this.A09.setStrokeWidth(!this.A05 ? this.A07 : this.A06);
        this.A0A = new Paint(1);
        this.A0B = new Paint();
        this.A0B.setAntiAlias(true);
        this.A0B.setColor(-1);
        this.A0B.setTextSize(A0I);
        this.A01 = !this.A05 ? A0G : A0H;
    }

    public final void A02(float f2, int i2) {
        this.A02 = i2;
        setProgressWithAnimation(f2);
    }

    public final void A03(int i2, int i3, int i4, boolean z) {
        this.A08.setColor(i2);
        this.A09.setColor(i3);
        if (z) {
            this.A0A.setColorFilter(new PorterDuffColorFilter(AbstractC3411P3.A02(i3, i4), PorterDuff.Mode.SRC_ATOP));
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        if (this.A03 != null) {
            this.A03.cancel();
            this.A03 = null;
        }
    }

    public float getProgress() {
        return this.A00;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.A0C, 0.0f, 360.0f, false, this.A08);
        canvas.drawArc(this.A0C, -90.0f, ((100.0f - this.A00) * 360.0f) / 100.0f, false, this.A09);
        if (this.A04 != null) {
            canvas.drawBitmap(this.A04, new Rect(0, 0, this.A04.getWidth(), this.A04.getHeight()), this.A0D, this.A0A);
        }
        if (this.A02 >= 0) {
            String str = this.A02 + A00(0, 0, 8);
            float f2 = this.A0C.left;
            float f3 = this.A0C.right;
            float sweepAngle = this.A0C.left;
            float f4 = f2 + ((f3 - sweepAngle) / 2.0f);
            float sweepAngle2 = this.A0B.measureText(str);
            float f5 = f4 - (sweepAngle2 / 2.0f);
            float f6 = this.A0C.top;
            float sweepAngle3 = A0H;
            float f7 = f6 + sweepAngle3;
            float f8 = this.A0C.bottom;
            float sweepAngle4 = this.A0C.top;
            canvas.drawText(str, f5, f7 + ((f8 - sweepAngle4) / 2.0f), this.A0B);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMin = Math.min(getDefaultSize(getSuggestedMinimumHeight(), i3), getDefaultSize(getSuggestedMinimumWidth(), i2));
        setMeasuredDimension(iMin, iMin);
        float f2 = !this.A05 ? this.A07 : this.A06;
        RectF rectF = this.A0C;
        int min = getPaddingLeft();
        float f3 = (f2 / 2.0f) + 0.0f + min;
        int min2 = getPaddingTop();
        float f4 = (f2 / 2.0f) + 0.0f + min2;
        int min3 = getPaddingRight();
        float f5 = (iMin - (f2 / 2.0f)) - min3;
        float strokeWidth = iMin;
        int min4 = getPaddingBottom();
        rectF.set(f3, f4, f5, (strokeWidth - (f2 / 2.0f)) - min4);
        int i4 = this.A01;
        RectF rectF2 = this.A0D;
        float f6 = this.A0C.left + i4;
        float f7 = this.A0C.top + i4;
        float f8 = this.A0C.right - i4;
        float strokeWidth2 = this.A0C.bottom;
        rectF2.set(f6, f7, f8, strokeWidth2 - i4);
    }

    public void setImage(EnumC3977YM enumC3977YM) {
        this.A04 = enumC3977YM == null ? null : AbstractC3978YN.A01(enumC3977YM);
        invalidate();
    }

    public void setImagePadding(int i2) {
        this.A01 = i2;
        invalidate();
    }

    public void setProgress(float f2) {
        this.A00 = Math.min(f2, 100.0f);
        postInvalidate();
    }

    public void setProgressWithAnimation(float f2) {
        this.A03 = ObjectAnimator.ofFloat(this, A00(0, 8, 107), f2);
        this.A03.setDuration(400L);
        this.A03.setInterpolator(new LinearInterpolator());
        this.A03.start();
    }
}
