package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdj extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final View f7646h;

    public zzbdj(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, View view) {
        super(zzbbzVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", zzaxtVar, i2, 57);
        this.f7646h = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        View view = this.f7646h;
        if (view != null) {
            zzbio zzbioVar = zzbix.f8627l4;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            Boolean bool = (Boolean) zzbaVar.f3098c.m5030a(zzbioVar);
            Boolean bool2 = (Boolean) zzbaVar.f3098c.m5030a(zzbix.f8737rc);
            String str = (String) this.f7658e.invoke(null, view, this.f7654a.f7547a.getResources().getDisplayMetrics(), bool, bool2);
            zzbcd zzbcdVar = new zzbcd();
            HashMap mapM4675b = zzazo.m4675b(str);
            if (mapM4675b != null) {
                zzbcdVar.f7582a = (Long) mapM4675b.get(0);
                zzbcdVar.f7583b = (Long) mapM4675b.get(1);
                zzbcdVar.f7584c = (Long) mapM4675b.get(2);
                zzbcdVar.f7585d = (Long) mapM4675b.get(3);
                zzbcdVar.f7586e = (Long) mapM4675b.get(4);
            }
            zzayr zzayrVarM4554D = zzays.m4554D();
            long jLongValue = zzbcdVar.f7582a.longValue();
            zzayrVarM4554D.m8326l();
            ((zzays) zzayrVarM4554D.f19780t).m4556F(jLongValue);
            long jLongValue2 = zzbcdVar.f7583b.longValue();
            zzayrVarM4554D.m8326l();
            ((zzays) zzayrVarM4554D.f19780t).m4557G(jLongValue2);
            long jLongValue3 = zzbcdVar.f7584c.longValue();
            zzayrVarM4554D.m8326l();
            ((zzays) zzayrVarM4554D.f19780t).m4558H(jLongValue3);
            if (bool2.booleanValue()) {
                long jLongValue4 = zzbcdVar.f7586e.longValue();
                zzayrVarM4554D.m8326l();
                ((zzays) zzayrVarM4554D.f19780t).m4555E(jLongValue4);
            }
            if (bool.booleanValue()) {
                long jLongValue5 = zzbcdVar.f7585d.longValue();
                zzayrVarM4554D.m8326l();
                ((zzays) zzayrVarM4554D.f19780t).m4559I(jLongValue5);
            }
            zzays zzaysVar = (zzays) zzayrVarM4554D.m8328o();
            zzaxt zzaxtVar = this.f7657d;
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4604Z(zzaysVar);
        }
    }
}
