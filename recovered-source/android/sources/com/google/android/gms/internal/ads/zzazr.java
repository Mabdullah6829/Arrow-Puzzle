package com.google.android.gms.internal.ads;

import android.content.p045pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazr implements PackageManager$OnChecksumsReadyListener {

    /* JADX INFO: renamed from: a */
    public final zzhcy f7213a = zzhcy.m7389q();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f7213a.m7320c("");
            return;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ApkChecksum apkChecksumM3792c = AbstractC5154h.m3792c(list.get(i2));
                if (apkChecksumM3792c.getType() == 8) {
                    zzhcy zzhcyVar = this.f7213a;
                    zzgzo zzgzoVarMo7280f = zzgzo.f18403c.mo7280f();
                    byte[] value = apkChecksumM3792c.getValue();
                    zzhcyVar.m7320c(zzgzoVarMo7280f.m7282g(value.length, value));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f7213a.m7320c("");
    }
}
