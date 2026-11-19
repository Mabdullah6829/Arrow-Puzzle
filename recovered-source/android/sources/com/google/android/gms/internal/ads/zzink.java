package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzink {

    /* JADX INFO: renamed from: a */
    public final List f20013a;

    /* JADX INFO: renamed from: b */
    public final List f20014b;

    public zzink(int i2, int i3) {
        this.f20013a = i2 == 0 ? Collections.EMPTY_LIST : new ArrayList(i2);
        this.f20014b = i3 == 0 ? Collections.EMPTY_LIST : new ArrayList(i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m8556a(zzini zziniVar) {
        this.f20013a.add(zziniVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m8557b(zzini zziniVar) {
        this.f20014b.add(zziniVar);
    }

    /* JADX INFO: renamed from: c */
    public final zzinl m8558c() {
        return new zzinl(this.f20013a, this.f20014b);
    }
}
