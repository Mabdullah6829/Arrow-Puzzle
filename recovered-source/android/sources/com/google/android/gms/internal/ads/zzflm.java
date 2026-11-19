package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzflm {
    /* JADX INFO: renamed from: a */
    public static com.google.android.gms.ads.internal.client.zzr m6490a(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfko zzfkoVar = (zzfko) it.next();
            if (zzfkoVar.f15970c) {
                arrayList.add(AdSize.f2953p);
            } else {
                arrayList.add(new AdSize(zzfkoVar.f15968a, zzfkoVar.f15969b));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzr(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }
}
