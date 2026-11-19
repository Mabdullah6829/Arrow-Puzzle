package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzgtk extends zzgth implements Serializable {

    /* JADX INFO: renamed from: s */
    public final Pattern f18174s;

    public zzgtk(Pattern pattern) {
        pattern.getClass();
        this.f18174s = pattern;
    }

    @Override // com.google.android.gms.internal.ads.zzgth
    /* JADX INFO: renamed from: a */
    public final zzgtg mo7125a(CharSequence charSequence) {
        return new zzgtj(this.f18174s.matcher(charSequence));
    }

    public final String toString() {
        return this.f18174s.toString();
    }
}
