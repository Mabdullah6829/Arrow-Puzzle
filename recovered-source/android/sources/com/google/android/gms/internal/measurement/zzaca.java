package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.internal.measurement.zzaca;
import com.google.android.gms.internal.measurement.zzacb;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzaca<MessageType extends zzacb<MessageType, BuilderType>, BuilderType extends zzaca<MessageType, BuilderType>> implements zzafb {
    /* JADX INFO: renamed from: i */
    public static void m9337i(int i2, List list) {
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

    @Override // com.google.android.gms.internal.measurement.zzafb
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ zzaca mo9338h(byte[] bArr, zzadf zzadfVar) {
        return mo9341m(bArr, bArr.length, zzadfVar);
    }

    @Override // 
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract zzadp clone();

    /* JADX INFO: renamed from: l */
    public zzaca mo9340l(int i2, byte[] bArr) {
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public zzaca mo9341m(byte[] bArr, int i2, zzadf zzadfVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzafb
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ zzaca mo9342n(byte[] bArr) {
        return mo9340l(bArr.length, bArr);
    }
}
