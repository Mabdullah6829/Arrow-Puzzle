package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4781lU implements InterfaceC2923H9 {
    public static String[] A03 = {"MPtFkEiIPrQJk6C68eapJqoHhp6zbLCW", "P1eCuU1JvuL46IL3Xh4EOSVLMCcJCOjT", "W4WpROs4sm5j6Tf0ztR0Y16lEj4WGQ", "4wLB1kD6U2fJ8LvWKaQYimBngFnzynrL", "j1g6H1G7HHWswscQmxGermXRDRDROF5f", "vYNShvJ8K3s57yIlGqGLfJHMZKUSU02I", "LyEFdcIU17ooQUQ0BZMXWJLXZvdofmIX", "P7XGal"};
    public static final InterfaceC2927HD A04 = new InterfaceC2927HD() { // from class: com.facebook.ads.redexgen.X.lV
        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final InterfaceC2923H9[] A5N() {
            return C4781lU.A00();
        }

        @Override // com.instagram.common.viewpoint.core.InterfaceC2927HD
        public final /* synthetic */ InterfaceC2923H9[] A5O(Uri uri, Map map) {
            return AbstractC2926HC.A01(this, uri, map);
        }
    };
    public boolean A00;
    public final C4780lT A02 = new C4780lT();
    public final C21864v A01 = new C21864v(16384);

    public static /* synthetic */ InterfaceC2923H9[] A00() {
        return new InterfaceC2923H9[]{new C4781lU()};
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AAC(InterfaceC2924HA interfaceC2924HA) {
        this.A02.A5c(interfaceC2924HA, new C3177LG(0, 1));
        interfaceC2924HA.A6O();
        interfaceC2924HA.AJ7(new C4850mn(-9223372036854775807L));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final int AHL(InterfaceC4855ms interfaceC4855ms, C2945HV c2945hv) throws IOException {
        int i2 = interfaceC4855ms.read(this.A01.A0l(), 0, 16384);
        if (i2 == -1) {
            return -1;
        }
        this.A01.A0f(0);
        this.A01.A0e(i2);
        if (!this.A00) {
            this.A02.AGq(0L, 4);
            this.A00 = true;
        }
        this.A02.A5A(this.A01);
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final void AJ6(long j2, long j3) {
        this.A00 = false;
        this.A02.AJ5();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2923H9
    public final boolean AK5(InterfaceC4855ms interfaceC4855ms) throws IOException {
        C21864v c21864v = new C21864v(10);
        int length = 0;
        while (true) {
            byte[] bArrA0l = c21864v.A0l();
            if (A03[3].charAt(10) != 'f') {
                throw new RuntimeException();
            }
            A03[3] = "dKI30oOFAvfBQiacazr45UFgS6k9aj5a";
            interfaceC4855ms.AGt(bArrA0l, 0, 10);
            c21864v.A0f(0);
            if (c21864v.A0K() != 4801587) {
                interfaceC4855ms.AIl();
                interfaceC4855ms.A47(length);
                int i2 = length;
                int syncBytes = 0;
                while (true) {
                    interfaceC4855ms.AGt(c21864v.A0l(), 0, 7);
                    c21864v.A0f(0);
                    int headerPosition = c21864v.A0M();
                    if (headerPosition != 44096 && headerPosition != 44097) {
                        syncBytes = 0;
                        interfaceC4855ms.AIl();
                        i2++;
                        if (i2 - length >= 8192) {
                            return false;
                        }
                        interfaceC4855ms.A47(i2);
                    } else {
                        syncBytes++;
                        if (syncBytes >= 4) {
                            return true;
                        }
                        int headerPosition2 = AbstractC2908Gu.A02(c21864v.A0l(), headerPosition);
                        if (headerPosition2 == -1) {
                            return false;
                        }
                        interfaceC4855ms.A47(headerPosition2 - 7);
                    }
                }
            } else {
                c21864v.A0g(3);
                int iA0H = c21864v.A0H();
                length += iA0H + 10;
                interfaceC4855ms.A47(iA0H);
            }
        }
    }
}
