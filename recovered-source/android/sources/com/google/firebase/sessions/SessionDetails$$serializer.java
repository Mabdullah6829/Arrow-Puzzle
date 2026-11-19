package com.google.firebase.sessions;

import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.UnknownFieldException;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;
import p025O0.AbstractC0486k;
import p025O0.C0481f;
import p025O0.C0484i;
import p025O0.C0488m;
import p025O0.C0492q;
import p025O0.InterfaceC0480e;
import p029Q0.C0511k;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class SessionDetails$$serializer implements InterfaceC0480e {
    public static final SessionDetails$$serializer INSTANCE;
    private static final InterfaceC0339d descriptor;

    static {
        SessionDetails$$serializer sessionDetails$$serializer = new SessionDetails$$serializer();
        INSTANCE = sessionDetails$$serializer;
        C0488m c0488m = new C0488m("com.google.firebase.sessions.SessionDetails", sessionDetails$$serializer, 4);
        c0488m.m1178j("sessionId", false);
        c0488m.m1178j("firstSessionId", false);
        c0488m.m1178j("sessionIndex", false);
        c0488m.m1178j("sessionStartTimestampUs", false);
        descriptor = c0488m;
    }

    private SessionDetails$$serializer() {
    }

    @Override // p025O0.InterfaceC0480e
    public final InterfaceC0325a[] childSerializers() {
        C0492q c0492q = C0492q.f1040a;
        return new InterfaceC0325a[]{c0492q, c0492q, C0481f.f1010a, C0484i.f1016a};
    }

    @Override // p018K0.InterfaceC0325a
    public final SessionDetails deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        InterfaceC0339d interfaceC0339d = descriptor;
        C0511k c0511kMo950a = decoder.mo950a(interfaceC0339d);
        int i2 = 0;
        int iM1204j = 0;
        String strM1208n = null;
        String strM1208n2 = null;
        long jM1205k = 0;
        boolean z = true;
        while (z) {
            int iM1203i = c0511kMo950a.m1203i(interfaceC0339d);
            if (iM1203i == -1) {
                z = false;
            } else if (iM1203i == 0) {
                strM1208n = c0511kMo950a.m1208n(interfaceC0339d, 0);
                i2 |= 1;
            } else if (iM1203i == 1) {
                strM1208n2 = c0511kMo950a.m1208n(interfaceC0339d, 1);
                i2 |= 2;
            } else if (iM1203i == 2) {
                iM1204j = c0511kMo950a.m1204j(interfaceC0339d, 2);
                i2 |= 4;
            } else {
                if (iM1203i != 3) {
                    throw new UnknownFieldException(iM1203i);
                }
                jM1205k = c0511kMo950a.m1205k(interfaceC0339d, 3);
                i2 |= 8;
            }
        }
        c0511kMo950a.m1209o(interfaceC0339d);
        return new SessionDetails(i2, strM1208n, strM1208n2, iM1204j, jM1205k, null);
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return descriptor;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c encoder, SessionDetails value) {
        AbstractC6452k.m12181e(encoder, "encoder");
        AbstractC6452k.m12181e(value, "value");
        InterfaceC0339d interfaceC0339d = descriptor;
        InterfaceC0455a interfaceC0455aMo958a = encoder.mo958a(interfaceC0339d);
        SessionDetails.write$Self$com_google_firebase_firebase_sessions(value, interfaceC0455aMo958a, interfaceC0339d);
        interfaceC0455aMo958a.mo948f(interfaceC0339d);
    }

    @Override // p025O0.InterfaceC0480e
    public InterfaceC0325a[] typeParametersSerializers() {
        return AbstractC0486k.f1021b;
    }
}
