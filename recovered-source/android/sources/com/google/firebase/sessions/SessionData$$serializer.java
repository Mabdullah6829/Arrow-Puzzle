package com.google.firebase.sessions;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.UnknownFieldException;
import p018K0.InterfaceC0325a;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p023N0.InterfaceC0456b;
import p023N0.InterfaceC0457c;
import p025O0.AbstractC0486k;
import p025O0.AbstractC0491p;
import p025O0.C0488m;
import p025O0.InterfaceC0480e;
import p029Q0.C0511k;
import p037U0.AbstractC0846b;
import p057d0.InterfaceC6281c;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class SessionData$$serializer implements InterfaceC0480e {
    public static final SessionData$$serializer INSTANCE;
    private static final InterfaceC0339d descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        C0488m c0488m = new C0488m("com.google.firebase.sessions.SessionData", sessionData$$serializer, 3);
        c0488m.m1178j("sessionDetails", false);
        c0488m.m1178j("backgroundTime", true);
        c0488m.m1178j("processDataMap", true);
        descriptor = c0488m;
    }

    private SessionData$$serializer() {
    }

    @Override // p025O0.InterfaceC0480e
    public final InterfaceC0325a[] childSerializers() {
        return new InterfaceC0325a[]{SessionDetails$$serializer.INSTANCE, AbstractC0846b.m1750i(Time$$serializer.INSTANCE), AbstractC0846b.m1750i((InterfaceC0325a) SessionData.$childSerializers[2].getValue())};
    }

    @Override // p018K0.InterfaceC0325a
    public final SessionData deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        InterfaceC0339d interfaceC0339d = descriptor;
        C0511k c0511kMo950a = decoder.mo950a(interfaceC0339d);
        InterfaceC6281c[] interfaceC6281cArr = SessionData.$childSerializers;
        int i2 = 0;
        SessionDetails sessionDetails = null;
        Time time = null;
        Map map = null;
        boolean z = true;
        while (z) {
            int iM1203i = c0511kMo950a.m1203i(interfaceC0339d);
            if (iM1203i == -1) {
                z = false;
            } else if (iM1203i == 0) {
                sessionDetails = (SessionDetails) c0511kMo950a.m1207m(interfaceC0339d, 0, SessionDetails$$serializer.INSTANCE, sessionDetails);
                i2 |= 1;
            } else if (iM1203i == 1) {
                time = (Time) c0511kMo950a.m1206l(interfaceC0339d, 1, Time$$serializer.INSTANCE, time);
                i2 |= 2;
            } else {
                if (iM1203i != 2) {
                    throw new UnknownFieldException(iM1203i);
                }
                map = (Map) c0511kMo950a.m1206l(interfaceC0339d, 2, (InterfaceC0325a) interfaceC6281cArr[2].getValue(), map);
                i2 |= 4;
            }
        }
        c0511kMo950a.m1209o(interfaceC0339d);
        return new SessionData(i2, sessionDetails, time, map, (AbstractC0491p) null);
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return descriptor;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c encoder, SessionData value) {
        AbstractC6452k.m12181e(encoder, "encoder");
        AbstractC6452k.m12181e(value, "value");
        InterfaceC0339d interfaceC0339d = descriptor;
        InterfaceC0455a interfaceC0455aMo958a = encoder.mo958a(interfaceC0339d);
        SessionData.write$Self$com_google_firebase_firebase_sessions(value, interfaceC0455aMo958a, interfaceC0339d);
        interfaceC0455aMo958a.mo948f(interfaceC0339d);
    }

    @Override // p025O0.InterfaceC0480e
    public InterfaceC0325a[] typeParametersSerializers() {
        return AbstractC0486k.f1021b;
    }
}
