package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzbch implements AppOpsManager$OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbci f7602a;

    public zzbch(zzbci zzbciVar) {
        this.f7602a = zzbciVar;
    }

    public final void onOpActiveChanged(String str, int i2, String str2, boolean z) {
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbci zzbciVar = this.f7602a;
            zzbciVar.f7604a = jCurrentTimeMillis;
            zzbciVar.f7607d = true;
            return;
        }
        zzbci zzbciVar2 = this.f7602a;
        long j2 = zzbciVar2.f7605b;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (j2 > 0) {
            long j3 = zzbciVar2.f7605b;
            if (jCurrentTimeMillis2 >= j3) {
                zzbciVar2.f7606c = jCurrentTimeMillis2 - j3;
            }
        }
        zzbciVar2.f7607d = false;
    }
}
