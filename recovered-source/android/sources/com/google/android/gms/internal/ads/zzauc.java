package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzauc {

    /* JADX INFO: renamed from: d */
    public static final Comparator f6930d = new zzaub();

    /* JADX INFO: renamed from: a */
    public final ArrayList f6931a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f6932b = new ArrayList(64);

    /* JADX INFO: renamed from: c */
    public int f6933c = 0;

    /* JADX INFO: renamed from: a */
    public final synchronized byte[] m4408a(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f6932b;
            if (i3 >= arrayList.size()) {
                return new byte[i2];
            }
            byte[] bArr = (byte[]) arrayList.get(i3);
            int length = bArr.length;
            if (length >= i2) {
                this.f6933c -= length;
                arrayList.remove(i3);
                this.f6931a.remove(bArr);
                return bArr;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4409b(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f6931a.add(bArr);
                ArrayList arrayList = this.f6932b;
                int iBinarySearch = Collections.binarySearch(arrayList, bArr, f6930d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                arrayList.add(iBinarySearch, bArr);
                this.f6933c += length;
                synchronized (this) {
                    while (this.f6933c > 4096) {
                        byte[] bArr2 = (byte[]) this.f6931a.remove(0);
                        this.f6932b.remove(bArr2);
                        this.f6933c -= bArr2.length;
                    }
                }
            }
        }
    }
}
