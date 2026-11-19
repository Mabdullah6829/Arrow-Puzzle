package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgco extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0315d f16970s;

    /* JADX INFO: renamed from: t */
    public long f16971t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16972u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16973v;

    /* JADX INFO: renamed from: w */
    public int f16974w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgco(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16973v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16972u = obj;
        this.f16974w |= Integer.MIN_VALUE;
        return zzgcp.m6873g(this.f16973v, this);
    }
}
