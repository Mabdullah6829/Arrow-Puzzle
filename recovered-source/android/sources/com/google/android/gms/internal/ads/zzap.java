package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzap {

    /* JADX INFO: renamed from: a */
    public final zzao[] f6355a;

    public zzap(zzao... zzaoVarArr) {
        this.f6355a = zzaoVarArr;
    }

    /* JADX INFO: renamed from: a */
    public final zzao m4286a(Class cls, zzgts zzgtsVar) {
        zzao[] zzaoVarArr = this.f6355a;
        int length = zzaoVarArr.length;
        int i2 = 0;
        while (true) {
            zzao zzaoVar = null;
            if (i2 >= length) {
                return null;
            }
            zzao zzaoVar2 = zzaoVarArr[i2];
            if (cls.isAssignableFrom(zzaoVar2.getClass())) {
                zzao zzaoVar3 = (zzao) cls.cast(zzaoVar2);
                if (zzgtsVar.mo3897b(zzaoVar3)) {
                    zzaoVar = zzaoVar3;
                }
            }
            if (zzaoVar != null) {
                return zzaoVar;
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: b */
    public final zzgwt m4287b(Class cls, zzgts zzgtsVar) {
        zzao zzaoVar;
        zzgzi zzgziVar = zzgwt.f18303t;
        zzgwq zzgwqVar = new zzgwq();
        for (zzao zzaoVar2 : this.f6355a) {
            if (cls.isAssignableFrom(zzaoVar2.getClass())) {
                zzaoVar = (zzao) cls.cast(zzaoVar2);
                if (!zzgtsVar.mo3897b(zzaoVar)) {
                    zzaoVar = null;
                }
            } else {
                zzaoVar = null;
            }
            if (zzaoVar != null) {
                zzgwqVar.m7203c(zzaoVar);
            }
        }
        return zzgwqVar.m7214f();
    }

    /* JADX INFO: renamed from: c */
    public final zzap m4288c(zzap zzapVar) {
        return zzapVar == null ? this : m4289d(zzapVar.f6355a);
    }

    /* JADX INFO: renamed from: d */
    public final zzap m4289d(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        String str = zzfm.f16091a;
        zzao[] zzaoVarArr2 = this.f6355a;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap((zzao[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.f6355a, ((zzap) obj).f6355a);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.f6355a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f6355a);
        return AbstractC1456a.m2450q(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public zzap(List list) {
        this.f6355a = (zzao[]) list.toArray(new zzao[0]);
    }
}
