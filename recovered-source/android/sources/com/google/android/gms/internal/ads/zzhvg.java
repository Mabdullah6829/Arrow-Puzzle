package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhvg {

    /* JADX INFO: renamed from: a */
    public zzhvj f19225a = null;

    /* JADX INFO: renamed from: b */
    public zzibl f19226b = null;

    private zzhvg() {
    }

    /* JADX INFO: renamed from: a */
    public final zzhvh m7977a() throws GeneralSecurityException {
        ECPoint eCPoint;
        zzhvj zzhvjVar = this.f19225a;
        if (zzhvjVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzibl zziblVar = this.f19226b;
        if (zziblVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        zzhey zzheyVar = zzhey.f18574a;
        BigInteger bigInteger = zziblVar.f19615a;
        ECPoint eCPoint2 = zzhvjVar.f19233b;
        zzhvb zzhvbVar = zzhvjVar.f19232a.f19222b;
        BigInteger order = zzhvbVar.f19208b.getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        ECParameterSpec eCParameterSpec = zzhvbVar.f19208b;
        if (!zzhlt.m7531b(eCParameterSpec, zzhlt.f18949a) && !zzhlt.m7531b(eCParameterSpec, zzhlt.f18950b) && !zzhlt.m7531b(eCParameterSpec, zzhlt.f18951c)) {
            throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
        }
        if (bigInteger.signum() != 1) {
            throw new GeneralSecurityException("k must be positive");
        }
        if (bigInteger.compareTo(eCParameterSpec.getOrder()) >= 0) {
            throw new GeneralSecurityException("k must be smaller than the order of the generator");
        }
        EllipticCurve curve = eCParameterSpec.getCurve();
        ECPoint generator = eCParameterSpec.getGenerator();
        zzhlt.m7530a(generator, curve);
        BigInteger a2 = eCParameterSpec.getCurve().getA();
        BigInteger bigIntegerM7532c = zzhlt.m7532c(curve);
        zzhls zzhlsVarM7533d = zzhlt.m7533d(ECPoint.POINT_INFINITY, bigIntegerM7532c);
        zzhls zzhlsVarM7533d2 = zzhlt.m7533d(generator, bigIntegerM7532c);
        for (int iBitLength = bigInteger.bitLength(); iBitLength >= 0; iBitLength--) {
            if (bigInteger.testBit(iBitLength)) {
                zzhlsVarM7533d = zzhlt.m7535f(zzhlsVarM7533d, zzhlsVarM7533d2, a2, bigIntegerM7532c);
                zzhlsVarM7533d2 = zzhlt.m7534e(zzhlsVarM7533d2, a2, bigIntegerM7532c);
            } else {
                zzhlsVarM7533d2 = zzhlt.m7535f(zzhlsVarM7533d, zzhlsVarM7533d2, a2, bigIntegerM7532c);
                zzhlsVarM7533d = zzhlt.m7534e(zzhlsVarM7533d, a2, bigIntegerM7532c);
            }
        }
        if (zzhlsVarM7533d.f18948c.equals(BigInteger.ZERO)) {
            eCPoint = ECPoint.POINT_INFINITY;
        } else {
            BigInteger bigIntegerModInverse = zzhlsVarM7533d.f18948c.modInverse(bigIntegerM7532c);
            BigInteger bigIntegerMod = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(bigIntegerM7532c);
            eCPoint = new ECPoint(zzhlsVarM7533d.f18946a.multiply(bigIntegerMod).mod(bigIntegerM7532c), zzhlsVarM7533d.f18947b.multiply(bigIntegerMod).mod(bigIntegerM7532c).multiply(bigIntegerModInverse).mod(bigIntegerM7532c));
        }
        zzhlt.m7530a(eCPoint, curve);
        if (eCPoint.equals(eCPoint2)) {
            return new zzhvh(this.f19225a, this.f19226b);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhvg(int i2) {
    }
}
