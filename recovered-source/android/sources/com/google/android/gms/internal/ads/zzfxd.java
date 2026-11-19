package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfxd extends zzfxe {

    /* JADX INFO: renamed from: c */
    public final HashSet f16746c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f16747d;

    /* JADX INFO: renamed from: e */
    public final long f16748e;

    public zzfxd(zzfww zzfwwVar, HashSet hashSet, JSONObject jSONObject, long j2) {
        super(zzfwwVar);
        this.f16746c = new HashSet(hashSet);
        this.f16747d = jSONObject;
        this.f16748e = j2;
    }
}
