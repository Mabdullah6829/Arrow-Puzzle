package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4703kB extends AbstractRunnableC3871Wc {
    public static byte[] A02;
    public final /* synthetic */ C3292N8 A00;
    public final /* synthetic */ String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-77, -65, -78, -66, -62, -78, -69, -80, -58, -84, -80, -82, -67, -67, -74, -69, -76};
    }

    public C4703kB(C3292N8 c3292n8, String str) {
        this.A00 = c3292n8;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        try {
            this.A00.A06.await();
            synchronized (this.A00.A02) {
                try {
                    Iterator<String> itKeys = this.A00.A02.A05().keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (this.A00.A0J(this.A01)) {
                            this.A00.A0E((C3325Nf) this.A00.A02.A05().get(next), next, next.equals(this.A01));
                        }
                    }
                    this.A00.A02.A06();
                    this.A00.A08();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (InterruptedException e) {
            InterfaceC3689Tc interfaceC3689TcA08 = this.A00.A03.A08();
            String encryptedId = A00(0, 17, 22);
            interfaceC3689TcA08.ABC(encryptedId, AbstractC3690Td.A1B, new C3691Te(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            InterfaceC3689Tc interfaceC3689TcA09 = this.A00.A03.A08();
            String encryptedId2 = A00(0, 17, 22);
            interfaceC3689TcA09.ABC(encryptedId2, AbstractC3690Td.A1A, new C3691Te(e2));
        }
    }
}
