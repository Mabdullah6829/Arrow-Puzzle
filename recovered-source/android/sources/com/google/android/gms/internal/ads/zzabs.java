package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabs implements zzabm {

    /* JADX INFO: renamed from: a */
    public int f4858a;

    /* JADX INFO: renamed from: b */
    public int f4859b;

    /* JADX INFO: renamed from: c */
    public int f4860c = 0;

    /* JADX INFO: renamed from: d */
    public zzabk[] f4861d = new zzabk[100];

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: a */
    public final synchronized void mo3928a(zzabl zzablVar) {
        while (zzablVar != null) {
            zzabk[] zzabkVarArr = this.f4861d;
            int i2 = this.f4860c;
            this.f4860c = i2 + 1;
            zzabkVarArr[i2] = zzablVar.mo3927d();
            this.f4859b--;
            zzablVar = zzablVar.mo3926a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3929b(zzabk zzabkVar) {
        zzabk[] zzabkVarArr = this.f4861d;
        int i2 = this.f4860c;
        this.f4860c = i2 + 1;
        zzabkVarArr[i2] = zzabkVar;
        this.f4859b--;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3935c(int i2) {
        int i3 = this.f4858a;
        this.f4858a = i2;
        if (i2 < i3) {
            mo3930d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    /* JADX INFO: renamed from: d */
    public final synchronized void mo3930d() {
        int i2 = this.f4858a;
        String str = zzfm.f16091a;
        int iMax = Math.max(0, ((i2 + SupportMenu.USER_MASK) / 65536) - this.f4859b);
        int i3 = this.f4860c;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f4861d, iMax, i3, (Object) null);
        this.f4860c = iMax;
    }

    @Override // com.google.android.gms.internal.ads.zzabm
    public final synchronized zzabk zza() {
        zzabk zzabkVar;
        try {
            int i2 = this.f4859b + 1;
            this.f4859b = i2;
            int i3 = this.f4860c;
            if (i3 > 0) {
                zzabk[] zzabkVarArr = this.f4861d;
                int i4 = i3 - 1;
                this.f4860c = i4;
                zzabkVar = zzabkVarArr[i4];
                if (zzabkVar == null) {
                    throw null;
                }
                zzabkVarArr[i4] = null;
            } else {
                zzabkVar = new zzabk(new byte[65536]);
                zzabk[] zzabkVarArr2 = this.f4861d;
                int length = zzabkVarArr2.length;
                if (i2 > length) {
                    this.f4861d = (zzabk[]) Arrays.copyOf(zzabkVarArr2, length + length);
                    return zzabkVar;
                }
            }
            return zzabkVar;
        } catch (Throwable th) {
            throw th;
        }
    }
}
