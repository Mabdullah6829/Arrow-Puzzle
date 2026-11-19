package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzgyx extends zzgur {

    /* JADX INFO: renamed from: u */
    public final Iterator f18380u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Set f18381v;

    public zzgyx(zzgyy zzgyyVar, Set set, Set set2) {
        this.f18381v = set2;
        this.f18380u = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgur
    /* JADX INFO: renamed from: a */
    public final Object mo7153a() {
        Object next;
        do {
            Iterator it = this.f18380u;
            if (!it.hasNext()) {
                this.f18213t = 3;
                return null;
            }
            next = it.next();
        } while (!this.f18381v.contains(next));
        return next;
    }
}
