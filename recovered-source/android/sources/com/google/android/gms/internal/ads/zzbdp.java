package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.p045pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbdp {
    /* JADX INFO: renamed from: a */
    public static String m4757a(Context context, String str, ArrayList arrayList) throws PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzhcy zzhcyVarM7389q = zzhcy.m7389q();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdo
            public final void onChecksumsReady(List list) {
                zzhcy zzhcyVar = zzhcyVarM7389q;
                if (list == null) {
                    zzhcyVar.m7320c(null);
                    return;
                }
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ApkChecksum apkChecksumM3792c = AbstractC5154h.m3792c(list.get(i2));
                        if (apkChecksumM3792c.getType() == 8) {
                            byte[] value = apkChecksumM3792c.getValue();
                            char[] cArr = zzbcc.f7581a;
                            int length = value.length;
                            char[] cArr2 = new char[length + length];
                            for (int i3 = 0; i3 < value.length; i3++) {
                                byte b = value[i3];
                                char[] cArr3 = zzbcc.f7581a;
                                int i4 = i3 + i3;
                                cArr2[i4] = cArr3[(b & 255) >>> 4];
                                cArr2[i4 + 1] = cArr3[b & 15];
                            }
                            zzhcyVar.m7320c(new String(cArr2));
                            return;
                        }
                    }
                    zzhcyVar.m7320c(null);
                } catch (Throwable unused) {
                    zzhcyVar.m7320c(null);
                }
            }
        });
        return (String) zzhcyVarM7389q.get();
    }
}
