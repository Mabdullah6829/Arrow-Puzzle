package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3876Wh {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C3876Wh> A02 = new ThreadLocal<>();
    public final C3859WQ A00 = new C3859WQ();

    public static C3859WQ A00() {
        return A02().A00;
    }

    public static C3859WQ A01(C3875Wg c3875Wg) {
        C3859WQ currentStackTraces = new C3859WQ(A00());
        currentStackTraces.add(c3875Wg);
        return currentStackTraces;
    }

    public static C3876Wh A02() {
        C3876Wh c3876Wh = A02.get();
        if (c3876Wh == null) {
            C3876Wh c3876Wh2 = new C3876Wh();
            A02.set(c3876Wh2);
            return c3876Wh2;
        }
        return c3876Wh;
    }

    public static void A03(AbstractRunnableC3871Wc abstractRunnableC3871Wc) {
        C3859WQ c3859wqA06 = abstractRunnableC3871Wc.A06();
        if (c3859wqA06 != null) {
            C3859WQ createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(c3859wqA06);
        }
    }

    public static void A04(AbstractRunnableC3871Wc abstractRunnableC3871Wc) {
        C3859WQ c3859wqA06 = abstractRunnableC3871Wc.A06();
        if (c3859wqA06 != null) {
            C3859WQ c3859wq = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            c3859wq.removeAll(c3859wqA06);
        }
    }
}
