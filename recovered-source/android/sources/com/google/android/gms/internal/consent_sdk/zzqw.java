package com.google.android.gms.internal.consent_sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzqw implements Map.Entry {

    /* JADX INFO: renamed from: s */
    public final Map.Entry f21760s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f21760s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzqz) this.f21760s.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzrq)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        zzqz zzqzVar = (zzqz) this.f21760s.getValue();
        zzrq zzrqVar = zzqzVar.f21762a;
        zzqzVar.f21763b = null;
        zzqzVar.f21762a = (zzrq) obj;
        return zzrqVar;
    }
}
