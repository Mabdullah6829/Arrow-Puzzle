package com.google.android.gms.internal.ads;

import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcm extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public Object f16963s;

    /* JADX INFO: renamed from: t */
    public long f16964t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16965u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16966v;

    /* JADX INFO: renamed from: w */
    public int f16967w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcm(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16966v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16965u = obj;
        this.f16967w |= Integer.MIN_VALUE;
        return zzgcp.m6875i(this.f16966v, this);
    }
}
