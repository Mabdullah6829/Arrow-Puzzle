package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcl {

    /* JADX INFO: renamed from: e */
    public static final zzcl f10386e = new zzcl(-1, -1, -1);

    /* JADX INFO: renamed from: a */
    public final int f10387a;

    /* JADX INFO: renamed from: b */
    public final int f10388b;

    /* JADX INFO: renamed from: c */
    public final int f10389c;

    /* JADX INFO: renamed from: d */
    public final int f10390d;

    public zzcl(int i2, int i3, int i4) {
        this.f10387a = i2;
        this.f10388b = i3;
        this.f10389c = i4;
        this.f10390d = zzfm.m6502d(i4) ? zzfm.m6504f(i4) * i3 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcl)) {
            return false;
        }
        zzcl zzclVar = (zzcl) obj;
        return this.f10387a == zzclVar.f10387a && this.f10388b == zzclVar.f10388b && this.f10389c == zzclVar.f10389c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10387a), Integer.valueOf(this.f10388b), Integer.valueOf(this.f10389c));
    }

    public final String toString() {
        int i2 = this.f10387a;
        int length = String.valueOf(i2).length();
        int i3 = this.f10388b;
        int length2 = String.valueOf(i3).length();
        int i4 = this.f10389c;
        StringBuilder sb = new StringBuilder(AbstractC1456a.m2437d(length, 38, length2, 11, String.valueOf(i4).length()) + 1);
        AbstractC1456a.m2455v(sb, "AudioFormat[sampleRate=", i2, ", channelCount=", i3);
        return AbstractC1456a.m2448o(sb, ", encoding=", i4, "]");
    }
}
