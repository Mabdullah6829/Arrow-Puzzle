package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqa implements zzgpl {

    /* JADX INFO: renamed from: a */
    public final ArrayList f18031a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7052c(HashMap map, Context context, View view) {
        ArrayList arrayList = this.f18031a;
        map.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: a */
    public final void mo7050a(HashMap map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    /* JADX INFO: renamed from: b */
    public final void mo7051b(HashMap map) {
    }
}
