package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zzawd implements Supplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7170a;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ zzawd f7169c = new zzawd(1);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ zzawd f7168b = new zzawd(0);

    public /* synthetic */ zzawd(int i2) {
        this.f7170a = i2;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f7170a != 0 ? zzawt.m4466a(null) : new zzawg();
    }
}
