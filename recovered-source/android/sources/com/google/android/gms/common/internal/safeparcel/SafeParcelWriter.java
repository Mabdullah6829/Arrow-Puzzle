package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    /* JADX INFO: renamed from: a */
    public static void m3575a(int i2, Bundle bundle, Parcel parcel) {
        if (bundle == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeBundle(bundle);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m3576b(Parcel parcel, int i2, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeByteArray(bArr);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: c */
    public static void m3577c(Parcel parcel, int i2, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: d */
    public static void m3578d(Parcel parcel, int i2, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeStrongBinder(iBinder);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: e */
    public static void m3579e(Parcel parcel, int i2, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeIntArray(iArr);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: f */
    public static void m3580f(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeInt(((Integer) list.get(i3)).intValue());
        }
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: g */
    public static void m3581g(Parcel parcel, int i2, Long l2) {
        if (l2 == null) {
            return;
        }
        m3588n(parcel, i2, 8);
        parcel.writeLong(l2.longValue());
    }

    /* JADX INFO: renamed from: h */
    public static void m3582h(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcelable.writeToParcel(parcel, i3);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: i */
    public static void m3583i(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeString(str);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: j */
    public static void m3584j(Parcel parcel, int i2, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeStringArray(strArr);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: k */
    public static void m3585k(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeStringList(list);
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: l */
    public static void m3586l(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: m */
    public static void m3587m(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int iM3589o = m3589o(i2, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        m3590p(iM3589o, parcel);
    }

    /* JADX INFO: renamed from: n */
    public static void m3588n(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    /* JADX INFO: renamed from: o */
    public static int m3589o(int i2, Parcel parcel) {
        parcel.writeInt(i2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: p */
    public static void m3590p(int i2, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(iDataPosition - i2);
        parcel.setDataPosition(iDataPosition);
    }
}
