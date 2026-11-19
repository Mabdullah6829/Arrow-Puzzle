package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9j */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC24679j implements InterfaceC4876nE {
    public int A00;

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1742")
    public boolean A01;
    public final int A02;
    public final long[] A03;
    public final C5064qI[] A04;
    public final int A05;
    public final C5027pg A06;
    public final int[] A07;

    public AbstractC24679j(C5027pg c5027pg, int[] iArr, int i2) {
        AbstractC21273y.A08(iArr.length > 0);
        this.A02 = i2;
        this.A06 = (C5027pg) AbstractC21273y.A01(c5027pg);
        this.A05 = iArr.length;
        this.A04 = new C5064qI[this.A05];
        for (int i3 = 0; i3 < i; i3++) {
            C5064qI[] c5064qIArr = this.A04;
            int i4 = iArr[i3];
            c5064qIArr[i3] = c5027pg.A08(i4);
        }
        Arrays.sort(this.A04, new Comparator() { // from class: com.facebook.ads.redexgen.X.EV
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC24679j.A07((C5064qI) obj, (C5064qI) obj2);
            }
        });
        this.A07 = new int[this.A05];
        for (int i5 = 0; i5 < i; i5++) {
            int[] iArr2 = this.A07;
            int i6 = c5027pg.A07(this.A04[i5]);
            iArr2[i5] = i6;
        }
        int i7 = this.A05;
        this.A03 = new long[i7];
        this.A01 = false;
    }

    public static /* synthetic */ int A07(C5064qI c5064qI, C5064qI c5064qI2) {
        return c5064qI2.A05 - c5064qI.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4876nE
    public void A5x() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4876nE
    public void A6K() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2781Eq
    public final C5064qI A8B(int i2) {
        return this.A04[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2781Eq
    public final int A8H(int i2) {
        return this.A07[i2];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4876nE
    public final C5064qI A92() {
        return this.A04[A93()];
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2781Eq
    public final C5027pg A9L() {
        return this.A06;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2781Eq
    public final int AA6(int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = this.A07[i3];
            if (i4 == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4876nE
    public void AFJ(float f2) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC24679j abstractC24679j = (AbstractC24679j) obj;
        return this.A06 == abstractC24679j.A06 && Arrays.equals(this.A07, abstractC24679j.A07);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = (System.identityHashCode(this.A06) * 31) + Arrays.hashCode(this.A07);
        }
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2781Eq
    public final int length() {
        return this.A07.length;
    }
}
