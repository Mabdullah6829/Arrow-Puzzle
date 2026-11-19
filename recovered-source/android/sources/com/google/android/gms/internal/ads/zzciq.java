package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzciq {

    /* JADX INFO: renamed from: a */
    public long f10173a;

    /* JADX INFO: renamed from: a */
    public final long m5500a(ByteBuffer byteBuffer) {
        zzauz zzauzVar;
        zzauy zzauyVar;
        long j2 = this.f10173a;
        if (j2 > 0) {
            return j2;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            zzauu zzauuVar = new zzauu(new zzcip(byteBufferDuplicate), zzciu.f10175c);
            ArrayList arrayList = zzauuVar.f19977x;
            List zzimqVar = arrayList;
            if (zzauuVar.f19973t != null && zzauuVar.f19974u != zzimk.f19971y) {
                zzimqVar = arrayList;
                zzimqVar = new zzimq(arrayList, zzauuVar);
            }
            zzimqVar = arrayList;
            Iterator it = zzimqVar.iterator();
            while (true) {
                zzauzVar = null;
                if (!it.hasNext()) {
                    zzauyVar = null;
                    break;
                }
                zzauw zzauwVar = (zzauw) it.next();
                if (zzauwVar instanceof zzauy) {
                    zzauyVar = (zzauy) zzauwVar;
                    break;
                }
            }
            ArrayList arrayList2 = zzauyVar.f19977x;
            List<zzauw> zzimqVar2 = arrayList2;
            if (zzauyVar.f19973t != null && zzauyVar.f19974u != zzimk.f19971y) {
                zzimqVar2 = arrayList2;
                zzimqVar2 = new zzimq(arrayList2, zzauyVar);
            }
            zzimqVar2 = arrayList2;
            for (zzauw zzauwVar2 : zzimqVar2) {
                if (zzauwVar2 instanceof zzauz) {
                    zzauzVar = (zzauz) zzauwVar2;
                    break;
                }
            }
            long j3 = (zzauzVar.f6964E * 1000) / zzauzVar.f6963D;
            this.f10173a = j3;
            return j3;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
