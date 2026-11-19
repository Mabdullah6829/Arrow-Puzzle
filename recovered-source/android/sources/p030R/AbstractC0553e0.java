package p030R;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import p001B.AbstractC0076b;
import p001B.AbstractC0081g;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: R.e0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553e0 {

    /* JADX INFO: renamed from: d */
    public static final BitSet f1161d;

    /* JADX INFO: renamed from: a */
    public final String f1162a;

    /* JADX INFO: renamed from: b */
    public final byte[] f1163b;

    /* JADX INFO: renamed from: c */
    public final Object f1164c;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
            bitSet.set(c);
        }
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        f1161d = bitSet;
    }

    public AbstractC0553e0(String str, boolean z, Object obj) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        AbstractC0076b.m133h(lowerCase, AppMeasurementSdk.ConditionalUserProperty.NAME);
        AbstractC0076b.m131f(!lowerCase.isEmpty(), "token must have at least 1 tchar");
        if (lowerCase.equals("connection")) {
            C0559h0.f1186c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char cCharAt = lowerCase.charAt(i2);
            if ((!z || cCharAt != ':' || i2 != 0) && !f1161d.get(cCharAt)) {
                throw new IllegalArgumentException(AbstractC0076b.m141p("Invalid character '%s' in key name '%s'", Character.valueOf(cCharAt), lowerCase));
            }
        }
        this.f1162a = lowerCase;
        this.f1163b = lowerCase.getBytes(AbstractC0081g.f107a);
        this.f1164c = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo1285a(byte[] bArr);

    /* JADX INFO: renamed from: b */
    public abstract byte[] mo1286b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f1162a.equals(((AbstractC0553e0) obj).f1162a);
    }

    public final int hashCode() {
        return this.f1162a.hashCode();
    }

    public final String toString() {
        return AbstractC0271e0.m403k(new StringBuilder("Key{name='"), this.f1162a, "'}");
    }
}
