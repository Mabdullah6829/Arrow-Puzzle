package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzibv extends zzibr {

    /* JADX INFO: renamed from: s */
    public final Serializable f19624s;

    public zzibv(Boolean bool) {
        this.f19624s = bool;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m8057j(zzibv zzibvVar) {
        Serializable serializable = zzibvVar.f19624s;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.android.gms.internal.ads.zzibr
    /* JADX INFO: renamed from: a */
    public final String mo8053a() {
        Serializable serializable = this.f19624s;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return m8058g().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzibv.class != obj.getClass()) {
            return false;
        }
        zzibv zzibvVar = (zzibv) obj;
        Serializable serializable = zzibvVar.f19624s;
        Serializable serializable2 = this.f19624s;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m8057j(this) && m8057j(zzibvVar)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m8059h().equals(zzibvVar.m8059h());
            }
            return m8058g().longValue() == zzibvVar.m8058g().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : zzici.m8070a(mo8053a())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : zzici.m8070a(zzibvVar.mo8053a())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? m8058g().doubleValue() : Double.parseDouble(mo8053a());
        double dDoubleValue2 = serializable instanceof Number ? zzibvVar.m8058g().doubleValue() : Double.parseDouble(zzibvVar.mo8053a());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final Number m8058g() {
        Serializable serializable = this.f19624s;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new zzibz((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: h */
    public final BigInteger m8059h() {
        Serializable serializable = this.f19624s;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m8057j(this)) {
            return BigInteger.valueOf(m8058g().longValue());
        }
        String strMo8053a = mo8053a();
        zzici.m8071b(strMo8053a);
        return new BigInteger(strMo8053a);
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f19624s;
        if (serializable == null) {
            return 31;
        }
        if (m8057j(this)) {
            jDoubleToLongBits = m8058g().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(m8058g().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public zzibv(Number number) {
        this.f19624s = number;
    }

    public zzibv(String str) {
        this.f19624s = str;
    }
}
