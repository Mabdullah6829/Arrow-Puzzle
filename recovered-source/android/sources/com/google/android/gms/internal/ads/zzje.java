package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class zzje {

    /* JADX INFO: renamed from: a */
    public final String f20088a;

    /* JADX INFO: renamed from: b */
    public final zzv f20089b;

    /* JADX INFO: renamed from: c */
    public final zzv f20090c;

    /* JADX INFO: renamed from: d */
    public final int f20091d;

    /* JADX INFO: renamed from: e */
    public final int f20092e;

    public zzje(String str, zzv zzvVar, zzv zzvVar2, int i2, int i3) {
        boolean z;
        if (i2 != 0) {
            z = false;
            if (i3 == 0) {
                i3 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        zzgtr.m7128a(z);
        zzgtr.m7128a(true ^ TextUtils.isEmpty(str));
        this.f20088a = str;
        this.f20089b = zzvVar;
        zzvVar2.getClass();
        this.f20090c = zzvVar2;
        this.f20091d = i2;
        this.f20092e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzje.class == obj.getClass()) {
            zzje zzjeVar = (zzje) obj;
            if (this.f20091d == zzjeVar.f20091d && this.f20092e == zzjeVar.f20092e && this.f20088a.equals(zzjeVar.f20088a) && this.f20089b.equals(zzjeVar.f20089b) && this.f20090c.equals(zzjeVar.f20090c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20090c.hashCode() + ((this.f20089b.hashCode() + ((this.f20088a.hashCode() + ((((this.f20091d + 527) * 31) + this.f20092e) * 31)) * 31)) * 31);
    }
}
