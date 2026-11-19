package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzqx implements Iterator {

    /* JADX INFO: renamed from: s */
    public final Iterator f21761s;

    public zzqx(Iterator it) {
        this.f21761s = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21761s.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f21761s.next();
        return entry.getValue() instanceof zzqz ? new zzqw(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21761s.remove();
    }
}
