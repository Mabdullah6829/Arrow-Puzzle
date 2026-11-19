package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfz extends zzgb {

    /* JADX INFO: renamed from: b */
    public final long f16829b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f16830c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f16831d;

    public zzfz(int i2, long j2) {
        super(i2);
        this.f16829b = j2;
        this.f16830c = new ArrayList();
        this.f16831d = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public final zzga m6800b(int i2) {
        ArrayList arrayList = this.f16830c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzga zzgaVar = (zzga) arrayList.get(i3);
            if (zzgaVar.f16892a == i2) {
                return zzgaVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final zzfz m6801c(int i2) {
        ArrayList arrayList = this.f16831d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            zzfz zzfzVar = (zzfz) arrayList.get(i3);
            if (zzfzVar.f16892a == i2) {
                return zzfzVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final String toString() {
        String strM6835a = zzgb.m6835a(this.f16892a);
        String string = Arrays.toString(this.f16830c.toArray());
        String string2 = Arrays.toString(this.f16831d.toArray());
        int length = strM6835a.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        AbstractC0271e0.m413u(sb, strM6835a, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
