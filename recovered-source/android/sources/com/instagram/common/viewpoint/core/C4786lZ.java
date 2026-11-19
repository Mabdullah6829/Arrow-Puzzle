package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4786lZ implements InterfaceC3082Jj {
    public static String[] A03 = {"LK8mEMUSnifSCT0YT0fQtLG", "zQWICugnqrmXEq8sMdeIuA9JBPwrta0k", "lKxJonOWK2Axk83UnpUnbJJcLxj", "3DYuz", "CNQNHGpRGAv1E31EB6wcq1FAARNpDgXE", "DpJK", "NUJ585yfBdIWgF7XcRLbZeMVqrhzmgk", "1sPINCYISeoO6PXpnzvAKZkikus6bvvY"};
    public final List<C3140Kf> A00;
    public final long[] A01;
    public final long[] A02;

    public C4786lZ(List<C3140Kf> list) {
        this.A00 = Collections.unmodifiableList(new ArrayList(list));
        this.A01 = new long[list.size() * 2];
        for (int i2 = 0; i2 < cueIndex; i2++) {
            C3140Kf c3140Kf = list.get(i2);
            int i3 = i2 * 2;
            this.A01[i3] = c3140Kf.A01;
            int arrayIndex = i3 + 1;
            this.A01[arrayIndex] = c3140Kf.A00;
        }
        this.A02 = Arrays.copyOf(this.A01, this.A01.length);
        Arrays.sort(this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final List<C5014pT> A7X(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.A00.size(); i2++) {
            if (this.A01[i2 * 2] <= j2) {
                long j3 = this.A01[(i2 * 2) + 1];
                if (A03[2].length() == 27) {
                    A03[5] = "FOcCQTOovqYXamkXPEg";
                    if (j2 < j3) {
                        C3140Kf c3140Kf = this.A00.get(i2);
                        if (c3140Kf.A02.A01 == -3.4028235E38f) {
                            arrayList2.add(c3140Kf);
                        } else {
                            C5014pT c5014pT = c3140Kf.A02;
                            String[] strArr = A03;
                            if (strArr[6].length() != strArr[0].length()) {
                                String[] strArr2 = A03;
                                strArr2[4] = "KriihMM2RWcrEfyoWolOk5PIi1Nv3YmO";
                                strArr2[1] = "gocQSZMmm3PjEWFg0RBonPYHqyNHFxQo";
                                arrayList.add(c5014pT);
                            }
                        }
                    } else {
                        continue;
                    }
                }
                throw new RuntimeException();
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.facebook.ads.redexgen.X.Kp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((C3140Kf) obj).A01, ((C3140Kf) obj2).A01);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList.add(((C3140Kf) arrayList2.get(i3)).A02.A02().A07((-1) - i3, 1).A0H());
        }
        return arrayList;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final long A83(int i2) {
        boolean z = true;
        AbstractC21273y.A07(i2 >= 0);
        if (i2 >= this.A02.length) {
            z = false;
        }
        AbstractC21273y.A07(z);
        return this.A02[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A84() {
        return this.A02.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3082Jj
    public final int A8a(long j2) {
        int iA0K = AbstractC22035C.A0K(this.A02, j2, false, false);
        int index = this.A02.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
