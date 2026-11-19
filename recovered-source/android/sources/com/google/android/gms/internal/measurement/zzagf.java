package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzagf {

    /* JADX INFO: renamed from: a */
    public final Unsafe f22127a;

    public zzagf(Unsafe unsafe) {
        this.f22127a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo9691a(Object obj, long j2, byte b);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo9692b(long j2, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo9693c(Object obj, long j2, boolean z);

    /* JADX INFO: renamed from: d */
    public abstract float mo9694d(long j2, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract void mo9695e(Object obj, long j2, float f2);

    /* JADX INFO: renamed from: f */
    public abstract double mo9696f(long j2, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo9697g(Object obj, long j2, double d);
}
