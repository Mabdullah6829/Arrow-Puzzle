package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgxh {
    /* JADX INFO: renamed from: a */
    public static Object m7247a(String str, Iterable iterable) {
        zzgur zzgurVar = (zzgur) ((zzgyy) iterable).iterator();
        return zzgurVar.hasNext() ? zzgurVar.next() : str;
    }

    /* JADX INFO: renamed from: b */
    public static void m7248b(List list, zzgts zzgtsVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzgtsVar.mo3897b(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }
}
