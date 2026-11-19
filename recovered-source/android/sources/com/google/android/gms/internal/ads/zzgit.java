package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class zzgit extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Context f17554f;

    public zzgit(zzaxt zzaxtVar, zzgie zzgieVar, Context context, zzgqo zzgqoVar) {
        super("oMAI9M+rfpAXD2NxGp+nC5qJwKDENlbYG7lXxNGFquSBEXZr9ZbCp8YKXYADPdQS", "GTycQamaBLKET6mxwzojHIa3a0Qk/f4p0jfnV7pjl+o=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(115));
        this.f17554f = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        Object[] objArr = (Object[]) method.invoke("", this.f17554f);
        objArr.getClass();
        synchronized (zzaxtVar) {
            try {
                long jIntValue = ((Integer) objArr[0]).intValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4606b0(jIntValue);
                int i2 = 1;
                long jIntValue2 = ((Integer) objArr[1]).intValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4578K0(jIntValue2);
                long jIntValue3 = ((Integer) objArr[2]).intValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4580L0(jIntValue3);
                long jIntValue4 = ((Integer) objArr[3]).intValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4620p0(jIntValue4);
                Boolean bool = (Boolean) objArr[4];
                if (bool == null) {
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4624t0(3);
                } else {
                    int i3 = true != bool.booleanValue() ? 1 : 2;
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4624t0(i3);
                }
                Boolean bool2 = (Boolean) objArr[5];
                if (bool2 == null) {
                    zzaxtVar.m4530q(3);
                } else {
                    if (true == bool2.booleanValue()) {
                        i2 = 2;
                    }
                    zzaxtVar.m4530q(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
