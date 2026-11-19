package com.google.android.gms.internal.consent_sdk;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpm implements Iterable, Serializable {

    /* JADX INFO: renamed from: t */
    public static final zzpm f21713t = new zzpk(zzqs.f21748b);

    /* JADX INFO: renamed from: s */
    public int f21714s = 0;

    static {
        int i2 = zzpc.f21705a;
    }

    /* JADX INFO: renamed from: I */
    public static void m9155I(int i2) {
        if (((i2 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(AbstractC0271e0.m396d(i2, "End index: 47 >= "));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract byte mo9148a(int i2);

    /* JADX INFO: renamed from: b */
    public abstract byte mo9149b(int i2);

    /* JADX INFO: renamed from: d */
    public abstract int mo9150d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int iMo9150d = mo9150d();
        if (iMo9150d != zzpmVar.mo9150d()) {
            return false;
        }
        if (iMo9150d == 0) {
            return true;
        }
        int i2 = this.f21714s;
        int i3 = zzpmVar.f21714s;
        if (i2 == 0 || i3 == 0 || i2 == i3) {
            return mo9154k(zzpmVar);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo9151g(int i2, int i3);

    /* JADX INFO: renamed from: h */
    public abstract zzpm mo9152h();

    public final int hashCode() {
        int iMo9151g = this.f21714s;
        if (iMo9151g == 0) {
            int iMo9150d = mo9150d();
            iMo9151g = mo9151g(iMo9150d, iMo9150d);
            if (iMo9151g == 0) {
                iMo9151g = 1;
            }
            this.f21714s = iMo9151g;
        }
        return iMo9151g;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzpf(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo9153j(zzpv zzpvVar);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo9154k(zzpm zzpmVar);

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo9150d = mo9150d();
        String strM9277a = mo9150d() <= 50 ? zzsk.m9277a(this) : zzsk.m9277a(mo9152h()).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo9150d);
        sb.append(" contents=\"");
        return AbstractC0271e0.m403k(sb, strM9277a, "\">");
    }
}
