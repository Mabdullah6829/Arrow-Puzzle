package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgua implements Iterable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ CharSequence f18188s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzgug f18189t;

    public zzgua(zzgug zzgugVar, CharSequence charSequence) {
        this.f18188s = charSequence;
        this.f18189t = zzgugVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        CharSequence charSequence = this.f18188s;
        zzgug zzgugVar = this.f18189t;
        return zzgugVar.f18199c.mo7142a(zzgugVar, charSequence);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzgtl.m7126a(sb, iterator(), ", ");
        sb.append(']');
        return sb.toString();
    }
}
