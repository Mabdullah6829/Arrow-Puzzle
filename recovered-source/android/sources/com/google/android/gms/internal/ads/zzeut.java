package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeut implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f14931a;

    /* JADX INFO: renamed from: b */
    public final zzflg f14932b;

    public zzeut(zzhcp zzhcpVar, zzflg zzflgVar) {
        this.f14931a = zzhcpVar;
        this.f14932b = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f14931a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List listAsList;
                byte[] byteArray;
                zzheq zzheqVarM7424a;
                zzeut zzeutVar = this.f14930a;
                zzbio zzbioVar = zzbix.f8364V7;
                com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                String strEncodeToString = null;
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                    String strM3346b = com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(zzeutVar.f14932b.f16040d);
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8396X7)).booleanValue()) {
                        listAsList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbix.f8412Y7)).split(","));
                    } else {
                        listAsList = Arrays.asList(((String) zzbaVar.f3098c.m5030a(zzbix.f8380W7)).split(","));
                    }
                    if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3345a(strM3346b))) {
                        try {
                            zzhna zzhnaVar = zzhna.f18999b;
                            synchronized (zzhnaVar) {
                                HashMap map = zzhnaVar.f19000a;
                                if (!map.containsKey("AES128_GCM")) {
                                    throw new GeneralSecurityException("Name AES128_GCM does not exist");
                                }
                                zzheqVarM7424a = (zzheq) map.get("AES128_GCM");
                            }
                            if (zzheqVarM7424a == null) {
                                try {
                                    zzheqVarM7424a = zzhfa.m7424a(((zzhoa) zzhne.f19005b.m7578h(null)).f19043b.m8099h());
                                } catch (GeneralSecurityException e) {
                                    throw new zzhoj("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
                                }
                            }
                            zzhek zzhekVarM7411g = zzhek.m7411g(zzheqVarM7424a);
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    zzhekVarM7411g.m7415c().mo8097c(byteArrayOutputStream);
                                    byteArrayOutputStream.close();
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    strEncodeToString = Base64.encodeToString(byteArray, 11);
                                } catch (Throwable th) {
                                    byteArrayOutputStream.close();
                                    throw th;
                                }
                            } catch (IOException unused) {
                                throw new GeneralSecurityException("Serialize keyset failed");
                            }
                        } catch (GeneralSecurityException e2) {
                            com.google.android.gms.ads.internal.util.zze.m3150k("Failed to generate key".concat(e2.toString()));
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("CryptoUtils.generateKey", e2);
                            byteArray = new byte[0];
                        }
                    }
                }
                return new zzeuu(strEncodeToString);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 5;
    }
}
