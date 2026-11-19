package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.44 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C213344 {
    public static String[] A00 = {"EztRdnRdnxII2dimpNbIGIFL", "yBPkb8rrKyWAtXIO8vHrmMLgNIFMukmC", "ruf61JzVv", "IfWYroKwc", "5HPqTBNR8piE8Sks8fUTmtRJQLpo0nUy", "FxyxfNH4TJBWtje7DU0sksr0G0lHlrNk", "mC", "vPIo9e1233jy8mUAOhcfZhe0yZqmz6aB"};

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC201424> SparseArray<T> A00(InterfaceC201323<T> interfaceC201323, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            parcelableSparseArray.put(sparseArray.keyAt(i2), interfaceC201323.A6f(sparseArray.valueAt(i2)));
        }
        return parcelableSparseArray;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends InterfaceC201424> AbstractC2570BP<T> A01(InterfaceC201323<T> interfaceC201323, List<Bundle> list) {
        C20302K c20302kA01 = AbstractC2570BP.A01();
        int i2 = 0;
        while (true) {
            int size = list.size();
            int i3 = A00[2].length();
            if (i3 == 29) {
                throw new RuntimeException();
            }
            A00[1] = "WptazREDdEStXNqRDkkRjPq2B5lfZI6H";
            if (i2 < size) {
                c20302kA01.A04(interfaceC201323.A6f((Bundle) AbstractC21273y.A01(list.get(i2))));
                i2++;
            } else {
                return c20302kA01.A05();
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC22035C.A0f(C213344.class.getClassLoader()));
        }
    }
}
