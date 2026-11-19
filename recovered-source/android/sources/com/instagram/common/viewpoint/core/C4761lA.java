package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4761lA implements InterfaceC2923H9 {
    public static String[] A0B = {"UBvRkgXOGDkhiRviOullp8V", "VkNaXMTzU8N2w", "EmncOItxREzVuvRcJiesLUTUZ", "GKNHQwhZeE13dvoU8lLSXwuEJRZ0Rb8T", "UfDFEQBLtd8kFCM7fNQpR1e2paOBi7mP", "RVi2VPuM0SECIbGMRSZvlBLvqxfM7S", "lPCpjqdMUX8JsRnbL9v7kcIYKByBL6xe", "JprIbG5eTccKgwX6h6kDKt0luN"};
    public static final InterfaceC2927HD A0C = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.lB
        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final InterfaceC2923H9[] A5N() {
            return C4761lA.A01();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
            return AbstractC2926HC.A01(this, uri, map);
        }
    };
    public long A00;
    public InterfaceC2924HA A01;
    public C4763lC A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray<C3168L7> A07;
    public final C21864v A08;
    public final C219453 A09;
    public final C3167L6 A0A;

    /* JADX WARN: Code duplicated, block: B:73:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b7  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        AbstractC21273y.A02(this.A01);
        long jA8O = interfaceC4855ms.A8O();
        if ((jA8O != -1) && !this.A0A.A0E()) {
            return this.A0A.A0B(interfaceC4855ms, c2945hv);
        }
        A00(jA8O);
        if (this.A02 != null && this.A02.A09()) {
            return this.A02.A06(interfaceC4855ms, c2945hv);
        }
        interfaceC4855ms.AIl();
        long jA8i = jA8O != -1 ? jA8O - interfaceC4855ms.A8i() : -1L;
        if ((jA8i != -1 && jA8i < 4) || !interfaceC4855ms.AGu(this.A08.A0l(), 0, 4, true)) {
            return -1;
        }
        this.A08.A0f(0);
        int iA0C = this.A08.A0C();
        if (iA0C == 441) {
            return -1;
        }
        if (A0B[2].length() == 2) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[5] = "kMhOTVhRWN36SIdb7fVpbVP8KQK8iP";
        strArr[1] = "K6CIMfQf5fCJv";
        if (iA0C == 442) {
            interfaceC4855ms.AGt(this.A08.A0l(), 0, 10);
            this.A08.A0f(9);
            interfaceC4855ms.AK3((this.A08.A0I() & 7) + 14);
            return 0;
        }
        if (iA0C == 443) {
            interfaceC4855ms.AGt(this.A08.A0l(), 0, 2);
            this.A08.A0f(0);
            interfaceC4855ms.AK3(this.A08.A0M() + 6);
            return 0;
        }
        if (((iA0C & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            interfaceC4855ms.AK3(1);
            return 0;
        }
        int i2 = iA0C & 255;
        C3168L7 c3168l7 = this.A07.get(i2);
        if (!this.A03) {
            if (c3168l7 == null) {
                InterfaceC3156Kv c4773lM = null;
                if (i2 == 189) {
                    c4773lM = new C4783lW();
                    this.A04 = true;
                    this.A00 = interfaceC4855ms.A8n();
                } else {
                    int i3 = i2 & 224;
                    if (A0B[7].length() != 26) {
                        A0B[7] = "MD0211Yr4bYXM5L9ZkPBjN7rOQ";
                        if (i3 == 192) {
                            c4773lM = new C4767lG();
                            this.A04 = true;
                            this.A00 = interfaceC4855ms.A8n();
                        } else if ((i2 & 240) == 224) {
                            c4773lM = new C4773lM();
                            this.A05 = true;
                            this.A00 = interfaceC4855ms.A8n();
                        }
                    } else {
                        String[] strArr2 = A0B;
                        strArr2[6] = "PIHtVurnoe8IajroMJlyufhIBiisymoK";
                        strArr2[4] = "tbo4qyhyaN86Rqnk6vLIVirgmw8EdsC9";
                        if (i3 == 192) {
                            c4773lM = new C4767lG();
                            this.A04 = true;
                            this.A00 = interfaceC4855ms.A8n();
                        } else if ((i2 & 240) == 224) {
                            c4773lM = new C4773lM();
                            this.A05 = true;
                            this.A00 = interfaceC4855ms.A8n();
                        }
                    }
                }
                if (c4773lM != null) {
                    c4773lM.A5c(this.A01, new C3177LG(i2, 256));
                    c3168l7 = new C3168L7(c4773lM, this.A09);
                    this.A07.put(i2, c3168l7);
                }
            }
            if (interfaceC4855ms.A8n() > ((this.A04 && this.A05) ? this.A00 + 8192 : 1048576L)) {
                this.A03 = true;
                this.A01.A6O();
            }
        }
        interfaceC4855ms.AGt(this.A08.A0l(), 0, 2);
        this.A08.A0f(0);
        int iA0M = this.A08.A0M() + 6;
        if (c3168l7 == null) {
            interfaceC4855ms.AK3(iA0M);
            return 0;
        }
        this.A08.A0d(iA0M);
        interfaceC4855ms.readFully(this.A08.A0l(), 0, iA0M);
        this.A08.A0f(6);
        c3168l7.A03(this.A08);
        this.A08.A0e(this.A08.A08());
        return 0;
    }

    public C4761lA() {
        this(new C219453(0L));
    }

    public C4761lA(C219453 c219453) {
        this.A09 = c219453;
        this.A08 = new C21864v(4096);
        this.A07 = new SparseArray<>();
        this.A0A = new C3167L6();
    }

    @RequiresNonNull({"output"})
    private void A00(long j2) {
        if (!this.A06) {
            this.A06 = true;
            if (this.A0A.A0C() != -9223372036854775807L) {
                this.A02 = new C4763lC(this.A0A.A0D(), this.A0A.A0C(), j2);
                this.A01.AJ7(this.A02.A07());
            } else {
                this.A01.AJ7(new C4850mn(this.A0A.A0C()));
            }
        }
    }

    public static /* synthetic */ InterfaceC2923H9[] A01() {
        return new InterfaceC2923H9[]{new C4761lA()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A01 = interfaceC2924HA;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        boolean z = false;
        boolean resetTimestampAdjuster = this.A09.A04() == -9223372036854775807L;
        if (!resetTimestampAdjuster) {
            long jA02 = this.A09.A02();
            if (jA02 != -9223372036854775807L && jA02 != 0 && jA02 != j3) {
                z = true;
            }
            resetTimestampAdjuster = z;
        }
        if (resetTimestampAdjuster) {
            this.A09.A07(j3);
        }
        if (this.A02 != null) {
            this.A02.A08(j3);
        }
        for (int i2 = 0; i2 < this.A07.size(); i2++) {
            this.A07.valueAt(i2).A02();
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC4855ms.AGt(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        byte b = bArr[13];
        if (A0B[3].charAt(12) == 'n') {
            throw new RuntimeException();
        }
        A0B[2] = "VV5ZPjEmtEUa5x1ycfEwWXr";
        int packStuffingLength = b & 7;
        interfaceC4855ms.A47(packStuffingLength);
        interfaceC4855ms.AGt(bArr, 0, 3);
        int packStuffingLength2 = bArr[0];
        int i2 = (packStuffingLength2 & 255) << 16;
        int packStuffingLength3 = bArr[1];
        int i3 = i2 | ((packStuffingLength3 & 255) << 8);
        int packStuffingLength4 = bArr[2];
        return 1 == ((packStuffingLength4 & 255) | i3);
    }
}
