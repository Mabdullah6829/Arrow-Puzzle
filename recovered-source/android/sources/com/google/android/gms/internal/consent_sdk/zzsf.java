package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzsf implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f21806s;

    /* JADX INFO: renamed from: t */
    public boolean f21807t;

    /* JADX INFO: renamed from: u */
    public Iterator f21808u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzsi f21809v;

    public /* synthetic */ zzsf(zzsi zzsiVar) {
        Objects.requireNonNull(zzsiVar);
        this.f21809v = zzsiVar;
        this.f21806s = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m9269a() {
        if (this.f21808u == null) {
            this.f21808u = this.f21809v.f21814u.entrySet().iterator();
        }
        return this.f21808u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f21806s + 1;
        zzsi zzsiVar = this.f21809v;
        if (i2 >= zzsiVar.f21813t) {
            return !zzsiVar.f21814u.isEmpty() && m9269a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f21807t = true;
        int i2 = this.f21806s + 1;
        this.f21806s = i2;
        zzsi zzsiVar = this.f21809v;
        return i2 < zzsiVar.f21813t ? (zzse) zzsiVar.f21812s[i2] : (Map.Entry) m9269a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f21807t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f21807t = false;
        int i2 = zzsi.f21811y;
        zzsi zzsiVar = this.f21809v;
        zzsiVar.m9276h();
        int i3 = this.f21806s;
        if (i3 >= zzsiVar.f21813t) {
            m9269a().remove();
        } else {
            this.f21806s = i3 - 1;
            zzsiVar.m9274f(i3);
        }
    }
}
