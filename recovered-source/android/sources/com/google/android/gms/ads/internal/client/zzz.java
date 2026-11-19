package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.C5138R;

/* JADX INFO: loaded from: classes.dex */
public final class zzz {

    /* JADX INFO: renamed from: a */
    public final AdSize[] f3278a;

    /* JADX INFO: renamed from: b */
    public final String f3279b;

    public zzz(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C5138R.styleable.f2970a);
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(1);
        boolean zIsEmpty = TextUtils.isEmpty(string);
        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
        if (!zIsEmpty && zIsEmpty2) {
            this.f3278a = m2982a(string);
        } else {
            if (!zIsEmpty || zIsEmpty2) {
                if (zIsEmpty) {
                    typedArrayObtainAttributes.recycle();
                    throw new IllegalArgumentException("Required XML attribute \"adSize\" was missing.");
                }
                typedArrayObtainAttributes.recycle();
                throw new IllegalArgumentException("Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both.");
            }
            this.f3278a = m2982a(string2);
        }
        String string3 = typedArrayObtainAttributes.getString(2);
        this.f3279b = string3;
        typedArrayObtainAttributes.recycle();
        if (TextUtils.isEmpty(string3)) {
            throw new IllegalArgumentException("Required XML attribute \"adUnitId\" was missing.");
        }
    }

    /* JADX INFO: renamed from: a */
    public static AdSize[] m2982a(String str) {
        String[] strArrSplit = str.split("\\s*,\\s*");
        int length = strArrSplit.length;
        AdSize[] adSizeArr = new AdSize[length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String strTrim = strArrSplit[i2].trim();
            if (strTrim.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$")) {
                String[] strArrSplit2 = strTrim.split("[xX]");
                strArrSplit2[0] = strArrSplit2[0].trim();
                strArrSplit2[1] = strArrSplit2[1].trim();
                try {
                    String str2 = strArrSplit2[0];
                    int i3 = "FULL_WIDTH".equals(str2) ? -1 : Integer.parseInt(str2);
                    String str3 = strArrSplit2[1];
                    adSizeArr[i2] = new AdSize(i3, "AUTO_HEIGHT".equals(str3) ? -2 : Integer.parseInt(str3));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
            } else if ("BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2946i;
            } else if ("LARGE_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2948k;
            } else if ("FULL_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2947j;
            } else if ("LEADERBOARD".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2949l;
            } else if ("MEDIUM_RECTANGLE".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2950m;
            } else if ("SMART_BANNER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2952o;
            } else if ("WIDE_SKYSCRAPER".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2951n;
            } else if ("FLUID".equals(strTrim)) {
                adSizeArr[i2] = AdSize.f2953p;
            } else {
                if (!"ICON".equals(strTrim)) {
                    throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(strTrim));
                }
                adSizeArr[i2] = AdSize.f2955r;
            }
        }
        if (length != 0) {
            return adSizeArr;
        }
        throw new IllegalArgumentException("Could not parse XML attribute \"adSize\": ".concat(str));
    }
}
