package p029Q0;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p011H.AbstractC0242F;
import p018K0.InterfaceC0325a;
import p021M0.C0341f;
import p021M0.InterfaceC0339d;
import p023N0.InterfaceC0455a;
import p023N0.InterfaceC0457c;
import p024O.C0466i;
import p027P0.C0495b;
import p027P0.C0497d;
import p027P0.InterfaceC0496c;

/* JADX INFO: renamed from: Q0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0512l implements InterfaceC0457c, InterfaceC0455a {

    /* JADX INFO: renamed from: a */
    public final C0505e f1073a;

    /* JADX INFO: renamed from: b */
    public final C0495b f1074b;

    /* JADX INFO: renamed from: c */
    public final EnumC0515o f1075c;

    /* JADX INFO: renamed from: d */
    public final C0512l[] f1076d;

    /* JADX INFO: renamed from: e */
    public final C0497d f1077e;

    /* JADX INFO: renamed from: f */
    public boolean f1078f;

    /* JADX INFO: renamed from: g */
    public String f1079g;

    /* JADX INFO: renamed from: h */
    public String f1080h;

    public C0512l(C0505e composer, C0495b c0495b, EnumC0515o enumC0515o, C0512l[] c0512lArr) {
        AbstractC6452k.m12181e(composer, "composer");
        this.f1073a = composer;
        this.f1074b = c0495b;
        this.f1075c = enumC0515o;
        this.f1076d = c0512lArr;
        this.f1077e = c0495b.f1045a;
        int iOrdinal = enumC0515o.ordinal();
        if (c0512lArr != null) {
            C0512l c0512l = c0512lArr[iOrdinal];
            if (c0512l == null && c0512l == this) {
                return;
            }
            c0512lArr[iOrdinal] = this;
        }
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: a */
    public final InterfaceC0455a mo958a(InterfaceC0339d descriptor) {
        C0512l c0512l;
        AbstractC6452k.m12181e(descriptor, "descriptor");
        C0495b c0495b = this.f1074b;
        EnumC0515o enumC0515oM1202f = AbstractC0509i.m1202f(descriptor, c0495b);
        char c = enumC0515oM1202f.f1094s;
        C0505e c0505e = this.f1073a;
        c0505e.m1194b(c);
        c0505e.f1060b = true;
        String str = this.f1079g;
        if (str != null) {
            String strMo496a = this.f1080h;
            if (strMo496a == null) {
                strMo496a = descriptor.mo496a();
            }
            c0505e.m1193a();
            mo965k(str);
            c0505e.m1194b(':');
            mo965k(strMo496a);
            this.f1079g = null;
            this.f1080h = null;
        }
        if (this.f1075c == enumC0515oM1202f) {
            return this;
        }
        C0512l[] c0512lArr = this.f1076d;
        return (c0512lArr == null || (c0512l = c0512lArr[enumC0515oM1202f.ordinal()]) == null) ? new C0512l(c0505e, c0495b, enumC0515oM1202f, c0512lArr) : c0512l;
    }

    @Override // p023N0.InterfaceC0455a
    /* JADX INFO: renamed from: b */
    public final boolean mo947b(InterfaceC0339d interfaceC0339d) {
        this.f1077e.getClass();
        return false;
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: c */
    public final void mo959c() {
        C0505e c0505e = this.f1073a;
        c0505e.getClass();
        AbstractC6452k.m12181e("null", "v");
        c0505e.f1059a.m1003m("null");
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: d */
    public final void mo960d(double d) {
        boolean z = this.f1078f;
        C0505e c0505e = this.f1073a;
        if (z) {
            mo965k(String.valueOf(d));
        } else {
            c0505e.f1059a.m1003m(String.valueOf(d));
        }
        this.f1077e.getClass();
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new JsonEncodingException("Unexpected special floating-point value " + Double.valueOf(d) + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) AbstractC0509i.m1200d(c0505e.f1059a.toString(), -1)));
        }
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: e */
    public final void mo961e(boolean z) {
        if (this.f1078f) {
            mo965k(String.valueOf(z));
        } else {
            this.f1073a.f1059a.m1003m(String.valueOf(z));
        }
    }

    @Override // p023N0.InterfaceC0455a
    /* JADX INFO: renamed from: f */
    public final void mo948f(InterfaceC0339d descriptor) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        C0505e c0505e = this.f1073a;
        c0505e.getClass();
        c0505e.f1060b = false;
        c0505e.m1194b(this.f1075c.f1095t);
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: g */
    public final void mo962g(InterfaceC0325a serializer, Object obj) {
        String strDiscriminator;
        AbstractC6452k.m12181e(serializer, "serializer");
        C0497d c0497d = this.f1074b.f1045a;
        c0497d.getClass();
        int iOrdinal = c0497d.f1052e.ordinal();
        if (iOrdinal == 0) {
            strDiscriminator = null;
        } else {
            if (iOrdinal == 1) {
                AbstractC0242F kind = serializer.getDescriptor().getKind();
                if (AbstractC6452k.m12177a(kind, C0341f.f680b) || AbstractC6452k.m12177a(kind, C0341f.f683e)) {
                    InterfaceC0339d descriptor = serializer.getDescriptor();
                    AbstractC6452k.m12181e(descriptor, "<this>");
                    Iterator it = descriptor.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = c0497d.f1050c;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof InterfaceC0496c) {
                            strDiscriminator = ((InterfaceC0496c) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strMo496a = serializer.getDescriptor().mo496a();
            this.f1079g = strDiscriminator;
            this.f1080h = strMo496a;
        }
        serializer.serialize(this, obj);
    }

    @Override // p023N0.InterfaceC0455a
    /* JADX INFO: renamed from: h */
    public final void mo949h(InterfaceC0339d descriptor, int i2, InterfaceC0325a serializer, Object obj) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(serializer, "serializer");
        if (obj != null || this.f1077e.f1048a) {
            AbstractC6452k.m12181e(descriptor, "descriptor");
            AbstractC6452k.m12181e(serializer, "serializer");
            m1210l(descriptor, i2);
            if (serializer.getDescriptor().mo497c()) {
                mo962g(serializer, obj);
            } else if (obj == null) {
                mo959c();
            } else {
                mo962g(serializer, obj);
            }
        }
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: i */
    public final void mo963i(int i2) {
        if (this.f1078f) {
            mo965k(String.valueOf(i2));
        } else {
            this.f1073a.f1059a.m1003m(String.valueOf(i2));
        }
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: j */
    public final void mo964j(long j2) {
        if (this.f1078f) {
            mo965k(String.valueOf(j2));
        } else {
            this.f1073a.f1059a.m1003m(String.valueOf(j2));
        }
    }

    @Override // p023N0.InterfaceC0457c
    /* JADX INFO: renamed from: k */
    public final void mo965k(String value) {
        byte b;
        AbstractC6452k.m12181e(value, "value");
        C0505e c0505e = this.f1073a;
        c0505e.getClass();
        AbstractC6452k.m12181e(value, "value");
        C0466i c0466i = c0505e.f1059a;
        c0466i.m992b(c0466i.f815b, value.length() + 2);
        char[] cArr = (char[]) c0466i.f816c;
        int i2 = c0466i.f815b;
        int i3 = i2 + 1;
        cArr[i2] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i3);
        int i4 = length + i3;
        int i5 = i3;
        while (i5 < i4) {
            char c = cArr[i5];
            byte[] bArr = AbstractC0514n.f1087b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = value.length();
                for (int i6 = i5 - i3; i6 < length2; i6++) {
                    c0466i.m992b(i5, 2);
                    char cCharAt = value.charAt(i6);
                    byte[] bArr2 = AbstractC0514n.f1087b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i7 = i5 + 1;
                        ((char[]) c0466i.f816c)[i5] = cCharAt;
                        i5 = i7;
                    } else if (b == 1) {
                        String str = AbstractC0514n.f1086a[cCharAt];
                        AbstractC6452k.m12178b(str);
                        c0466i.m992b(i5, str.length());
                        str.getChars(0, str.length(), (char[]) c0466i.f816c, i5);
                        int length3 = str.length() + i5;
                        c0466i.f815b = length3;
                        i5 = length3;
                    } else {
                        char[] cArr2 = (char[]) c0466i.f816c;
                        cArr2[i5] = '\\';
                        cArr2[i5 + 1] = (char) b;
                        i5 += 2;
                        c0466i.f815b = i5;
                    }
                }
                c0466i.m992b(i5, 1);
                ((char[]) c0466i.f816c)[i5] = '\"';
                c0466i.f815b = i5 + 1;
                return;
            }
            i5++;
        }
        cArr[i4] = '\"';
        c0466i.f815b = i4 + 1;
    }

    /* JADX INFO: renamed from: l */
    public final void m1210l(InterfaceC0339d descriptor, int i2) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        int iOrdinal = this.f1075c.ordinal();
        C0505e c0505e = this.f1073a;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!c0505e.f1060b) {
                c0505e.m1194b(',');
            }
            c0505e.m1193a();
            return;
        }
        if (iOrdinal == 2) {
            if (c0505e.f1060b) {
                this.f1078f = true;
                c0505e.m1193a();
                return;
            }
            if (i2 % 2 == 0) {
                c0505e.m1194b(',');
                c0505e.m1193a();
            } else {
                c0505e.m1194b(':');
                c0505e.m1195c();
                z = false;
            }
            this.f1078f = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!c0505e.f1060b) {
                c0505e.m1194b(',');
            }
            c0505e.m1193a();
            AbstractC0509i.m1201e(descriptor, this.f1074b);
            mo965k(descriptor.mo500f(i2));
            c0505e.m1194b(':');
            c0505e.m1195c();
            return;
        }
        if (i2 == 0) {
            this.f1078f = true;
        }
        if (i2 == 1) {
            c0505e.m1194b(',');
            c0505e.m1195c();
            this.f1078f = false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1211m(InterfaceC0339d descriptor, int i2, long j2) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        m1210l(descriptor, i2);
        mo964j(j2);
    }

    /* JADX INFO: renamed from: n */
    public final void m1212n(InterfaceC0339d descriptor, int i2, InterfaceC0325a serializer, Object obj) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(serializer, "serializer");
        m1210l(descriptor, i2);
        mo962g(serializer, obj);
    }

    /* JADX INFO: renamed from: o */
    public final void m1213o(InterfaceC0339d descriptor, int i2, String value) {
        AbstractC6452k.m12181e(descriptor, "descriptor");
        AbstractC6452k.m12181e(value, "value");
        m1210l(descriptor, i2);
        mo965k(value);
    }
}
