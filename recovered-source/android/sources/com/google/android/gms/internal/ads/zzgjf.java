package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.constraintlayout.widget.C1137R;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjf extends zzgji {

    /* JADX INFO: renamed from: f */
    public final zzgen f17588f;

    /* JADX INFO: renamed from: g */
    public final Context f17589g;

    /* JADX INFO: renamed from: h */
    public final Map f17590h;

    public zzgjf(zzaxt zzaxtVar, zzgie zzgieVar, zzgen zzgenVar, Context context, Map map, zzgqo zzgqoVar) {
        super("3At8eFbAjAqsz9p03G/poStdLmldcsHDf7hwtHq+b9glp6N8klzSrT8HZ4GJjVN5", "mjdtNA0QQNNvx7gc0+BIhw0NZpaH3AMuijVtb9zt66I=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(C1137R.styleable.ConstraintSet_transitionEasing));
        this.f17588f = zzgenVar;
        this.f17589g = context;
        this.f17590h = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        zzgen zzgenVar = this.f17588f;
        Integer numValueOf = Integer.valueOf(zzgenVar.ordinal());
        Context context = this.f17589g;
        Object obj = this.f17590h.get("up");
        Boolean bool = Boolean.TRUE;
        if (obj == null) {
            obj = bool;
        }
        Object[] objArr = (Object[]) method.invoke("", numValueOf, context, obj);
        objArr.getClass();
        synchronized (zzaxtVar) {
            try {
                if (zzgenVar == zzgen.f17093s) {
                    Object obj2 = objArr[0];
                    Object obj3 = -1L;
                    if (obj2 == null) {
                        obj2 = obj3;
                    }
                    long jLongValue = ((Long) obj2).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4568E(jLongValue);
                    Object obj4 = objArr[1];
                    long jLongValue2 = ((Long) (obj4 != null ? obj4 : -1L)).longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4569F(jLongValue2);
                }
                long jLongValue3 = ((Long) objArr[2]).longValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4584N0(jLongValue3);
                long jLongValue4 = ((Long) objArr[3]).longValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4609e0(jLongValue4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
