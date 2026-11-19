package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzoz;
import com.google.android.gms.internal.consent_sdk.zzpa;
import java.io.IOException;
import java.util.logging.Logger;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzpa<MessageType extends zzpa<MessageType, BuilderType>, BuilderType extends zzoz<MessageType, BuilderType>> implements zzrq {
    protected int zza = 0;

    /* JADX INFO: renamed from: b */
    public int mo9144b(zzsa zzsaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzrq
    public final zzpm zzk() {
        try {
            zzqm zzqmVar = (zzqm) this;
            int iMo9224g = zzqmVar.mo9224g();
            zzpm zzpmVar = zzpm.f21713t;
            byte[] bArr = new byte[iMo9224g];
            Logger logger = zzpv.f21720b;
            zzpr zzprVar = new zzpr(bArr, iMo9224g);
            zzqmVar.mo9221a(zzprVar);
            if (zzprVar.f21718e - zzprVar.f21719f == 0) {
                return new zzpk(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC0271e0.m399g("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }
}
