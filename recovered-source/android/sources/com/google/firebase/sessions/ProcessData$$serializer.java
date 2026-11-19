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
import p025O0.C0488m;
import p025O0.C0492q;
import p025O0.InterfaceC0480e;
import p029Q0.C0511k;

/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class ProcessData$$serializer implements InterfaceC0480e {
    public static final ProcessData$$serializer INSTANCE;
    private static final InterfaceC0339d descriptor;

    static {
        ProcessData$$serializer processData$$serializer = new ProcessData$$serializer();
        INSTANCE = processData$$serializer;
        C0488m c0488m = new C0488m("com.google.firebase.sessions.ProcessData", processData$$serializer, 2);
        c0488m.m1178j("pid", false);
        c0488m.m1178j("uuid", false);
        descriptor = c0488m;
    }

    private ProcessData$$serializer() {
    }

    @Override // p025O0.InterfaceC0480e
    public final InterfaceC0325a[] childSerializers() {
        return new InterfaceC0325a[]{C0481f.f1010a, C0492q.f1040a};
    }

    @Override // p018K0.InterfaceC0325a
    public final ProcessData deserialize(InterfaceC0456b decoder) {
        AbstractC6452k.m12181e(decoder, "decoder");
        InterfaceC0339d interfaceC0339d = descriptor;
        C0511k c0511kMo950a = decoder.mo950a(interfaceC0339d);
        boolean z = true;
        int i2 = 0;
        int iM1204j = 0;
        String strM1208n = null;
        while (z) {
            int iM1203i = c0511kMo950a.m1203i(interfaceC0339d);
            if (iM1203i == -1) {
                z = false;
            } else if (iM1203i == 0) {
                iM1204j = c0511kMo950a.m1204j(interfaceC0339d, 0);
                i2 |= 1;
            } else {
                if (iM1203i != 1) {
                    throw new UnknownFieldException(iM1203i);
                }
                strM1208n = c0511kMo950a.m1208n(interfaceC0339d, 1);
                i2 |= 2;
            }
        }
        c0511kMo950a.m1209o(interfaceC0339d);
        return new ProcessData(i2, iM1204j, strM1208n, null);
    }

    @Override // p018K0.InterfaceC0325a
    public final InterfaceC0339d getDescriptor() {
        return descriptor;
    }

    @Override // p018K0.InterfaceC0325a
    public final void serialize(InterfaceC0457c encoder, ProcessData value) {
        AbstractC6452k.m12181e(encoder, "encoder");
        AbstractC6452k.m12181e(value, "value");
        InterfaceC0339d interfaceC0339d = descriptor;
        InterfaceC0455a interfaceC0455aMo958a = encoder.mo958a(interfaceC0339d);
        ProcessData.write$Self$com_google_firebase_firebase_sessions(value, interfaceC0455aMo958a, interfaceC0339d);
        interfaceC0455aMo958a.mo948f(interfaceC0339d);
    }

    @Override // p025O0.InterfaceC0480e
    public InterfaceC0325a[] typeParametersSerializers() {
        return AbstractC0486k.f1021b;
    }
}
