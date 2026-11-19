package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhj implements zzhr {

    /* JADX INFO: renamed from: a */
    public final boolean f18827a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f18828b = new ArrayList(1);

    /* JADX INFO: renamed from: c */
    public int f18829c;

    /* JADX INFO: renamed from: d */
    public zzhv f18830d;

    public zzhj(boolean z) {
        this.f18827a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    /* JADX INFO: renamed from: a */
    public final void mo5493a(zzip zzipVar) {
        zzipVar.getClass();
        ArrayList arrayList = this.f18828b;
        if (arrayList.contains(zzipVar)) {
            return;
        }
        arrayList.add(zzipVar);
        this.f18829c++;
    }

    /* JADX INFO: renamed from: f */
    public final void m7468f(zzhv zzhvVar) {
        for (int i2 = 0; i2 < this.f18829c; i2++) {
            ((zzip) this.f18828b.get(i2)).getClass();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7469h(zzhv zzhvVar) {
        this.f18830d = zzhvVar;
        for (int i2 = 0; i2 < this.f18829c; i2++) {
            ((zzip) this.f18828b.get(i2)).mo3938e(this, zzhvVar, this.f18827a);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7470i(int i2) {
        zzhv zzhvVar = this.f18830d;
        String str = zzfm.f16091a;
        for (int i3 = 0; i3 < this.f18829c; i3++) {
            ((zzip) this.f18828b.get(i3)).mo3940g(zzhvVar, this.f18827a, i2);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7471k() {
        zzhv zzhvVar = this.f18830d;
        String str = zzfm.f16091a;
        for (int i2 = 0; i2 < this.f18829c; i2++) {
            ((zzip) this.f18828b.get(i2)).mo3941k(zzhvVar, this.f18827a);
        }
        this.f18830d = null;
    }
}
