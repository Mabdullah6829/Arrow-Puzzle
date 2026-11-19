package p029Q0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.JsonException;
import p001B.C0092r;
import p003C.C0118i;
import p018K0.InterfaceC0325a;
import p021M0.C0340e;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0456b;
import p025O0.C0479d;
import p027P0.C0495b;
import p027P0.C0497d;
import p027P0.InterfaceC0498e;
import p058e0.AbstractC6318z;
import p058e0.C6314v;
import p078p0.InterfaceC6487a;
import p091y0.AbstractC6574d;

/* JADX INFO: renamed from: Q0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0511k implements InterfaceC0456b {

    /* JADX INFO: renamed from: a */
    public final C0495b f1067a;

    /* JADX INFO: renamed from: b */
    public final EnumC0515o f1068b;

    /* JADX INFO: renamed from: c */
    public final C0513m f1069c;

    /* JADX INFO: renamed from: d */
    public int f1070d;

    /* JADX INFO: renamed from: e */
    public final C0497d f1071e;

    /* JADX INFO: renamed from: f */
    public final C0507g f1072f;

    public C0511k(C0495b c0495b, EnumC0515o enumC0515o, C0513m c0513m, InterfaceC0339d descriptor) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        this.f1067a = c0495b;
        this.f1068b = enumC0515o;
        this.f1069c = c0513m;
        this.f1070d = -1;
        C0497d c0497d = c0495b.f1045a;
        this.f1071e = c0497d;
        this.f1072f = c0497d.f1048a ? null : new C0507g(descriptor);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.io.Serializable, java.lang.Object, java.lang.Object[]] */
    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: a */
    public final C0511k mo950a(InterfaceC0339d descriptor) {
        byte bM1198b;
        AbstractC6452k.m12181e(descriptor, "descriptor");
        C0495b c0495b = this.f1067a;
        EnumC0515o enumC0515oM1202f = AbstractC0509i.m1202f(descriptor, c0495b);
        C0513m c0513m = this.f1069c;
        C0118i c0118i = c0513m.f1082b;
        int i2 = c0118i.f174c + 1;
        c0118i.f174c = i2;
        Object[] objArr = (Object[]) c0118i.f173b;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            ?? CopyOf = Arrays.copyOf(objArr, i3);
            AbstractC6452k.m12180d(CopyOf, "copyOf(...)");
            c0118i.f173b = CopyOf;
            int[] iArrCopyOf = Arrays.copyOf((int[]) c0118i.f175d, i3);
            AbstractC6452k.m12180d(iArrCopyOf, "copyOf(...)");
            c0118i.f175d = iArrCopyOf;
        }
        ((Object[]) c0118i.f173b)[i2] = descriptor;
        c0513m.m1219e(enumC0515oM1202f.f1094s);
        String str = c0513m.f1085e;
        int i4 = c0513m.f1081a;
        while (true) {
            int iM1227n = c0513m.m1227n(i4);
            bM1198b = 10;
            if (iM1227n == -1) {
                c0513m.f1081a = iM1227n;
                break;
            }
            char cCharAt = str.charAt(iM1227n);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                c0513m.f1081a = iM1227n;
                bM1198b = AbstractC0509i.m1198b(cCharAt);
                break;
            }
            i4 = iM1227n + 1;
        }
        if (bM1198b == 4) {
            C0513m.m1214k(c0513m, "Unexpected leading comma", 0, 6);
            throw null;
        }
        int iOrdinal = enumC0515oM1202f.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C0511k(c0495b, enumC0515oM1202f, c0513m, descriptor);
        }
        return (this.f1068b == enumC0515oM1202f && c0495b.f1045a.f1048a) ? this : new C0511k(c0495b, enumC0515oM1202f, c0513m, descriptor);
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: b */
    public final Object mo951b(InterfaceC0325a deserializer) {
        AbstractC6452k.m12181e(deserializer, "deserializer");
        try {
            return deserializer.deserialize(this);
        } catch (MissingFieldException e) {
            String message = e.getMessage();
            AbstractC6452k.m12178b(message);
            if (AbstractC6574d.m12226v(message, "at path")) {
                throw e;
            }
            throw new MissingFieldException(e.f24641s, e.getMessage() + " at path: " + this.f1069c.f1082b.m199b(), e);
        }
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: c */
    public final boolean mo952c() {
        boolean z;
        boolean z2;
        C0513m c0513m = this.f1069c;
        int iM1228o = c0513m.m1228o();
        String str = c0513m.f1085e;
        if (iM1228o == str.length()) {
            C0513m.m1214k(c0513m, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(iM1228o) == '\"') {
            iM1228o++;
            z = true;
        } else {
            z = false;
        }
        int iM1227n = c0513m.m1227n(iM1228o);
        if (iM1227n >= str.length() || iM1227n == -1) {
            C0513m.m1214k(c0513m, "EOF", 0, 6);
            throw null;
        }
        int i2 = iM1227n + 1;
        int iCharAt = str.charAt(iM1227n) | ' ';
        if (iCharAt == 102) {
            c0513m.m1217c(i2, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                C0513m.m1214k(c0513m, "Expected valid boolean literal prefix, but had '" + c0513m.m1222h() + '\'', 0, 6);
                throw null;
            }
            c0513m.m1217c(i2, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (c0513m.f1081a == str.length()) {
            C0513m.m1214k(c0513m, "EOF", 0, 6);
            throw null;
        }
        if (str.charAt(c0513m.f1081a) == '\"') {
            c0513m.f1081a++;
            return z2;
        }
        C0513m.m1214k(c0513m, "Expected closing quotation mark", 0, 6);
        throw null;
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: d */
    public final int mo953d() {
        C0513m c0513m = this.f1069c;
        long jM1220f = c0513m.m1220f();
        int i2 = (int) jM1220f;
        if (jM1220f == i2) {
            return i2;
        }
        C0513m.m1214k(c0513m, "Failed to parse int for input '" + jM1220f + '\'', 0, 6);
        throw null;
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: e */
    public final String mo954e() {
        this.f1071e.getClass();
        return this.f1069c.m1221g();
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: f */
    public final long mo955f() {
        return this.f1069c.m1220f();
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: g */
    public final boolean mo956g() {
        C0507g c0507g = this.f1072f;
        if (!(c0507g != null ? c0507g.f1062b : false)) {
            C0513m c0513m = this.f1069c;
            int iM1227n = c0513m.m1227n(c0513m.m1228o());
            String str = c0513m.f1085e;
            int length = str.length() - iM1227n;
            boolean z = false;
            if (length >= 4 && iM1227n != -1) {
                for (int i2 = 0; i2 < 4; i2++) {
                    if ("null".charAt(i2) == str.charAt(iM1227n + i2)) {
                    }
                }
                if (length <= 4 || AbstractC0509i.m1198b(str.charAt(iM1227n + 4)) != 0) {
                    z = true;
                    c0513m.f1081a = iM1227n + 4;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // p023N0.InterfaceC0456b
    /* JADX INFO: renamed from: h */
    public final double mo957h() {
        C0513m c0513m = this.f1069c;
        String strM1222h = c0513m.m1222h();
        try {
            double d = Double.parseDouble(strM1222h);
            this.f1067a.f1045a.getClass();
            if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                return d;
            }
            C0513m.m1214k(c0513m, "Unexpected special floating-point value " + Double.valueOf(d) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0513m.m1214k(c0513m, "Failed to parse type 'double' for input '" + strM1222h + '\'', 0, 6);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef A[PHI: r12
  0x01ef: PHI (r12v1 Q0.m) = (r12v0 Q0.m), (r12v0 Q0.m), (r12v2 Q0.m) binds: [B:82:0x0181, B:89:0x01b5, B:112:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX INFO: renamed from: i */
    public final int m1203i(final InterfaceC0339d descriptor) {
        C0513m c0513m;
        Object obj;
        final C0495b json = this.f1067a;
        C0497d c0497d = json.f1045a;
        AbstractC6452k.m12181e(descriptor, "descriptor");
        EnumC0515o enumC0515o = this.f1068b;
        int iOrdinal = enumC0515o.ordinal();
        int i2 = 0;
        zM1229p = false;
        boolean zM1229p = false;
        int iIntValue = -1;
        C0513m c0513m2 = this.f1069c;
        if (iOrdinal == 0) {
            boolean zM1229p2 = c0513m2.m1229p();
            boolean zM1216b = c0513m2.m1216b();
            C0507g c0507g = this.f1072f;
            if (!zM1216b) {
                if (zM1229p2) {
                    c0497d.getClass();
                    AbstractC0509i.m1199c(c0513m2, "object");
                    throw null;
                }
                if (c0507g != null) {
                    C0479d c0479d = c0507g.f1061a;
                    C0506f c0506f = c0479d.f1007b;
                    InterfaceC0339d interfaceC0339d = c0479d.f1006a;
                    int iMo499e = interfaceC0339d.mo499e();
                    while (true) {
                        long j2 = c0479d.f1008c;
                        if (j2 != -1) {
                            int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j2);
                            c0479d.f1008c |= 1 << iNumberOfTrailingZeros;
                            if (((Boolean) c0506f.invoke(interfaceC0339d, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue()) {
                                iIntValue = iNumberOfTrailingZeros;
                            }
                        } else if (iMo499e > 64) {
                            long[] jArr = c0479d.f1009d;
                            int length = jArr.length;
                            while (true) {
                                if (i2 < length) {
                                    int i3 = i2 + 1;
                                    int i4 = i3 * 64;
                                    long j3 = jArr[i2];
                                    while (true) {
                                        if (j3 != -1) {
                                            c0513m = c0513m2;
                                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j3);
                                            j3 |= 1 << iNumberOfTrailingZeros2;
                                            iIntValue = iNumberOfTrailingZeros2 + i4;
                                            if (((Boolean) c0506f.invoke(interfaceC0339d, Integer.valueOf(iIntValue))).booleanValue()) {
                                                jArr[i2] = j3;
                                            } else {
                                                c0513m2 = c0513m;
                                            }
                                        } else {
                                            jArr[i2] = j3;
                                            i2 = i3;
                                        }
                                    }
                                } else {
                                    c0513m = c0513m2;
                                    iIntValue = -1;
                                }
                            }
                        } else {
                            c0513m = c0513m2;
                            iIntValue = -1;
                        }
                    }
                } else {
                    c0513m = c0513m2;
                    iIntValue = -1;
                }
                if (enumC0515o != EnumC0515o.MAP) {
                    C0118i c0118i = c0513m.f1082b;
                    ((int[]) c0118i.f175d)[c0118i.f174c] = iIntValue;
                }
                return iIntValue;
            }
            this.f1071e.getClass();
            String name = c0513m2.m1218d();
            c0513m2.m1219e(':');
            AbstractC6452k.m12181e(descriptor, "<this>");
            AbstractC6452k.m12181e(json, "json");
            AbstractC6452k.m12181e(name, "name");
            C0497d c0497d2 = json.f1045a;
            c0497d2.getClass();
            AbstractC0509i.m1201e(descriptor, json);
            int iMo498d = descriptor.mo498d(name);
            if (iMo498d == -3 && c0497d2.f1051d) {
                C0092r c0092r = json.f1047c;
                InterfaceC6487a interfaceC6487a = new InterfaceC6487a() { // from class: Q0.h
                    @Override // p078p0.InterfaceC6487a
                    public final Object invoke() {
                        String[] strArrNames;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C0495b c0495b = json;
                        c0495b.f1045a.getClass();
                        InterfaceC0339d interfaceC0339d2 = descriptor;
                        AbstractC0509i.m1201e(interfaceC0339d2, c0495b);
                        int iMo499e2 = interfaceC0339d2.mo499e();
                        for (int i5 = 0; i5 < iMo499e2; i5++) {
                            List listMo501g = interfaceC0339d2.mo501g(i5);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listMo501g) {
                                if (obj2 instanceof InterfaceC0498e) {
                                    arrayList.add(obj2);
                                }
                            }
                            InterfaceC0498e interfaceC0498e = (InterfaceC0498e) (arrayList.size() == 1 ? arrayList.get(0) : null);
                            if (interfaceC0498e != null && (strArrNames = interfaceC0498e.names()) != null) {
                                for (String str : strArrNames) {
                                    String str2 = AbstractC6452k.m12177a(interfaceC0339d2.getKind(), C0340e.f679c) ? "enum value" : "property";
                                    if (linkedHashMap.containsKey(str)) {
                                        String message = "The suggested name '" + str + "' for " + str2 + ' ' + interfaceC0339d2.mo500f(i5) + " is already one of the names for " + str2 + ' ' + interfaceC0339d2.mo500f(((Number) AbstractC6318z.m12125s(str, linkedHashMap)).intValue()) + " in " + interfaceC0339d2;
                                        AbstractC6452k.m12181e(message, "message");
                                        throw new JsonException(message);
                                    }
                                    linkedHashMap.put(str, Integer.valueOf(i5));
                                }
                            }
                        }
                        return linkedHashMap.isEmpty() ? C6314v.f24339s : linkedHashMap;
                    }
                };
                c0092r.getClass();
                c0092r.getClass();
                AbstractC6452k.m12181e(descriptor, "descriptor");
                Map map = (Map) ((ConcurrentHashMap) c0092r.f130t).get(descriptor);
                C0510j c0510j = AbstractC0509i.f1065a;
                Object obj2 = map != null ? map.get(c0510j) : null;
                Object objInvoke = obj2 != null ? obj2 : null;
                if (objInvoke == null) {
                    objInvoke = interfaceC6487a.invoke();
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c0092r.f130t;
                    Object obj3 = concurrentHashMap.get(descriptor);
                    if (obj3 == null) {
                        obj = obj3;
                        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(2);
                        concurrentHashMap.put(descriptor, concurrentHashMap2);
                        obj = concurrentHashMap2;
                    }
                    obj = obj3;
                    ((Map) obj).put(c0510j, objInvoke);
                }
                Integer num = (Integer) ((Map) objInvoke).get(name);
                iIntValue = num != null ? num.intValue() : -3;
            } else {
                iIntValue = iMo498d;
            }
            if (iIntValue == -3) {
                c0513m2.m1224j(AbstractC6574d.m12223B(c0513m2.f1085e.subSequence(0, c0513m2.f1081a).toString(), name), "Encountered an unknown key '" + name + '\'', "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                throw null;
            }
            if (c0507g != null) {
                C0479d c0479d2 = c0507g.f1061a;
                if (iIntValue < 64) {
                    c0479d2.f1008c |= 1 << iIntValue;
                } else {
                    int i5 = (iIntValue >>> 6) - 1;
                    long[] jArr2 = c0479d2.f1009d;
                    jArr2[i5] = jArr2[i5] | (1 << (iIntValue & 63));
                }
            }
        } else if (iOrdinal != 2) {
            boolean zM1229p3 = c0513m2.m1229p();
            if (c0513m2.m1216b()) {
                int i6 = this.f1070d;
                if (i6 != -1 && !zM1229p3) {
                    C0513m.m1214k(c0513m2, "Expected end of the array or comma", 0, 6);
                    throw null;
                }
                iIntValue = i6 + 1;
                this.f1070d = iIntValue;
            } else if (zM1229p3) {
                c0497d.getClass();
                AbstractC0509i.m1199c(c0513m2, "array");
                throw null;
            }
        } else {
            int i7 = this.f1070d;
            boolean z = i7 % 2 != 0;
            if (!z) {
                c0513m2.m1219e(':');
            } else if (i7 != -1) {
                zM1229p = c0513m2.m1229p();
            }
            if (c0513m2.m1216b()) {
                if (z) {
                    if (this.f1070d == -1) {
                        int i8 = c0513m2.f1081a;
                        if (zM1229p) {
                            C0513m.m1214k(c0513m2, "Unexpected leading comma", i8, 4);
                            throw null;
                        }
                    } else {
                        int i9 = c0513m2.f1081a;
                        if (!zM1229p) {
                            C0513m.m1214k(c0513m2, "Expected comma after the key-value pair", i9, 4);
                            throw null;
                        }
                    }
                }
                iIntValue = this.f1070d + 1;
                this.f1070d = iIntValue;
            } else if (zM1229p) {
                c0497d.getClass();
                AbstractC0509i.m1199c(c0513m2, "object");
                throw null;
            }
        }
        c0513m = c0513m2;
        if (enumC0515o != EnumC0515o.MAP) {
            C0118i c0118i2 = c0513m.f1082b;
            ((int[]) c0118i2.f175d)[c0118i2.f174c] = iIntValue;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: j */
    public final int m1204j(InterfaceC0339d descriptor, int i2) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        return mo953d();
    }

    /* JADX INFO: renamed from: k */
    public final long m1205k(InterfaceC0339d descriptor, int i2) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        return mo955f();
    }

    /* JADX INFO: renamed from: l */
    public final Object m1206l(InterfaceC0339d descriptor, int i2, InterfaceC0325a deserializer, Object obj) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(deserializer, "deserializer");
        if (deserializer.getDescriptor().mo497c() || mo956g()) {
            return mo951b(deserializer);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.Serializable, java.lang.Object, java.lang.Object[]] */
    /* JADX INFO: renamed from: m */
    public final Object m1207m(InterfaceC0339d descriptor, int i2, InterfaceC0325a deserializer, Object obj) {
        C0118i c0118i = this.f1069c.f1082b;
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(deserializer, "deserializer");
        boolean z = this.f1068b == EnumC0515o.MAP && (i2 & 1) == 0;
        if (z) {
            int[] iArr = (int[]) c0118i.f175d;
            int i3 = c0118i.f174c;
            if (iArr[i3] == -2) {
                ((Object[]) c0118i.f173b)[i3] = C0510j.f1066a;
            }
        }
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(deserializer, "deserializer");
        Object objMo951b = mo951b(deserializer);
        if (z) {
            int[] iArr2 = (int[]) c0118i.f175d;
            int i4 = c0118i.f174c;
            if (iArr2[i4] != -2) {
                int i5 = i4 + 1;
                c0118i.f174c = i5;
                Object[] objArr = (Object[]) c0118i.f173b;
                if (i5 == objArr.length) {
                    int i6 = i5 * 2;
                    ?? CopyOf = Arrays.copyOf(objArr, i6);
                    AbstractC6452k.m12180d(CopyOf, "copyOf(...)");
                    c0118i.f173b = CopyOf;
                    int[] iArrCopyOf = Arrays.copyOf((int[]) c0118i.f175d, i6);
                    AbstractC6452k.m12180d(iArrCopyOf, "copyOf(...)");
                    c0118i.f175d = iArrCopyOf;
                }
            }
            Object[] objArr2 = (Object[]) c0118i.f173b;
            int i7 = c0118i.f174c;
            objArr2[i7] = objMo951b;
            ((int[]) c0118i.f175d)[i7] = -2;
        }
        return objMo951b;
    }

    /* JADX INFO: renamed from: n */
    public final String m1208n(InterfaceC0339d descriptor, int i2) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        return mo954e();
    }

    /* JADX INFO: renamed from: o */
    public final void m1209o(InterfaceC0339d descriptor) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        C0497d c0497d = this.f1067a.f1045a;
        c0497d.getClass();
        C0513m c0513m = this.f1069c;
        if (c0513m.m1229p()) {
            c0497d.getClass();
            AbstractC0509i.m1199c(c0513m, "");
            throw null;
        }
        c0513m.m1219e(this.f1068b.f1095t);
        C0118i c0118i = c0513m.f1082b;
        int i2 = c0118i.f174c;
        int[] iArr = (int[]) c0118i.f175d;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            c0118i.f174c = i2 - 1;
        }
        int i3 = c0118i.f174c;
        if (i3 != -1) {
            c0118i.f174c = i3 - 1;
        }
    }
}
