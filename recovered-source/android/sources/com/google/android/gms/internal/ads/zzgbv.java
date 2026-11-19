package com.google.android.gms.internal.ads;

import java.util.Collections;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbv extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public /* synthetic */ Object f16905s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f16906t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbv(String str, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f16906t = str;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        zzgbv zzgbvVar = new zzgbv(this.f16906t, interfaceC6348c);
        zzgbvVar.f16905s = obj;
        return zzgbvVar;
    }

    @Override // p078p0.InterfaceC6502p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbv) create((zzgbi) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        AbstractC0243G.m377o(obj);
        zzgbg zzgbgVar = (zzgbg) ((zzgbi) this.f16905s).m8347w();
        AbstractC6452k.m12180d(Collections.unmodifiableMap(((zzgbi) zzgbgVar.f19780t).m6867E()), "getQueryIdToAdQualityDataMapMap(...)");
        String key = this.f16906t;
        AbstractC6452k.m12181e(key, "key");
        zzgbgVar.m8326l();
        ((zzgbi) zzgbgVar.f19780t).m6868H().remove(key);
        return (zzgbi) zzgbgVar.m8328o();
    }
}
