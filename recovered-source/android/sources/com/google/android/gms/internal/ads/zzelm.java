package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzelm implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzfvg f14157s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ View f14158t;

    public /* synthetic */ zzelm(zzfvg zzfvgVar, View view) {
        this.f14157s = zzfvgVar;
        this.f14158t = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvg zzfvgVar = this.f14157s;
        Iterator it = zzfvgVar.f16646d.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            View view = this.f14158t;
            zzfvb zzfvbVar = zzfvb.f16631s;
            if (!zHasNext) {
                zzfvgVar.f16647e.m6733a(view, zzfvbVar);
                return;
            }
            ((zzfuu) it.next()).mo6723c(view, zzfvbVar);
        }
    }
}
