package p030R;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p001B.AbstractC0076b;
import p001B.C0084j;

/* JADX INFO: renamed from: R.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0592y {

    /* JADX INFO: renamed from: c */
    public static final C0084j f1296c = new C0084j(String.valueOf(','));

    /* JADX INFO: renamed from: d */
    public static final C0592y f1297d = new C0592y(C0572o.f1219t, false, new C0592y(new C0572o(2), true, new C0592y()));

    /* JADX INFO: renamed from: a */
    public final Map f1298a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1299b;

    public C0592y(InterfaceC0574p interfaceC0574p, boolean z, C0592y c0592y) {
        String messageEncoding = interfaceC0574p.getMessageEncoding();
        AbstractC0076b.m131f(!messageEncoding.contains(","), "Comma is currently not allowed in message encoding");
        int size = c0592y.f1298a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0592y.f1298a.containsKey(interfaceC0574p.getMessageEncoding()) ? size : size + 1);
        for (C0590x c0590x : c0592y.f1298a.values()) {
            String messageEncoding2 = c0590x.f1290a.getMessageEncoding();
            if (!messageEncoding2.equals(messageEncoding)) {
                linkedHashMap.put(messageEncoding2, new C0590x(c0590x.f1290a, c0590x.f1291b));
            }
        }
        linkedHashMap.put(messageEncoding, new C0590x(interfaceC0574p, z));
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f1298a = mapUnmodifiableMap;
        HashSet hashSet = new HashSet(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            if (((C0590x) entry.getValue()).f1291b) {
                hashSet.add((String) entry.getKey());
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        C0084j c0084j = f1296c;
        c0084j.getClass();
        Iterator it = setUnmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        c0084j.m146a(sb, it);
        this.f1299b = sb.toString().getBytes(Charset.forName("US-ASCII"));
    }

    public C0592y() {
        this.f1298a = new LinkedHashMap(0);
        this.f1299b = new byte[0];
    }
}
