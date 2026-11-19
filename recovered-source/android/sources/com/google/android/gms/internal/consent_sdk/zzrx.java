package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzrx {

    /* JADX INFO: renamed from: c */
    public static final zzrx f21791c = new zzrx();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f21793b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final zzrh f21792a = new zzrh();

    private zzrx() {
    }

    /* JADX INFO: renamed from: a */
    public final zzsa m9255a(Class cls) {
        Charset charset = zzqs.f21747a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f21793b;
        zzsa zzruVar = (zzsa) concurrentHashMap.get(cls);
        if (zzruVar == null) {
            zzrh zzrhVar = this.f21792a;
            zzrhVar.getClass();
            zzsr zzsrVar = zzsc.f21802a;
            if (!zzqm.class.isAssignableFrom(cls)) {
                int i2 = zzpc.f21705a;
            }
            zzrn zzrnVarMo9215a = zzrhVar.f21770a.mo9215a(cls);
            if (zzrnVarMo9215a.zzb()) {
                int i3 = zzpc.f21705a;
                zzruVar = new zzru(zzsc.f21802a, zzqd.f21727a, zzrnVarMo9215a.zza());
            } else {
                int i4 = zzpc.f21705a;
                int i5 = zzrw.f21790a;
                int i6 = zzrd.f21764a;
                zzsr zzsrVar2 = zzsc.f21802a;
                zzqc zzqcVar = zzrnVarMo9215a.zzc() + (-1) != 1 ? zzqd.f21727a : null;
                int i7 = zzrm.f21776a;
                zzruVar = zzrt.m9239g(zzrnVarMo9215a, zzsrVar2, zzqcVar);
            }
            zzsa zzsaVar = (zzsa) concurrentHashMap.putIfAbsent(cls, zzruVar);
            if (zzsaVar != null) {
                return zzsaVar;
            }
        }
        return zzruVar;
    }
}
