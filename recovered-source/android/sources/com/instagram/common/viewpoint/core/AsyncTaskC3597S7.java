package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.S7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AsyncTaskC3597S7 extends AsyncTask<C3599S9, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final InterfaceC3598S8 A00;
    public final C4494gi A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C3599S9... c3599s9Arr) throws Throwable {
        if (!AbstractC3863WU.A02(this) && c3599s9Arr != null) {
            try {
                if (c3599s9Arr.length >= 1) {
                    String str = c3599s9Arr[0].A01;
                    String str2 = c3599s9Arr[0].A00;
                    Bitmap bitmapA0O = null;
                    try {
                        bitmapA0O = new C3648Sx(this.A01).A0O(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A08().ABC(A01(0, 7, 4), AbstractC3690Td.A1V, new C3691Te(th));
                    }
                    if (bitmapA0O != null) {
                        return C3732UK.A05(this.A01, bitmapA0O, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                AbstractC3863WU.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = (bArrCopyOfRange[i5] ^ i4) ^ 36;
            String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            bArrCopyOfRange[i5] = (byte) i6;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public AsyncTaskC3597S7(C4494gi c4494gi, InterfaceC3598S8 interfaceC3598S8, boolean z) {
        this.A01 = c4494gi;
        this.A00 = interfaceC3598S8;
        this.A02 = z;
    }

    public /* synthetic */ AsyncTaskC3597S7(C4494gi c4494gi, InterfaceC3598S8 interfaceC3598S8, boolean z, C4516h4 c4516h4) {
        this(c4494gi, interfaceC3598S8, z);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            this.A00.AE8(drawable);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C3599S9[] c3599s9Arr) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            return A00(c3599s9Arr);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
