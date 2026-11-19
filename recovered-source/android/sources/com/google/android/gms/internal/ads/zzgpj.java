package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpj {

    /* JADX INFO: renamed from: a */
    public final Set f17980a;

    /* JADX INFO: renamed from: b */
    public final zzgqa f17981b;

    public zzgpj(zzgqa zzgqaVar, Set set) {
        this.f17980a = set;
        this.f17981b = zzgqaVar;
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m7047a() {
        HashMap map = new HashMap();
        Iterator it = this.f17980a.iterator();
        while (it.hasNext()) {
            ((zzgpl) it.next()).mo7051b(map);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m7048b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.f17980a.iterator();
        while (it.hasNext()) {
            ((zzgpl) it.next()).mo7052c(map, context, view);
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m7049c() {
        HashMap map = new HashMap();
        Iterator it = this.f17980a.iterator();
        while (it.hasNext()) {
            ((zzgpl) it.next()).mo7050a(map);
        }
        return map;
    }
}
