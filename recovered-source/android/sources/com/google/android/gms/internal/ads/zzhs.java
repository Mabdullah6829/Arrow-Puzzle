package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class zzhs extends IOException {

    /* JADX INFO: renamed from: s */
    public final int f19162s;

    public zzhs() {
        this.f19162s = AdError.REMOTE_ADS_SERVICE_ERROR;
    }

    public zzhs(String str, int i2) {
        super(str);
        this.f19162s = i2;
    }

    public zzhs(String str, Exception exc, int i2) {
        super(str, exc);
        this.f19162s = i2;
    }

    public zzhs(Exception exc, int i2) {
        super(exc);
        this.f19162s = i2;
    }
}
