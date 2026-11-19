package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzsw implements zzrt {

    /* JADX INFO: renamed from: a */
    public zzro[] f22875a;

    private zzsw() {
    }

    /* JADX INFO: renamed from: b */
    public static zzsw m10649b() {
        return new zzsw();
    }

    @Override // com.google.android.gms.internal.measurement.zzrt
    /* JADX INFO: renamed from: a */
    public final Object mo10531a(zzrs zzrsVar) throws IOException {
        ArrayList arrayListM10628a = zzrsVar.m10628a(zzrsVar.f22834a.mo10642d(zzrsVar.f22837d));
        zzro[] zzroVarArr = this.f22875a;
        if (zzroVarArr != null) {
            zzroVarArr[0].mo10627a(arrayListM10628a);
        }
        return (OutputStream) arrayListM10628a.get(0);
    }
}
