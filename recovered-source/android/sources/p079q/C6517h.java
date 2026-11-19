package p079q;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.constraintlayout.core.state.C1106a;
import androidx.privacysandbox.ads.adservices.java.internal.C1622a;
import com.google.firebase.crashlytics.internal.C5636a;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001B.C0086l;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p049b0.C1887c;
import p063h.C6357c;
import p065i.C6368a;
import p065i.C6369b;
import p065i.C6370c;
import p067j.C6404m;
import p067j.C6405n;
import p067j.C6406o;
import p067j.C6407p;
import p067j.C6408q;
import p067j.C6409r;
import p067j.C6410s;
import p067j.C6411t;
import p067j.C6412u;
import p067j.C6413v;
import p067j.C6415x;
import p067j.EnumC6381B;
import p067j.EnumC6388I;
import p067j.EnumC6389J;
import p067j.EnumC6391L;
import p069k.AbstractC6435p;
import p069k.C6428i;
import p069k.C6429j;
import p069k.C6430k;
import p069k.C6433n;
import p072l.C6466a;
import p072l.C6471f;
import p072l.InterfaceC6472g;
import p076n.C6477a;
import p081r.C6523b;
import p081r.C6530i;
import p081r.InterfaceC6524c;
import p081r.InterfaceC6525d;
import p082s.InterfaceC6533a;
import p082s.InterfaceC6534b;

