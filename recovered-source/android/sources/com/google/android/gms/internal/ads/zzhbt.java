package com.google.android.gms.internal.ads;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class zzhbt extends zzhbh {

    /* JADX INFO: renamed from: H */
    public zzhbr f18505H;

    @Override // com.google.android.gms.internal.ads.zzhay
    /* JADX INFO: renamed from: j */
    public final void mo7322j() {
        zzhbr zzhbrVar = this.f18505H;
        if (zzhbrVar != null) {
            zzhbrVar.m7382g();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: q */
    public final void mo7344q(int i2) {
        this.f18490D = null;
        if (i2 == 1) {
            this.f18505H = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: v */
    public final void mo7349v(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    /* JADX INFO: renamed from: w */
    public final void mo7350w() {
        zzhbr zzhbrVar = this.f18505H;
        if (zzhbrVar != null) {
            try {
                zzhbrVar.f18503u.execute(zzhbrVar);
            } catch (RejectedExecutionException e) {
                zzhbrVar.f18504v.m7321d(e);
            }
        }
    }
}
