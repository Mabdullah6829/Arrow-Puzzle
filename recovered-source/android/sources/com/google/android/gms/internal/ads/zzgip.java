package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgip extends zzgji {

    /* JADX INFO: renamed from: f */
    public final Map f17539f;

    /* JADX INFO: renamed from: g */
    public final Context f17540g;

    /* JADX INFO: renamed from: h */
    public final zzgen f17541h;

    /* JADX INFO: renamed from: i */
    public final long f17542i;

    /* JADX INFO: renamed from: j */
    public final long f17543j;

    public zzgip(zzaxt zzaxtVar, zzgie zzgieVar, Map map, Context context, zzgen zzgenVar, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        super("6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB", "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8=", zzaxtVar, zzgieVar, zzgqoVar.m7060a(113));
        this.f17540g = context;
        this.f17539f = map;
        this.f17541h = zzgenVar;
        this.f17542i = zzgdqVar.m6928b0();
        this.f17543j = zzgdqVar.m6929c0();
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    /* JADX INFO: renamed from: a */
    public final void mo7017a(Method method, zzaxt zzaxtVar) {
        String strEncodeToString;
        zzayt zzaytVar;
        Object[] objArr = (Object[]) method.invoke("", this.f17540g, Integer.valueOf(this.f17541h.ordinal()));
        objArr.getClass();
        String strM4629y0 = "E";
        int i2 = 1;
        try {
            ListenableFuture listenableFuture = (ListenableFuture) this.f17539f.get("gs");
            if (listenableFuture != null && ((Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaytVar = (zzayt) listenableFuture.get(this.f17542i, TimeUnit.MILLISECONDS)) != null && zzaytVar.m4629y0().length() > 1)) {
                strM4629y0 = zzaytVar.m4629y0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strM4629y0.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) this.f17539f.get("ai");
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.f17543j, TimeUnit.MILLISECONDS);
                    if (!zzgtq.m7127a(str)) {
                        strM4629y0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (zzaxtVar) {
            try {
                Object obj = objArr[4];
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    strEncodeToString = Base64.encodeToString(zzgzo.f18403c.mo7280f().m7282g(bArr.length, bArr).getBytes(StandardCharsets.UTF_8), 11);
                } else {
                    strEncodeToString = (String) obj;
                }
                long jLongValue = ((Long) objArr[0]).longValue();
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4573I(jLongValue);
                String str2 = (String) objArr[1];
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4571H(str2);
                String str3 = (String) objArr[2];
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4591R(str3);
                String str4 = (String) objArr[3];
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4593S(str4);
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4566D(strEncodeToString);
                zzaxtVar.m8326l();
                ((zzayt) zzaxtVar.f19780t).m4600V0(strM4629y0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i2 = 2;
                    }
                    zzaxtVar.m8326l();
                    ((zzayt) zzaxtVar.f19780t).m4627w0(i2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
