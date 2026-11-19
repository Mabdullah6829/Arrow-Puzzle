package com.instagram.common.viewpoint.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import androidx.constraintlayout.widget.C1137R;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4717kQ implements InterfaceC3266Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C3265Mg> A02 = new SparseArray<>();
    public final InterfaceC22155O A03;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 41, 20, 3, 60, 0, 13, 21, 9, 30, 47, 13, 15, 4, 9, 37, 2, 8, 9, 20, 88, 85, 18, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AAs(HashMap<String, C3265Mg> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC21273y.A08(this.A02.size() == 0);
        try {
            if (AbstractC22175Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC21273y.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    C3265Mg c3265Mg = new C3265Mg(cursorA00.getInt(0), (String) AbstractC21273y.A01(cursorA00.getString(1)), C3267Mi.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c3265Mg.A02, c3265Mg);
                    sparseArray.put(c3265Mg.A01, c3265Mg.A02);
                } catch (Throwable th2) {
                    if (cursorA00 != null) {
                        try {
                            cursorA00.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e) {
            map.clear();
            sparseArray.clear();
            throw new C22145N(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AKJ(HashMap<String, C3265Mg> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i2 = 0; i2 < this.A02.size(); i2++) {
                try {
                    C3265Mg c3265MgValueAt = this.A02.valueAt(i2);
                    if (c3265MgValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i2));
                    } else {
                        A06(writableDatabase, c3265MgValueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new C22145N(e);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(136, 3, 37), A01(139, 8, 1)};
    }

    public C4717kQ(InterfaceC22155O interfaceC22155O) {
        this.A03 = interfaceC22155O;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC21273y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C22145N {
        AbstractC22175Q.A04(sQLiteDatabase, 1, (String) AbstractC21273y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC21273y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i2) {
        sQLiteDatabase.delete((String) AbstractC21273y.A01(this.A01), A01(130, 6, C1137R.styleable.ConstraintSet_transitionPathRotate), new String[]{Integer.toString(i2)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C3265Mg c3265Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3267Mi.A08(c3265Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c3265Mg.A01));
        contentValues.put(A01(136, 3, 37), c3265Mg.A02);
        contentValues.put(A01(139, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC21273y.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(InterfaceC22155O interfaceC22155O, String str) throws C22145N {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = interfaceC22155O.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                AbstractC22175Q.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C22145N(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void A5p() throws C22145N {
        A08(this.A03, (String) AbstractC21273y.A01(this.A00));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final boolean A6S() throws C22145N {
        try {
            return AbstractC22175Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC21273y.A01(this.A00)) != -1;
        } catch (SQLException e) {
            throw new C22145N(e);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AAF(long j2) {
        this.A00 = Long.toHexString(j2);
        this.A01 = A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AFd(C3265Mg c3265Mg, boolean z) {
        if (z) {
            this.A02.delete(c3265Mg.A01);
        } else {
            this.A02.put(c3265Mg.A01, null);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AGK(C3265Mg c3265Mg) {
        this.A02.put(c3265Mg.A01, c3265Mg);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3266Mh
    public final void AKI(HashMap<String, C3265Mg> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C3265Mg> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C22145N(e);
        }
    }
}
