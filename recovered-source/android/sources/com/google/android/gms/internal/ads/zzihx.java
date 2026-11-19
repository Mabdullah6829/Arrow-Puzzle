package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes2.dex */
public final class zzihx extends zzihu implements Set {

    /* JADX INFO: renamed from: t */
    public final Set f19931t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzihx(Set delegate) {
        super(delegate);
        AbstractC6452k.m12181e(delegate, "delegate");
        this.f19931t = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f19927s.contains((Map.Entry) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zzihw(this.f19931t.iterator());
    }
}
