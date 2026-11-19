package p025O0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p014I0.C0313b;
import p018K0.InterfaceC0325a;
import p021M0.C0341f;
import p021M0.InterfaceC0339d;
import p037U0.AbstractC0846b;
import p057d0.EnumC6282d;
import p058e0.AbstractC6305m;
import p058e0.C6313u;
import p058e0.C6314v;
import p078p0.InterfaceC6487a;

/* JADX INFO: renamed from: O0.m */
/* JADX INFO: loaded from: classes.dex */
public class C0488m implements InterfaceC0339d, InterfaceC0477b {

    /* JADX INFO: renamed from: a */
    public final String f1024a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0480e f1025b;

    /* JADX INFO: renamed from: c */
    public final int f1026c;

    /* JADX INFO: renamed from: d */
    public int f1027d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f1028e;

    /* JADX INFO: renamed from: f */
    public final List[] f1029f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f1030g;

    /* JADX INFO: renamed from: h */
    public Object f1031h;

    /* JADX INFO: renamed from: i */
    public final Object f1032i;

    /* JADX INFO: renamed from: j */
    public final Object f1033j;

    /* JADX INFO: renamed from: k */
    public final Object f1034k;

    public C0488m(String str, InterfaceC0480e interfaceC0480e, int i2) {
        this.f1024a = str;
        this.f1025b = interfaceC0480e;
        this.f1026c = i2;
        String[] strArr = new String[i2];
        final int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            strArr[i4] = "[UNINITIALIZED]";
        }
        this.f1028e = strArr;
        int i5 = this.f1026c;
        this.f1029f = new List[i5];
        this.f1030g = new boolean[i5];
        this.f1031h = C6314v.f24339s;
        EnumC6282d[] enumC6282dArr = EnumC6282d.f24307s;
        this.f1032i = AbstractC0242F.m356m(new InterfaceC6487a(this) { // from class: O0.l

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C0488m f1023t;

            {
                this.f1023t = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d0.c, java.lang.Object] */
            @Override // p078p0.InterfaceC6487a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i3) {
                    case 0:
                        InterfaceC0325a[] interfaceC0325aArrChildSerializers = this.f1023t.f1025b.childSerializers();
                        return interfaceC0325aArrChildSerializers == null ? AbstractC0486k.f1021b : interfaceC0325aArrChildSerializers;
                    case 1:
                        InterfaceC0325a[] interfaceC0325aArrTypeParametersSerializers = this.f1023t.f1025b.typeParametersSerializers();
                        if (interfaceC0325aArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(interfaceC0325aArrTypeParametersSerializers.length);
                            for (InterfaceC0325a interfaceC0325a : interfaceC0325aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0325a.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC0486k.m1175b(arrayList);
                    default:
                        C0488m c0488m = this.f1023t;
                        return Integer.valueOf(AbstractC0486k.m1176c(c0488m, (InterfaceC0339d[]) c0488m.f1033j.getValue()));
                }
            }
        });
        final int i6 = 1;
        this.f1033j = AbstractC0242F.m356m(new InterfaceC6487a(this) { // from class: O0.l

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C0488m f1023t;

            {
                this.f1023t = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d0.c, java.lang.Object] */
            @Override // p078p0.InterfaceC6487a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i6) {
                    case 0:
                        InterfaceC0325a[] interfaceC0325aArrChildSerializers = this.f1023t.f1025b.childSerializers();
                        return interfaceC0325aArrChildSerializers == null ? AbstractC0486k.f1021b : interfaceC0325aArrChildSerializers;
                    case 1:
                        InterfaceC0325a[] interfaceC0325aArrTypeParametersSerializers = this.f1023t.f1025b.typeParametersSerializers();
                        if (interfaceC0325aArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(interfaceC0325aArrTypeParametersSerializers.length);
                            for (InterfaceC0325a interfaceC0325a : interfaceC0325aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0325a.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC0486k.m1175b(arrayList);
                    default:
                        C0488m c0488m = this.f1023t;
                        return Integer.valueOf(AbstractC0486k.m1176c(c0488m, (InterfaceC0339d[]) c0488m.f1033j.getValue()));
                }
            }
        });
        final int i7 = 2;
        this.f1034k = AbstractC0242F.m356m(new InterfaceC6487a(this) { // from class: O0.l

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ C0488m f1023t;

            {
                this.f1023t = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [d0.c, java.lang.Object] */
            @Override // p078p0.InterfaceC6487a
            public final Object invoke() {
                ArrayList arrayList;
                switch (i7) {
                    case 0:
                        InterfaceC0325a[] interfaceC0325aArrChildSerializers = this.f1023t.f1025b.childSerializers();
                        return interfaceC0325aArrChildSerializers == null ? AbstractC0486k.f1021b : interfaceC0325aArrChildSerializers;
                    case 1:
                        InterfaceC0325a[] interfaceC0325aArrTypeParametersSerializers = this.f1023t.f1025b.typeParametersSerializers();
                        if (interfaceC0325aArrTypeParametersSerializers != null) {
                            arrayList = new ArrayList(interfaceC0325aArrTypeParametersSerializers.length);
                            for (InterfaceC0325a interfaceC0325a : interfaceC0325aArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0325a.getDescriptor());
                            }
                        } else {
                            arrayList = null;
                        }
                        return AbstractC0486k.m1175b(arrayList);
                    default:
                        C0488m c0488m = this.f1023t;
                        return Integer.valueOf(AbstractC0486k.m1176c(c0488m, (InterfaceC0339d[]) c0488m.f1033j.getValue()));
                }
            }
        });
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: a */
    public final String mo496a() {
        return this.f1024a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p025O0.InterfaceC0477b
    /* JADX INFO: renamed from: b */
    public final Set mo1173b() {
        return this.f1031h.keySet();
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: c */
    public final boolean mo497c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: d */
    public final int mo498d(String name) {
        AbstractC6452k.m12181e(name, "name");
        Integer num = (Integer) this.f1031h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: e */
    public final int mo499e() {
        return this.f1026c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [d0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [d0.c, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0488m) {
            InterfaceC0339d interfaceC0339d = (InterfaceC0339d) obj;
            if (this.f1024a.equals(interfaceC0339d.mo496a()) && Arrays.equals((InterfaceC0339d[]) this.f1033j.getValue(), (InterfaceC0339d[]) ((C0488m) obj).f1033j.getValue())) {
                int iMo499e = interfaceC0339d.mo499e();
                int i2 = this.f1026c;
                if (i2 == iMo499e) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (AbstractC6452k.m12177a(mo502h(i3).mo496a(), interfaceC0339d.mo502h(i3).mo496a()) && AbstractC6452k.m12177a(mo502h(i3).getKind(), interfaceC0339d.mo502h(i3).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: f */
    public final String mo500f(int i2) {
        return this.f1028e[i2];
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: g */
    public final List mo501g(int i2) {
        List list = this.f1029f[i2];
        return list == null ? C6313u.f24338s : list;
    }

    @Override // p021M0.InterfaceC0339d
    public final List getAnnotations() {
        return C6313u.f24338s;
    }

    @Override // p021M0.InterfaceC0339d
    public final AbstractC0242F getKind() {
        return C0341f.f680b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d0.c, java.lang.Object] */
    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: h */
    public final InterfaceC0339d mo502h(int i2) {
        return ((InterfaceC0325a[]) this.f1032i.getValue())[i2].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d0.c, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f1034k.getValue()).intValue();
    }

    @Override // p021M0.InterfaceC0339d
    /* JADX INFO: renamed from: i */
    public final boolean mo503i(int i2) {
        return this.f1030g[i2];
    }

    @Override // p021M0.InterfaceC0339d
    public boolean isInline() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m1178j(String str, boolean z) {
        int i2 = this.f1027d + 1;
        this.f1027d = i2;
        String[] strArr = this.f1028e;
        strArr[i2] = str;
        this.f1030g[i2] = z;
        this.f1029f[i2] = null;
        if (i2 == this.f1026c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                map.put(strArr[i3], Integer.valueOf(i3));
            }
            this.f1031h = map;
        }
    }

    public final String toString() {
        return AbstractC6305m.m12105A(AbstractC0846b.m1757p(0, this.f1026c), ", ", this.f1024a.concat("("), ")", new C0313b(this, 1), 24);
    }
}
