package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [com.facebook.ads.internal.util.common.Stateful<android.os.Bundle>] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4585iE {
    public static byte[] A03;
    public final C3387Of A00;
    public final InterfaceC4379er A01;
    public final List<C4584iD> A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 36);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-11, -10, -29, -10, -21, -11, -10, -21, -27, -11, -60, -75, -61, -60, -61};
    }

    public C4585iE(List<AbstractC3385Od> list, Bundle bundle, InterfaceC4379er interfaceC4379er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC4379er;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 76));
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.A02.add(new C4584iD(list.get(i2), (Bundle) parcelableArrayList.get(i2)));
        }
        this.A00 = (C3387Of) AbstractC3943Xo.A00(bundle.getByteArray(A00(0, 10, 126)));
    }

    public C4585iE(List<AbstractC3385Od> list, InterfaceC4379er interfaceC4379er) {
        this.A02 = new ArrayList(list.size());
        this.A01 = interfaceC4379er;
        Iterator<AbstractC3385Od> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new C4584iD(it.next()));
        }
        this.A00 = new C3387Of();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 126), AbstractC3943Xo.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<C4584iD> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 76), arrayList);
        return bundle;
    }

    public final C3387Of A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<C4584iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d, double d2) {
        if (d2 >= 0.0d) {
            this.A00.A05(d, d2);
        }
        double dA9V = this.A01.A9V();
        this.A00.A04(d, dA9V);
        Iterator<C4584iD> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d, dA9V);
        }
    }
}
