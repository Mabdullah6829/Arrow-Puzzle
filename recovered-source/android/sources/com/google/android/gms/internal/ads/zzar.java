package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
final class zzar {

    /* JADX INFO: renamed from: a */
    public final int f6718a;

    public zzar(int i2) {
        this.f6718a = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m4335a() {
        int i2 = this.f6718a;
        if (i2 == 2) {
            return 10;
        }
        if (i2 == 5) {
            return 11;
        }
        if (i2 == 29) {
            return 12;
        }
        if (i2 == 42) {
            return 16;
        }
        if (i2 != 22) {
            return i2 != 23 ? 0 : 15;
        }
        return BasicMeasure.EXACTLY;
    }
}
