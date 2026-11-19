package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzghg {

    /* JADX INFO: renamed from: a */
    public final zzhcp f17260a;

    /* JADX INFO: renamed from: b */
    public final zzghl f17261b;

    /* JADX INFO: renamed from: c */
    public final Set f17262c;

    /* JADX INFO: renamed from: d */
    public final String f17263d;

    /* JADX INFO: renamed from: e */
    public final zzaxt f17264e;

    /* JADX INFO: renamed from: f */
    public final zzgie f17265f;

    /* JADX INFO: renamed from: g */
    public final zzgqo f17266g;

    public zzghg(zzhcp zzhcpVar, zzghl zzghlVar, zzgie zzgieVar, zzgen zzgenVar, String str, zzaxt zzaxtVar, zzinl zzinlVar, zzinl zzinlVar2, zzinl zzinlVar3, zzgqo zzgqoVar) {
        this.f17260a = zzhcpVar;
        this.f17261b = zzghlVar;
        this.f17263d = str;
        this.f17265f = zzgieVar;
        this.f17264e = zzaxtVar;
        this.f17266g = zzgqoVar;
        int iOrdinal = zzgenVar.ordinal();
        if (iOrdinal == 0) {
            this.f17262c = zzinlVar.zzb();
        } else if (iOrdinal == 1) {
            this.f17262c = zzinlVar2.zzb();
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException();
            }
            this.f17262c = zzinlVar3.zzb();
        }
    }

    /* JADX INFO: renamed from: a */
    public final ListenableFuture m7004a() {
        boolean z;
        zzhcp zzhcpVar = this.f17260a;
        zzghl zzghlVar = this.f17261b;
        synchronized (zzghlVar) {
            z = zzghlVar.f17281d;
        }
        if (!z) {
            return zzhcf.m7367a(Integer.toString(7));
        }
        if (!this.f17265f.zzb()) {
            return zzhcf.m7369c(zzhcpVar, new Callable() { // from class: com.google.android.gms.internal.ads.zzghf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzghg zzghgVar = this.f17259a;
                    String str = zzghgVar.f17263d;
                    zzghl zzghlVar2 = zzghgVar.f17261b;
                    zzghlVar2.getClass();
                    zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
                    zzaxtVarM4561F0.m4531r(16384);
                    return Base64.encodeToString(zzghlVar2.m7006b(((zzayt) zzaxtVarM4561F0.m8328o()).m8099h(), str, true), 11);
                }
            });
        }
        Set set = this.f17262c;
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(zzhcpVar.submit((zzgjh) it.next()));
        }
        return new zzhce(zzgwt.m7220t(arrayList), false).m7366a(zzhbu.f18506s, new Callable() { // from class: com.google.android.gms.internal.ads.zzghd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                final zzghg zzghgVar = this.f17257a;
                Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzghe
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzghg zzghgVar2 = zzghgVar;
                        zzayt zzaytVar = (zzayt) zzghgVar2.f17264e.m8328o();
                        String str = zzghgVar2.f17263d;
                        zzghl zzghlVar2 = zzghgVar2.f17261b;
                        try {
                            return Base64.encodeToString(((zzazm) zzghlVar2.m7008d(str, zzaytVar.m8099h()).m8328o()).m8099h(), 11);
                        } catch (IllegalArgumentException unused) {
                            zzghlVar2.getClass();
                            zzaxt zzaxtVarM4561F0 = zzayt.m4561F0();
                            zzaxtVarM4561F0.m4531r(4096);
                            return Base64.encodeToString(zzghlVar2.m7006b(((zzayt) zzaxtVarM4561F0.m8328o()).m8099h(), str, true), 11);
                        }
                    }
                };
                zzgqm zzgqmVarM7060a = zzghgVar.f17266g.m7060a(101);
                try {
                    zzgqmVarM7060a.m7057a();
                    Object objCall = callable.call();
                    zzgqmVarM7060a.m7059c();
                    return (String) objCall;
                } catch (Throwable th) {
                    try {
                        zzgqmVarM7060a.m7058b(th);
                        throw th;
                    } catch (Throwable th2) {
                        zzgqmVarM7060a.m7059c();
                        throw th2;
                    }
                }
            }
        });
    }
}
