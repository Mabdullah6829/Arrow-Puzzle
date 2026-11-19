package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgxi extends zzgur {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Iterator f18327u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgts f18328v;

    public zzgxi(Iterator it, zzgts zzgtsVar) {
        this.f18327u = it;
        this.f18328v = zzgtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    /* JADX INFO: renamed from: a */
    public final Object mo7153a() {
        Object next;
        do {
            Iterator it = this.f18327u;
            if (!it.hasNext()) {
                this.f18213t = 3;
                return null;
            }
            next = it.next();
        } while (!this.f18328v.mo3897b(next));
        return next;
    }
}
