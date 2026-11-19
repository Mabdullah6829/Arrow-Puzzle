package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewa implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final ArrayList f15005a;

    public zzewa(ArrayList arrayList) {
        this.f15005a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList arrayList = this.f15005a;
        if (arrayList != null) {
            bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
        }
    }
}
