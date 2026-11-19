package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class zzgwn extends zzgwo {

    /* JADX INFO: renamed from: a */
    public Object[] f18295a;

    /* JADX INFO: renamed from: b */
    public int f18296b;

    /* JADX INFO: renamed from: c */
    public boolean f18297c;

    public zzgwn(int i2) {
        zzgvp.m7175b(i2, "initialCapacity");
        this.f18295a = new Object[i2];
        this.f18296b = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwo
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ zzgwo mo7202a(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m7203c(Object obj) {
        obj.getClass();
        m7205e(1);
        Object[] objArr = this.f18295a;
        int i2 = this.f18296b;
        this.f18296b = i2 + 1;
        objArr[i2] = obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m7204d(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m7205e(collection.size());
            if (collection instanceof zzgwp) {
                this.f18296b = ((zzgwp) collection).mo7213k(this.f18296b, this.f18295a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            mo7202a(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7205e(int i2) {
        int length = this.f18295a.length;
        int iM7206b = zzgwo.m7206b(length, this.f18296b + i2);
        if (iM7206b > length || this.f18297c) {
            this.f18295a = Arrays.copyOf(this.f18295a, iM7206b);
            this.f18297c = false;
        }
    }
}
