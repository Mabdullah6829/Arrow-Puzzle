package com.google.android.gms.internal.ads;

import p014I0.InterfaceC0312a;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgck extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public InterfaceC0312a f16957s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f16958t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgcp f16959u;

    /* JADX INFO: renamed from: v */
    public int f16960v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgck(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16959u = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16958t = obj;
        this.f16960v |= Integer.MIN_VALUE;
        return zzgcp.m6870d(this.f16959u, this);
    }
}
