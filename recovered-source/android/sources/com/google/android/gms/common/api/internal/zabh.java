package com.google.android.gms.common.api.internal;

/* JADX INFO: loaded from: classes.dex */
final class zabh implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f4287s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zabk f4288t;

    public zabh(zabk zabkVar, int i2) {
        this.f4287s = i2;
        this.f4288t = zabkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4288t.m3497b(this.f4287s);
    }
}
