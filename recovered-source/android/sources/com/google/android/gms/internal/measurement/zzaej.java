package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzaej implements Map.Entry {

    /* JADX INFO: renamed from: s */
    public final Map.Entry f22053s;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22053s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzael zzaelVar = (zzael) this.f22053s.getValue();
        if (zzaelVar == null) {
            return null;
        }
        zzaelVar.m9600c(null);
        return zzaelVar.f22055a;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzafc)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        zzael zzaelVar = (zzael) this.f22053s.getValue();
        zzafc zzafcVar = zzaelVar.f22055a;
        zzaelVar.f22056b = null;
        zzaelVar.f22055a = (zzafc) obj;
        return zzafcVar;
    }
}
