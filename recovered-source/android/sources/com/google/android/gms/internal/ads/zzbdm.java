package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbdm implements Callable {

    /* JADX INFO: renamed from: a */
    public final zzbbz f7654a;

    /* JADX INFO: renamed from: b */
    public final String f7655b;

    /* JADX INFO: renamed from: c */
    public final String f7656c;

    /* JADX INFO: renamed from: d */
    public final zzaxt f7657d;

    /* JADX INFO: renamed from: e */
    public Method f7658e;

    /* JADX INFO: renamed from: f */
    public final int f7659f;

    /* JADX INFO: renamed from: g */
    public final int f7660g;

    public zzbdm(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i2, int i3) {
        this.f7654a = zzbbzVar;
        this.f7655b = str;
        this.f7656c = str2;
        this.f7657d = zzaxtVar;
        this.f7659f = i2;
        this.f7660g = i3;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo4750a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2;
        try {
            long jNanoTime = System.nanoTime();
            zzbbz zzbbzVar = this.f7654a;
            Method methodM4731d = zzbbzVar.m4731d(this.f7655b, this.f7656c);
            this.f7658e = methodM4731d;
            if (methodM4731d == null) {
                return null;
            }
            mo4750a();
            zzbaq zzbaqVar = zzbbzVar.f7557k;
            if (zzbaqVar == null || (i2 = this.f7659f) == Integer.MIN_VALUE) {
                return null;
            }
            zzbaqVar.m4691a(this.f7660g, i2, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
