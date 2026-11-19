package com.instagram.common.viewpoint.core;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3669TI extends SQLiteOpenHelper {
    public static byte[] A01;
    public static String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
    public static final String A03;
    public final C3668TH A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, 11, 19, 4, 17, -33, 19, 0, 1, 11, 4, -33, 36, 53, 36, 45, 51, 50, -33, 0, 3, 3, -33, 2, 14, 11, 20, 12, 13, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, 15, 30, 13, 31, 20, 17, 31, -10, -8, -25, -19, -13, -25, -58, 12, 21, 24, 11, 15, 13, 20, 5, 17, 11, 31, 25, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
        if (A02[7].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
        strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
    }

    static {
        A02();
        A03 = C3669TI.class.getSimpleName();
    }

    public C3669TI(C4490ge c4490ge, C3668TH c3668th) {
        super(c4490ge, A01(c4490ge), (SQLiteDatabase.CursorFactory) null, 4);
        if (c3668th != null) {
            this.A00 = c3668th;
            return;
        }
        throw new IllegalArgumentException(A00(41, 32, 2));
    }

    public static String A01(C4490ge c4490ge) {
        Locale locale = Locale.US;
        Object[] objArr = {A00(0, 0, 19)};
        String strA00 = A00(126, 8, 41);
        String str = String.format(locale, strA00, objArr);
        if (!C3763Up.A2k(c4490ge)) {
            return str;
        }
        String defaultDbName = c4490ge.getPackageName();
        String processName = ProcessUtils.getProcessName(c4490ge);
        if (!defaultDbName.equals(processName) && !TextUtils.isEmpty(processName)) {
            String defaultDbName2 = String.format(Locale.US, strA00, '_' + processName);
            return defaultDbName2;
        }
        return str;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        for (AbstractC3672TL abstractC3672TL : this.A00.A0M()) {
            abstractC3672TL.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        for (AbstractC3672TL abstractC3672TL : this.A00.A0M()) {
            abstractC3672TL.A08(sQLiteDatabase);
            abstractC3672TL.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(A00(101, 25, 99));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 == 2 && i3 >= 3) {
            sQLiteDatabase.execSQL(A00(73, 28, 105));
        }
        if (i2 <= 3 && i3 >= 4) {
            C3666TF c3666tf = C4442fs.A02;
            sQLiteDatabase.execSQL(A00(11, 30, 124) + c3666tf.A01 + A00(0, 1, 52) + c3666tf.A02 + A00(1, 10, 2));
        }
    }
}
