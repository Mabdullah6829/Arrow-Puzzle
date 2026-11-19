package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
final class zzqs {
    /* JADX INFO: renamed from: a */
    public static zzgwt m8840a(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            zzgzi zzgziVar = zzgwt.f18303t;
            return zzgyo.f18355w;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new Function() { // from class: com.google.android.gms.internal.ads.zzqr
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new Integer(Integer.bitCount(((Integer) obj).intValue()));
            }
        }).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM3873e = AbstractC5160n.m3873e(it.next());
            if (audioDescriptorM3873e.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM3873e.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    AbstractC5152f.m3776h(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                } else {
                    byte b = descriptor[0];
                    int i2 = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfm.m6503e(i2)));
                    }
                }
            }
        }
        return zzgwt.m7220t(treeSet);
    }
}
