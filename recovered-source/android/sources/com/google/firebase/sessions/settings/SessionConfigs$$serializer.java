package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.UnknownFieldException;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;
import p025O0.AbstractC0486k;
import p025O0.C0476a;
import p025O0.C0478c;
import p025O0.C0481f;
import p025O0.C0484i;
import p025O0.C0488m;
import p025O0.InterfaceC0480e;
import p029Q0.C0511k;
import p037U0.AbstractC0846b;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class SessionConfigs$$serializer implements InterfaceC0480e {
    public static final SessionConfigs$$serializer INSTANCE;
    private static final InterfaceC0339d descriptor;

    static {
        SessionConfigs$$serializer sessionConfigs$$serializer = new SessionConfigs$$serializer();
        INSTANCE = sessionConfigs$$serializer;
        C0488m c0488m = new C0488m("com.google.firebase.sessions.settings.SessionConfigs", sessionConfigs$$serializer, 5);
        c0488m.m1178j("sessionsEnabled", false);
        c0488m.m1178j("sessionSamplingRate", false);
        c0488m.m1178j("sessionTimeoutSeconds", false);
        c0488m.m1178j("cacheDurationSeconds", false);
        c0488m.m1178j("cacheUpdatedTimeSeconds", false);
        descriptor = c0488m;
    }

    private SessionConfigs$$serializer() {
    }

    @Override // p025O0.InterfaceC0480e
    public final InterfaceC0325a[] childSerializers() {
        InterfaceC0325a interfaceC0325aM1750i = AbstractC0846b.m1750i(C0476a.f1001a);
        InterfaceC0325a interfaceC0325aM1750i2 = AbstractC0846b.m1750i(C0478c.f1003a);
        C0481f c0481f = C0481f.f1010a;
        return new InterfaceC0325a[]{interfaceC0325aM1750i, interfaceC0325aM1750i2, AbstractC0846b.m1750i(c0481f), AbstractC0846b.m1750i(c0481f), AbstractC0846b.m1750i(C0484i.f1016a)};
    }

    @Override // p018K0.InterfaceC0325a
    public final SessionConfigs deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        InterfaceC0339d interfaceC0339d = descriptor;
        C0511k c0511kMo950a = decoder.mo950a(interfaceC0339d);
        int i2 = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l2 = null;
        boolean z = true;
        while (z) {
            int iM1203i = c0511kMo950a.m1203i(interfaceC0339d);
            if (iM1203i == -1) {
                z = false;
            } else if (iM1203i == 0) {
                bool = (Boolean) c0511kMo950a.m1206l(interfaceC0339d, 0, C0476a.f1001a, bool);
                i2 |= 1;
            } else if (iM1203i == 1) {
                d = (Double) c0511kMo950a.m1206l(interfaceC0339d, 1, C0478c.f1003a, d);
                i2 |= 2;
            } else if (iM1203i == 2) {
                num = (Integer) c0511kMo950a.m1206l(interfaceC0339d, 2, C0481f.f1010a, num);
                i2 |= 4;
            } else if (iM1203i == 3) {
                num2 = (Integer) c0511kMo950a.m1206l(interfaceC0339d, 3, C0481f.f1010a, num2);
                i2 |= 8;
            } else {
                if (iM1203i != 4) {
                    throw new UnknownFieldException(iM1203i);
                }
                l2 = (Long) c0511kMo950a.m1206l(interfaceC0339d, 4, C0484i.f1016a, l2);
                i2 |= 16;
            }
        }
        c0511kMo950a.m1209o(interfaceC0339d);
        return new SessionConfigs(i2, bool, d, num, num2, l2, null);
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return descriptor;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c encoder, SessionConfigs value) {
        AbstractC6452k.m12181e(encoder, "encoder");
        AbstractC6452k.m12181e(value, "value");
        InterfaceC0339d interfaceC0339d = descriptor;
        InterfaceC0455a interfaceC0455aMo958a = encoder.mo958a(interfaceC0339d);
        SessionConfigs.write$Self$com_google_firebase_firebase_sessions(value, interfaceC0455aMo958a, interfaceC0339d);
        interfaceC0455aMo958a.mo948f(interfaceC0339d);
    }

    @Override // p025O0.InterfaceC0480e
    public InterfaceC0325a[] typeParametersSerializers() {
        return AbstractC0486k.f1021b;
    }
}
