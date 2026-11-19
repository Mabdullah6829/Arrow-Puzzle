package p029Q0;

import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p021M0.AbstractC0336a;
import p021M0.AbstractC0338c;
import p021M0.C0340e;
import p021M0.C0341f;
import p021M0.InterfaceC0339d;
import p027P0.C0495b;
import p043a.AbstractC0878a;
import p049b0.C1887c;

/* JADX INFO: renamed from: Q0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0509i {

    /* JADX INFO: renamed from: a */
    public static final C0510j f1065a = new C0510j();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0339d m1197a(InterfaceC0339d interfaceC0339d, C1887c module) {
        AbstractC6452k.m12181e(interfaceC0339d, "<this>");
        AbstractC6452k.m12181e(module, "module");
        if (!AbstractC6452k.m12177a(interfaceC0339d.getKind(), C0340e.f678b)) {
            return interfaceC0339d.isInline() ? m1197a(interfaceC0339d.mo502h(0), module) : interfaceC0339d;
        }
        AbstractC0878a.m1800k(interfaceC0339d);
        return interfaceC0339d;
    }

    /* JADX INFO: renamed from: b */
    public static final byte m1198b(char c) {
        if (c < '~') {
            return C0504d.f1058b[c];
        }
        return (byte) 0;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1199c(C0513m c0513m, String str) {
        c0513m.m1224j(c0513m.f1081a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static final CharSequence m1200d(CharSequence charSequence, int i2) {
        AbstractC6452k.m12181e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder sbM408p = AbstractC0271e0.m408p(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                sbM408p.append(charSequence.subSequence(i3, i4).toString());
                sbM408p.append(str2);
                return sbM408p.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: e */
    public static final void m1201e(InterfaceC0339d interfaceC0339d, C0495b json) {
        AbstractC6452k.m12181e(interfaceC0339d, "<this>");
        AbstractC6452k.m12181e(json, "json");
        if (AbstractC6452k.m12177a(interfaceC0339d.getKind(), C0341f.f680b)) {
            json.f1045a.getClass();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final EnumC0515o m1202f(InterfaceC0339d desc, C0495b c0495b) {
        AbstractC6452k.m12181e(desc, "desc");
        AbstractC0242F kind = desc.getKind();
        if (kind instanceof AbstractC0336a) {
            return EnumC0515o.POLY_OBJ;
        }
        if (AbstractC6452k.m12177a(kind, C0341f.f681c)) {
            return EnumC0515o.LIST;
        }
        if (!AbstractC6452k.m12177a(kind, C0341f.f682d)) {
            return EnumC0515o.OBJ;
        }
        InterfaceC0339d interfaceC0339dM1197a = m1197a(desc.mo502h(0), c0495b.f1046b);
        AbstractC0242F kind2 = interfaceC0339dM1197a.getKind();
        if ((kind2 instanceof AbstractC0338c) || AbstractC6452k.m12177a(kind2, C0340e.f679c)) {
            return EnumC0515o.MAP;
        }
        c0495b.f1045a.getClass();
        throw new JsonEncodingException("Value of type '" + interfaceC0339dM1197a.mo496a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC0339dM1197a.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }
}
