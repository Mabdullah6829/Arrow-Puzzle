package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbgi implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbfy zzbfyVar = (zzbfy) obj;
        zzbfy zzbfyVar2 = (zzbfy) obj2;
        float f2 = zzbfyVar.f7801b;
        float f3 = zzbfyVar2.f7801b;
        if (f2 < f3) {
            return -1;
        }
        if (f2 > f3) {
            return 1;
        }
        float f4 = zzbfyVar.f7800a;
        float f5 = zzbfyVar2.f7800a;
        if (f4 < f5) {
            return -1;
        }
        if (f4 > f5) {
            return 1;
        }
        float f6 = (zzbfyVar.f7803d - f2) * (zzbfyVar.f7802c - f4);
        float f7 = (zzbfyVar2.f7803d - f3) * (zzbfyVar2.f7802c - f5);
        if (f6 > f7) {
            return -1;
        }
        return f6 < f7 ? 1 : 0;
    }
}
