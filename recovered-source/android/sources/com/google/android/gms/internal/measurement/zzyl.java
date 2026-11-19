package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public class zzyl {

    /* JADX INFO: renamed from: a */
    public final String f23097a;

    /* JADX INFO: renamed from: b */
    public final Class f23098b;

    /* JADX INFO: renamed from: c */
    public final boolean f23099c;

    /* JADX INFO: renamed from: d */
    public final boolean f23100d;

    /* JADX INFO: renamed from: e */
    public final long f23101e;

    public zzyl(String str, Class cls, boolean z, boolean z2) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt2 = str.charAt(i2);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
        this.f23097a = str;
        this.f23098b = cls;
        this.f23099c = z;
        this.f23100d = z2;
        int iIdentityHashCode = System.identityHashCode(this);
        long j2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            j2 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f23101e = j2;
    }

    /* JADX INFO: renamed from: a */
    public void mo10711a(Iterator it, zzzc zzzcVar) {
        while (it.hasNext()) {
            mo10712b(it.next(), zzzcVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo10712b(Object obj, zzzc zzzcVar) {
        zzzcVar.mo10735a(obj, this.f23097a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f23098b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f23097a;
        StringBuilder sb = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        AbstractC0271e0.m413u(sb, name, "/", str, "[");
        return AbstractC0271e0.m403k(sb, name2, "]");
    }
}
