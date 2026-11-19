package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;
import p043a.AbstractC0878a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzna implements zzrt {

    /* JADX INFO: renamed from: a */
    public final boolean f22670a;

    public zzna(boolean z) {
        this.f22670a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10531a(zzrs zzrsVar) throws IOException {
        zznd zzndVarM10532a;
        InputStream inputStreamM10648c = zzst.m10648c(zzrsVar);
        try {
            int i2 = 4096;
            if (this.f22670a) {
                if (inputStreamM10648c instanceof zzsf) {
                    long length = ((zzsf) inputStreamM10648c).zza().length();
                    if (length == 0) {
                        i2 = 512;
                    } else if (length < 4096) {
                        i2 = (int) length;
                    }
                }
                zzndVarM10532a = zznd.m10532a(zzacv.m9430h(i2, inputStreamM10648c), true);
            } else {
                zzndVarM10532a = zznd.m10532a(zzacv.m9430h(4096, inputStreamM10648c), false);
            }
            AbstractC0878a.m1797f(inputStreamM10648c, null);
            return zzndVarM10532a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0878a.m1797f(inputStreamM10648c, th);
                throw th2;
            }
        }
    }
}
