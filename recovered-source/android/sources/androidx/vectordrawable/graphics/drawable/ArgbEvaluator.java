package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public class ArgbEvaluator implements TypeEvaluator {
    private static final ArgbEvaluator sInstance = new ArgbEvaluator();

    public static ArgbEvaluator getInstance() {
        return sInstance;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f2, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f3 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f4 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fM394b = AbstractC0271e0.m394b(f4, f3, f2, f3);
        float fM394b2 = AbstractC0271e0.m394b(fPow4, fPow, f2, fPow);
        float fM394b3 = AbstractC0271e0.m394b(fPow5, fPow2, f2, fPow2);
        float fM394b4 = AbstractC0271e0.m394b(fPow6, fPow3, f2, fPow3);
        float fPow7 = ((float) Math.pow(fM394b2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fM394b3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fM394b4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fM394b * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
