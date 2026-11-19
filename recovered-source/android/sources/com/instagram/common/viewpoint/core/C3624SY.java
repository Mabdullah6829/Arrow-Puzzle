package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3624SY {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, 120, 85, 93, 95, 93, 86, 91, 106, 109, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 31, 29, 26, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, 113, 120};
    }

    public C3624SY(C3659T8 c3659t8) {
        this.A00 = c3659t8.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), c3659t8), 0);
    }

    public final C3623SX A02() {
        SharedPreferences sharedPreferences = this.A00;
        String strA00 = A00(0, 13, 55);
        if (sharedPreferences.contains(strA00)) {
            return new C3623SX(this.A00.getString(strA00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), EnumC3622SW.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return C3623SX.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(C3623SX c3623sx) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, 55), c3623sx.A03());
        editorEdit.putBoolean(A00(54, 15, 96), c3623sx.A04());
        editorEdit.putLong(A00(26, 7, 65), c3623sx.A01());
        editorEdit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(13, 13, 78), str);
        editorEdit.apply();
    }
}
