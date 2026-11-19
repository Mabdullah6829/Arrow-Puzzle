package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbu extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public Object f16900s;

    /* JADX INFO: renamed from: t */
    public C0315d f16901t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16902u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16903v;

    /* JADX INFO: renamed from: w */
    public int f16904w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbu(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16903v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16902u = obj;
        this.f16904w |= Integer.MIN_VALUE;
        return this.f16903v.m6880k(null, this);
    }
}
