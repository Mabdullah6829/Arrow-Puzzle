package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.m3544h(strArr);
        Preconditions.m3544h(strArr2);
        Preconditions.m3544h(atomicReference);
        Preconditions.m3537a(strArr.length == strArr2.length);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (Objects.equals(str, strArr[i2])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i2];
                        if (str2 == null) {
                            str2 = strArr2[i2] + "(" + strArr[i2] + ")";
                            strArr3[i2] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzf, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (this.zzd.zza()) {
            return str.startsWith("_exp_") ? AbstractC0271e0.m399g("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
        }
        return str;
    }

    public final String zzd(zzbh zzbhVar) {
        String string;
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbhVar.toString();
        }
        StringBuilder sb = new StringBuilder("origin=");
        sb.append(zzbhVar.zzc);
        sb.append(",name=");
        sb.append(zza(zzbhVar.zza));
        sb.append(",params=");
        zzbf zzbfVar = zzbhVar.zzb;
        if (zzbfVar == null) {
            string = null;
        } else {
            string = !zzgmVar.zza() ? zzbfVar.toString() : zze(zzbfVar.zzf());
        }
        sb.append(string);
        return sb.toString();
    }

    public final String zze(Bundle bundle) {
        String strZzf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbM408p = AbstractC0271e0.m408p("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM408p.length() != 8) {
                sbM408p.append(", ");
            }
            sbM408p.append(zzb(str));
            sbM408p.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                strZzf = zzf(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                strZzf = zzf((Object[]) obj);
            } else {
                strZzf = obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj);
            }
            sbM408p.append(strZzf);
        }
        sbM408p.append("}]");
        return sbM408p.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM408p = AbstractC0271e0.m408p("[");
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbM408p.length() != 1) {
                    sbM408p.append(", ");
                }
                sbM408p.append(strZze);
            }
        }
        sbM408p.append("]");
        return sbM408p.toString();
    }
}
