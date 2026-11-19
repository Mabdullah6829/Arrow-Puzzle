package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzgil extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Activity f17524f;

    /* JADX INFO: renamed from: g */
    public final View f17525g;

    public zzgil(zzaxt zzaxtVar, zzgie zzgieVar, View view, Activity activity, zzgqo zzgqoVar) {
        super("MB4NRPoKbszEsZs50F7mJwzu+33Ub7A+OagrfmieGdBjZs38LvzcQgcwQTLr3PB3", "U7Z7WtTc2NEgeomO+YkeOiOPYLQ8ra19osxSo/kBqLE=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(111));
        this.f17525g = view;
        this.f17524f = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f17525g, this.f17524f);
        objArr.getClass();
        synchronized (zzaxtVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4611g0(jLongValue);
            long jLongValue2 = ((Long) objArr[1]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4612h0(jLongValue2);
            String str = (String) objArr[2];
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4613i0(str);
        }
    }
}
