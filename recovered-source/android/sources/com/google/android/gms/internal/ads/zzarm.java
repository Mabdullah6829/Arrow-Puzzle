package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzarm {

    /* JADX INFO: renamed from: a */
    public final int f6766a;

    /* JADX INFO: renamed from: b */
    public final List f6767b;

    /* JADX INFO: renamed from: c */
    public final byte[] f6768c;

    public zzarm(int i2, String str, int i3, ArrayList arrayList, byte[] bArr) {
        this.f6766a = i3;
        this.f6767b = arrayList == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList);
        this.f6768c = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m4338a() {
        int i2 = this.f6766a;
        if (i2 != 2) {
            return i2 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
