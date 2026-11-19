package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaho {

    /* JADX INFO: renamed from: a */
    public static final zzham f5334a = new zzham(new int[]{0, 2, 1}, 3);

    /* JADX INFO: renamed from: b */
    public static final zzham f5335b = new zzham(new int[]{0, 2, 1, 3, 4}, 5);

    /* JADX INFO: renamed from: c */
    public static final zzham f5336c = new zzham(new int[]{0, 2, 1, 5, 3, 4}, 6);

    /* JADX INFO: renamed from: d */
    public static final zzham f5337d;

    /* JADX INFO: renamed from: e */
    public static final zzham f5338e;

    static {
        int[] iArr = new int[7];
        iArr[0] = 0;
        System.arraycopy(new int[]{2, 1, 6, 5, 3, 4}, 0, iArr, 1, 6);
        f5337d = new zzham(iArr, 7);
        int[] iArr2 = new int[8];
        iArr2[0] = 0;
        System.arraycopy(new int[]{2, 1, 7, 5, 6, 3, 4}, 0, iArr2, 1, 7);
        f5338e = new zzham(iArr2, 8);
    }

    /* JADX INFO: renamed from: a */
    public static zzap m4132a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            String str2 = zzfm.f16091a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzeh.m6211c("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzajg.m4148b(new zzeu(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzeh.m6212d("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzakc(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzap(arrayList);
    }
}
