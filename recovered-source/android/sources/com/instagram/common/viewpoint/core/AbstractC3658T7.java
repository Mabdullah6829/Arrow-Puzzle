package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.T7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3658T7 {
    public static String[] A00 = {"WfUJfZecOVcHzzrBpx92ELEjWhu2m", "ABQQ5taiOepRv8Mi5iWio7B3aVpn", "lqinWbZDhv0Ny2jUIa5P6Phm3DGMmF2T", "dPu2X3zgdKacWkfyqxYrIyrhes", "b2oe8Nr0EFLLItrmCHMxvIgMHIYOeqfq", "h", "yKBaB64vFuTn7zYoCnuYBPVEHVJ9GNEq", ""};
    public static final AtomicReference<C4490ge> A01 = new AtomicReference<>();

    public static C4490ge A00() {
        AtomicReference<C4490ge> atomicReference = A01;
        if (A00[2].charAt(13) != '2') {
            throw new RuntimeException();
        }
        A00[3] = "t";
        return atomicReference.get();
    }

    public static void A01(C4490ge c4490ge) {
        if (c4490ge == null) {
            return;
        }
        AbstractC2532An.A00(A01, null, c4490ge);
    }
}
