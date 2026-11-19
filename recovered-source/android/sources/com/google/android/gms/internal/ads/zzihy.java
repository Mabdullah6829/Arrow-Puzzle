package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p080q0.InterfaceC6520a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzihy implements Map.Entry, InterfaceC6520a {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Map.Entry f19932s;

    public zzihy(Map.Entry delegate) {
        AbstractC6452k.m12181e(delegate, "delegate");
        this.f19932s = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f19932s.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f19932s.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
