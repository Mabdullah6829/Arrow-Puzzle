package p034T;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import p001B.AbstractC0076b;
import p001B.C0084j;
import p001B.C0087m;
import p030R.EnumC0587v0;

/* JADX INFO: renamed from: T.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0736g1 {

    /* JADX INFO: renamed from: g */
    public static final C0084j f1873g = new C0084j("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", 2);

    /* JADX INFO: renamed from: a */
    public final Long f1874a;

    /* JADX INFO: renamed from: b */
    public final Boolean f1875b;

    /* JADX INFO: renamed from: c */
    public final Integer f1876c;

    /* JADX INFO: renamed from: d */
    public final Integer f1877d;

    /* JADX INFO: renamed from: e */
    public final C0717b2 f1878e;

    /* JADX INFO: renamed from: f */
    public final C0767o0 f1879f;

    public C0736g1(Map map, int i2, int i3, boolean z) {
        long j2;
        boolean z2;
        C0717b2 c0717b2;
        C0767o0 c0767o0;
        this.f1874a = AbstractC0655H0.m1513i("timeout", map);
        this.f1875b = AbstractC0655H0.m1506b("waitForReady", map);
        Integer numM1510f = AbstractC0655H0.m1510f("maxResponseMessageBytes", map);
        this.f1876c = numM1510f;
        if (numM1510f != null) {
            AbstractC0076b.m129d("maxInboundMessageSize %s exceeds bounds", numM1510f.intValue() >= 0, numM1510f);
        }
        Integer numM1510f2 = AbstractC0655H0.m1510f("maxRequestMessageBytes", map);
        this.f1877d = numM1510f2;
        if (numM1510f2 != null) {
            AbstractC0076b.m129d("maxOutboundMessageSize %s exceeds bounds", numM1510f2.intValue() >= 0, numM1510f2);
        }
        Map mapM1511g = z ? AbstractC0655H0.m1511g("retryPolicy", map) : null;
        if (mapM1511g == null) {
            j2 = 0;
            c0717b2 = null;
            z2 = true;
        } else {
            Integer numM1510f3 = AbstractC0655H0.m1510f("maxAttempts", mapM1511g);
            AbstractC0076b.m133h(numM1510f3, "maxAttempts cannot be empty");
            int iIntValue = numM1510f3.intValue();
            AbstractC0076b.m127b(iIntValue, "maxAttempts must be greater than 1: %s", iIntValue >= 2);
            int iMin = Math.min(iIntValue, i2);
            Long lM1513i = AbstractC0655H0.m1513i("initialBackoff", mapM1511g);
            AbstractC0076b.m133h(lM1513i, "initialBackoff cannot be empty");
            long jLongValue = lM1513i.longValue();
            AbstractC0076b.m128c(jLongValue, jLongValue > 0, "initialBackoffNanos must be greater than 0: %s");
            Long lM1513i2 = AbstractC0655H0.m1513i("maxBackoff", mapM1511g);
            AbstractC0076b.m133h(lM1513i2, "maxBackoff cannot be empty");
            long jLongValue2 = lM1513i2.longValue();
            j2 = 0;
            z2 = true;
            AbstractC0076b.m128c(jLongValue2, jLongValue2 > 0, "maxBackoff must be greater than 0: %s");
            Double dM1509e = AbstractC0655H0.m1509e("backoffMultiplier", mapM1511g);
            AbstractC0076b.m133h(dM1509e, "backoffMultiplier cannot be empty");
            double dDoubleValue = dM1509e.doubleValue();
            AbstractC0076b.m129d("backoffMultiplier must be greater than 0: %s", dDoubleValue > 0.0d, dM1509e);
            Long lM1513i3 = AbstractC0655H0.m1513i("perAttemptRecvTimeout", mapM1511g);
            AbstractC0076b.m129d("perAttemptRecvTimeout cannot be negative: %s", lM1513i3 == null || lM1513i3.longValue() >= 0, lM1513i3);
            Set setM1633o = AbstractC0761m2.m1633o("retryableStatusCodes", mapM1511g);
            AbstractC0076b.m144t("%s is required in retry policy", setM1633o != null, "retryableStatusCodes");
            AbstractC0076b.m144t("%s must not contain OK", !setM1633o.contains(EnumC0587v0.OK), "retryableStatusCodes");
            AbstractC0076b.m131f((lM1513i3 == null && setM1633o.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            c0717b2 = new C0717b2(iMin, jLongValue, jLongValue2, dDoubleValue, lM1513i3, setM1633o);
        }
        this.f1878e = c0717b2;
        Map mapM1511g2 = z ? AbstractC0655H0.m1511g("hedgingPolicy", map) : null;
        if (mapM1511g2 == null) {
            c0767o0 = null;
        } else {
            Integer numM1510f4 = AbstractC0655H0.m1510f("maxAttempts", mapM1511g2);
            AbstractC0076b.m133h(numM1510f4, "maxAttempts cannot be empty");
            int iIntValue2 = numM1510f4.intValue();
            AbstractC0076b.m127b(iIntValue2, "maxAttempts must be greater than 1: %s", iIntValue2 >= 2 ? z2 : false);
            int iMin2 = Math.min(iIntValue2, i3);
            Long lM1513i4 = AbstractC0655H0.m1513i("hedgingDelay", mapM1511g2);
            AbstractC0076b.m133h(lM1513i4, "hedgingDelay cannot be empty");
            long jLongValue3 = lM1513i4.longValue();
            AbstractC0076b.m128c(jLongValue3, jLongValue3 >= j2 ? z2 : false, "hedgingDelay must not be negative: %s");
            Set setM1633o2 = AbstractC0761m2.m1633o("nonFatalStatusCodes", mapM1511g2);
            if (setM1633o2 == null) {
                setM1633o2 = Collections.unmodifiableSet(EnumSet.noneOf(EnumC0587v0.class));
            } else {
                AbstractC0076b.m144t("%s must not contain OK", !setM1633o2.contains(EnumC0587v0.OK), "nonFatalStatusCodes");
            }
            c0767o0 = new C0767o0(iMin2, jLongValue3, setM1633o2);
        }
        this.f1879f = c0767o0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0736g1)) {
            return false;
        }
        C0736g1 c0736g1 = (C0736g1) obj;
        return AbstractC0076b.m140o(this.f1874a, c0736g1.f1874a) && AbstractC0076b.m140o(this.f1875b, c0736g1.f1875b) && AbstractC0076b.m140o(this.f1876c, c0736g1.f1876c) && AbstractC0076b.m140o(this.f1877d, c0736g1.f1877d) && AbstractC0076b.m140o(this.f1878e, c0736g1.f1878e) && AbstractC0076b.m140o(this.f1879f, c0736g1.f1879f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1874a, this.f1875b, this.f1876c, this.f1877d, this.f1878e, this.f1879f});
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1874a, "timeoutNanos");
        c0087mM143s.m158b(this.f1875b, "waitForReady");
        c0087mM143s.m158b(this.f1876c, "maxInboundMessageSize");
        c0087mM143s.m158b(this.f1877d, "maxOutboundMessageSize");
        c0087mM143s.m158b(this.f1878e, "retryPolicy");
        c0087mM143s.m158b(this.f1879f, "hedgingPolicy");
        return c0087mM143s.toString();
    }
}
