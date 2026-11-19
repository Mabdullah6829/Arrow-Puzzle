package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zznn extends zzos {
    public final zzhe zza;
    public final zzhe zzb;
    public final zzhe zzc;
    public final zzhe zzd;
    public final zzhe zze;
    public final zzhe zzf;
    private final Map zzh;

    public zznn(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzh = new HashMap();
        zzhh zzhhVarZzd = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd);
        this.zza = new zzhe(zzhhVarZzd, "last_delete_stale", 0L);
        zzhh zzhhVarZzd2 = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd2);
        this.zzb = new zzhe(zzhhVarZzd2, "last_delete_stale_batch", 0L);
        zzhh zzhhVarZzd3 = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd3);
        this.zzc = new zzhe(zzhhVarZzd3, "backoff", 0L);
        zzhh zzhhVarZzd4 = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd4);
        this.zzd = new zzhe(zzhhVarZzd4, "last_upload", 0L);
        zzhh zzhhVarZzd5 = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd5);
        this.zze = new zzhe(zzhhVarZzd5, "last_upload_attempt", 0L);
        zzhh zzhhVarZzd6 = this.zzu.zzd();
        Objects.requireNonNull(zzhhVarZzd6);
        this.zzf = new zzhe(zzhhVarZzd6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        return false;
    }

    public final Pair zzc(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.zza;
        Preconditions.m3541e(str);
        return (zzjlVar.zzo(zzjk.AD_STORAGE) && zzrVar.zzn) ? zzd(str) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final Pair zzd(String str) {
        zznm zznmVar;
        AdvertisingIdClient.Info infoM2775a;
        zzg();
        zzic zzicVar = this.zzu;
        long jMo3639a = zzicVar.zzba().mo3639a();
        zznm zznmVar2 = (zznm) this.zzh.get(str);
        if (zznmVar2 != null && jMo3639a < zznmVar2.zzc) {
            return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
        }
        long jZzl = zzicVar.zzc().zzl(str, zzfy.zza) + jMo3639a;
        try {
            try {
                infoM2775a = AdvertisingIdClient.m2775a(zzicVar.zzaZ());
            } catch (PackageManager.NameNotFoundException unused) {
                infoM2775a = null;
                if (zznmVar2 != null && jMo3639a < zznmVar2.zzc + this.zzu.zzc().zzl(str, zzfy.zzb)) {
                    return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
                }
            }
            if (infoM2775a == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = infoM2775a.f3021a;
            zznmVar = str2 != null ? new zznm(str2, infoM2775a.f3022b, jZzl) : new zznm("", infoM2775a.f3022b, jZzl);
            this.zzh.put(str, zznmVar);
            return new Pair(zznmVar.zza, Boolean.valueOf(zznmVar.zzb));
        } catch (Exception e) {
            this.zzu.zzaW().zzj().zzb("Unable to get advertising id", e);
            zznmVar = new zznm("", false, jZzl);
        }
    }

    @WorkerThread
    public final String zzf(zzr zzrVar, zzjl zzjlVar) {
        String str = zzrVar.zza;
        Preconditions.m3541e(str);
        if (!zzjlVar.zzo(zzjk.AD_STORAGE) || !zzrVar.zzn) {
            return "";
        }
        zzg();
        String str2 = (String) zzd(str).first;
        MessageDigest messageDigestZzQ = zzpp.zzQ();
        if (messageDigestZzQ == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZzQ.digest(str2.getBytes())));
    }
}
