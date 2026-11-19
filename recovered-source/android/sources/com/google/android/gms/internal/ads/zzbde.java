package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbde extends zzbdm {

    /* JADX INFO: renamed from: h */
    public final StackTraceElement[] f7641h;

    public zzbde(zzbbz zzbbzVar, zzaxt zzaxtVar, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzbbzVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzaxtVar, i2, 45);
        this.f7641h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    /* JADX INFO: renamed from: a */
    public final void mo4750a() {
        StackTraceElement[] stackTraceElementArr = this.f7641h;
        if (stackTraceElementArr != null) {
            zzbbq zzbbqVar = new zzbbq((String) this.f7658e.invoke(null, stackTraceElementArr));
            zzaxt zzaxtVar = this.f7657d;
            synchronized (zzaxtVar) {
                try {
                    long jLongValue = zzbbqVar.f7526a.longValue();
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4589Q(jLongValue);
                    if (zzbbqVar.f7527b.booleanValue()) {
                        int i2 = true != zzbbqVar.f7528c.booleanValue() ? 2 : 1;
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4625u0(i2);
                    } else {
                        zzaxtVar.m8326l();
                        ((zzayt) zzaxtVar.f19780t).m4625u0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
