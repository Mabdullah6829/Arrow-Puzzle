package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzss implements zzrt {

    /* JADX INFO: renamed from: a */
    public final zzafj f22870a;

    /* JADX INFO: renamed from: b */
    public final zzadf f22871b;

    public zzss(zzafj zzafjVar) {
        zzadf zzadfVar = zzadf.f22012b;
        int i2 = zzacf.f21956a;
        this.f22871b = zzadf.f22013c;
        this.f22870a = zzafjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo10531a(zzrs zzrsVar) throws IOException {
        InputStream inputStreamM10648c = zzst.m10648c(zzrsVar);
        try {
            zzadu zzaduVarMo9350a = this.f22870a.mo9350a(inputStreamM10648c, this.f22871b);
            if (inputStreamM10648c != null) {
                inputStreamM10648c.close();
            }
            return zzaduVarMo9350a;
        } catch (Throwable th) {
            if (inputStreamM10648c != null) {
                try {
                    inputStreamM10648c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
