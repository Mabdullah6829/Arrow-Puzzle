package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f5 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4393f5 implements InterfaceC3676TP {
    public static byte[] A04;
    public Context A00;
    public final InterfaceC3675TO A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C3673TM A01 = A00();

    static {
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{113, 101, 122, 106, 102, 112, 97, 97, 124, 123, 114, 102, 106, 126, 112, 108};
    }

    public C4393f5(Context context, InterfaceC3675TO interfaceC3675TO) {
        this.A00 = context;
        this.A02 = interfaceC3675TO;
    }

    private C3673TM A00() {
        return C3673TM.A00(AbstractC3856WN.A00(this.A00).getString(A01(0, 16, 100), null));
    }

    private void A02() {
        this.A02.ACV(new C4398fA(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C3673TM c3673tm = new C3673TM(strArr, num, num2);
        C3673TM newSettings = this.A01;
        if (c3673tm.equals(newSettings)) {
            return;
        }
        this.A01 = c3673tm;
        this.A03.set(true);
        SharedPreferences.Editor editorEdit = AbstractC3856WN.A00(this.A00).edit();
        C3673TM newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 100), newSettings2.A07()).apply();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3676TP
    public final C3673TM A7k() {
        A02();
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3676TP
    public final boolean AAh() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0a = C3763Up.A0a(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = setA0a.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3676TP
    public final boolean AJw() {
        A02();
        return this.A03.getAndSet(false);
    }
}
