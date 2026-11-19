package com.google.android.gms.internal.ads;

import p014I0.InterfaceC0312a;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgbx extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public InterfaceC0312a f16912s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f16913t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzgcp f16914u;

    /* JADX INFO: renamed from: v */
    public int f16915v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbx(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16914u = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16913t = obj;
        this.f16915v |= Integer.MIN_VALUE;
        return this.f16914u.m6877a(this);
    }
}
