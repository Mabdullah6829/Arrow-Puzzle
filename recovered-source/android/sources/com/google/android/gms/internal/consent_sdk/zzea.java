package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzea extends zzdw {

    /* JADX INFO: renamed from: u */
    public final transient Object f21652u;

    public zzea(Object obj) {
        this.f21652u = obj;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: a */
    public final void mo9132a(Object[] objArr) {
        objArr[0] = this.f21652u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f21652u.equals(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds
    /* JADX INFO: renamed from: g */
    public final zzeb iterator() {
        return new zzdx(this.f21652u);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f21652u.hashCode();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdw, com.google.android.gms.internal.consent_sdk.zzds, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzdx(this.f21652u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0271e0.m399g("[", this.f21652u.toString(), "]");
    }
}
