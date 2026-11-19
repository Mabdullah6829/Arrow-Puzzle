package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzabe {

    /* JADX INFO: renamed from: b */
    public static final Comparator f21906b = new zzaax();

    /* JADX INFO: renamed from: c */
    public static final zzabe f21907c;

    /* JADX INFO: renamed from: a */
    public final zzabc f21908a;

    static {
        List list = Collections.EMPTY_LIST;
        f21907c = new zzabe(new zzabc());
    }

    public zzabe(zzabc zzabcVar) {
        this.f21908a = zzabcVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzabe) && ((zzabe) obj).f21908a.equals(this.f21908a);
    }

    public final int hashCode() {
        return ~this.f21908a.hashCode();
    }

    public final String toString() {
        return this.f21908a.toString();
    }
}
