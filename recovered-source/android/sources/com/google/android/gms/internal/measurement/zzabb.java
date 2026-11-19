package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzabb extends AbstractSet {

    /* JADX INFO: renamed from: s */
    public final int f21893s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzabc f21894t;

    public zzabb(zzabc zzabcVar, int i2) {
        this.f21894t = zzabcVar;
        this.f21893s = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m9320a() {
        int i2 = this.f21893s;
        if (i2 == -1) {
            return 0;
        }
        return this.f21894t.f21897t[i2];
    }

    /* JADX INFO: renamed from: b */
    public final int m9321b() {
        return this.f21894t.f21897t[this.f21893s + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.f21894t.f21896s, m9320a(), m9321b(), obj, this.f21893s == -1 ? zzabc.f21895x : zzabe.f21906b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzaba(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return m9321b() - m9320a();
    }
}
