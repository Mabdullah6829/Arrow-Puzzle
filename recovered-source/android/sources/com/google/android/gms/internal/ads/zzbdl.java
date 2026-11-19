package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdl {

    /* JADX INFO: renamed from: a */
    public final zzbbz f7648a;

    /* JADX INFO: renamed from: b */
    public final String f7649b;

    /* JADX INFO: renamed from: c */
    public final String f7650c;

    /* JADX INFO: renamed from: e */
    public final Class[] f7652e;

    /* JADX INFO: renamed from: d */
    public volatile Method f7651d = null;

    /* JADX INFO: renamed from: f */
    public final CountDownLatch f7653f = new CountDownLatch(1);

    public zzbdl(zzbbz zzbbzVar, String str, String str2, Class... clsArr) {
        this.f7648a = zzbbzVar;
        this.f7649b = str;
        this.f7650c = str2;
        this.f7652e = clsArr;
        zzbbzVar.f7548b.submit(new zzbdk(this));
    }
}
