package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: s */
    public final int f2939s;

    AdFormat(int i2) {
        this.f2939s = i2;
    }

    /* JADX INFO: renamed from: b */
    public static AdFormat m2747b(int i2) {
        for (AdFormat adFormat : values()) {
            if (adFormat.f2939s == i2) {
                return adFormat;
            }
        }
        return null;
    }
}
