package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhu {

    /* JADX INFO: renamed from: a */
    public Uri f19189a;

    /* JADX INFO: renamed from: b */
    public Map f19190b;

    /* JADX INFO: renamed from: c */
    public long f19191c;

    /* JADX INFO: renamed from: d */
    public final long f19192d;

    /* JADX INFO: renamed from: e */
    public int f19193e;

    public /* synthetic */ zzhu(zzhv zzhvVar) {
        this.f19189a = zzhvVar.f19195a;
        this.f19190b = zzhvVar.f19196b;
        this.f19191c = zzhvVar.f19197c;
        this.f19192d = zzhvVar.f19198d;
        this.f19193e = zzhvVar.f19199e;
    }

    /* JADX INFO: renamed from: a */
    public final zzhv m7861a() {
        zzgtr.m7135h(this.f19189a, "The uri must be set.");
        return new zzhv(this.f19189a, this.f19190b, this.f19191c, this.f19192d, this.f19193e);
    }

    public zzhu() {
        this.f19190b = Collections.EMPTY_MAP;
        this.f19192d = -1L;
    }
}
