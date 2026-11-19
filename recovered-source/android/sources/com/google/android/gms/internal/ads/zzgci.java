package com.google.android.gms.internal.ads;

import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgci extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public Object f16950s;

    /* JADX INFO: renamed from: t */
    public long f16951t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16952u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16953v;

    /* JADX INFO: renamed from: w */
    public int f16954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgci(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16953v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16952u = obj;
        this.f16954w |= Integer.MIN_VALUE;
        return zzgcp.m6874h(this.f16953v, this);
    }
}
