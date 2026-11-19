package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzigt extends zzigx {
    public zzigt() {
        super(0);
    }

    @Override // com.google.android.gms.internal.ads.zzigx
    /* JADX INFO: renamed from: a */
    public final void mo8433a() {
        if (!this.f19893v) {
            for (int i2 = 0; i2 < this.f19891t; i2++) {
                ((zzied) ((zzigu) m8435b(i2)).f19882s).getClass();
            }
            Iterator it = m8436c().iterator();
            while (it.hasNext()) {
                ((zzied) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.mo8433a();
    }
}
