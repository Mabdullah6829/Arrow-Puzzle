package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzajk extends zzajs implements zzaiz {

    /* JADX INFO: renamed from: b */
    public final String f5531b;

    /* JADX INFO: renamed from: c */
    public final int f5532c;

    /* JADX INFO: renamed from: d */
    public final int f5533d;

    /* JADX INFO: renamed from: e */
    public final long f5534e;

    /* JADX INFO: renamed from: f */
    public final long f5535f;

    /* JADX INFO: renamed from: g */
    public final zzajs[] f5536g;

    public zzajk(String str, int i2, int i3, long j2, long j3, zzajs[] zzajsVarArr) {
        String str2;
        super("CHAP");
        zzgtr.m7128a(i2 <= i3);
        this.f5531b = str;
        this.f5532c = i2;
        this.f5533d = i3;
        int length = zzajsVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                str2 = null;
                break;
            }
            zzajs zzajsVar = zzajsVarArr[i4];
            if (zzajsVar instanceof zzajx) {
                zzajx zzajxVar = (zzajx) zzajsVar;
                String str3 = zzajxVar.f5554a;
                zzgwt zzgwtVar = zzajxVar.f5567c;
                if (str3.equals("TIT2") && !zzgwtVar.isEmpty()) {
                    str2 = (String) zzgwtVar.get(0);
                    break;
                }
            }
            i4++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.f5534e = j2;
        this.f5535f = j3;
        this.f5536g = zzajsVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzajk.class == obj.getClass()) {
            zzajk zzajkVar = (zzajk) obj;
            if (this.f5532c == zzajkVar.f5532c && this.f5533d == zzajkVar.f5533d && this.f5534e == zzajkVar.f5534e && this.f5535f == zzajkVar.f5535f && Objects.equals(this.f5531b, zzajkVar.f5531b) && Arrays.equals(this.f5536g, zzajkVar.f5536g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5531b.hashCode() + ((((((((this.f5532c + 527) * 31) + this.f5533d) * 31) + ((int) this.f5534e)) * 31) + ((int) this.f5535f)) * 31);
    }
}
