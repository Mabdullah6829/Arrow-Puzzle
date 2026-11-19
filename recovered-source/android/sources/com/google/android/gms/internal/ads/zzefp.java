package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
final class zzefp implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzefs f13806a;

    public zzefp(zzefs zzefsVar) {
        this.f13806a = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        zzfky zzfkyVar = (zzfky) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue()) {
            zzefs zzefsVar = this.f13806a;
            zzfkq zzfkqVar = zzfkyVar.f16006b.f16002b;
            zzejl zzejlVar = zzefsVar.f13814e;
            int i2 = zzfkqVar.f15977f;
            synchronized (zzejlVar.f14031g) {
                zzejlVar.f14026b = i2;
            }
            zzejl zzejlVar2 = zzefsVar.f13814e;
            long j2 = zzfkqVar.f15978g;
            synchronized (zzejlVar2.f14032h) {
                zzejlVar2.f14027c = j2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8512e7)).booleanValue()) {
            Matcher matcher = zzefs.f13809h.matcher(th.getMessage());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                zzefs zzefsVar = this.f13806a;
                int i2 = Integer.parseInt(strGroup);
                zzejl zzejlVar = zzefsVar.f13814e;
                synchronized (zzejlVar.f14031g) {
                    zzejlVar.f14026b = i2;
                }
            }
        }
    }
}
