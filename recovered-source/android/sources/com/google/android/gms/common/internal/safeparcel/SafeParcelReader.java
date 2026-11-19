package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(iDataPosition);
            sb.append(" size=");
            sb.append(iDataSize);
            super(sb.toString());
        }
    }

    private SafeParcelReader() {
    }

    /* JADX INFO: renamed from: a */
    public static BigDecimal m3551a(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i3 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i3);
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m3552b(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m3553c(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return bArrCreateByteArray;
    }

    /* JADX INFO: renamed from: d */
    public static byte[][] m3554d(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        int i3 = parcel.readInt();
        byte[][] bArr = new byte[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM3570t);
        return bArr;
    }

    /* JADX INFO: renamed from: e */
    public static int[] m3555e(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: f */
    public static ArrayList m3556f(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = parcel.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM3570t);
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static Parcelable m3557g(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM3570t);
        return parcelable;
    }

    /* JADX INFO: renamed from: h */
    public static String m3558h(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static String[] m3559i(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return strArrCreateStringArray;
    }

    /* JADX INFO: renamed from: j */
    public static ArrayList m3560j(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: k */
    public static Object[] m3561k(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM3570t);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: l */
    public static ArrayList m3562l(Parcel parcel, int i2, Parcelable.Creator creator) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM3570t);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: m */
    public static void m3563m(int i2, Parcel parcel) {
        if (parcel.dataPosition() != i2) {
            throw new ParseException(AbstractC1456a.m2447n(new StringBuilder(String.valueOf(i2).length() + 26), "Overread allowed size end=", i2), parcel);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m3564n(int i2, Parcel parcel) {
        m3573w(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: o */
    public static float m3565o(int i2, Parcel parcel) {
        m3573w(parcel, i2, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: renamed from: p */
    public static IBinder m3566p(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iM3570t == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM3570t);
        return strongBinder;
    }

    /* JADX INFO: renamed from: q */
    public static int m3567q(int i2, Parcel parcel) {
        m3573w(parcel, i2, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: r */
    public static long m3568r(int i2, Parcel parcel) {
        m3573w(parcel, i2, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: s */
    public static Long m3569s(int i2, Parcel parcel) {
        int iM3570t = m3570t(i2, parcel);
        if (iM3570t == 0) {
            return null;
        }
        m3574x(parcel, iM3570t, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* JADX INFO: renamed from: t */
    public static int m3570t(int i2, Parcel parcel) {
        return (i2 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: u */
    public static void m3571u(int i2, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + m3570t(i2, parcel));
    }

    /* JADX INFO: renamed from: v */
    public static int m3572v(Parcel parcel) {
        int i2 = parcel.readInt();
        int iM3570t = m3570t(i2, parcel);
        char c = (char) i2;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i2))), parcel);
        }
        int i3 = iM3570t + iDataPosition;
        if (i3 >= iDataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        throw new ParseException(AbstractC1456a.m2449p(new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i3).length()), "Size read is invalid start=", iDataPosition, " end=", i3), parcel);
    }

    /* JADX INFO: renamed from: w */
    public static void m3573w(Parcel parcel, int i2, int i3) {
        int iM3570t = m3570t(i2, parcel);
        if (iM3570t == i3) {
            return;
        }
        String hexString = Integer.toHexString(iM3570t);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iM3570t).length() + 4 + 1);
        AbstractC1456a.m2455v(sb, "Expected size ", i3, " got ", iM3570t);
        throw new ParseException(AbstractC1456a.m2450q(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: renamed from: x */
    public static void m3574x(Parcel parcel, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i2).length() + 4 + 1);
        AbstractC1456a.m2455v(sb, "Expected size ", i3, " got ", i2);
        throw new ParseException(AbstractC1456a.m2450q(sb, " (0x", hexString, ")"), parcel);
    }
}
