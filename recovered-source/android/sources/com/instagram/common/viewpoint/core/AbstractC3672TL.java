package com.instagram.common.viewpoint.core;

import android.database.sqlite.SQLiteDatabase;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3672TL {
    public static byte[] A01;
    public final C3668TH A00;

    static {
        A04();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 34, 52, 61, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract C3666TF[] A0A();

    public AbstractC3672TL(C3668TH c3668th) {
        this.A00 = c3668th;
    }

    private String A00() {
        C3666TF[] c3666tfArrA0A = A0A();
        if (c3666tfArrA0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i2 = 0; i2 < c3666tfArrA0A.length - 1; i2++) {
            result = result + c3666tfArrA0A[i2].A02() + A01(20, 2, 43);
        }
        return result + c3666tfArrA0A[c3666tfArrA0A.length - 1].A02();
    }

    public static String A02(String str, C3666TF[] c3666tfArr) {
        StringBuilder sb = new StringBuilder(A01(56, 7, 114));
        for (int i2 = 0; i2 < c3666tfArr.length - 1; i2++) {
            sb.append(c3666tfArr[i2].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(c3666tfArr[c3666tfArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static String A03(String str, C3666TF[] c3666tfArr, C3666TF c3666tf) {
        return A02(str, c3666tfArr) + A01(12, 7, C1137R.styleable.ConstraintSet_quantizeMotionSteps) + c3666tf.A01 + A01(2, 4, C1137R.styleable.ConstraintSet_pathMotionArc);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, C1137R.styleable.ConstraintSet_polarRelativeTo) + A00() + A01(19, 1, C1137R.styleable.ConstraintSet_pivotAnchor));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
