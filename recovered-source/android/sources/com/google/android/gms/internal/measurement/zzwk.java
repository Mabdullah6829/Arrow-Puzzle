package com.google.android.gms.internal.measurement;

import androidx.collection.SimpleArrayMap;
import p001B.AbstractC0076b;

/* JADX INFO: loaded from: classes2.dex */
final class zzwk extends zzwl {

    /* JADX INFO: renamed from: e */
    public static final zzwl f23028e;

    /* JADX INFO: renamed from: f */
    public static final zzwl f23029f;

    static {
        zzwl zzwlVarM10694b = new zzwk(null, new SimpleArrayMap(0)).m10694b();
        f23028e = zzwlVarM10694b;
        zzwk zzwkVar = new zzwk(zzwlVarM10694b, new SimpleArrayMap());
        boolean z = !zzwkVar.f23033c;
        Boolean bool = Boolean.TRUE;
        AbstractC0076b.m139n(z, "Can't mutate after handing to trace");
        zzwj zzwjVar = zzwl.f23030d;
        AbstractC0076b.m139n(!zzwkVar.m10695c(zzwjVar), "Key already present");
        zzwkVar.f23032b.put(zzwjVar, bool);
        f23029f = zzwkVar.m10694b();
    }
}
