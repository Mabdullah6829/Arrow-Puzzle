package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import androidx.constraintlayout.widget.C1137R;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgiz extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Map f17569f;

    public zzgiz(zzaxt zzaxtVar, zzgie zzgieVar, Map map, zzgqo zzgqoVar) {
        super("YG+UUJxJEVSGG6jfg3qjLnMxlQFUVyMMjgzEbZMK/+kyZ0C5+m/L80+lYQbH4OQO", "6dR3aiNoBR9E5efHnflEq0hfvoZwKGjGgWyKk1r6EjY=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(C1137R.styleable.ConstraintSet_polarRelativeTo));
        this.f17569f = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Map map = this.f17569f;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
        objArr.getClass();
        synchronized (zzaxtVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4582M0(jLongValue);
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (jLongValue2 >= 0) {
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4615k0(jLongValue2);
            }
            long jLongValue3 = ((Long) objArr[2]).longValue();
            if (jLongValue3 >= 0) {
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4616l0(jLongValue3);
            }
        }
    }
}
