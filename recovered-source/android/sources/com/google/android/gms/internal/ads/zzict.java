package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.ads.zzict;
import com.google.android.gms.internal.ads.zzicu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzict<MessageType extends zzicu<MessageType, BuilderType>, BuilderType extends zzict<MessageType, BuilderType>> implements zzify {
    /* JADX INFO: renamed from: i */
    public static void m8094i(int i2, List list) {
        int size = list.size() - i2;
        String strM2448o = AbstractC1456a.m2448o(new StringBuilder(String.valueOf(size).length() + 26), "Element at index ", size, " is null.");
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i2) {
                throw new NullPointerException(strM2448o);
            }
            list.remove(size2);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract zziej clone();
}
