package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.constraintlayout.widget.C1137R;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgjb extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Context f17576f;

    public zzgjb(zzaxt zzaxtVar, zzgie zzgieVar, Context context, zzgqo zzgqoVar) {
        super("i8dIMUuFazx2QmSkfzNlM975x3JumPrUee1RASXGMNDJH8RWJsPNqbpEpnJFa4Hi", "5davCcWMx5wzne2F0dLFbMr5/cylOtU7FK3CcX7bJPU=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(C1137R.styleable.ConstraintSet_quantizeMotionSteps));
        this.f17576f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f17576f);
        objArr.getClass();
        synchronized (zzaxtVar) {
            long jLongValue = ((Long) objArr[0]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4576J0(jLongValue);
            long jLongValue2 = ((Long) objArr[1]).longValue();
            zzaxtVar.m8326l();
            ((zzayt) zzaxtVar.f19780t).m4607c0(jLongValue2);
        }
    }
}
