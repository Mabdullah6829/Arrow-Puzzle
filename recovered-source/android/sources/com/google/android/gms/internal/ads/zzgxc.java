package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxc extends zzgwn {

    /* JADX INFO: renamed from: d */
    public Object[] f18321d;

    /* JADX INFO: renamed from: e */
    public int f18322e;

    public zzgxc() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzgwn, com.google.android.gms.internal.ads.zzgwo
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ zzgwo mo7202a(Object obj) {
        m7235f(obj);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m7235f(Object obj) {
        obj.getClass();
        if (this.f18321d != null) {
            int iM7240q = zzgxd.m7240q(this.f18296b);
            Object[] objArr = this.f18321d;
            if (iM7240q <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iM7200a = zzgwm.m7200a(iHashCode);
                while (true) {
                    int i2 = iM7200a & length;
                    Object[] objArr2 = this.f18321d;
                    Object obj2 = objArr2[i2];
                    if (obj2 == null) {
                        objArr2[i2] = obj;
                        this.f18322e += iHashCode;
                        m7203c(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        iM7200a = i2 + 1;
                    }
                }
            }
        }
        this.f18321d = null;
        m7203c(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m7236g(Iterable iterable) {
        iterable.getClass();
        if (this.f18321d == null) {
            m7204d(iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m7235f(it.next());
        }
    }

    /* JADX INFO: renamed from: h */
    public final zzgxd m7237h() {
        zzgxd zzgxdVarM7244v;
        int i2 = this.f18296b;
        if (i2 == 0) {
            return zzgyu.f18372B;
        }
        if (i2 == 1) {
            Object obj = this.f18295a[0];
            Objects.requireNonNull(obj);
            return new zzgze(obj);
        }
        if (this.f18321d == null || zzgxd.m7240q(i2) != this.f18321d.length) {
            zzgxdVarM7244v = zzgxd.m7244v(this.f18296b, this.f18295a);
            this.f18296b = zzgxdVarM7244v.size();
        } else {
            int i3 = this.f18296b;
            Object[] objArrCopyOf = this.f18295a;
            int length = objArrCopyOf.length;
            if (i3 < (length >> 1) + (length >> 2)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            }
            int i4 = this.f18322e;
            Object[] objArr = this.f18321d;
            zzgxdVarM7244v = new zzgyu(i4, objArr.length - 1, this.f18296b, objArrCopyOf, objArr);
        }
        this.f18297c = true;
        this.f18321d = null;
        return zzgxdVarM7244v;
    }
}
