package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4894nW implements InterfaceC201424 {
    public static byte[] A03;
    public static String[] A04 = {"kjXOolT", "y1uosoppcQ2KAnagmdUHUDs2pqKkNOP", "9S5fCrLfVI6Z6wWSlA", "LW4KLvv", "ESAoxwChDjEBJ2YD38hEjiU5IsN", "MD8cz6uZEkXt7x64XO0blzPRBkN5Dhm8", "wv8vTraLOdvtLK52tGc0aCYgNtDO0cFF", "ftZS2reRIxcEfCn6parOlN78mV3R9Y2K"};
    public static final InterfaceC201323<C4894nW> A05;
    public static final C4894nW A06;
    public static final String A07;
    public int A00;
    public final int A01;
    public final AbstractC2570BP<C5027pg> A02;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 95);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, 79, 86, 78, 83, 74, 86, 95, 26, 83, 94, 95, 84, 78, 83, 89, 91, 86, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 73, 26, 91, 94, 94, 95, 94, 26, 78, 85, 26, 85, 84, 95, 26, 110, 72, 91, 89, 81, 125, 72, 85, 79, 74, 123, 72, 72, 91, 67, 20, 81, 119, 100, 102, 110, 66, 119, 106, 112, 117, 68, 119, 119, 100, 124};
        if (A04[5].charAt(31) == 'Q') {
            throw new RuntimeException();
        }
        A04[4] = "LoVxB454";
        A03 = bArr;
    }

    static {
        A03();
        A06 = new C4894nW(new C5027pg[0]);
        A07 = AbstractC22035C.A0h(0);
        A05 = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.nX
            @Override // com.instagram.common.viewpoint.core.InterfaceC201323
            public final InterfaceC201424 A6f(Bundle bundle) {
                return C4894nW.A00(bundle);
            }
        };
    }

    public C4894nW(C5027pg... c5027pgArr) {
        this.A02 = AbstractC2570BP.A07(c5027pgArr);
        this.A01 = c5027pgArr.length;
        A02();
    }

    public static /* synthetic */ C4894nW A00(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A07);
        if (parcelableArrayList == null) {
            return new C4894nW(new C5027pg[0]);
        }
        return new C4894nW((C5027pg[]) C213344.A01(C5027pg.A06, parcelableArrayList).toArray(new C5027pg[0]));
    }

    private void A02() {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = i2 + 1; i3 < i; i3++) {
                if (this.A02.get(i2).equals(this.A02.get(i3))) {
                    AbstractC21714g.A08(A01(60, 15, 90), A01(0, 0, 115), new IllegalArgumentException(A01(0, 60, 101)));
                }
            }
        }
    }

    public final int A04(C5027pg c5027pg) {
        int index = this.A02.indexOf(c5027pg);
        if (index >= 0) {
            return index;
        }
        return -1;
    }

    public final C5027pg A05(int i2) {
        return this.A02.get(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4894nW c4894nW = (C4894nW) obj;
        return this.A01 == c4894nW.A01 && this.A02.equals(c4894nW.A02);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = this.A02.hashCode();
        }
        int i2 = this.A00;
        String[] strArr = A04;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A04[6] = "ifk0Ba0Zppjn7MlaJBrmzFqZbJ0HKklT";
        return i2;
    }
}
