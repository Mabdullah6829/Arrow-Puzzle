package p030R;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.AbstractC0081g;
import p007E.C0194c;
import p007E.C0195d;

/* JADX INFO: renamed from: R.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559h0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f1186c = Logger.getLogger(C0559h0.class.getName());

    /* JADX INFO: renamed from: d */
    public static final C0572o f1187d = new C0572o(8);

    /* JADX INFO: renamed from: e */
    public static final C0194c f1188e;

    /* JADX INFO: renamed from: a */
    public Object[] f1189a;

    /* JADX INFO: renamed from: b */
    public int f1190b;

    static {
        C0194c c0194c = C0195d.f387c;
        if (c0194c.f390b != null) {
            c0194c = new C0194c(c0194c.f389a, (Character) null);
        }
        f1188e = c0194c;
    }

    /* JADX INFO: renamed from: a */
    public final void m1305a(AbstractC0553e0 abstractC0553e0) {
        if (this.f1190b == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = this.f1190b;
            if (i2 >= i4) {
                Arrays.fill(this.f1189a, i3 * 2, i4 * 2, (Object) null);
                this.f1190b = i3;
                return;
            }
            if (!Arrays.equals(abstractC0553e0.f1163b, m1309e(i2))) {
                byte[] bArrM1309e = m1309e(i2);
                Object[] objArr = this.f1189a;
                int i5 = i3 * 2;
                objArr[i5] = bArrM1309e;
                Object obj = objArr[(i2 * 2) + 1];
                if (objArr instanceof byte[][]) {
                    m1306b(objArr != null ? objArr.length : 0);
                }
                this.f1189a[i5 + 1] = obj;
                i3++;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1306b(int i2) {
        Object[] objArr = new Object[i2];
        int i3 = this.f1190b;
        if (i3 != 0) {
            System.arraycopy(this.f1189a, 0, objArr, 0, i3 * 2);
        }
        this.f1189a = objArr;
    }

    /* JADX INFO: renamed from: c */
    public final Object m1307c(AbstractC0553e0 abstractC0553e0) {
        for (int i2 = this.f1190b - 1; i2 >= 0; i2--) {
            if (Arrays.equals(abstractC0553e0.f1163b, m1309e(i2))) {
                Object obj = this.f1189a[(i2 * 2) + 1];
                if (obj instanceof byte[]) {
                    return abstractC0553e0.mo1285a((byte[]) obj);
                }
                obj.getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m1308d(C0559h0 c0559h0) {
        int i2 = c0559h0.f1190b;
        if (i2 == 0) {
            return;
        }
        Object[] objArr = this.f1189a;
        int length = objArr != null ? objArr.length : 0;
        int i3 = this.f1190b;
        int i4 = length - (i3 * 2);
        if (i3 == 0 || i4 < i2 * 2) {
            m1306b((i2 * 2) + (i3 * 2));
        }
        System.arraycopy(c0559h0.f1189a, 0, this.f1189a, this.f1190b * 2, c0559h0.f1190b * 2);
        this.f1190b += c0559h0.f1190b;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m1309e(int i2) {
        return (byte[]) this.f1189a[i2 * 2];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: f */
    public final void m1310f(AbstractC0553e0 abstractC0553e0, Object obj) {
        AbstractC0076b.m133h(abstractC0553e0, "key");
        AbstractC0076b.m133h(obj, "value");
        int i2 = this.f1190b;
        int i3 = i2 * 2;
        if (i3 == 0) {
            m1306b(Math.max(i2 * 4, 8));
        } else {
            Object[] objArr = this.f1189a;
            if (i3 == (objArr != null ? objArr.length : 0)) {
                m1306b(Math.max(i2 * 4, 8));
            }
        }
        int i4 = this.f1190b;
        this.f1189a[i4 * 2] = abstractC0553e0.f1163b;
        this.f1189a[(i4 * 2) + 1] = abstractC0553e0.mo1286b(obj);
        this.f1190b++;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i2 = 0; i2 < this.f1190b; i2++) {
            if (i2 != 0) {
                sb.append(',');
            }
            byte[] bArrM1309e = m1309e(i2);
            Charset charset = AbstractC0081g.f107a;
            String str = new String(bArrM1309e, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                Object obj = this.f1189a[(i2 * 2) + 1];
                if (!(obj instanceof byte[])) {
                    AbstractC1456a.m2454u(obj);
                    throw null;
                }
                sb.append(f1188e.m287c((byte[]) obj));
            } else {
                Object obj2 = this.f1189a[(i2 * 2) + 1];
                if (!(obj2 instanceof byte[])) {
                    AbstractC1456a.m2454u(obj2);
                    throw null;
                }
                sb.append(new String((byte[]) obj2, charset));
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
