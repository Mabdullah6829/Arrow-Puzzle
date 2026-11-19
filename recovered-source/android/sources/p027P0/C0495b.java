package p027P0;

import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0092r;
import p018K0.InterfaceC0325a;
import p024O.C0466i;
import p029Q0.AbstractC0509i;
import p029Q0.C0502b;
import p029Q0.C0505e;
import p029Q0.C0511k;
import p029Q0.C0512l;
import p029Q0.C0513m;
import p029Q0.EnumC0515o;
import p031R0.AbstractC0596a;
import p049b0.C1887c;
import p058e0.C6301i;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0495b {

    /* JADX INFO: renamed from: d */
    public static final C0495b f1044d = new C0495b();

    /* JADX INFO: renamed from: a */
    public final C0497d f1045a = new C0497d();

    /* JADX INFO: renamed from: b */
    public final C1887c f1046b = AbstractC0596a.f1311a;

    /* JADX INFO: renamed from: c */
    public final C0092r f1047c = new C0092r();

    /* JADX INFO: renamed from: a */
    public final Object m1182a(InterfaceC0325a deserializer, String str) {
        byte bM1198b;
        AbstractC6452k.m12181e(deserializer, "deserializer");
        this.f1045a.getClass();
        C0513m c0513m = new C0513m(str);
        Object objMo951b = new C0511k(this, EnumC0515o.OBJ, c0513m, deserializer.getDescriptor()).mo951b(deserializer);
        int i2 = c0513m.f1081a;
        while (true) {
            bM1198b = 10;
            String str2 = c0513m.f1085e;
            if (i2 != -1 && i2 < str2.length()) {
                int i3 = i2 + 1;
                char cCharAt = str2.charAt(i2);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    c0513m.f1081a = i3;
                    bM1198b = AbstractC0509i.m1198b(cCharAt);
                    break;
                }
                i2 = i3;
            } else {
                c0513m.f1081a = str2.length();
                break;
            }
        }
        if (bM1198b == 10) {
            return objMo951b;
        }
        C0513m.m1214k(c0513m, "Expected EOF after parsing, but had " + str.charAt(c0513m.f1081a - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m1183b(InterfaceC0325a serializer, Object obj) {
        char[] cArr;
        AbstractC6452k.m12181e(serializer, "serializer");
        C0466i c0466i = new C0466i();
        C0502b c0502b = C0502b.f1054c;
        synchronized (c0502b) {
            C6301i c6301i = c0502b.f1055a;
            cArr = null;
            char[] cArr2 = (char[]) (c6301i.isEmpty() ? null : c6301i.removeLast());
            if (cArr2 != null) {
                c0502b.f1056b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0466i.f816c = cArr;
        try {
            EnumC0515o enumC0515o = EnumC0515o.OBJ;
            C0512l[] c0512lArr = new C0512l[EnumC0515o.f1093z.size()];
            this.f1045a.getClass();
            new C0512l(new C0505e(c0466i), this, enumC0515o, c0512lArr).mo962g(serializer, obj);
            return c0466i.toString();
        } finally {
            c0466i.m999i();
        }
    }
}
