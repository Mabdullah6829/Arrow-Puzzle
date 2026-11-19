package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzab {

    /* JADX INFO: renamed from: a */
    public zzaa f21888a;

    /* JADX INFO: renamed from: b */
    public zzaa f21889b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f21890c;

    public zzab() {
        this.f21888a = new zzaa("", 0L, null);
        this.f21889b = new zzaa("", 0L, null);
        this.f21890c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        zzab zzabVar = new zzab(this.f21888a.clone());
        ArrayList arrayList = this.f21890c;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zzabVar.f21890c.add(((zzaa) obj).clone());
        }
        return zzabVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f21888a = zzaaVar;
        this.f21889b = zzaaVar.clone();
        this.f21890c = new ArrayList();
    }
}
