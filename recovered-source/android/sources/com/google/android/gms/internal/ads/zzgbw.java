package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbw extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public long f16907s;

    /* JADX INFO: renamed from: t */
    public C0315d f16908t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16909u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16910v;

    /* JADX INFO: renamed from: w */
    public int f16911w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbw(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16910v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16909u = obj;
        this.f16911w |= Integer.MIN_VALUE;
        return this.f16910v.m6878b(0L, this);
    }
}
