package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbq extends zzhbh {

    /* JADX INFO: renamed from: H */
    public List f18500H;

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: q */
    public final void mo7344q(int i2) {
        this.f18490D = null;
        this.f18500H = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: v */
    public final void mo7349v(int i2, Object obj) {
        List list = this.f18500H;
        if (list != null) {
            list.set(i2, new zzhbp(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: w */
    public final void mo7350w() {
        List list = this.f18500H;
        if (list != null) {
            m7320c(mo7353x(list));
        }
    }

    /* JADX INFO: renamed from: x */
    public abstract List mo7353x(List list);
}
