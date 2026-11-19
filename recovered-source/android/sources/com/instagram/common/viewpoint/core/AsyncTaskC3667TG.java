package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.TG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AsyncTaskC3667TG<T> extends AsyncTask<Void, Void, T> {
    public static byte[] A04;
    public EnumC3670TJ A00;
    public final C4490ge A01;
    public final AbstractC3671TK<T> A02;
    public final AbstractC3736UO<T> A03;

    static {
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TK != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public AsyncTaskC3667TG(C4490ge c4490ge, AbstractC3671TK<T> abstractC3671TK, AbstractC3736UO<T> abstractC3736UO) {
        this.A02 = abstractC3671TK;
        this.A03 = abstractC3736UO;
        this.A01 = c4490ge;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    private final T A00(Void... voidArr) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        T tA03 = null;
        try {
            try {
                tA03 = this.A02.A03();
                this.A00 = this.A02.A00();
                return tA03;
            } catch (Exception e) {
                this.A01.A08().ABC(A01(0, 8, 89), AbstractC3690Td.A0w, new C3691Te(e));
                this.A00 = EnumC3670TJ.A08;
                return tA03;
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final void onPostExecute(T result) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(result);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
