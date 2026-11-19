package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbcj extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final Activity f7608h;

    /* JADX INFO: renamed from: i */
    public final View f7609i;

    public zzbcj(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, View view, Activity activity) {
        super(zzbbzVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzaxtVar, i2, 62);
        this.f7609i = view;
        this.f7608h = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        View view = this.f7609i;
        if (view == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8779u3);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f7658e.invoke(null, view, this.f7608h, bool);
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4611g0(jLongValue);
                long jLongValue2 = ((Long) objArr[1]).longValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4612h0(jLongValue2);
                if (zBooleanValue) {
                    String str = (String) objArr[2];
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4613i0(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
