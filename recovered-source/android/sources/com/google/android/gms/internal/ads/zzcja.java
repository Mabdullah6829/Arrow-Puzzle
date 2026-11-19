package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcja implements Iterable {

    /* JADX INFO: renamed from: s */
    public final ArrayList f10184s = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m5504a(zzchu zzchuVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f10184s;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zzciz zzcizVar = (zzciz) obj;
            if (zzcizVar.f10179b == zzchuVar) {
                arrayList.add(zzcizVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ((zzciz) obj2).f10180c.mo5512o();
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f10184s.iterator();
    }
}
