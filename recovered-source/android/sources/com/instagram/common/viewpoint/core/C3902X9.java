package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.constraintlayout.widget.C1137R;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3902X9 implements InterfaceC3378OW {
    public static C3902X9 A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, C3776V2> A00 = new LinkedHashMap<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = C3902X9.class.getSimpleName();
    }

    public static C3902X9 A00() {
        if (A01 == null) {
            A01 = new C3902X9();
        }
        return A01;
    }

    public final InterfaceC3362OG A03(String str) {
        C3776V2 adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) == strArr[2].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
        strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
        return null;
    }

    public final C3776V2 A04(String str) {
        return this.A00.get(str);
    }

    public final C3776V2 A05(String str, Messenger messenger, String str2) {
        C3776V2 c3776v2 = new C3776V2(str, messenger, str2);
        this.A00.put(str, c3776v2);
        return c3776v2;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C3776V2>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (zHasNext) {
                InterfaceC3362OG interfaceC3362OG = it.next().getValue().A00;
                if (interfaceC3362OG != null) {
                    interfaceC3362OG.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i2, String str, Bundle bundle, Messenger messenger) {
        try {
            Message messageObtain = Message.obtain((Handler) null, i2);
            if (str != null) {
                messageObtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                messageObtain.getData().putBundle(A01(0, 17, C1137R.styleable.ConstraintSet_pathMotionArc), bundle);
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C3776V2 c3776v2 = this.A00.get(str);
        if (c3776v2 != null && c3776v2.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            c3776v2.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3378OW
    public final void AEs(int i2, String str, Bundle bundle) {
        C3776V2 adRecord = A04(str);
        if (adRecord != null) {
            A07(i2, str, bundle, adRecord.A02);
        }
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, C3776V2>> it = this.A00.entrySet().iterator();
        while (it.hasNext()) {
            C3776V2 value = it.next().getValue();
            try {
                value.A02.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A03);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (zHasNext) {
                A08((String) it2.next());
            } else {
                return;
            }
        }
    }
}
