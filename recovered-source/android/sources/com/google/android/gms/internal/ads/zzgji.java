package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgji implements zzgjh {

    /* JADX INFO: renamed from: a */
    public final String f17597a;

    /* JADX INFO: renamed from: b */
    public final String f17598b;

    /* JADX INFO: renamed from: c */
    public final zzgie f17599c;

    /* JADX INFO: renamed from: d */
    public final zzaxt f17600d;

    /* JADX INFO: renamed from: e */
    public final zzgqm f17601e;

    public zzgji(String str, String str2, zzaxt zzaxtVar, zzgie zzgieVar, zzgqm zzgqmVar) {
        this.f17597a = str;
        this.f17598b = str2;
        this.f17600d = zzaxtVar;
        this.f17599c = zzgieVar;
        this.f17601e = zzgqmVar;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo7017a(Method method, zzaxt zzaxtVar);

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzgqm zzgqmVar = this.f17601e;
        try {
            zzgqmVar.m7057a();
            Method methodMo7012d = this.f17599c.mo7012d(this.f17597a, this.f17598b);
            if (methodMo7012d != null) {
                mo7017a(methodMo7012d, this.f17600d);
            }
            zzgqmVar.m7059c();
            return null;
        } catch (Throwable th) {
            try {
                zzgqmVar.m7058b(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVar.m7059c();
                throw th2;
            }
        }
    }
}
