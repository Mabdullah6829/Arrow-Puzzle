package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewn implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Integer f15049a;

    public zzewn(Integer num) {
        this.f15049a = num;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Integer num = this.f15049a;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
