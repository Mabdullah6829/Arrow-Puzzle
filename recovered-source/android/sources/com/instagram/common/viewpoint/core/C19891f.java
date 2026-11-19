package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.androidx.media3.common.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1f */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C19891f extends AbstractC2497AE implements Handler.Callback {
    public static byte[] A0C;
    public static String[] A0D = {"NK", "vMUMQm9t3PVEHAhulw0MAIkQwbUiUT4C", "VzHAp2e3DLoJMdzQNED0QcuPK7cYUDq5", "FnbOiwq", "xIduLB4T8250", "Cs28mBuu0mG0MZGGLuKaoZOHc13snW3U", "yvPpy336WGNf4g7OJVDaRPYRY7Bcuv5q", "KVpXSq2ZIE7gcar9k8WJ"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC2972Hw A03;
    public List<ImfDataTrack> A04;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC2584Bd A07;
    public final InterfaceC2586Bf A08;
    public final C24629e A09;
    public final long[] A0A;
    public final Metadata[] A0B;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{86, 97, 97, 124, 97, 51, 122, 125, 51, 99, 114, 97, 96, 122, 125, 116, 51, 90, 94, 85, 51, 96, 99, 118, 112, 124, 84, 69, 80, 85, 80, 69, 80, 99, 84, 95, 85, 84, 67, 84, 67};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A07(Metadata metadata, List<Metadata.Entry> list) {
        for (int i2 = 0; i2 < metadata.A02(); i2++) {
            C5064qI c5064qIA9b = metadata.A03(i2).A9b();
            if (c5064qIA9b == null || !this.A07.AKN(c5064qIA9b)) {
                list.add(metadata.A03(i2));
            } else {
                InterfaceC2972Hw interfaceC2972HwA5J = this.A07.A5J(c5064qIA9b);
                byte[] bArr = (byte[]) AbstractC21273y.A01(metadata.A03(i2).A9a());
                this.A09.A0A();
                this.A09.A0C(bArr.length);
                ((ByteBuffer) AbstractC22035C.A0f(this.A09.A02)).put(bArr);
                this.A09.A0B();
                Metadata metadataA5o = interfaceC2972HwA5J.A5o(this.A09);
                if (metadataA5o != null) {
                    A07(metadataA5o, list);
                }
            }
        }
    }

    static {
        A02();
    }

    public C19891f(InterfaceC2586Bf interfaceC2586Bf, Looper looper) {
        this(interfaceC2586Bf, looper, InterfaceC2584Bd.A00, null);
    }

    public C19891f(InterfaceC2586Bf interfaceC2586Bf, Looper looper, InterfaceC2584Bd interfaceC2584Bd, String str) {
        super(5);
        this.A08 = (InterfaceC2586Bf) AbstractC21273y.A01(interfaceC2586Bf);
        this.A06 = looper == null ? null : AbstractC22035C.A0c(looper, this);
        this.A07 = (InterfaceC2584Bd) AbstractC21273y.A01(interfaceC2584Bd);
        this.A09 = new C24629e();
        this.A0B = new Metadata[5];
        this.A0A = new long[5];
        A08(str);
    }

    private void A01() {
        Arrays.fill(this.A0B, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
    }

    private void A03(long j2) {
        if (this.A04 == null) {
            return;
        }
        for (ImfDataTrack imfDataTrack : this.A04) {
            if (imfDataTrack.A01 > j2 || imfDataTrack.A00 >= j2) {
            }
        }
    }

    private void A04(long j2) {
        if (this.A04 == null) {
            return;
        }
        long jA01 = AbstractC20442Y.A01(j2);
        if (this.A06 != null) {
            this.A06.obtainMessage(1, Long.valueOf(jA01)).sendToTarget();
        } else {
            A03(jA01);
        }
    }

    private void A05(Metadata metadata, long j2) {
        if (this.A06 != null) {
            Handler handler = this.A06;
            String[] strArr = A0D;
            if (strArr[4].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "4kdXpcjsywiaLxx0LOctAJHWIf081Tdg";
            handler.obtainMessage(0, new Object[]{metadata, Long.valueOf(j2)}).sendToTarget();
            return;
        }
        A06(metadata, j2);
    }

    private void A06(Metadata metadata, long j2) {
        this.A08.AEt(metadata, j2);
    }

    private void A08(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = ImfSpecParser.A01(str);
            } catch (JSONException unused) {
                AbstractC21714g.A05(A00(25, 16, 46), A00(0, 25, 12));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1Z() {
        A01();
        this.A03 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1a(long j2, boolean z) {
        A01();
        this.A05 = false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2497AE
    public final void A1c(C5064qI[] c5064qIArr, long j2, long j3) {
        this.A03 = this.A07.A5J(c5064qIArr[0]);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean AAP() {
        return this.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final boolean AAe() {
        return true;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo
    public final void AIX(long j2, long j3) {
        A04(j2);
        if (!this.A05) {
            int i2 = this.A00;
            String[] strArr = A0D;
            if (strArr[7].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0D[6] = "1aiib0Ku6fHDvKwfwiyuvRv8M83XUpBK";
            if (i2 < 5) {
                this.A09.A0A();
                C23146z c23146zA1U = A1U();
                int iA1R = A1R(c23146zA1U, this.A09, 0);
                if (iA1R == -4) {
                    if (this.A09.A05()) {
                        this.A05 = true;
                    } else if (!this.A09.A04()) {
                        this.A09.A00 = this.A02;
                        this.A09.A0B();
                        Metadata metadataA5o = ((InterfaceC2972Hw) AbstractC22035C.A0f(this.A03)).A5o(this.A09);
                        if (metadataA5o != null) {
                            ArrayList arrayList = new ArrayList(metadataA5o.A02());
                            A07(metadataA5o, arrayList);
                            if (!arrayList.isEmpty()) {
                                Metadata metadata = new Metadata(arrayList);
                                int i3 = (this.A01 + this.A00) % 5;
                                this.A0B[i3] = metadata;
                                this.A0A[i3] = this.A09.A01;
                                this.A00++;
                            }
                        }
                    }
                } else if (iA1R == -5) {
                    this.A02 = ((C5064qI) AbstractC21273y.A01(c23146zA1U.A00)).A0M;
                }
            }
        }
        if (this.A00 > 0 && this.A0A[this.A01] <= j2) {
            A05((Metadata) AbstractC22035C.A0f(this.A0B[this.A01]), AbstractC20442Y.A01(j2 - this.A0A[this.A01]));
            this.A0B[this.A01] = null;
            this.A01 = (this.A01 + 1) % 5;
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC23667p
    public final int AKM(C5064qI c5064qI) {
        int i2;
        if (this.A07.AKN(c5064qI)) {
            if (AbstractC19901g.A1G(c5064qI)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            return AbstractC23597i.A00(i2);
        }
        return AbstractC23597i.A00(0);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4973oo, com.instagram.common.viewpoint.core.InterfaceC23667p
    public final String getName() {
        return A00(25, 16, 46);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                Object[] objArr = (Object[]) message.obj;
                A06((Metadata) objArr[0], ((Long) objArr[1]).longValue());
                return true;
            case 1:
                A03(((Long) message.obj).longValue());
                String[] strArr = A0D;
                if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                    throw new RuntimeException();
                }
                A0D[5] = "UckPrHUV0DeFsLdW0mSA3sL7bYTaY94z";
                return true;
            default:
                throw new IllegalStateException();
        }
    }
}
