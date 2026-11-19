package com.google.android.gms.internal.ads;

import p014I0.C0315d;
import p066i0.AbstractC6373c;

/* JADX INFO: loaded from: classes2.dex */
final class zzgce extends AbstractC6373c {

    /* JADX INFO: renamed from: s */
    public C0315d f16935s;

    /* JADX INFO: renamed from: t */
    public long f16936t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ Object f16937u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzgcp f16938v;

    /* JADX INFO: renamed from: w */
    public int f16939w;

    /* JADX INFO: renamed from: x */
    public String f16940x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgce(zzgcp zzgcpVar, AbstractC6373c abstractC6373c) {
        super(abstractC6373c);
        this.f16938v = zzgcpVar;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        this.f16937u = obj;
        this.f16939w |= Integer.MIN_VALUE;
        return zzgcp.m6871e(this.f16938v, null, this);
    }
}
