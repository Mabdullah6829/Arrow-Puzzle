package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9i */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24669i extends C5023pc implements InterfaceC201424 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C4894nW, C4879nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C24669i A0J = new C4882nK().A0p();

    @Deprecated
    public static final C24669i A0I = A0J;
    public static final String A0W = AbstractC22035C.A0h(1000);
    public static final String A0Q = AbstractC22035C.A0h(1001);
    public static final String A0R = AbstractC22035C.A0h(1002);
    public static final String A0T = AbstractC22035C.A0h(PointerIconCompat.TYPE_HELP);
    public static final String A0M = AbstractC22035C.A0h(PointerIconCompat.TYPE_WAIT);
    public static final String A0N = AbstractC22035C.A0h(1005);
    public static final String A0K = AbstractC22035C.A0h(PointerIconCompat.TYPE_CELL);
    public static final String A0V = AbstractC22035C.A0h(PointerIconCompat.TYPE_CROSSHAIR);
    public static final String A0b = AbstractC22035C.A0h(PointerIconCompat.TYPE_TEXT);
    public static final String A0O = AbstractC22035C.A0h(PointerIconCompat.TYPE_VERTICAL_TEXT);
    public static final String A0Z = AbstractC22035C.A0h(PointerIconCompat.TYPE_ALIAS);
    public static final String A0a = AbstractC22035C.A0h(PointerIconCompat.TYPE_COPY);
    public static final String A0Y = AbstractC22035C.A0h(PointerIconCompat.TYPE_NO_DROP);
    public static final String A0X = AbstractC22035C.A0h(PointerIconCompat.TYPE_ALL_SCROLL);
    public static final String A0P = AbstractC22035C.A0h(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW);
    public static final String A0L = AbstractC22035C.A0h(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW);
    public static final String A0S = AbstractC22035C.A0h(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
    public static final String A0U = AbstractC22035C.A0h(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
    public static final InterfaceC201323<C24669i> A0H = new InterfaceC201323() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.instagram.common.viewpoint.core.InterfaceC201323
        public final InterfaceC201424 A6f(Bundle bundle) {
            return new C4882nK(bundle).A0p();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C4894nW, C4879nH>> sparseArray, SparseArray<Map<C4894nW, C4879nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
            if (iIndexOfKey < 0 || !A0O(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C4894nW, C4879nH> map, Map<C4894nW, C4879nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C4894nW, C4879nH> entry : map.entrySet()) {
            C4894nW key = entry.getKey();
            if (!map2.containsKey(key) || !AbstractC22035C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C24669i(C4882nK c4882nK) {
        super(c4882nK);
        this.A0C = c4882nK.A0C;
        this.A06 = c4882nK.A06;
        this.A07 = c4882nK.A07;
        this.A05 = c4882nK.A05;
        this.A09 = c4882nK.A09;
        this.A02 = c4882nK.A02;
        this.A03 = c4882nK.A03;
        this.A00 = c4882nK.A00;
        this.A01 = c4882nK.A01;
        this.A08 = c4882nK.A08;
        this.A0B = c4882nK.A0B;
        this.A0D = c4882nK.A0D;
        this.A04 = c4882nK.A04;
        this.A0E = c4882nK.A0E;
        this.A0F = c4882nK.A0F;
        this.A0A = c4882nK.A0A;
    }

    public static C24669i A02(Context context) {
        return new C4882nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C4882nK A0P() {
        return new C4882nK(this);
    }

    @Deprecated
    public final C4879nH A0Q(int i2, C4894nW c4894nW) {
        Map<C4894nW, C4879nH> map = this.A0E.get(i2);
        if (map != null) {
            return map.get(c4894nW);
        }
        return null;
    }

    public final boolean A0R(int i2) {
        return this.A0F.get(i2);
    }

    @Deprecated
    public final boolean A0S(int i2, C4894nW c4894nW) {
        Map<C4894nW, C4879nH> map = this.A0E.get(i2);
        return map != null && map.containsKey(c4894nW);
    }

    @Override // com.instagram.common.viewpoint.core.C5023pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C24669i c24669i = (C24669i) obj;
                if (super.equals(c24669i) && this.A0C == c24669i.A0C && this.A06 == c24669i.A06 && this.A07 == c24669i.A07 && this.A05 == c24669i.A05 && this.A09 == c24669i.A09 && this.A02 == c24669i.A02 && this.A03 == c24669i.A03 && this.A00 == c24669i.A00 && this.A01 == c24669i.A01 && this.A08 == c24669i.A08 && this.A0B == c24669i.A0B && this.A0D == c24669i.A0D && this.A04 == c24669i.A04 && A0N(this.A0F, c24669i.A0F) && A0M(this.A0E, c24669i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C5023pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
