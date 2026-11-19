package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzigv implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f19885s;

    /* JADX INFO: renamed from: t */
    public boolean f19886t;

    /* JADX INFO: renamed from: u */
    public Iterator f19887u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzigx f19888v;

    public /* synthetic */ zzigv(zzigx zzigxVar) {
        Objects.requireNonNull(zzigxVar);
        this.f19888v = zzigxVar;
        this.f19885s = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m8434a() {
        if (this.f19887u == null) {
            this.f19887u = this.f19888v.f19892u.entrySet().iterator();
        }
        return this.f19887u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f19885s + 1;
        zzigx zzigxVar = this.f19888v;
        if (i2 >= zzigxVar.f19891t) {
            return !zzigxVar.f19892u.isEmpty() && m8434a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f19886t = true;
        int i2 = this.f19885s + 1;
        this.f19885s = i2;
        zzigx zzigxVar = this.f19888v;
        return i2 < zzigxVar.f19891t ? (zzigu) zzigxVar.f19890s[i2] : (Map.Entry) m8434a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f19886t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f19886t = false;
        zzigx zzigxVar = this.f19888v;
        zzigxVar.m8440g();
        int i2 = this.f19885s;
        if (i2 >= zzigxVar.f19891t) {
            m8434a().remove();
        } else {
            this.f19885s = i2 - 1;
            zzigxVar.m8438e(i2);
        }
    }
}
