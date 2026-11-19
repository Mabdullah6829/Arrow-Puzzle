package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzicm extends zzibx {

    /* JADX INFO: renamed from: a */
    public static final zzicm f19670a = new zzicm();

    private zzicm() {
    }

    /* JADX INFO: renamed from: a */
    public static void m8072a(zzicq zzicqVar, zzibr zzibrVar) throws IOException {
        Writer writer = zzicqVar.f19687s;
        if (zzibrVar == null || (zzibrVar instanceof zzibs)) {
            zzicqVar.m8087c();
            return;
        }
        if (zzibrVar instanceof zzibv) {
            zzibv zzibvVarM8055d = zzibrVar.m8055d();
            Serializable serializable = zzibvVarM8055d.f19624s;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = serializable != null ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(zzibvVarM8055d.mo8053a());
                    zzicqVar.m8090i();
                    zzicqVar.m8093n();
                    writer.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strMo8053a = zzibvVarM8055d.mo8053a();
                if (strMo8053a == null) {
                    zzicqVar.m8087c();
                    return;
                }
                zzicqVar.m8090i();
                zzicqVar.m8093n();
                zzicqVar.m8091j(strMo8053a);
                return;
            }
            Number numberM8058g = zzibvVarM8055d.m8058g();
            if (numberM8058g == null) {
                zzicqVar.m8087c();
                return;
            }
            zzicqVar.m8090i();
            String string = numberM8058g.toString();
            Class<?> cls = numberM8058g.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (zzicqVar.f19694z != zzibw.f19625s) {
                        throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                    }
                } else if (cls != Float.class && cls != Double.class && !zzicq.f19684B.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    throw new IllegalArgumentException(AbstractC1456a.m2451r(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                }
            }
            zzicqVar.m8093n();
            writer.append((CharSequence) string);
            return;
        }
        boolean z = zzibrVar instanceof zzibq;
        if (z) {
            zzicqVar.m8090i();
            zzicqVar.m8093n();
            int i2 = zzicqVar.f19689u;
            int[] iArr = zzicqVar.f19688t;
            if (i2 == iArr.length) {
                zzicqVar.f19688t = Arrays.copyOf(iArr, i2 + i2);
            }
            int[] iArr2 = zzicqVar.f19688t;
            int i3 = zzicqVar.f19689u;
            zzicqVar.f19689u = i3 + 1;
            iArr2[i3] = 1;
            writer.write(91);
            if (!z) {
                throw new IllegalStateException("Not a JSON Array: ".concat(zzibrVar.toString()));
            }
            ArrayList arrayList = ((zzibq) zzibrVar).f19621s;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                m8072a(zzicqVar, (zzibr) obj);
            }
            zzicqVar.m8088e(1, 2, ']');
            return;
        }
        if (!(zzibrVar instanceof zzibt)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzibrVar.getClass())));
        }
        zzicqVar.m8090i();
        zzicqVar.m8093n();
        int i5 = zzicqVar.f19689u;
        int[] iArr3 = zzicqVar.f19688t;
        if (i5 == iArr3.length) {
            zzicqVar.f19688t = Arrays.copyOf(iArr3, i5 + i5);
        }
        int[] iArr4 = zzicqVar.f19688t;
        int i6 = zzicqVar.f19689u;
        zzicqVar.f19689u = i6 + 1;
        iArr4[i6] = 3;
        writer.write(123);
        Iterator it = ((zzicc) zzibrVar.m8054b().f19623s.entrySet()).iterator();
        while (((zzicf) it).hasNext()) {
            zzicg next = ((zzicb) it).next();
            String str = (String) next.getKey();
            Objects.requireNonNull(str, "name == null");
            if (zzicqVar.f19686A != null) {
                throw new IllegalStateException("Already wrote a name, expecting a value.");
            }
            int iM8089h = zzicqVar.m8089h();
            if (iM8089h != 3 && iM8089h != 5) {
                throw new IllegalStateException("Please begin an object before writing a name.");
            }
            zzicqVar.f19686A = str;
            m8072a(zzicqVar, (zzibr) next.getValue());
        }
        zzicqVar.m8088e(3, 5, '}');
    }
}
