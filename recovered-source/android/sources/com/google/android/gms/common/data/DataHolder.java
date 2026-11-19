package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new zad();

    /* JADX INFO: renamed from: s */
    public final int f4388s;

    /* JADX INFO: renamed from: t */
    public final String[] f4389t;

    /* JADX INFO: renamed from: u */
    public Bundle f4390u;

    /* JADX INFO: renamed from: v */
    public final CursorWindow[] f4391v;

    /* JADX INFO: renamed from: w */
    public final int f4392w;

    /* JADX INFO: renamed from: x */
    public final Bundle f4393x;

    /* JADX INFO: renamed from: y */
    public int[] f4394y;

    /* JADX INFO: renamed from: z */
    public boolean f4395z = false;

    /* JADX INFO: renamed from: A */
    public final boolean f4387A = true;

    public static class Builder {
    }

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i2, String[] strArr, CursorWindow[] cursorWindowArr, int i3, Bundle bundle) {
        this.f4388s = i2;
        this.f4389t = strArr;
        this.f4391v = cursorWindowArr;
        this.f4392w = i3;
        this.f4393x = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f4395z) {
                    this.f4395z = true;
                    int i2 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f4391v;
                        if (i2 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i2].close();
                        i2++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.f4387A && this.f4391v.length > 0) {
                synchronized (this) {
                    z = this.f4395z;
                }
                if (!z) {
                    close();
                    String string = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(string);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3584j(parcel, 1, this.f4389t);
        SafeParcelWriter.m3586l(parcel, 2, this.f4391v, i2);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4392w);
        SafeParcelWriter.m3575a(4, this.f4393x, parcel);
        SafeParcelWriter.m3588n(parcel, 1000, 4);
        parcel.writeInt(this.f4388s);
        SafeParcelWriter.m3590p(iM3589o, parcel);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
