package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwv {

    /* JADX INFO: renamed from: a */
    public Object[] f18307a;

    /* JADX INFO: renamed from: b */
    public int f18308b;

    /* JADX INFO: renamed from: c */
    public zzgwu f18309c;

    public zzgwv() {
        this(4);
    }

    /* JADX INFO: renamed from: a */
    public final void m7225a(Object obj, Object obj2) {
        int i2 = this.f18308b + 1;
        Object[] objArr = this.f18307a;
        int length = objArr.length;
        int i3 = i2 + i2;
        if (i3 > length) {
            this.f18307a = Arrays.copyOf(objArr, zzgwo.m7206b(length, i3));
        }
        zzgvp.m7174a(obj, obj2);
        Object[] objArr2 = this.f18307a;
        int i4 = this.f18308b;
        int i5 = i4 + i4;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f18308b = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m7226b(Set set) {
        if (set != null) {
            int size = set.size() + this.f18308b;
            Object[] objArr = this.f18307a;
            int length = objArr.length;
            int i2 = size + size;
            if (i2 > length) {
                this.f18307a = Arrays.copyOf(objArr, zzgwo.m7206b(length, i2));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m7225a(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final zzgww m7227c() {
        return m7228d(true);
    }

    /* JADX INFO: renamed from: d */
    public final zzgww m7228d(boolean z) {
        zzgwu zzgwuVar;
        zzgwu zzgwuVar2;
        if (z && (zzgwuVar2 = this.f18309c) != null) {
            throw zzgwuVar2.m7224a();
        }
        zzgyt zzgytVarM7265e = zzgyt.m7265e(this.f18308b, this.f18307a, this);
        if (!z || (zzgwuVar = this.f18309c) == null) {
            return zzgytVarM7265e;
        }
        throw zzgwuVar.m7224a();
    }

    public zzgwv(int i2) {
        this.f18307a = new Object[i2 + i2];
        this.f18308b = 0;
    }
}