/* JADX INFO: renamed from: q.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6517h {

    /* JADX INFO: renamed from: a */
    public final Context f24716a;

    /* JADX INFO: renamed from: b */
    public final C6471f f24717b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6525d f24718c;

    /* JADX INFO: renamed from: d */
    public final C6512c f24719d;

    /* JADX INFO: renamed from: e */
    public final Executor f24720e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC6534b f24721f;

    /* JADX INFO: renamed from: g */
    public final C1887c f24722g;

    /* JADX INFO: renamed from: h */
    public final C1887c f24723h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC6524c f24724i;

    public C6517h(Context context, C6471f c6471f, InterfaceC6525d interfaceC6525d, C6512c c6512c, Executor executor, InterfaceC6534b interfaceC6534b, C1887c c1887c, C1887c c1887c2, InterfaceC6524c interfaceC6524c) {
        this.f24716a = context;
        this.f24717b = c6471f;
        this.f24718c = interfaceC6525d;
        this.f24719d = c6512c;
        this.f24720e = executor;
        this.f24721f = interfaceC6534b;
        this.f24722g = c1887c;
        this.f24723h = c1887c2;
        this.f24724i = interfaceC6524c;
    }

    /* JADX INFO: renamed from: a */
    public final void m12199a(C6430k c6430k, int i2) {
        byte[] bArr;
        long j2;
        C6466a c6466a;
        String str;
        C6466a c6466a2;
        int i3;
        C6369b c6369bM1981b;
        String str2;
        Integer numValueOf;
        C6411t c6411t;
        final C6517h c6517h = this;
        final C6430k c6430k2 = c6430k;
        byte[] bArr2 = c6430k2.f24599b;
        InterfaceC6472g interfaceC6472gM12195a = c6517h.f24717b.m12195a(c6430k2.f24598a);
        long jMax = 0;
        while (true) {
            final int i4 = 0;
            InterfaceC6533a interfaceC6533a = new InterfaceC6533a(c6517h) { // from class: q.e

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ C6517h f24708t;

                {
                    this.f24708t = c6517h;
                }

                @Override // p082s.InterfaceC6533a
                public final Object execute() {
                    Boolean bool;
                    switch (i4) {
                        case 0:
                            C6430k c6430k3 = c6430k2;
                            C6530i c6530i = (C6530i) this.f24708t.f24718c;
                            SQLiteDatabase sQLiteDatabaseM12203c = c6530i.m12203c();
                            sQLiteDatabaseM12203c.beginTransaction();
                            try {
                                Long lM12200e = C6530i.m12200e(sQLiteDatabaseM12203c, c6430k3);
                                if (lM12200e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c6530i.m12203c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM12200e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM12203c.setTransactionSuccessful();
                                sQLiteDatabaseM12203c.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM12203c.endTransaction();
                                throw th2;
                            }
                        default:
                            C6530i c6530i2 = (C6530i) this.f24708t.f24718c;
                            c6530i2.getClass();
                            return (Iterable) c6530i2.m12204h(new C1622a(7, c6530i2, c6430k2));
                    }
                }
            };
            C6530i c6530i = (C6530i) c6517h.f24721f;
            if (!((Boolean) c6530i.m12207l(interfaceC6533a)).booleanValue()) {
                c6530i.m12207l(new C6516g(jMax, c6517h, c6430k2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) c6530i.m12207l(new InterfaceC6533a(c6517h) { // from class: q.e

                /* JADX INFO: renamed from: t */
                public final /* synthetic */ C6517h f24708t;

                {
                    this.f24708t = c6517h;
                }

                @Override // p082s.InterfaceC6533a
                public final Object execute() {
                    Boolean bool;
                    switch (i5) {
                        case 0:
                            C6430k c6430k3 = c6430k2;
                            C6530i c6530i2 = (C6530i) this.f24708t.f24718c;
                            SQLiteDatabase sQLiteDatabaseM12203c = c6530i2.m12203c();
                            sQLiteDatabaseM12203c.beginTransaction();
                            try {
                                Long lM12200e = C6530i.m12200e(sQLiteDatabaseM12203c, c6430k3);
                                if (lM12200e == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c6530i2.m12203c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM12200e.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM12203c.setTransactionSuccessful();
                                sQLiteDatabaseM12203c.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM12203c.endTransaction();
                                throw th2;
                            }
                        default:
                            C6530i c6530i3 = (C6530i) this.f24708t.f24718c;
                            c6530i3.getClass();
                            return (Iterable) c6530i3.m12204h(new C1622a(7, c6530i3, c6430k2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (interfaceC6472gM12195a == null) {
                AbstractC0242F.m350f("Uploader", "Unknown backend for %s, deleting event batch for it...", c6430k2);
                c6466a2 = new C6466a(3, -1L);
                bArr = bArr2;
                j2 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6523b) it.next()).f24744c);
                }
                if (bArr2 != null) {
                    InterfaceC6524c interfaceC6524c = c6517h.f24724i;
                    Objects.requireNonNull(interfaceC6524c);
                    C6477a c6477a = (C6477a) c6530i.m12207l(new C1106a(interfaceC6524c, 18));
                    C6428i c6428i = new C6428i();
                    c6428i.f24583f = new HashMap();
                    c6428i.f24581d = Long.valueOf(c6517h.f24722g.m2719f());
                    c6428i.f24582e = Long.valueOf(c6517h.f24723h.m2719f());
                    c6428i.f24578a = "GDT_CLIENT_METRICS";
                    C6357c c6357c = new C6357c("proto");
                    c6477a.getClass();
                    c6428i.f24580c = new C6433n(c6357c, AbstractC6435p.f24611a.encode(c6477a));
                    arrayList.add(((C6370c) interfaceC6472gM12195a).m12157a(c6428i.m12165b()));
                }
                C6370c c6370c = (C6370c) interfaceC6472gM12195a;
                HashMap map = new HashMap();
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    C6429j c6429j = (C6429j) obj;
                    String str3 = c6429j.f24588a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(c6429j);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c6429j);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    C6429j c6429j2 = (C6429j) ((List) entry.getValue()).get(0);
                    EnumC6391L enumC6391L = EnumC6391L.f24456s;
                    long jM2719f = c6370c.f24441f.m2719f();
                    long jM2719f2 = c6370c.f24440e.m2719f();
                    C6406o c6406o = new C6406o(new C6404m(Integer.valueOf(c6429j2.m12167b("sdk-version")), c6429j2.m12166a("model"), c6429j2.m12166a("hardware"), c6429j2.m12166a("device"), c6429j2.m12166a("product"), c6429j2.m12166a("os-uild"), c6429j2.m12166a("manufacturer"), c6429j2.m12166a("fingerprint"), c6429j2.m12166a("locale"), c6429j2.m12166a("country"), c6429j2.m12166a("mcc_mnc"), c6429j2.m12166a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (C6429j c6429j3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        C6433n c6433n = c6429j3.f24590c;
                        byte[] bArr4 = c6429j3.f24597j;
                        C6357c c6357c2 = c6433n.f24608a;
                        byte[] bArr5 = c6433n.f24609b;
                        long j3 = jMax;
                        if (c6357c2.equals(new C6357c("proto"))) {
                            c6411t = new C6411t();
                            c6411t.f24531e = bArr5;
                        } else {
                            if (c6357c2.equals(new C6357c("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                C6411t c6411t2 = new C6411t();
                                c6411t2.f24532f = str4;
                                c6411t = c6411t2;
                            } else {
                                String strM355l = AbstractC0242F.m355l("CctTransportBackend");
                                if (Log.isLoggable(strM355l, 5)) {
                                    Log.w(strM355l, "Received event of unsupported encoding " + c6357c2 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            jMax = j3;
                        }
                        c6411t.f24527a = Long.valueOf(c6429j3.f24591d);
                        c6411t.f24530d = Long.valueOf(c6429j3.f24592e);
                        String str5 = (String) c6429j3.f24593f.get("tz-offset");
                        c6411t.f24533g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        c6411t.f24534h = new C6415x((EnumC6389J) EnumC6389J.f24454s.get(c6429j3.m12167b("net-type")), (EnumC6388I) EnumC6388I.f24452s.get(c6429j3.m12167b("mobile-subtype")));
                        Integer num = c6429j3.f24589b;
                        if (num != null) {
                            c6411t.f24528b = num;
                        }
                        Integer num2 = c6429j3.f24594g;
                        if (num2 != null) {
                            C6410s c6410s = new C6410s(new C6409r(num2));
                            EnumC6381B enumC6381B = EnumC6381B.f24450s;
                            c6411t.f24529c = new C6407p(c6410s);
                        }
                        byte[] bArr6 = c6429j3.f24596i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            c6411t.f24535i = new C6408q(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strM414v = c6411t.f24527a == null ? " eventTimeMs" : "";
                        if (c6411t.f24530d == null) {
                            strM414v = strM414v.concat(" eventUptimeMs");
                        }
                        if (c6411t.f24533g == null) {
                            strM414v = AbstractC0271e0.m414v(strM414v, " timezoneOffsetSeconds");
                        }
                        if (!strM414v.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strM414v));
                        }
                        arrayList4.add(new C6412u(c6411t.f24527a.longValue(), c6411t.f24528b, c6411t.f24529c, c6411t.f24530d.longValue(), c6411t.f24531e, c6411t.f24532f, c6411t.f24533g.longValue(), c6411t.f24534h, c6411t.f24535i));
                        bArr2 = bArr3;
                        jMax = j3;
                    }
                    arrayList3.add(new C6413v(jM2719f, jM2719f2, c6406o, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j2 = jMax;
                C6405n c6405n = new C6405n(arrayList3);
                URL urlM12156b = c6370c.f24439d;
                if (bArr != null) {
                    try {
                        C6368a c6368aM12155a = C6368a.m12155a(bArr);
                        str = c6368aM12155a.f24432b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = c6368aM12155a.f24431a;
                        if (str6 != null) {
                            urlM12156b = C6370c.m12156b(str6);
                        }
                    } catch (IllegalArgumentException unused2) {
                        c6466a = new C6466a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    C0086l c0086l = new C0086l(urlM12156b, c6405n, str);
                    C1106a c1106a = new C1106a(c6370c, 16);
                    int i7 = 5;
                    do {
                        c6369bM1981b = c1106a.m1981b(c0086l);
                        URL url = c6369bM1981b.f24434b;
                        if (url != null) {
                            AbstractC0242F.m350f("CctTransportBackend", "Following redirect to: %s", url);
                            c0086l = new C0086l(url, (C6405n) c0086l.f114v, (String) c0086l.f112t);
                        } else {
                            c0086l = null;
                        }
                        if (c0086l == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = c6369bM1981b.f24433a;
                    if (i8 == 200) {
                        c6466a2 = new C6466a(1, c6369bM1981b.f24435c);
                    } else {
                        if (i8 >= 500 || i8 == 404) {
                            c6466a = new C6466a(2, -1L);
                        } else if (i8 == 400) {
                            try {
                                c6466a = new C6466a(4, -1L);
                            } catch (IOException e) {
                                e = e;
                                AbstractC0242F.m351h("CctTransportBackend", "Could not make request to the backend", e);
                                i3 = 2;
                                c6466a2 = new C6466a(2, -1L);
                            }
                        } else {
                            c6466a = new C6466a(3, -1L);
                        }
                        c6466a2 = c6466a;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i3 = 2;
            int i9 = c6466a2.f24642a;
            if (i9 == i3) {
                c6530i.m12207l(new C5636a(this, iterable, c6430k, j2));
                this.f24719d.m12198a(c6430k, i2 + 1, true);
                return;
            }
            c6517h = this;
            c6430k2 = c6430k;
            jMax = j2;
            c6530i.m12207l(new C1622a(4, c6517h, iterable));
            if (i9 == 1) {
                jMax = Math.max(jMax, c6466a2.f24643b);
                if (bArr != null) {
                    c6530i.m12207l(new C1106a(c6517h, 17));
                }
            } else if (i9 == 4) {
                HashMap map2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((C6523b) it2.next()).f24744c.f24588a;
                    if (map2.containsKey(str7)) {
                        map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                    } else {
                        map2.put(str7, 1);
                    }
                }
                c6530i.m12207l(new C1622a(5, c6517h, map2));
            }
            bArr2 = bArr;
        }
    }
}
