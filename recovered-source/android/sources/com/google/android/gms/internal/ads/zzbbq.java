package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbq extends zzazo {

    /* JADX INFO: renamed from: a */
    public final Long f7526a;

    /* JADX INFO: renamed from: b */
    public final Boolean f7527b;

    /* JADX INFO: renamed from: c */
    public final Boolean f7528c;

    public zzbbq() {
    }

    @Override // com.google.android.gms.internal.ads.zzazo
    /* JADX INFO: renamed from: a */
    public final HashMap mo4676a() {
        HashMap map = new HashMap();
        map.put(0, this.f7526a);
        map.put(1, this.f7527b);
        map.put(2, this.f7528c);
        return map;
    }

    public zzbbq(String str) {
        HashMap mapM4675b = zzazo.m4675b(str);
        if (mapM4675b != null) {
            this.f7526a = (Long) mapM4675b.get(0);
            this.f7527b = (Boolean) mapM4675b.get(1);
            this.f7528c = (Boolean) mapM4675b.get(2);
        }
    }
}
