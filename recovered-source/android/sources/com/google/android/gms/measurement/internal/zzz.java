package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzz {
    final /* synthetic */ zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private Long zzc;
    private long zzd;

    public /* synthetic */ zzz(zzad zzadVar, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final com.google.android.gms.internal.measurement.zzhs zza(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strM10127F = zzhsVar.m10127F();
        List listM10124C = zzhsVar.m10124C();
        zzad zzadVar = this.zza;
        zzpg zzpgVar = zzadVar.zzg;
        zzpgVar.zzp();
        Long l2 = (Long) zzpk.zzM(zzhsVar, "_eid");
        if (l2 != null) {
            if (strM10127F.equals("_ep")) {
                zzpgVar.zzp();
                String str2 = (String) zzpk.zzM(zzhsVar, "_en");
                ?? r7 = 0;
                if (TextUtils.isEmpty(str2)) {
                    zzadVar.zzu.zzaW().zzc().zzb("Extra parameter without an event name. eventId", l2);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l2.longValue() != this.zzc.longValue()) {
                    zzaw zzawVarZzj = zzpgVar.zzj();
                    zzawVarZzj.zzg();
                    zzawVarZzj.zzay();
                    try {
                        try {
                            cursorRawQuery = zzawVarZzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l2.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), cursorRawQuery.getBlob(0))).m9555r(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        zzawVarZzj.zzu.zzaW().zzb().zzd("Failed to merge main event. appId, eventId", zzgu.zzl(str), l2, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                                        return null;
                                    }
                                    this.zzb = (com.google.android.gms.internal.measurement.zzhs) obj;
                                    this.zzd = ((Long) pairCreate.second).longValue();
                                    this.zza.zzg.zzp();
                                    this.zzc = (Long) zzpk.zzM(this.zzb, "_eid");
                                } else {
                                    zzawVarZzj.zzu.zzaW().zzk().zza("Main event not found");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzawVarZzj.zzu.zzaW().zzb().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r7 = zzpgVar;
                            if (r7 != 0) {
                                r7.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r7 != 0) {
                            r7.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l2);
                    return null;
                }
                long j2 = this.zzd - 1;
                this.zzd = j2;
                if (j2 <= 0) {
                    zzaw zzawVarZzj2 = this.zza.zzg.zzj();
                    zzawVarZzj2.zzg();
                    zzawVarZzj2.zzu.zzaW().zzk().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzawVarZzj2.zze().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        zzawVarZzj2.zzu.zzaW().zzb().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.zza.zzg.zzj().zzU(str, l2, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.zzb.m10124C()) {
                    this.zza.zzg.zzp();
                    if (zzpk.zzI(zzhsVar, zzhwVar.m10156B()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaW().zzc().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listM10124C);
                    listM10124C = arrayList;
                }
                strM10127F = str2;
            } else {
                this.zzc = l2;
                this.zzb = zzhsVar;
                zzpgVar.zzp();
                long jLongValue = ((Long) zzpk.zzN(zzhsVar, "_epc", 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzadVar.zzu.zzaW().zzc().zzb("Complex event with zero extra param count. eventName", strM10127F);
                } else {
                    zzpgVar.zzj().zzU(str, l2, this.zzd, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.m9572r();
        zzhrVar.m10108C(strM10127F);
        zzhrVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10141U();
        zzhrVar.m9552o();
        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10140T(listM10124C);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r();
    }
}
