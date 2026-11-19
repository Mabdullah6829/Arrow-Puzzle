package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgca extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0315d f16920s;

    /* JADX INFO: renamed from: t */
    public long f16921t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16922u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16923v;

    /* JADX INFO: renamed from: w */
    public int f16924w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgca(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16923v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16922u = obj;
        this.f16924w |= Integer.MIN_VALUE;
        return zzgcp.m6872f(this.f16923v, this);
    }
}
