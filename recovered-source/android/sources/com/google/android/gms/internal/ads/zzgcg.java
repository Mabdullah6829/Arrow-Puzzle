package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcg extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public long f16943s;

    /* JADX INFO: renamed from: t */
    public C0315d f16944t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16945u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16946v;

    /* JADX INFO: renamed from: w */
    public int f16947w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcg(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16946v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16945u = obj;
        this.f16947w |= Integer.MIN_VALUE;
        return zzgcp.m6876j(this.f16946v, this);
    }
}
