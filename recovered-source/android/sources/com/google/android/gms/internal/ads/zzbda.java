package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbda extends zzbdm {
    public zzbda(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2) {
        super(zzbbzVar, "IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", zzaxtVar, i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8193L3);
        bool.getClass();
        String str = (String) this.f7658e.invoke(null, this.f7654a.f7547a, bool);
        zzbbf zzbbfVar = new zzbbf();
        zzbbfVar.f7512a = -1L;
        zzbbfVar.f7513b = -1L;
        HashMap mapM4675b = zzazo.m4675b(str);
        if (mapM4675b != null) {
            zzbbfVar.f7512a = ((Long) mapM4675b.get(0)).longValue();
            zzbbfVar.f7513b = ((Long) mapM4675b.get(1)).longValue();
        }
        zzaxt zzaxtVar = this.f7657d;
        synchronized (zzaxtVar) {
            long j2 = zzbbfVar.f7512a;
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4576J0(j2);
            long j3 = zzbbfVar.f7513b;
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4607c0(j3);
        }
    }
}
