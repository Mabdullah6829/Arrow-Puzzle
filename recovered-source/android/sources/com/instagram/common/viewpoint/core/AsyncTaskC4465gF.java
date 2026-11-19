package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AsyncTaskC4465gF extends AsyncTask<String, Void, C4466gG> {
    public static byte[] A05;
    public static String[] A06 = {"naFNcZuGe", "C9JAYYW4", "8H9N3VrVfLlJ9IUdYMoO", "YylQBw7bkupjVtNcwFivzoGwGcTau", "utPcy8I9vNMcCezdgtn", "ehhspVm5", "7sb5kaLRz1R8p", "m"};
    public static final String A07;
    public static final Set<String> A08;
    public C3659T8 A00;
    public InterfaceC4444fu A01;
    public InterfaceC4464gE A02;
    public Map<String, String> A03;
    public Map<String, String> A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final C4466gG A00(String... strArr) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        String[] strArr2 = A06;
        if (strArr2[4].length() == strArr2[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A06;
        strArr3[3] = "OBWBCzNqNMhSgl0vUrcBODbII9DBW";
        strArr3[2] = "nuEeWi2rsMih0JuNdplL";
        try {
            String str = strArr[0];
            if (!TextUtils.isEmpty(str) && !A08.contains(str)) {
                String strA02 = A02(str);
                if (this.A03 != null && !this.A03.isEmpty()) {
                    for (Map.Entry<String, String> entry : this.A03.entrySet()) {
                        strA02 = A03(strA02, entry.getKey(), entry.getValue());
                    }
                }
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 > 2) {
                        return null;
                    }
                    if (A06(strA02)) {
                        return new C4466gG(this.A01);
                    }
                    i2 = i3;
                }
            }
            return null;
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 62, 43, 105, 56, 15, 15, 18, 15, 93, 18, 13, 24, 19, 20, 19, 26, 93, 8, 15, 17, 71, 93, 15, 0, 15, 2, 1, 9, 54, 45, 52, 52};
    }

    static {
        A04();
        A07 = AsyncTaskC4465gF.class.getSimpleName();
        A08 = new HashSet();
        A08.add(A01(0, 1, 15));
        A08.add(A01(29, 4, 63));
    }

    public AsyncTaskC4465gF(C3659T8 c3659t8) {
        this(c3659t8, null, null);
    }

    public AsyncTaskC4465gF(C3659T8 c3659t8, Map<String, String> extraData) {
        this(c3659t8, extraData, null);
    }

    public AsyncTaskC4465gF(C3659T8 c3659t8, Map<String, String> extraData, Map<String, String> postData) {
        this.A00 = c3659t8;
        this.A03 = extraData != null ? new HashMap(extraData) : null;
        this.A04 = postData != null ? new HashMap(postData) : null;
    }

    private String A02(String str) {
        try {
            return A03(str, A01(23, 6, 9), AbstractC3932Xd.A01(this.A00.A04().A6w()));
        } catch (Exception unused) {
            return str;
        }
    }

    private String A03(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return str;
        }
        String strA01 = A01(3, 1, 49);
        if (str.contains(strA01)) {
            strA01 = A01(1, 1, 127);
        }
        StringBuilder sbAppend = new StringBuilder().append(str).append(strA01).append(str2);
        String prepend = A01(2, 1, 113);
        StringBuilder sbAppend2 = sbAppend.append(prepend);
        String prepend2 = URLEncoder.encode(str3);
        return sbAppend2.append(prepend2).toString();
    }

    private final void A05(C4466gG response) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A02 != null) {
                this.A02.AHC(response);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }

    private boolean A06(String str) {
        InterfaceC4444fu interfaceC4444fuAGw;
        InterfaceC4445fv interfaceC4445fvA00 = C4463gD.A00(this.A00);
        try {
            if (this.A04 == null || this.A04.size() == 0) {
                interfaceC4444fuAGw = interfaceC4445fvA00.AGw(str, new C4459g9());
            } else {
                C4459g9 params = new C4459g9();
                params.A05(this.A04);
                interfaceC4444fuAGw = interfaceC4445fvA00.AGx(str, params.A08());
            }
            this.A01 = interfaceC4444fuAGw;
        } catch (Exception e) {
            Log.e(A07, A01(4, 19, 26) + str, e);
        }
        return this.A01 != null && this.A01.A9C() == 200;
    }

    public final void A07(InterfaceC4464gE interfaceC4464gE) {
        this.A02 = interfaceC4464gE;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ C4466gG doInBackground(String[] strArr) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return null;
        }
        try {
            return A00(strArr);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        if (this.A02 != null) {
            this.A02.AHA();
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(C4466gG c4466gG) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            A05(c4466gG);
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }
}
