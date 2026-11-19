package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzifd implements Map.Entry {

    /* JADX INFO: renamed from: s */
    public final Map.Entry f19796s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19796s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zziff zziffVar = (zziff) this.f19796s.getValue();
        if (zziffVar == null) {
            return null;
        }
        return zziffVar.m8357a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzifz)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.f19796s;
        zzifz zzifzVar = ((zziff) entry.getValue()).f19801d;
        entry.setValue(new zziff((zzifz) obj));
        return zzifzVar;
    }
}
