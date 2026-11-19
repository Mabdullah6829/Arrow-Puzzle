package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgcb extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public Object f16925s;

    /* JADX INFO: renamed from: t */
    public C0315d f16926t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16927u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16928v;

    /* JADX INFO: renamed from: w */
    public int f16929w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcb(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16928v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16927u = obj;
        this.f16929w |= Integer.MIN_VALUE;
        return this.f16928v.m6879c(this);
    }
}
