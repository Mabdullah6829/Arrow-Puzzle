package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class zzcgk {

    /* JADX INFO: renamed from: a */
    public final zzcgd f9963a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f9964b;

    public zzcgk() {
        zzcgd zzcgdVar = new zzcgd();
        this.f9963a = zzcgdVar;
        this.f9964b = new AtomicInteger(0);
        zzcgi zzcgiVar = new zzcgi(this);
        zzcgdVar.addListener(new zzhcd(zzcgdVar, zzcgiVar), zzcfy.f9953h);
    }

    /* JADX INFO: renamed from: a */
    public final void m5399a(zzcgh zzcghVar, zzcgf zzcgfVar) {
        zzcgj zzcgjVar = new zzcgj(this, zzcghVar, zzcgfVar);
        zzhcp zzhcpVar = zzcfy.f9953h;
        zzcgd zzcgdVar = this.f9963a;
        zzcgdVar.addListener(new zzhcd(zzcgdVar, zzcgjVar), zzhcpVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m5400b() {
        this.f9963a.m5398b(new Exception());
    }

    /* JADX INFO: renamed from: c */
    public final void m5401c(String str, Throwable th) {
        this.f9963a.m5398b(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8045C8)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e(str, th);
        }
    }
}
