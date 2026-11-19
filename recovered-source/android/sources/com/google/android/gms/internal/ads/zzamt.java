package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamt implements zzahh {

    /* JADX INFO: renamed from: a */
    public final int f6042a;

    /* JADX INFO: renamed from: b */
    public final zzham f6043b;

    public zzamt(int i2, int[] iArr) {
        zzham zzhamVar;
        this.f6042a = i2;
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            zzhamVar = new zzham(iArrCopyOf, iArrCopyOf.length);
        } else {
            zzhamVar = zzham.f18425u;
        }
        this.f6043b = zzhamVar;
    }

    public final String toString() {
        zzham zzhamVar = this.f6043b;
        ArrayList arrayList = new ArrayList(zzhamVar.f18427t);
        for (int i2 = 0; i2 < zzhamVar.f18427t; i2++) {
            arrayList.add(zzfm.m6499a(zzhamVar.m7301a(i2)));
        }
        String strM6499a = zzfm.m6499a(this.f6042a);
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2438e(strM6499a.length() + 37, 1, string));
        sb.append("UnsupportedBrands{major=");
        sb.append(strM6499a);
        sb.append(", compatible=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
