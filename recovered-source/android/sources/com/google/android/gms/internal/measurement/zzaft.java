package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzaft implements Iterator {

    /* JADX INFO: renamed from: s */
    public int f22108s;

    /* JADX INFO: renamed from: t */
    public boolean f22109t;

    /* JADX INFO: renamed from: u */
    public Iterator f22110u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzafv f22111v;

    public /* synthetic */ zzaft(zzafv zzafvVar) {
        Objects.requireNonNull(zzafvVar);
        this.f22111v = zzafvVar;
        this.f22108s = -1;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m9665a() {
        if (this.f22110u == null) {
            this.f22110u = this.f22111v.f22115u.entrySet().iterator();
        }
        return this.f22110u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f22108s + 1;
        zzafv zzafvVar = this.f22111v;
        if (i2 >= zzafvVar.f22114t) {
            return !zzafvVar.f22115u.isEmpty() && m9665a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f22109t = true;
        int i2 = this.f22108s + 1;
        this.f22108s = i2;
        zzafv zzafvVar = this.f22111v;
        return i2 < zzafvVar.f22114t ? (zzafs) zzafvVar.f22113s[i2] : (Map.Entry) m9665a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22109t) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f22109t = false;
        zzafv zzafvVar = this.f22111v;
        zzafvVar.m9671g();
        int i2 = this.f22108s;
        if (i2 >= zzafvVar.f22114t) {
            m9665a().remove();
        } else {
            this.f22108s = i2 - 1;
            zzafvVar.m9669e(i2);
        }
    }
}
