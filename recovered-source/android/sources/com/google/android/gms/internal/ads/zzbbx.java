package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class zzbbx implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f7544s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbbz f7545t;

    public zzbbx(zzbbz zzbbzVar, int i2) {
        this.f7544s = i2;
        this.f7545t = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayt zzaytVarM6773a;
        int i2 = this.f7544s;
        zzbbz zzbbzVar = this.f7545t;
        if (i2 > 0) {
            try {
                Thread.sleep(i2 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzbbzVar.f7547a;
            zzaytVarM6773a = zzfxx.m6773a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzaytVarM6773a = null;
        }
        zzbbz zzbbzVar2 = this.f7545t;
        zzbbzVar2.f7554h = zzaytVarM6773a;
        int i3 = this.f7544s;
        if (i3 < 4) {
            if (zzaytVarM6773a != null && zzaytVarM6773a.m4608d0() && !zzaytVarM6773a.m4629y0().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaytVarM6773a.m4565C0() && zzaytVarM6773a.m4567D0().m4666D() && zzaytVarM6773a.m4567D0().m4667E() != -2) {
                return;
            }
            int i4 = i3 + 1;
            if (zzbbzVar2.f7558l) {
                Future<?> futureSubmit = zzbbzVar2.f7548b.submit(new zzbbx(zzbbzVar2, i4));
                if (i4 == 0) {
                    zzbbzVar2.f7555i = futureSubmit;
                }
            }
        }
    }
}
