package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkRequest;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjd extends zzga {
    private final zzpg zza;
    private Boolean zzb;
    private String zzc;

    public zzjd(zzpg zzpgVar, String str) {
        Preconditions.m3544h(zzpgVar);
        this.zza = zzpgVar;
        this.zzc = null;
    }

    private final void zzM(zzbh zzbhVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzF(zzbhVar, zzrVar);
    }

    @BinderThread
    private final void zzN(zzr zzrVar, boolean z) {
        Preconditions.m3544h(zzrVar);
        String str = zzrVar.zza;
        Preconditions.m3541e(str);
        zzO(str, false);
        this.zza.zzt().zzC(zzrVar.zzb);
    }

    @BinderThread
    private final void zzO(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzaW().zzb().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.zzb == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.zzc)) {
                        zzpg zzpgVar = this.zza;
                        if (!UidVerifier.m3657a(zzpgVar.zzaZ(), Binder.getCallingUid()) && !GoogleSignatureVerifier.m3405a(zzpgVar.zzaZ()).m3408b(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    this.zzb = Boolean.valueOf(z2);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.zza.zzaW().zzb().zzb("Measurement Service called with invalid calling package. appId", zzgu.zzl(str));
                throw e;
            }
        }
        if (this.zzc == null) {
            Context contextZzaZ = this.zza.zzaZ();
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
            if (UidVerifier.m3658b(contextZzaZ, callingUid, str)) {
                this.zzc = str;
            }
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzA(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzif(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzB(zzr zzrVar, final zzoo zzooVar, final zzgh zzghVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.m3544h(str);
        this.zza.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzI(str, zzooVar, zzghVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzC(final zzr zzrVar, final zzaf zzafVar) {
        zzN(zzrVar, false);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzja
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzJ(zzrVar, zzafVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzD(final zzr zzrVar, final Bundle bundle, final zzge zzgeVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.m3544h(str);
        this.zza.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zziy
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH(zzrVar, bundle, zzgeVar, str);
            }
        });
    }

    @VisibleForTesting
    public final void zzE(Runnable runnable) {
        Preconditions.m3544h(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzl(runnable);
        }
    }

    public final /* synthetic */ void zzF(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzv(zzrVar);
    }

    public final /* synthetic */ void zzG(zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzw(zzrVar);
    }

    public final /* synthetic */ void zzH(zzr zzrVar, Bundle bundle, zzge zzgeVar, String str) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        try {
            zzgeVar.zze(zzpgVar.zzar(zzrVar, bundle));
        } catch (RemoteException e) {
            this.zza.zzaW().zzb().zzc("Failed to return trigger URIs for app", str, e);
        }
    }

    public final void zzI(String str, zzoo zzooVar, zzgh zzghVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        zzpgVar.zzaX().zzg();
        zzpgVar.zzu();
        List<zzpj> listZzC = zzpgVar.zzj().zzC(str, zzooVar, ((Integer) zzfy.zzA.zzb(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (zzpj zzpjVar : listZzC) {
            if (zzpgVar.zzO(str, zzpjVar.zze())) {
                int iZzi = zzpjVar.zzi();
                if (iZzi > 0) {
                    if (iZzi <= ((Integer) zzfy.zzy.zzb(null)).intValue()) {
                        if (zzpgVar.zzba().currentTimeMillis() >= zzpjVar.zzh() + Math.min(((Long) zzfy.zzw.zzb(null)).longValue() * (1 << (iZzi - 1)), ((Long) zzfy.zzx.zzb(null)).longValue())) {
                        }
                    }
                    zzpgVar.zzaW().zzk().zzd("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(zzpjVar.zzc()), Long.valueOf(zzpjVar.zzh()));
                }
                zzom zzomVarZzb = zzpjVar.zzb();
                try {
                    com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.m10181H(), zzomVarZzb.zzb);
                    for (int i2 = 0; i2 < ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10184B(); i2++) {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10185C(i2).m9572r();
                        long jCurrentTimeMillis = zzpgVar.zzba().currentTimeMillis();
                        zzicVar.m9552o();
                        ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10349r0(jCurrentTimeMillis);
                        zzhzVar.m9552o();
                        ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10190J(i2, (com.google.android.gms.internal.measurement.zzid) zzicVar.m9555r());
                    }
                    zzomVarZzb.zzb = ((com.google.android.gms.internal.measurement.zzib) zzhzVar.m9555r()).m9346i();
                    if (Log.isLoggable(zzpgVar.zzaW().zzn(), 2)) {
                        zzomVarZzb.zzg = zzpgVar.zzp().zzi((com.google.android.gms.internal.measurement.zzib) zzhzVar.m9555r());
                    }
                    arrayList.add(zzomVarZzb);
                } catch (zzaeh unused) {
                    zzpgVar.zzaW().zze().zzb("Failed to parse queued batch. appId", str);
                }
            } else {
                zzpgVar.zzaW().zzk().zzd("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(zzpjVar.zzc()), zzpjVar.zze());
            }
        }
        zzoq zzoqVar = new zzoq(arrayList);
        try {
            zzghVar.zze(zzoqVar);
            this.zza.zzaW().zzk().zzc("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(zzoqVar.zza.size()));
        } catch (RemoteException e) {
            this.zza.zzaW().zzb().zzc("[sgtm] Failed to return upload batches for app", str, e);
        }
    }

    public final /* synthetic */ void zzJ(zzr zzrVar, zzaf zzafVar) {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzaa();
        String str = zzrVar.zza;
        Preconditions.m3544h(str);
        zzpgVar.zzas(str, zzafVar);
    }

    public final /* synthetic */ void zzK(Bundle bundle, String str, zzr zzrVar) {
        if (bundle.isEmpty()) {
            zzaw zzawVarZzj = this.zza.zzj();
            zzawVarZzj.zzg();
            zzawVarZzj.zzay();
            try {
                zzawVarZzj.zze().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e) {
                zzawVarZzj.zzu.zzaW().zzb().zzb("Error clearing default event params", e);
                return;
            }
        }
        zzaw zzawVarZzj2 = this.zza.zzj();
        zzawVarZzj2.zzg();
        zzawVarZzj2.zzay();
        byte[] bArrM9346i = zzawVarZzj2.zzg.zzp().zzh(new zzbc(zzawVarZzj2.zzu, "", str, "dep", 0L, 0L, 0L, bundle)).m9346i();
        zzic zzicVar = zzawVarZzj2.zzu;
        zzicVar.zzaW().zzk().zzc("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrM9346i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrM9346i);
        try {
            if (zzawVarZzj2.zze().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert default event parameters (got -1). appId", zzgu.zzl(str));
            }
        } catch (SQLiteException e2) {
            zzawVarZzj2.zzu.zzaW().zzb().zzc("Error storing default event parameters. appId", zzgu.zzl(str), e2);
        }
        zzpg zzpgVar = this.zza;
        zzaw zzawVarZzj3 = zzpgVar.zzj();
        long j2 = zzrVar.zzD;
        if (zzawVarZzj3.zzW(str, j2)) {
            zzpgVar.zzj().zzX(str, Long.valueOf(j2), null, bundle);
        }
    }

    public final /* synthetic */ zzpg zzL() {
        return this.zza;
    }

    public final void zzb(zzbh zzbhVar, zzr zzrVar) {
        zzpg zzpgVar = this.zza;
        zzht zzhtVarZzh = zzpgVar.zzh();
        String str = zzrVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzhtVarZzh.zze.get(str);
        if (zzcVar == null) {
            this.zza.zzaW().zzk().zzb("EES not loaded for", zzrVar.zza);
            zzM(zzbhVar, zzrVar);
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzab zzabVar = zzcVar.f22343c;
            Map mapZzz = zzpgVar.zzp().zzz(zzbhVar.zzb.zzf(), true);
            String str2 = zzbhVar.zza;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            if (zzcVar.m9828a(new com.google.android.gms.internal.measurement.zzaa(str2, zzbhVar.zzd, mapZzz))) {
                if (zzabVar.f21889b.equals(zzabVar.f21888a)) {
                    zzM(zzbhVar, zzrVar);
                } else {
                    zzpg zzpgVar2 = this.zza;
                    zzpgVar2.zzaW().zzk().zzb("EES edited event", zzbhVar.zza);
                    zzM(zzpgVar2.zzp().zzA(zzabVar.f21889b), zzrVar);
                }
                if (zzabVar.f21890c.isEmpty()) {
                    return;
                }
                ArrayList arrayList = zzabVar.f21890c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    com.google.android.gms.internal.measurement.zzaa zzaaVar = (com.google.android.gms.internal.measurement.zzaa) obj;
                    zzpg zzpgVar3 = this.zza;
                    zzpgVar3.zzaW().zzk().zzb("EES logging created event", zzaaVar.f21850a);
                    zzM(zzpgVar3.zzp().zzA(zzaaVar), zzrVar);
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzaW().zzb().zzc("EES error. appId, eventName", zzrVar.zzb, zzbhVar.zza);
        }
        this.zza.zzaW().zzk().zzb("EES was not applied to event", zzbhVar.zza);
        zzM(zzbhVar, zzrVar);
    }

    @VisibleForTesting
    public final zzbh zzc(zzbh zzbhVar, zzr zzrVar) {
        zzbf zzbfVar;
        if (Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzbhVar.zza) && (zzbfVar = zzbhVar.zzb) != null && zzbfVar.zze() != 0) {
            String strZzd = zzbfVar.zzd("_cis");
            if ("referrer broadcast".equals(strZzd) || "referrer API".equals(strZzd)) {
                this.zza.zzaW().zzi().zzb("Event has been filtered ", zzbhVar.toString());
                return new zzbh("_cmpx", zzbfVar, zzbhVar.zzc, zzbhVar.zzd, zzbhVar.zze);
            }
        }
        return zzbhVar;
    }

    @VisibleForTesting
    public final void zzd(Runnable runnable) {
        Preconditions.m3544h(runnable);
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzaX().zze()) {
            runnable.run();
        } else {
            zzpgVar.zzaX().zzj(runnable);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zze(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.m3544h(zzbhVar);
        zzN(zzrVar, false);
        zzd(new zzir(this, zzbhVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzf(zzpl zzplVar, zzr zzrVar) {
        Preconditions.m3544h(zzplVar);
        zzN(zzrVar, false);
        zzd(new zziu(this, zzplVar, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzg(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzie(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzh(zzbh zzbhVar, String str, String str2) {
        Preconditions.m3544h(zzbhVar);
        Preconditions.m3541e(str);
        zzO(str, true);
        zzd(new zzis(this, zzbhVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzi(zzr zzrVar) {
        zzN(zzrVar, false);
        zzd(new zzin(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzj(zzr zzrVar, boolean z) {
        zzN(zzrVar, false);
        String str = zzrVar.zza;
        Preconditions.m3544h(str);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzid(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.zza.zzaW().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            this.zza.zzaW().zzb().zzc("Failed to get user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final byte[] zzk(zzbh zzbhVar, String str) {
        Preconditions.m3541e(str);
        Preconditions.m3544h(zzbhVar);
        zzO(str, true);
        zzpg zzpgVar = this.zza;
        zzgs zzgsVarZzj = zzpgVar.zzaW().zzj();
        zzgn zzgnVarZzs = zzpgVar.zzs();
        String str2 = zzbhVar.zza;
        zzgsVarZzj.zzb("Log and bundle. event", zzgnVarZzs.zza(str2));
        long jMo3640b = zzpgVar.zzba().mo3640b() / 1000000;
        try {
            byte[] bArr = (byte[]) zzpgVar.zzaX().zzi(new zzit(this, zzbhVar, str)).get();
            if (bArr == null) {
                zzpgVar.zzaW().zzb().zzb("Log and bundle returned null. appId", zzgu.zzl(str));
                bArr = new byte[0];
            }
            zzpgVar.zzaW().zzj().zzd("Log and bundle processed. event, size, time_ms", zzpgVar.zzs().zza(str2), Integer.valueOf(bArr.length), Long.valueOf((zzpgVar.zzba().mo3640b() / 1000000) - jMo3640b));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            zzpg zzpgVar2 = this.zza;
            zzpgVar2.zzaW().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar2.zzs().zza(zzbhVar.zza), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            zzpg zzpgVar3 = this.zza;
            zzpgVar3.zzaW().zzb().zzd("Failed to log and bundle. appId, event, error", zzgu.zzl(str), zzpgVar3.zzs().zza(zzbhVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzl(long j2, String str, String str2, String str3) {
        zzd(new zzig(this, str2, str3, str, j2));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final String zzm(zzr zzrVar) {
        zzN(zzrVar, false);
        return this.zza.zzaq(zzrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzn(zzah zzahVar, zzr zzrVar) {
        Preconditions.m3544h(zzahVar);
        Preconditions.m3544h(zzahVar.zzc);
        zzN(zzrVar, false);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.zza = zzrVar.zza;
        zzd(new zzih(this, zzahVar2, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzo(zzah zzahVar) {
        Preconditions.m3544h(zzahVar);
        Preconditions.m3544h(zzahVar.zzc);
        Preconditions.m3541e(zzahVar.zza);
        zzO(zzahVar.zza, true);
        zzd(new zzii(this, new zzah(zzahVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzp(String str, String str2, boolean z, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.m3544h(str3);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzij(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.zza.zzaW().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.zza.zzaW().zzb().zzc("Failed to query user properties. appId", zzgu.zzl(zzrVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzq(String str, String str2, String str3, boolean z) {
        zzO(str, true);
        try {
            List<zzpn> list = (List) this.zza.zzaX().zzh(new zzik(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzpn zzpnVar : list) {
                if (z || !zzpp.zzac(zzpnVar.zzc)) {
                    arrayList.add(new zzpl(zzpnVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            this.zza.zzaW().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            this.zza.zzaW().zzb().zzc("Failed to get user properties as. appId", zzgu.zzl(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzr(String str, String str2, zzr zzrVar) {
        zzN(zzrVar, false);
        String str3 = zzrVar.zza;
        Preconditions.m3544h(str3);
        try {
            return (List) this.zza.zzaX().zzh(new zzil(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzaW().zzb().zzb("Failed to get conditional user properties", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzs(String str, String str2, String str3) {
        zzO(str, true);
        try {
            return (List) this.zza.zzaX().zzh(new zzim(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.zza.zzaW().zzb().zzb("Failed to get conditional user properties as", e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzt(zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.m3541e(str);
        zzO(str, false);
        zzd(new zzio(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzu(final Bundle bundle, final zzr zzrVar) {
        zzN(zzrVar, false);
        final String str = zzrVar.zza;
        Preconditions.m3544h(str);
        zzd(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzK(bundle, str, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzv(zzr zzrVar) {
        Preconditions.m3541e(zzrVar.zza);
        Preconditions.m3544h(zzrVar.zzs);
        zzE(new zzip(this, zzrVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final zzao zzw(zzr zzrVar) {
        zzN(zzrVar, false);
        Preconditions.m3541e(zzrVar.zza);
        try {
            return (zzao) this.zza.zzaX().zzi(new zziq(this, zzrVar)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zza.zzaW().zzb().zzc("Failed to get consent. appId", zzgu.zzl(zzrVar.zza), e);
            return new zzao(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final List zzx(zzr zzrVar, Bundle bundle) {
        zzN(zzrVar, false);
        Preconditions.m3544h(zzrVar.zza);
        zzpg zzpgVar = this.zza;
        if (!zzpgVar.zzd().zzp(null, zzfy.zzaT)) {
            try {
                return (List) this.zza.zzaX().zzh(new zziw(this, zzrVar, bundle)).get();
            } catch (InterruptedException | ExecutionException e) {
                this.zza.zzaW().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) zzpgVar.zzaX().zzi(new zziv(this, zzrVar, bundle)).get(WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.zza.zzaW().zzb().zzc("Failed to get trigger URIs. appId", zzgu.zzl(zzrVar.zza), e2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzy(final zzr zzrVar) {
        Preconditions.m3541e(zzrVar.zza);
        Preconditions.m3544h(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzjc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    @BinderThread
    public final void zzz(final zzr zzrVar) {
        Preconditions.m3541e(zzrVar.zza);
        Preconditions.m3544h(zzrVar.zzs);
        zzE(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzix
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(zzrVar);
            }
        });
    }
}
