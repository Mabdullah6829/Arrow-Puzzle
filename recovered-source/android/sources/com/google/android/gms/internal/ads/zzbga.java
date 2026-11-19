package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzbga implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbgf zzbgfVar = (zzbgf) obj;
        zzbgf zzbgfVar2 = (zzbgf) obj2;
        int i2 = zzbgfVar.f7819c - zzbgfVar2.f7819c;
        return i2 != 0 ? i2 : Long.compare(zzbgfVar.f7817a, zzbgfVar2.f7817a);
    }
}
