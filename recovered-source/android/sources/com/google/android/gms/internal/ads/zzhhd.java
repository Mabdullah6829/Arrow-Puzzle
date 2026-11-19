package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhhd implements zzhdr {

    /* JADX INFO: renamed from: c */
    public static final byte[] f18716c = new byte[0];

    /* JADX INFO: renamed from: d */
    public static final Set f18717d;

    /* JADX INFO: renamed from: a */
    public final String f18718a;

    /* JADX INFO: renamed from: b */
    public final zzhdr f18719b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f18717d = Collections.unmodifiableSet(hashSet);
    }

    public zzhhd(zzhte zzhteVar, zzhdr zzhdrVar) {
        if (!f18717d.contains(zzhteVar.m7803D())) {
            String strM7803D = zzhteVar.m7803D();
            throw new IllegalArgumentException(AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strM7803D).length() + 67), "Unsupported DEK key type: ", strM7803D, ". Only Tink AEAD key types are supported."));
        }
        this.f18718a = zzhteVar.m7803D();
        zzhtd zzhtdVarM7801I = zzhte.m7801I(zzhteVar);
        zzhtdVarM7801I.m7798s(zzhtx.RAW);
        zzhfa.m7424a(((zzhte) zzhtdVarM7801I.m8328o()).m8099h());
        this.f18719b = zzhdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i2 = byteBufferWrap.getInt();
            if (i2 <= 0 || i2 > 4096 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i2];
            byteBufferWrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrMo7400a = this.f18719b.mo7400a(bArr3, f18716c);
            String str = this.f18718a;
            zzidl zzidlVar = zzidl.f19719t;
            return ((zzhdr) ((zzhnw) zzhnb.f19001b.f19002a.get()).m7587a(zzhne.f19005b.m7575e(zzhnz.m7588a(str, zzidl.m8149y(bArrMo7400a, 0, bArrMo7400a.length), zzhta.SYMMETRIC, zzhtx.RAW, null), zzhey.f18574a), zzhdr.class)).mo7400a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
