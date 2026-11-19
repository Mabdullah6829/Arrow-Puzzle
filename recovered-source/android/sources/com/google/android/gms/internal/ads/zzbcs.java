package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcs implements Callable {

    /* JADX INFO: renamed from: a */
    public final zzbbz f7621a;

    /* JADX INFO: renamed from: b */
    public final zzaxt f7622b;

    public zzbcs(zzbbz zzbbzVar, zzaxt zzaxtVar) {
        this.f7621a = zzbbzVar;
        this.f7622b = zzaxtVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws ExecutionException, InterruptedException {
        zzbbz zzbbzVar = this.f7621a;
        zzbaz zzbazVar = zzbbzVar.f7556j;
        if ((zzbazVar != null ? zzbazVar.f7503a : zzbbzVar.f7555i) != null) {
            (zzbazVar != null ? zzbazVar.f7503a : zzbbzVar.f7555i).get();
        }
        zzayt zzaytVarM4729b = zzbbzVar.m4729b();
        if (zzaytVarM4729b == null) {
            return null;
        }
        try {
            zzaxt zzaxtVar = this.f7622b;
            synchronized (zzaxtVar) {
                try {
                    byte[] bArrM8099h = zzaytVarM4729b.m8099h();
                    zzidz zzidzVar = zzidz.f19758b;
                    int i2 = zzicy.f19697a;
                    zzaxtVar.m8325k(bArrM8099h, bArrM8099h.length, zzidz.f19759c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzifh | NullPointerException unused) {
            return null;
        }
    }
}
