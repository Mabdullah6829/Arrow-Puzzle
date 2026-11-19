package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfuv {

    /* JADX INFO: renamed from: a */
    public final zzfvh f16597a;

    /* JADX INFO: renamed from: b */
    public final zzfvh f16598b;

    /* JADX INFO: renamed from: c */
    public final boolean f16599c;

    /* JADX INFO: renamed from: d */
    public final zzfuz f16600d;

    /* JADX INFO: renamed from: e */
    public final zzfvc f16601e;

    public zzfuv(zzfuz zzfuzVar, zzfvc zzfvcVar, zzfvh zzfvhVar, zzfvh zzfvhVar2, boolean z) {
        this.f16600d = zzfuzVar;
        this.f16601e = zzfvcVar;
        this.f16597a = zzfvhVar;
        this.f16598b = zzfvhVar2;
        this.f16599c = z;
    }

    /* JADX INFO: renamed from: a */
    public static zzfuv m6724a(zzfuz zzfuzVar, zzfvc zzfvcVar, zzfvh zzfvhVar, zzfvh zzfvhVar2, boolean z) {
        if (zzfvhVar == zzfvh.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        zzfuz zzfuzVar2 = zzfuz.DEFINED_BY_JAVASCRIPT;
        zzfvh zzfvhVar3 = zzfvh.NATIVE;
        if (zzfuzVar == zzfuzVar2 && zzfvhVar == zzfvhVar3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfvcVar == zzfvc.DEFINED_BY_JAVASCRIPT && zzfvhVar == zzfvhVar3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfuv(zzfuzVar, zzfvcVar, zzfvhVar, zzfvhVar2, z);
    }
}
