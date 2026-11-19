package com.google.android.gms.internal.ads;

import com.google.firebase.messaging.ServiceStarter;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacp {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f4921a = ByteBuffer.allocateDirect(ServiceStarter.ERROR_UNKNOWN);

    /* JADX INFO: renamed from: b */
    public zzgv f4922b;

    /* JADX INFO: renamed from: a */
    public final void m3948a(ArrayList arrayList) {
        zzgv zzgvVar;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((zzgu) arrayList.get(i2)).f18186a == 1) {
                try {
                    zzgvVar = new zzgv((zzgu) arrayList.get(i2));
                } catch (zzgt unused) {
                    zzgvVar = null;
                }
                this.f4922b = zzgvVar;
            }
        }
    }
}
