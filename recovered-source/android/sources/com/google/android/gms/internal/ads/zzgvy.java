package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzgvy extends zzgvk {

    /* JADX INFO: renamed from: s */
    public final Object f18275s;

    /* JADX INFO: renamed from: t */
    public int f18276t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgwa f18277u;

    public zzgvy(zzgwa zzgwaVar, int i2) {
        Objects.requireNonNull(zzgwaVar);
        this.f18277u = zzgwaVar;
        this.f18275s = zzgwaVar.m7180b()[i2];
        this.f18276t = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m7177a() {
        int i2 = this.f18276t;
        Object obj = this.f18275s;
        zzgwa zzgwaVar = this.f18277u;
        if (i2 != -1 && i2 < zzgwaVar.size()) {
            if (Objects.equals(obj, zzgwaVar.m7180b()[this.f18276t])) {
                return;
            }
        }
        this.f18276t = zzgwaVar.m7187i(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18275s;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        zzgwa zzgwaVar = this.f18277u;
        Map mapM7183e = zzgwaVar.m7183e();
        if (mapM7183e != null) {
            return mapM7183e.get(this.f18275s);
        }
        m7177a();
        int i2 = this.f18276t;
        if (i2 == -1) {
            return null;
        }
        return zzgwaVar.m7181c()[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzgvk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        zzgwa zzgwaVar = this.f18277u;
        Map mapM7183e = zzgwaVar.m7183e();
        Object obj2 = this.f18275s;
        if (mapM7183e != null) {
            return mapM7183e.put(obj2, obj);
        }
        m7177a();
        int i2 = this.f18276t;
        if (i2 == -1) {
            zzgwaVar.put(obj2, obj);
            return null;
        }
        Object obj3 = zzgwaVar.m7181c()[i2];
        zzgwaVar.m7181c()[this.f18276t] = obj;
        return obj3;
    }
}
