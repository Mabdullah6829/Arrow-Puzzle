package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
final class zzgxk implements Iterator {

    /* JADX INFO: renamed from: s */
    public static final zzgxk f18331s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ zzgxk[] f18332t;

    static {
        zzgxk zzgxkVar = new zzgxk("INSTANCE", 0);
        f18331s = zzgxkVar;
        f18332t = new zzgxk[]{zzgxkVar};
    }

    public static zzgxk[] values() {
        return (zzgxk[]) f18332t.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgtr.m7134g("no calls to next() since the last call to remove()", false);
    }
}
