package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7g */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C23577g extends AbstractC4632j0 {
    public static byte[] A00;
    public static String[] A01 = {"5V5lzA70kRKZvNcqBnXwT00Z041t6ONl", "kRuh8LYE7MIIox", "vbi5lrus1TtIcXopJBSqGum5Kl452Sg0", "JcNQ6WafPgnmx1aBDePIhrwzaceROyrU", "60x4BO5hhvvMWgz", "65jgyaanPJJ2TdYJaJc79ygQBnrUrWFq", "zOX7nuTxFizV3LeqTcyyEc2wd", "PvIxiwPRiyIOar7lINjn4bFuW"};

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{42, 47, 107, 34, 56, 107, 37, 36, 63, 107, 57, 46, 42, 47, 50, 107, 36, 57, 107, 42, 39, 57, 46, 42, 47, 50, 107, 47, 34, 56, 59, 39, 42, 50, 46, 47, 20, 21, 28, 17, 9};
    }

    static {
        A03();
    }

    public C23577g(C4494gi c4494gi, C3353O7 c3353o7) {
        super(c4494gi, c3353o7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01(long j2) {
        HashMap map = new HashMap();
        map.put(A00(36, 5, 12), String.valueOf(System.currentTimeMillis() - j2));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(List<String> trackingUrls, Map<String, String> extraData) {
        if (trackingUrls != null) {
            boolean zIsEmpty = trackingUrls.isEmpty();
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "86KHDrV9NKgfIZAVdUdv4tP2w";
            strArr[7] = "hnWt117Y9rLxZfnYOmFuZ36IL";
            if (zIsEmpty) {
                return;
            }
            Iterator<String> it = trackingUrls.iterator();
            while (it.hasNext()) {
                new AsyncTaskC4465gF(this.A0B, extraData).execute(it.next());
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0P() {
        C4686ju c4686ju = (C4686ju) this.A01;
        if (c4686ju.A0R()) {
            AbstractC3286N2 abstractC3286N2 = this.A07;
            if (A01[3].charAt(25) != 'c') {
                throw new RuntimeException();
            }
            A01[4] = "SmlVqZ";
            if (abstractC3286N2 != null) {
                this.A07.A0B(c4686ju);
                return;
            }
            return;
        }
        throw new IllegalStateException(A00(0, 36, 55));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4632j0
    public final void A0R(InterfaceC3285N1 interfaceC3285N1, C3709Tw c3709Tw, C3707Tu c3707Tu, C3354O8 c3354o8) {
        C4686ju c4686ju = (C4686ju) interfaceC3285N1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4629ix c4629ix = new C4629ix(this, c3354o8, c4686ju, jCurrentTimeMillis, c3707Tu);
        A0H().postDelayed(c4629ix, c3709Tw.A05().A05());
        c4686ju.A0L(this.A0B, new C4628iw(this, c4629ix, jCurrentTimeMillis, c3707Tu), this.A09, c3354o8, C3732UK.A0K());
    }
}
