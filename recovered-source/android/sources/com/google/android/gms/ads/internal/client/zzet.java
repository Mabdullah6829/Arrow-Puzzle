package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbsc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzet extends zzbsc {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzeu f3160s;

    public /* synthetic */ zzet(zzeu zzeuVar) {
        Objects.requireNonNull(zzeuVar);
        this.f3160s = zzeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    /* JADX INFO: renamed from: i3 */
    public final void mo2942i3(List list) {
        int i2;
        ArrayList arrayList;
        zzeu zzeuVar = this.f3160s;
        synchronized (zzeuVar.f3165d) {
            zzeuVar.f3167f = false;
            zzeuVar.f3168g = true;
            arrayList = new ArrayList(zzeuVar.f3166e);
            zzeuVar.f3166e.clear();
        }
        zzeu.m2943a(list);
        int size = arrayList.size();
        for (i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) arrayList.get(i2)).mo2782a();
        }
    }
}
