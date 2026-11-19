package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.ProxyConfig;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw extends zzos {
    private final zzav zzm;
    private final zzog zzn;
    private static final String[] zzb = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    static final String[] zza = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    private static final String[] zzc = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzd = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
    private static final String[] zze = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
    private static final String[] zzf = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzj = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private static final String[] zzk = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    private static final String[] zzl = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public zzaw(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzn = new zzog(this.zzu.zzba());
        this.zzu.zzc();
        this.zzm = new zzav(this, this.zzu.zzaZ(), "google_app_measurement.db");
    }

    @WorkerThread
    private final long zzaA(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    private final long zzaB(String str, String[] strArr, long j2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j2 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @WorkerThread
    private final String zzaC(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    @WorkerThread
    private final void zzaD(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                this.zzu.zzaW().zzd().zzb("Value of the primary key is not set.", zzgu.zzl("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseZze.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                this.zzu.zzaW().zzb().zzc("Failed to insert/update table (got -1). key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"));
            }
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzd("Error storing into table. key", zzgu.zzl("consent_settings"), zzgu.zzl("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012f  */
    @WorkerThread
    private final zzbd zzaE(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.m3541e(str2);
        Preconditions.m3541e(str3);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        long j3 = cursorQuery.getLong(1);
                        long j4 = cursorQuery.getLong(2);
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        zzbd zzbdVar = new zzbd(str2, str3, j2, j3, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j4, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaW().zzb().zzb("Got multiple records for event aggregates, expected one. appId", zzgu.zzl(str2));
                        }
                        cursorQuery.close();
                        return zzbdVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzic zzicVar = this.zzu;
                    zzicVar.zzaW().zzb().zzd("Error querying events. appId", zzgu.zzl(str2), zzicVar.zzl().zza(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    private final void zzaF(String str, zzbd zzbdVar) {
        Preconditions.m3544h(zzbdVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        String str2 = zzbdVar.zza;
        contentValues.put("app_id", str2);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbdVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzbdVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzbdVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzbdVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzbdVar.zzg));
        contentValues.put("last_bundled_day", zzbdVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzbdVar.zzi);
        contentValues.put("last_sampling_rate", zzbdVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzbdVar.zze));
        Boolean bool = zzbdVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zze().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                this.zzu.zzaW().zzb().zzb("Failed to insert/update event aggregates (got -1). appId", zzgu.zzl(str2));
            }
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing event aggregates. appId", zzgu.zzl(zzbdVar.zza), e);
        }
    }

    private final void zzaG(String str, String str2) {
        Preconditions.m3541e(str2);
        zzg();
        zzay();
        try {
            zze().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error deleting snapshot. appId", zzgu.zzl(str2), e);
        }
    }

    private final zzpj zzaH(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        if (TextUtils.isEmpty(str2)) {
            this.zzu.zzaW().zzj().zza("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzpk.zzw(com.google.android.gms.internal.measurement.zzib.m10181H(), bArr);
            zzls zzlsVarZzb = zzls.zzb(i2);
            if (zzlsVarZzb != zzls.GOOGLE_SIGNAL && zzlsVarZzb != zzls.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10183A()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) it.next()).m9572r();
                    zzicVar.m9552o();
                    ((com.google.android.gms.internal.measurement.zzid) zzicVar.f22030t).m10315f1(i3);
                    arrayList.add((com.google.android.gms.internal.measurement.zzid) zzicVar.m9555r());
                }
                zzhzVar.m9552o();
                ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10193M();
                zzhzVar.m9552o();
                ((com.google.android.gms.internal.measurement.zzib) zzhzVar.f22030t).m10192L(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        this.zzu.zzaW().zzb().zzb("Invalid upload header: ", str4);
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            zzpi zzpiVar = new zzpi();
            zzpiVar.zzb(j2);
            zzpiVar.zzc((com.google.android.gms.internal.measurement.zzib) zzhzVar.m9555r());
            zzpiVar.zzd(str2);
            zzpiVar.zze(map);
            zzpiVar.zzf(zzlsVarZzb);
            zzpiVar.zzg(j3);
            zzpiVar.zzh(j4);
            zzpiVar.zzi(j5);
            zzpiVar.zzj(i3);
            return zzpiVar.zza();
        } catch (IOException e) {
            this.zzu.zzaW().zzb().zzc("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    private final String zzaI() {
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int iZza = zzlsVar.zza();
        zzicVar.zzc();
        Long l2 = (Long) zzfy.zzS.zzb(null);
        l2.longValue();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l2 + ")";
        int iZza2 = zzlsVar.zza();
        zzicVar.zzc();
        String str2 = "(upload_type != " + iZza2 + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + zzal.zzI() + ")";
        StringBuilder sb = new StringBuilder(AbstractC0271e0.m395c(str.length(), 5, str2.length(), 1));
        AbstractC0271e0.m413u(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    private static final String zzaJ(List list) {
        return list.isEmpty() ? "" : AbstractC0271e0.m399g(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    @WorkerThread
    public static final void zzaw(ContentValues contentValues, String str, Object obj) {
        Preconditions.m3541e("value");
        Preconditions.m3544h(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    @WorkerThread
    public final long zzA(String str, com.google.android.gms.internal.measurement.zzib zzibVar, String str2, Map map, zzls zzlsVar, Long l2) {
        int iDelete;
        zzg();
        zzay();
        Preconditions.m3544h(zzibVar);
        Preconditions.m3541e(str);
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zzb.zza();
            zzic zzicVar = this.zzu;
            long jMo3639a = zzicVar.zzba().mo3639a();
            long jAbs = Math.abs(jMo3639a - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zzb.zzb(jMo3639a);
                zzg();
                zzay();
                if (zzai() && (iDelete = zze().delete("upload_queue", zzaI(), new String[0])) > 0) {
                    zzicVar.zzaW().zzk().zzb("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
                Preconditions.m3541e(str);
                zzg();
                zzay();
                try {
                    int iZzm = zzicVar.zzc().zzm(str, zzfy.zzz);
                    if (iZzm > 0) {
                        zze().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iZzm)});
                    }
                } catch (SQLiteException e) {
                    this.zzu.zzaW().zzb().zzc("Error deleting over the limit queued batches. appId", zzgu.zzl(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrM9346i = zzibVar.m9346i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM9346i);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        zzic zzicVar2 = this.zzu;
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar2.zzba().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long jInsert = zze().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            zzicVar2.zzaW().zzb().zzb("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e2) {
            this.zzu.zzaW().zzb().zzc("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    @WorkerThread
    public final zzpj zzB(long j2) throws Throwable {
        Cursor cursorQuery;
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
            try {
                if (cursorQuery.moveToFirst()) {
                    String string = cursorQuery.getString(1);
                    Preconditions.m3544h(string);
                    zzpj zzpjVarZzaH = zzaH(string, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                    cursorQuery.close();
                    return zzpjVarZzaH;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    this.zzu.zzaW().zzb().zzc("Error to querying MeasurementBatch from upload_queue. rowId", Long.valueOf(j2), e);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    @WorkerThread
    public final List zzC(String str, zzoo zzooVar, int i2) {
        List list;
        Preconditions.m3541e(str);
        zzg();
        zzay();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "associated_row_id", "last_upload_timestamp"};
            String strZzaJ = zzaJ(zzooVar.zza);
            String strZzaI = zzaI();
            StringBuilder sb = new StringBuilder(String.valueOf(strZzaJ).length() + 17 + strZzaI.length());
            sb.append("app_id=?");
            sb.append(strZzaJ);
            sb.append(" AND NOT ");
            sb.append(strZzaI);
            cursorQuery = sQLiteDatabaseZze.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i2 > 0 ? String.valueOf(i2) : null);
            ArrayList arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                zzpj zzpjVarZzaH = zzaH(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (zzpjVarZzaH != null) {
                    arrayList.add(zzpjVarZzaH);
                }
            }
            list = arrayList;
        } catch (SQLiteException e) {
            try {
                this.zzu.zzaW().zzb().zzc("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    @WorkerThread
    public final boolean zzD(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strZzaJ = zzaJ(arrayList);
        String strZzaI = zzaI();
        return zzaA(AbstractC1456a.m2451r(new StringBuilder((String.valueOf(strZzaJ).length() + 61) + strZzaI.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strZzaJ, " AND NOT ", strZzaI), new String[]{str}) != 0;
    }

    @WorkerThread
    public final void zzE(Long l2) {
        zzg();
        zzay();
        Preconditions.m3544h(l2);
        try {
            if (zze().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                this.zzu.zzaW().zze().zza("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzb("Failed to delete a MeasurementBatch in a upload_queue table", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    public final String zzF() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZze = zze();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZze.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zzb().zzb("Database error getting next bundle app id", e);
                }
            } catch (Throwable th) {
                r1 = sQLiteDatabaseZze;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final boolean zzG() {
        return zzaA("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @WorkerThread
    public final void zzH(long j2) {
        zzg();
        zzay();
        try {
            if (zze().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzb("Failed to delete a bundle in a queue table", e);
            throw e;
        }
    }

    @WorkerThread
    public final void zzI() {
        zzg();
        zzay();
        if (zzai()) {
            zzpg zzpgVar = this.zzg;
            long jZza = zzpgVar.zzq().zza.zza();
            zzic zzicVar = this.zzu;
            long jMo3639a = zzicVar.zzba().mo3639a();
            long jAbs = Math.abs(jMo3639a - jZza);
            zzicVar.zzc();
            if (jAbs > zzal.zzJ()) {
                zzpgVar.zzq().zza.zzb(jMo3639a);
                zzg();
                zzay();
                if (zzai()) {
                    SQLiteDatabase sQLiteDatabaseZze = zze();
                    String strValueOf = String.valueOf(zzicVar.zzba().currentTimeMillis());
                    zzicVar.zzc();
                    int iDelete = sQLiteDatabaseZze.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzal.zzI())});
                    if (iDelete > 0) {
                        zzicVar.zzaW().zzk().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzJ(List list) {
        zzg();
        zzay();
        Preconditions.m3544h(list);
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (zzai()) {
            String strJoin = TextUtils.join(",", list);
            String strM2450q = AbstractC1456a.m2450q(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (zzaA(AbstractC1456a.m2450q(new StringBuilder(strM2450q.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM2450q, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                AbstractC1456a.m2459z(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                StringBuilder sb = new StringBuilder(strM2450q.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM2450q);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseZze.execSQL(sb.toString());
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    public final void zzK(Long l2) {
        zzg();
        zzay();
        Preconditions.m3544h(l2);
        if (zzai()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (zzaA(sb.toString(), null) > 0) {
                AbstractC1456a.m2459z(this.zzu, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                long jCurrentTimeMillis = this.zzu.zzba().currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l2.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l2);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseZze.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final Object zzL(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            AbstractC1456a.m2452s(this.zzu, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.zzu.zzaW().zzb().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        AbstractC1456a.m2452s(this.zzu, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    @WorkerThread
    public final long zzM() {
        return zzaB("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0092 A[Catch: all -> 0x006c, SQLiteException -> 0x00a6, TryCatch #0 {SQLiteException -> 0x00a6, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a8), top: B:30:0x0071 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8 A[Catch: all -> 0x006c, SQLiteException -> 0x00a6, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a6, blocks: (B:15:0x0071, B:17:0x0092, B:20:0x00a8), top: B:30:0x0071 }] */
    @VisibleForTesting
    @WorkerThread
    public final long zzN(String str, String str2) {
        long j2;
        ContentValues contentValues;
        Preconditions.m3541e(str);
        Preconditions.m3541e("first_open_count");
        zzg();
        zzay();
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        long j3 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j2 = -1;
                long jZzaB = zzaB(sb.toString(), new String[]{str}, -1L);
                if (jZzaB == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZze.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.zzu.zzaW().zzb().zzc("Failed to insert column (got -1). appId", zzgu.zzl(str), "first_open_count");
                    } else {
                        jZzaB = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
                            if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                this.zzu.zzaW().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                            } else {
                                sQLiteDatabaseZze.setTransactionSuccessful();
                                j2 = jZzaB;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j3 = jZzaB;
                            this.zzu.zzaW().zzb().zzd("Error inserting column. appId", zzgu.zzl(str), "first_open_count", e);
                            j2 = j3;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jZzaB));
                    if (sQLiteDatabaseZze.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        this.zzu.zzaW().zzb().zzc("Failed to update column (got 0). appId", zzgu.zzl(str), "first_open_count");
                    } else {
                        sQLiteDatabaseZze.setTransactionSuccessful();
                        j2 = jZzaB;
                    }
                }
            } finally {
                sQLiteDatabaseZze.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
        return j2;
    }

    @WorkerThread
    public final long zzO() {
        return zzaB("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean zzP() {
        return zzaA("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzQ(String str, String str2) {
        return zzaA("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final boolean zzR() {
        return zzaA("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    public final void zzS(List list) {
        Preconditions.m3544h(list);
        zzg();
        zzay();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i2)).longValue());
        }
        sb.append(")");
        int iDelete = zze().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            this.zzu.zzaW().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    public final long zzT(String str) {
        Preconditions.m3541e(str);
        return zzaB("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean zzU(String str, Long l2, long j2, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        zzg();
        zzay();
        Preconditions.m3544h(zzhsVar);
        Preconditions.m3541e(str);
        Preconditions.m3544h(l2);
        zzic zzicVar = this.zzu;
        byte[] bArrM9346i = zzhsVar.m9346i();
        zzicVar.zzaW().zzk().zzc("Saving complex main event, appId, data size", zzicVar.zzl().zza(str), Integer.valueOf(bArrM9346i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", bArrM9346i);
        try {
            if (zze().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzicVar.zzaW().zzb().zzb("Failed to insert complex main event (got -1). appId", zzgu.zzl(str));
            return false;
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing complex main event. appId", zzgu.zzl(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0087  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:19:0x006a */
    public final Bundle zzV(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zze().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        try {
                            com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), cursorRawQuery.getBlob(0))).m9555r();
                            this.zzg.zzp();
                            Bundle bundleZzH = zzpk.zzH(zzhsVar.m10124C());
                            cursorRawQuery.close();
                            return bundleZzH;
                        } catch (IOException e) {
                            this.zzu.zzaW().zzb().zzc("Failed to retrieve default event parameters. appId", zzgu.zzl(str), e);
                        }
                    } else {
                        this.zzu.zzaW().zzk().zza("Default event parameters not found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zzb().zzb("Error selecting default event parameters", e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    public final boolean zzW(String str, long j2) {
        try {
            return zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) <= 0 && zzaB("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) > 0;
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzb("Error checking backfill conditions", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:2: B:51:0x0104->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    public final void zzX(String str, Long l2, String str2, Bundle bundle) {
        zzic zzicVar;
        Bundle bundle2;
        zzbc zzbcVar;
        long j2;
        String str3;
        ContentValues contentValues;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        Iterator<E> it;
        String str4 = str;
        Preconditions.m3544h(bundle);
        zzg();
        zzay();
        zzau zzauVar = l2 != null ? new zzau(this, str4, l2.longValue()) : new zzau(this, str4);
        List<zzat> listZza = zzauVar.zza();
        while (!listZza.isEmpty()) {
            for (zzat zzatVar : listZza) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        com.google.android.gms.internal.measurement.zzid zzidVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = zze().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(zzatVar.zzb)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.m10218f0(), cursorQuery.getBlob(0))).m9555r();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        this.zzu.zzaW().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(str4));
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor2 = cursorQuery;
                                                    this.zzu.zzaW().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(str4), e);
                                                    if (cursor2 != null) {
                                                        cursor2.close();
                                                    }
                                                }
                                                zzidVar2 = zzidVar;
                                            } catch (IOException e2) {
                                                this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(str4), e2);
                                                cursorQuery.close();
                                            }
                                            if (zzidVar2 != null) {
                                                it = zzidVar2.m10324i2().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).m10421C().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(str4));
                                        }
                                        cursorQuery.close();
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = cursorQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    zzidVar = null;
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                zzidVar = null;
                            }
                            if (zzidVar2 != null) {
                                it = zzidVar2.m10324i2().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((com.google.android.gms.internal.measurement.zziu) it.next()).m10421C().equals(str2)) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    long jUpdate = zze().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j2)});
                    if (jUpdate != 1) {
                        zzicVar.zzaW().zzb().zzc("Failed to update raw event. appId, updatedRows", zzgu.zzl(str3), Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e5) {
                    this.zzu.zzaW().zzb().zzc("Error updating raw event. appId", zzgu.zzl(zzbcVar.zza), e5);
                }
                zzpg zzpgVar = this.zzg;
                zzpk zzpkVarZzp = zzpgVar.zzp();
                com.google.android.gms.internal.measurement.zzhs zzhsVar = zzatVar.zzd;
                Bundle bundle3 = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.m10124C()) {
                    if (zzhwVar.m10163I()) {
                        bundle3.putDouble(zzhwVar.m10156B(), zzhwVar.m10164J());
                    } else if (zzhwVar.m10161G()) {
                        bundle3.putFloat(zzhwVar.m10156B(), zzhwVar.m10162H());
                    } else if (zzhwVar.m10159E()) {
                        bundle3.putLong(zzhwVar.m10156B(), zzhwVar.m10160F());
                    } else if (zzhwVar.m10157C()) {
                        bundle3.putString(zzhwVar.m10156B(), zzhwVar.m10158D());
                    } else if (zzhwVar.m10165K().isEmpty()) {
                        zzpkVarZzp.zzu.zzaW().zzb().zzb("Unexpected parameter type for parameter", zzhwVar);
                    } else {
                        bundle3.putParcelableArray(zzhwVar.m10156B(), zzpk.zzy(zzhwVar.m10165K()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM10127F = zzhsVar.m10127F();
                if (string == null) {
                    string = "";
                }
                zzgv zzgvVar = new zzgv(strM10127F, string, bundle3, zzhsVar.m10129H(), zzhsVar.m10137P());
                zzicVar = this.zzu;
                Bundle bundle4 = zzgvVar.zze;
                String str5 = zzgvVar.zza;
                zzpp zzppVarZzk = zzicVar.zzk();
                if (str5.equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                    bundle2 = new Bundle(bundle);
                    for (String str6 : bundle.keySet()) {
                        zzpg zzpgVar2 = zzpgVar;
                        if (str6.startsWith("gad_")) {
                            bundle2.remove(str6);
                        }
                        zzpgVar = zzpgVar2;
                    }
                } else {
                    bundle2 = bundle;
                }
                zzpg zzpgVar3 = zzpgVar;
                zzppVarZzk.zzK(bundle4, bundle2);
                zzau zzauVar2 = zzauVar;
                zzbcVar = new zzbc(this.zzu, zzgvVar.zzb, str4, zzhsVar.m10127F(), zzhsVar.m10129H(), zzhsVar.m10137P(), zzhsVar.m10131J(), bundle4);
                j2 = zzatVar.zza;
                long j3 = zzatVar.zzb;
                boolean z = zzatVar.zzc;
                zzg();
                zzay();
                str3 = zzbcVar.zza;
                Preconditions.m3541e(str3);
                byte[] bArrM9346i = zzpgVar3.zzp().zzh(zzbcVar).m9346i();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzbcVar.zzb);
                contentValues.put("timestamp", Long.valueOf(zzbcVar.zzd));
                contentValues.put("metadata_fingerprint", Long.valueOf(j3));
                contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrM9346i);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(zzbcVar.zze));
                str4 = str;
                zzauVar = zzauVar2;
            }
            listZza = zzauVar.zza();
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    public final zzjl zzY(String str) throws Throwable {
        Throwable th;
        SQLiteException e;
        Preconditions.m3544h(str);
        zzg();
        zzay();
        ?? RawQuery = {str};
        ?? r1 = 0;
        zzjlVarZzf = null;
        zzjlVarZzf = null;
        zzjl zzjlVarZzf = null;
        try {
            try {
                RawQuery = zze().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", RawQuery);
                try {
                    if (RawQuery.moveToFirst()) {
                        zzjlVarZzf = zzjl.zzf(RawQuery.getString(0), RawQuery.getInt(1));
                    } else {
                        this.zzu.zzaW().zzk().zza("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzu.zzaW().zzb().zzb("Error querying database.", e);
                    if (RawQuery != 0) {
                    }
                    if (zzjlVarZzf == null) {
                        return zzjl.zza;
                    }
                    return zzjlVarZzf;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = RawQuery;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            RawQuery = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        RawQuery.close();
        if (zzjlVarZzf == null) {
            return zzjl.zza;
        }
        return zzjlVarZzf;
    }

    @WorkerThread
    public final boolean zzZ(String str, zzoh zzohVar) {
        zzg();
        zzay();
        Preconditions.m3544h(zzohVar);
        Preconditions.m3541e(str);
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        zzfx zzfxVar = zzfy.zzau;
        long jLongValue = jCurrentTimeMillis - ((Long) zzfxVar.zzb(null)).longValue();
        long j2 = zzohVar.zzb;
        if (j2 < jLongValue || j2 > ((Long) zzfxVar.zzb(null)).longValue() + jCurrentTimeMillis) {
            zzicVar.zzaW().zze().zzd("Storing trigger URI outside of the max retention time span. appId, now, timestamp", zzgu.zzl(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j2));
        }
        zzicVar.zzaW().zzk().zza("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.zza);
        contentValues.put("source", Integer.valueOf(zzohVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (zze().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzicVar.zzaW().zzb().zzb("Failed to insert trigger URI (got -1). appId", zzgu.zzl(str));
            return false;
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing trigger URI. appId", zzgu.zzl(str), e);
            return false;
        }
    }

    public final void zzaa(String str, zzjl zzjlVar) {
        Preconditions.m3544h(str);
        Preconditions.m3544h(zzjlVar);
        zzg();
        zzay();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzjlVar.zzl());
        contentValues.put("consent_source", Integer.valueOf(zzjlVar.zzb()));
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzba zzab(String str) {
        Preconditions.m3544h(str);
        zzg();
        zzay();
        return zzba.zzg(zzaC("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final List zzac(String str) {
        List list;
        String string;
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            sQLiteDatabaseZze.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseZze.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                Preconditions.m3544h(string);
                            }
                            if (string2 == null) {
                                this.zzu.zzaW().zzb().zzb("Read null value from diagnostic signals table, ignoring it. appId", zzgu.zzl(str));
                            } else {
                                long j2 = cursorQuery.getLong(2);
                                com.google.android.gms.internal.measurement.zzfa zzfaVarM9875A = com.google.android.gms.internal.measurement.zzfb.m9875A();
                                zzfaVarM9875A.m9552o();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarM9875A.f22030t).m9876B(string2);
                                zzfaVarM9875A.m9552o();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarM9875A.f22030t).m9879E(j2);
                                zzfaVarM9875A.m9552o();
                                ((com.google.android.gms.internal.measurement.zzfb) zzfaVarM9875A.f22030t).m9878D(string);
                                if (zIsEmpty) {
                                    zzfaVarM9875A.m9552o();
                                    ((com.google.android.gms.internal.measurement.zzfb) zzfaVarM9875A.f22030t).m9877C();
                                }
                                arrayList.add((com.google.android.gms.internal.measurement.zzfb) zzfaVarM9875A.m9555r());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseZze.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseZze.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseZze.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    this.zzu.zzaW().zzb().zzc("Error querying or deleting diagnostic signals. appId", zzgu.zzl(str), e);
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseZze.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseZze.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            this.zzu.zzaW().zzb().zzc("Error opening database for diagnostic signals. appId", zzgu.zzl(str), e2);
            return Collections.EMPTY_LIST;
        }
    }

    public final void zzad(String str, zzba zzbaVar) throws Throwable {
        Preconditions.m3544h(str);
        Preconditions.m3544h(zzbaVar);
        zzg();
        zzay();
        zzjl zzjlVarZzY = zzY(str);
        zzjl zzjlVar = zzjl.zza;
        if (zzjlVarZzY == zzjlVar) {
            zzaa(str, zzjlVar);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", zzbaVar.zze());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final void zzae(String str, zzjl zzjlVar) {
        Preconditions.m3544h(str);
        Preconditions.m3544h(zzjlVar);
        zzg();
        zzay();
        zzaa(str, zzY(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", zzjlVar.zzl());
        zzaD("consent_settings", "app_id", contentValues);
    }

    public final zzjl zzaf(String str) {
        Preconditions.m3544h(str);
        zzg();
        zzay();
        return zzjl.zzf(zzaC("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    @WorkerThread
    public final void zzag(String str, List list) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        Preconditions.m3544h(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) ((com.google.android.gms.internal.measurement.zzfd) list.get(i2)).m9572r();
            if (((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9886G() != 0) {
                for (int i3 = 0; i3 < ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9886G(); i3++) {
                    com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9887H(i3).m9572r();
                    com.google.android.gms.internal.measurement.zzfe zzfeVar2 = (com.google.android.gms.internal.measurement.zzfe) zzfeVar.clone();
                    String strZzb = zzjm.zzb(((com.google.android.gms.internal.measurement.zzff) zzfeVar.f22030t).m9893C());
                    if (strZzb != null) {
                        zzfeVar2.m9552o();
                        ((com.google.android.gms.internal.measurement.zzff) zzfeVar2.f22030t).m9903N(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < ((com.google.android.gms.internal.measurement.zzff) zzfeVar.f22030t).m9895E()) {
                        com.google.android.gms.internal.measurement.zzfh zzfhVarM9896F = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.f22030t).m9896F(i4);
                        com.google.android.gms.internal.measurement.zzfe zzfeVar3 = zzfeVar;
                        boolean z2 = z;
                        String strZzc = zzlt.zzc(zzfhVarM9896F.m9913H(), zzjn.zza, zzjn.zzb);
                        if (strZzc != null) {
                            com.google.android.gms.internal.measurement.zzfg zzfgVar = (com.google.android.gms.internal.measurement.zzfg) zzfhVarM9896F.m9572r();
                            zzfgVar.m9552o();
                            ((com.google.android.gms.internal.measurement.zzfh) zzfgVar.f22030t).m9914J(strZzc);
                            com.google.android.gms.internal.measurement.zzfh zzfhVar = (com.google.android.gms.internal.measurement.zzfh) zzfgVar.m9555r();
                            zzfeVar2.m9552o();
                            ((com.google.android.gms.internal.measurement.zzff) zzfeVar2.f22030t).m9904O(i4, zzfhVar);
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        zzfeVar = zzfeVar3;
                    }
                    if (z) {
                        zzfcVar.m9552o();
                        ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9889J(i3, (com.google.android.gms.internal.measurement.zzff) zzfeVar2.m9555r());
                        list.set(i2, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.m9555r());
                    }
                }
            }
            if (((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9883D() != 0) {
                for (int i5 = 0; i5 < ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9883D(); i5++) {
                    com.google.android.gms.internal.measurement.zzfn zzfnVarM9884E = ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9884E(i5);
                    String strZzc2 = zzlt.zzc(zzfnVarM9884E.m9929C(), zzjo.zza, zzjo.zzb);
                    if (strZzc2 != null) {
                        com.google.android.gms.internal.measurement.zzfm zzfmVar = (com.google.android.gms.internal.measurement.zzfm) zzfnVarM9884E.m9572r();
                        zzfmVar.m9552o();
                        ((com.google.android.gms.internal.measurement.zzfn) zzfmVar.f22030t).m9935J(strZzc2);
                        zzfcVar.m9552o();
                        ((com.google.android.gms.internal.measurement.zzfd) zzfcVar.f22030t).m9888I(i5, (com.google.android.gms.internal.measurement.zzfn) zzfmVar.m9555r());
                        list.set(i2, (com.google.android.gms.internal.measurement.zzfd) zzfcVar.m9555r());
                    }
                }
            }
        }
        zzay();
        zzg();
        Preconditions.m3541e(str);
        SQLiteDatabase sQLiteDatabaseZze = zze();
        sQLiteDatabaseZze.beginTransaction();
        try {
            zzay();
            zzg();
            Preconditions.m3541e(str);
            SQLiteDatabase sQLiteDatabaseZze2 = zze();
            sQLiteDatabaseZze2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZze2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) it.next();
                zzay();
                zzg();
                Preconditions.m3541e(str);
                Preconditions.m3544h(zzfdVar);
                if (zzfdVar.m9880A()) {
                    int iM9881B = zzfdVar.m9881B();
                    Iterator<E> it2 = zzfdVar.m9885F().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff) it2.next()).m9891A()) {
                                this.zzu.zzaW().zze().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(iM9881B));
                                break;
                            }
                        } else {
                            Iterator it3 = zzfdVar.m9882C().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    Iterator<E> it4 = zzfdVar.m9885F().iterator();
                                    while (true) {
                                        com.google.android.gms.internal.measurement.zzfd zzfdVar2 = zzfdVar;
                                        String str2 = "app_id";
                                        try {
                                            if (!it4.hasNext()) {
                                                sQLiteDatabase = sQLiteDatabaseZze;
                                                Iterator it5 = zzfdVar2.m9882C().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        com.google.android.gms.internal.measurement.zzfn zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it5.next();
                                                        zzay();
                                                        zzg();
                                                        Preconditions.m3541e(str);
                                                        Preconditions.m3544h(zzfnVar);
                                                        if (zzfnVar.m9929C().isEmpty()) {
                                                            this.zzu.zzaW().zze().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iM9881B), String.valueOf(zzfnVar.m9927A() ? Integer.valueOf(zzfnVar.m9928B()) : null));
                                                        } else {
                                                            byte[] bArrM9346i = zzfnVar.m9346i();
                                                            ContentValues contentValues = new ContentValues();
                                                            contentValues.put(str2, str);
                                                            String str3 = str2;
                                                            contentValues.put("audience_id", Integer.valueOf(iM9881B));
                                                            contentValues.put("filter_id", zzfnVar.m9927A() ? Integer.valueOf(zzfnVar.m9928B()) : null);
                                                            Iterator it6 = it5;
                                                            contentValues.put("property_name", zzfnVar.m9929C());
                                                            contentValues.put("session_scoped", zzfnVar.m9933G() ? Boolean.valueOf(zzfnVar.m9934H()) : null);
                                                            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrM9346i);
                                                            try {
                                                                if (zze().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                    this.zzu.zzaW().zzb().zzb("Failed to insert property filter (got -1). appId", zzgu.zzl(str));
                                                                } else {
                                                                    str2 = str3;
                                                                    it5 = it6;
                                                                }
                                                            } catch (SQLiteException e) {
                                                                this.zzu.zzaW().zzb().zzc("Error storing property filter. appId", zzgu.zzl(str), e);
                                                            }
                                                        }
                                                    }
                                                    sQLiteDatabaseZze = sQLiteDatabase;
                                                    break;
                                                }
                                            }
                                            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) it4.next();
                                            zzay();
                                            zzg();
                                            Preconditions.m3541e(str);
                                            Preconditions.m3544h(zzffVar);
                                            if (!zzffVar.m9893C().isEmpty()) {
                                                byte[] bArrM9346i2 = zzffVar.m9346i();
                                                sQLiteDatabase = sQLiteDatabaseZze;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(iM9881B));
                                                contentValues2.put("filter_id", zzffVar.m9891A() ? Integer.valueOf(zzffVar.m9892B()) : null);
                                                contentValues2.put("event_name", zzffVar.m9893C());
                                                contentValues2.put("session_scoped", zzffVar.m9901K() ? Boolean.valueOf(zzffVar.m9902L()) : null);
                                                contentValues2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrM9346i2);
                                                try {
                                                    if (zze().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        this.zzu.zzaW().zzb().zzb("Failed to insert event filter (got -1). appId", zzgu.zzl(str));
                                                    }
                                                    zzfdVar = zzfdVar2;
                                                    sQLiteDatabaseZze = sQLiteDatabase;
                                                } catch (SQLiteException e2) {
                                                    this.zzu.zzaW().zzb().zzc("Error storing event filter. appId", zzgu.zzl(str), e2);
                                                    zzay();
                                                    zzg();
                                                    Preconditions.m3541e(str);
                                                    SQLiteDatabase sQLiteDatabaseZze3 = zze();
                                                    sQLiteDatabaseZze3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM9881B)});
                                                    sQLiteDatabaseZze3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM9881B)});
                                                    sQLiteDatabaseZze = sQLiteDatabase;
                                                    break;
                                                }
                                            } else {
                                                this.zzu.zzaW().zze().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzgu.zzl(str), Integer.valueOf(iM9881B), String.valueOf(zzffVar.m9891A() ? Integer.valueOf(zzffVar.m9892B()) : null));
                                                sQLiteDatabase = sQLiteDatabaseZze;
                                            }
                                            zzay();
                                            zzg();
                                            Preconditions.m3541e(str);
                                            SQLiteDatabase sQLiteDatabaseZze4 = zze();
                                            sQLiteDatabaseZze4.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM9881B)});
                                            sQLiteDatabaseZze4.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM9881B)});
                                            sQLiteDatabaseZze = sQLiteDatabase;
                                            break;
                                            break;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                    }
                                }
                                if (!((com.google.android.gms.internal.measurement.zzfn) it3.next()).m9927A()) {
                                    this.zzu.zzaW().zze().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzgu.zzl(str), Integer.valueOf(iM9881B));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzu.zzaW().zze().zzb("Audience with no ID. appId", zzgu.zzl(str));
                }
            }
            sQLiteDatabase = sQLiteDatabaseZze;
            ArrayList arrayList = new ArrayList();
            Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.zzfd zzfdVar3 = (com.google.android.gms.internal.measurement.zzfd) it7.next();
                arrayList.add(zzfdVar3.m9880A() ? Integer.valueOf(zzfdVar3.m9881B()) : null);
            }
            Preconditions.m3541e(str);
            zzay();
            zzg();
            SQLiteDatabase sQLiteDatabaseZze5 = zze();
            try {
                long jZzaA = zzaA("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int i6 = 0;
                int iMax = Math.max(0, Math.min(AdError.SERVER_ERROR_CODE, this.zzu.zzc().zzm(str, zzfy.zzU)));
                if (jZzaA > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZze5.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                this.zzu.zzaW().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseZze;
        }
    }

    @WorkerThread
    public final zzbd zzah(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar, String str2) throws Throwable {
        zzbd zzbdVarZzaE = zzaE("events", str, zzhsVar.m10127F());
        if (zzbdVarZzaE == null) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zze().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzgu.zzl(str), zzicVar.zzl().zza(str2));
            return new zzbd(str, zzhsVar.m10127F(), 1L, 1L, 1L, zzhsVar.m10129H(), 0L, null, null, null, null);
        }
        long j2 = zzbdVarZzaE.zze + 1;
        long j3 = zzbdVarZzaE.zzd + 1;
        return new zzbd(zzbdVarZzaE.zza, zzbdVarZzaE.zzb, zzbdVarZzaE.zzc + 1, j3, j2, zzbdVarZzaE.zzf, zzbdVarZzaE.zzg, zzbdVarZzaE.zzh, zzbdVarZzaE.zzi, zzbdVarZzaE.zzj, zzbdVarZzaE.zzk);
    }

    @VisibleForTesting
    public final boolean zzai() {
        zzic zzicVar = this.zzu;
        Context contextZzaZ = zzicVar.zzaZ();
        zzicVar.zzc();
        return contextZzaZ.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long zzaj(String str, String[] strArr, long j2) {
        return zzaB("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    public final /* synthetic */ zzog zzau() {
        return this.zzn;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ee A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TRY_LEAVE, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011d A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0145  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x014b A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190 A[Catch: all -> 0x0078, SQLiteException -> 0x007b, LOOP:0: B:66:0x0190->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e9 A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01f0 A[Catch: all -> 0x0078, SQLiteException -> 0x007b, TryCatch #4 {all -> 0x0078, blocks: (B:3:0x0016, B:8:0x002a, B:14:0x0048, B:15:0x0064, B:18:0x006c, B:19:0x0070, B:40:0x00c8, B:42:0x00ee, B:43:0x0103, B:44:0x0107, B:45:0x0117, B:47:0x011d, B:48:0x0130, B:60:0x015e, B:63:0x0166, B:64:0x0171, B:66:0x0190, B:67:0x019e, B:68:0x01a8, B:73:0x01e9, B:72:0x01d6, B:76:0x01f0, B:53:0x014b, B:78:0x0205, B:82:0x021b, B:11:0x003c, B:29:0x0087, B:31:0x008d, B:35:0x009c, B:38:0x00c0, B:32:0x0092), top: B:89:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void zzav(String str, long j2, long j3, zzpc zzpcVar) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jZzaB;
        long j4;
        String str3;
        String[] strArr2;
        long j5;
        com.google.android.gms.internal.measurement.zzhr zzhrVar;
        Preconditions.m3544h(zzpcVar);
        zzg();
        zzay();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j3 != -1 ? new String[]{String.valueOf(j3), String.valueOf(j2)} : new String[]{String.valueOf(j2)};
                    str4 = j3 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.m10218f0(), cursorRawQuery.getBlob(0))).m9555r();
                                        if (cursorRawQuery.moveToNext()) {
                                            this.zzu.zzaW().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(r3));
                                        }
                                        cursorRawQuery.close();
                                        zzpcVar.zza = zzidVar;
                                        jZzaB = zzaB("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j3 == -1) {
                                            if (jZzaB != -1) {
                                                j4 = -1;
                                            } else {
                                                strArr2 = new String[]{r3, string2};
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                            }
                                            cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j5 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j6 = cursorRawQuery.getLong(4);
                                                    try {
                                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), blob);
                                                        zzhrVar.m10108C(cursorRawQuery.getString(1));
                                                        long j7 = cursorRawQuery.getLong(2);
                                                        zzhrVar.m9552o();
                                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10144X(j7);
                                                        zzhrVar.m9552o();
                                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10122A(j6);
                                                        if (!zzpcVar.zza(j5, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event. appId", zzgu.zzl(r3), e);
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(r3));
                                            }
                                        } else {
                                            j4 = j3;
                                        }
                                        if (j4 == -1 && jZzaB != -1) {
                                            jZzaB = Math.min(j4, jZzaB);
                                        } else if (j4 != -1) {
                                            jZzaB = j4;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jZzaB)};
                                        cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j5 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j8 = cursorRawQuery.getLong(4);
                                                zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), blob2);
                                                zzhrVar.m10108C(cursorRawQuery.getString(1));
                                                long j9 = cursorRawQuery.getLong(2);
                                                zzhrVar.m9552o();
                                                ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10144X(j9);
                                                zzhrVar.m9552o();
                                                ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10122A(j8);
                                                if (!zzpcVar.zza(j5, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(r3));
                                        }
                                    } catch (IOException e2) {
                                        this.zzu.zzaW().zzb().zzc("Data loss. Failed to merge raw event metadata. appId", zzgu.zzl(r3), e2);
                                    }
                                } else {
                                    this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(r3));
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                this.zzu.zzaW().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(string), e);
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j3 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j3)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j3 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseZze.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseZze.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                this.zzu.zzaW().zzb().zzb("Raw event metadata record is missing. appId", zzgu.zzl(r3));
                            } else {
                                com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.m10218f0(), cursorRawQuery.getBlob(0))).m9555r();
                                if (cursorRawQuery.moveToNext()) {
                                    this.zzu.zzaW().zze().zzb("Get multiple raw event metadata records, expected one. appId", zzgu.zzl(r3));
                                }
                                cursorRawQuery.close();
                                zzpcVar.zza = zzidVar2;
                                jZzaB = zzaB("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j3 == -1) {
                                    if (jZzaB != -1) {
                                        j4 = -1;
                                    } else {
                                        strArr2 = new String[]{r3, string2};
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                    }
                                    cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j5 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j10 = cursorRawQuery.getLong(4);
                                            zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), blob3);
                                            zzhrVar.m10108C(cursorRawQuery.getString(1));
                                            long j11 = cursorRawQuery.getLong(2);
                                            zzhrVar.m9552o();
                                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10144X(j11);
                                            zzhrVar.m9552o();
                                            ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10122A(j10);
                                            if (!zzpcVar.zza(j5, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(r3));
                                    }
                                } else {
                                    j4 = j3;
                                }
                                if (j4 == -1) {
                                    if (j4 != -1) {
                                        jZzaB = j4;
                                    }
                                } else if (j4 != -1) {
                                    jZzaB = j4;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jZzaB)};
                                cursorRawQuery = sQLiteDatabaseZze.query("raw_events", new String[]{"rowid", AppMeasurementSdk.ConditionalUserProperty.NAME, "timestamp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j5 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j12 = cursorRawQuery.getLong(4);
                                        zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.m10121Q(), blob4);
                                        zzhrVar.m10108C(cursorRawQuery.getString(1));
                                        long j13 = cursorRawQuery.getLong(2);
                                        zzhrVar.m9552o();
                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10144X(j13);
                                        zzhrVar.m9552o();
                                        ((com.google.android.gms.internal.measurement.zzhs) zzhrVar.f22030t).m10122A(j12);
                                        if (!zzpcVar.zza(j5, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.m9555r())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    this.zzu.zzaW().zze().zzb("Raw event data disappeared while in transaction. appId", zzgu.zzl(r3));
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        this.zzu.zzaW().zzb().zzc("Data loss. Error selecting raw event. appId", zzgu.zzl(string), e);
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    @WorkerThread
    public final void zzb() {
        zzay();
        zze().beginTransaction();
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        zzic zzicVar = this.zzu;
        if (!zzicVar.zzc().zzp(null, zzfy.zzbe)) {
            return false;
        }
        zzicVar.zzaX().zzj(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzaw zzawVar = this.zza;
                try {
                    SQLiteDatabase sQLiteDatabaseZze = zzawVar.zze();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseZze.update("raw_events", contentValues, null, null);
                } catch (SQLiteException e) {
                    zzawVar.zzu.zzaW().zzb().zzb("Failed to remove elapsed times from raw events table", e);
                }
            }
        });
        return false;
    }

    @WorkerThread
    public final void zzc() {
        zzay();
        zze().setTransactionSuccessful();
    }

    @WorkerThread
    public final void zzd() {
        zzay();
        zze().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zze() {
        zzg();
        try {
            return this.zzm.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzu.zzaW().zze().zzb("Error opening database", e);
            throw e;
        }
    }

    @WorkerThread
    public final zzbd zzf(String str, String str2) {
        return zzaE("events", str, str2);
    }

    @WorkerThread
    public final void zzh(zzbd zzbdVar) {
        zzaF("events", zzbdVar);
    }

    public final void zzi(String str) {
        zzbd zzbdVarZzaE;
        zzaG("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = zze().query("events", (String[]) Collections.singletonList(AppMeasurementSdk.ConditionalUserProperty.NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zzbdVarZzaE = zzaE("events", str, string)) != null) {
                            zzaF("events_snapshot", zzbdVarZzaE);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Error creating snapshot. appId", zzgu.zzl(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    public final void zzj(String str) throws Throwable {
        boolean z;
        zzbd zzbdVarZzaE;
        ArrayList arrayList = new ArrayList(Arrays.asList(AppMeasurementSdk.ConditionalUserProperty.NAME, "lifetime_count"));
        zzbd zzbdVarZzaE2 = zzaE("events", str, "_f");
        zzbd zzbdVarZzaE3 = zzaE("events", str, "_v");
        zzaG("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = zze().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (zzbdVarZzaE = zzaE("events_snapshot", str, string)) != null) {
                            zzaF("events", zzbdVarZzaE);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            this.zzu.zzaW().zzb().zzc("Error querying snapshot. appId", zzgu.zzl(str), e);
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && zzbdVarZzaE2 != null) {
                                zzaF("events", zzbdVarZzaE2);
                            } else if (!z && zzbdVarZzaE3 != null) {
                                zzaF("events", zzbdVarZzaE3);
                            }
                            zzaG("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                zzaF("events", zzbdVarZzaE3);
                            }
                        } else if (!z) {
                            zzaF("events", zzbdVarZzaE3);
                        }
                        zzaG("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && zzbdVarZzaE2 != null) {
                    zzaF("events", zzbdVarZzaE2);
                } else if (!z && zzbdVarZzaE3 != null) {
                    zzaF("events", zzbdVarZzaE3);
                }
            } else {
                cursorQuery.close();
                if (zzbdVarZzaE2 != null) {
                    zzaF("events", zzbdVarZzaE2);
                } else if (zzbdVarZzaE3 != null) {
                    zzaF("events", zzbdVarZzaE3);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        zzaG("events_snapshot", str);
    }

    @WorkerThread
    public final void zzk(String str, String str2) {
        Preconditions.m3541e(str);
        Preconditions.m3541e(str2);
        zzg();
        zzay();
        try {
            zze().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzd("Error deleting user property. appId", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e);
        }
    }

    @WorkerThread
    public final boolean zzl(zzpn zzpnVar) {
        Preconditions.m3544h(zzpnVar);
        zzg();
        zzay();
        String str = zzpnVar.zza;
        String str2 = zzpnVar.zzc;
        if (zzm(str, str2) == null) {
            if (zzpp.zzh(str2)) {
                if (zzaA("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.zzu.zzc().zzn(str, zzfy.zzV, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jZzaA = zzaA("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, zzpnVar.zzb});
                this.zzu.zzc();
                if (jZzaA >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzpnVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(zzpnVar.zzd));
        zzaw(contentValues, "value", zzpnVar.zze);
        try {
            if (zze().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzu.zzaW().zzb().zzb("Failed to insert/update user property (got -1). appId", zzgu.zzl(str));
            return true;
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing user property. appId", zzgu.zzl(zzpnVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    @WorkerThread
    public final zzpn zzm(String str, String str2) throws Throwable {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.m3541e(str);
        Preconditions.m3541e(str2);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j2 = cursorQuery.getLong(0);
                        Object objZzL = zzL(cursorQuery, 1);
                        if (objZzL != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                zzpn zzpnVar = new zzpn(str3, cursorQuery.getString(2), str4, j2, objZzL);
                                if (cursorQuery.moveToNext()) {
                                    this.zzu.zzaW().zzb().zzb("Got multiple records for user property, expected one. appId", zzgu.zzl(str3));
                                }
                                cursorQuery.close();
                                return zzpnVar;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        zzic zzicVar = this.zzu;
                        zzicVar.zzaW().zzb().zzd("Error querying user property. appId", zzgu.zzl(str3), zzicVar.zzl().zzc(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    @WorkerThread
    public final List zzn(String str) {
        String str2;
        Preconditions.m3541e(str);
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = zze().query("user_attributes", new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j2 = cursorQuery.getLong(2);
                            Object objZzL = zzL(cursorQuery, 3);
                            if (objZzL == null) {
                                zzicVar.zzaW().zzb().zzb("Read invalid user property value, ignoring it. appId", zzgu.zzl(str));
                                str2 = str;
                            } else {
                                str2 = str;
                                arrayList.add(new zzpn(str2, str3, string, j2, objZzL));
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                str = str2;
                            } catch (SQLiteException e) {
                                e = e;
                                this.zzu.zzaW().zzb().zzc("Error querying user properties. appId", zzgu.zzl(str2), e);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } catch (SQLiteException e3) {
                e = e3;
                str2 = str;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    @WorkerThread
    public final List zzo(String str, String str2, String str3) throws Throwable {
        String str4;
        Cursor cursor;
        Cursor cursorQuery;
        String str5;
        Preconditions.m3541e(str);
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str6 = str;
                arrayList2.add(str6);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    str4 = str2;
                } else {
                    str4 = str2;
                    try {
                        arrayList2.add(str4);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e) {
                        e = e;
                        cursor = null;
                        try {
                            this.zzu.zzaW().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                            arrayList = Collections.EMPTY_LIST;
                            cursorQuery = cursor;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                    sb2.append(str3);
                    sb2.append(ProxyConfig.MATCH_ALL_SCHEMES);
                    arrayList2.add(sb2.toString());
                    sb.append(" and name glob ?");
                }
                String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String[] strArr2 = {AppMeasurementSdk.ConditionalUserProperty.NAME, "set_timestamp", "value", "origin"};
                String string = sb.toString();
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = sQLiteDatabaseZze.query("user_attributes", strArr2, string, strArr, null, null, "rowid", "1001");
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            while (true) {
                                int size = arrayList.size();
                                zzicVar.zzc();
                                if (size >= 1000) {
                                    zzgs zzgsVarZzb = zzicVar.zzaW().zzb();
                                    zzicVar.zzc();
                                    zzgsVarZzb.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j2 = cursorQuery.getLong(1);
                                Object objZzL = zzL(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objZzL == null) {
                                    try {
                                        zzicVar.zzaW().zzb().zzd("(2)Read invalid user property value, ignoring it", zzgu.zzl(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        this.zzu.zzaW().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursorQuery = cursor;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new zzpn(str6, str5, string2, j2, objZzL));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    this.zzu.zzaW().zzb().zzd("(2)Error querying user properties", zzgu.zzl(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursor = cursorQuery;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    @WorkerThread
    public final boolean zzp(zzah zzahVar) {
        Preconditions.m3544h(zzahVar);
        zzg();
        zzay();
        String str = zzahVar.zza;
        Preconditions.m3544h(str);
        if (zzm(str, zzahVar.zzc.zzb) == null) {
            long jZzaA = zzaA("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzu.zzc();
            if (jZzaA >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.zzb);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.NAME, zzahVar.zzc.zzb);
        Object objZza = zzahVar.zzc.zza();
        Preconditions.m3544h(objZza);
        zzaw(contentValues, "value", objZza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzahVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzahVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzahVar.zzh));
        zzic zzicVar = this.zzu;
        contentValues.put("timed_out_event", zzicVar.zzk().zzah(zzahVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzahVar.zzd));
        contentValues.put("triggered_event", zzicVar.zzk().zzah(zzahVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzahVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzahVar.zzj));
        contentValues.put("expired_event", zzicVar.zzk().zzah(zzahVar.zzk));
        try {
            if (zze().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzicVar.zzaW().zzb().zzb("Failed to insert/update conditional user property (got -1)", zzgu.zzl(str));
            return true;
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing conditional user property", zzgu.zzl(str), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0121  */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f6: MOVE (r8 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    @WorkerThread
    public final zzah zzq(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.m3541e(str);
        Preconditions.m3541e(str2);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("conditional_properties", new String[]{"origin", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objZzL = zzL(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j2 = cursorQuery.getLong(4);
                    zzpg zzpgVar = this.zzg;
                    zzpk zzpkVarZzp = zzpgVar.zzp();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                    zzbh zzbhVar = (zzbh) zzpkVarZzp.zzl(blob, creator);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(str3, cursorQuery.getLong(8), objZzL, str4), cursorQuery.getLong(6), z, string2, zzbhVar, j2, (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzic zzicVar = this.zzu;
                            zzicVar.zzaW().zzb().zzc("Got multiple records for conditional property, expected one", zzgu.zzl(str), zzicVar.zzl().zzc(str3));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        zzic zzicVar2 = this.zzu;
        zzicVar2.zzaW().zzb().zzd("Error querying conditional property", zzgu.zzl(str), zzicVar2.zzl().zzc(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    public final int zzr(String str, String str2) {
        Preconditions.m3541e(str);
        Preconditions.m3541e(str2);
        zzg();
        zzay();
        try {
            return zze().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzic zzicVar = this.zzu;
            zzicVar.zzaW().zzb().zzd("Error deleting conditional property", zzgu.zzl(str), zzicVar.zzl().zzc(str2), e);
            return 0;
        }
    }

    @WorkerThread
    public final List zzs(String str, String str2, String str3) {
        Preconditions.m3541e(str);
        zzg();
        zzay();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public final List zzt(String str, String[] strArr) {
        zzg();
        zzay();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                String[] strArr2 = {"app_id", "origin", AppMeasurementSdk.ConditionalUserProperty.NAME, "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                zzic zzicVar = this.zzu;
                zzicVar.zzc();
                cursorQuery = sQLiteDatabaseZze.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        int size = arrayList.size();
                        zzicVar.zzc();
                        if (size >= 1000) {
                            zzgs zzgsVarZzb = zzicVar.zzaW().zzb();
                            zzicVar.zzc();
                            zzgsVarZzb.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objZzL = zzL(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j2 = cursorQuery.getLong(6);
                        zzpg zzpgVar = this.zzg;
                        zzpk zzpkVarZzp = zzpgVar.zzp();
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) zzpkVarZzp.zzl(blob, creator);
                        arrayList.add(new zzah(string, string2, new zzpl(string3, cursorQuery.getLong(10), objZzL, string2), cursorQuery.getLong(8), z, string4, zzbhVar, j2, (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbh) zzpgVar.zzp().zzl(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzb("Error querying conditional user property value", e);
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0320  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02ff: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:768), block:B:88:0x02ff */
    @WorkerThread
    public final zzh zzu(String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Boolean boolValueOf;
        String string;
        Preconditions.m3541e(str);
        zzg();
        zzay();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zze().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        zzpg zzpgVar = this.zzg;
                        zzh zzhVar = new zzh(zzpgVar.zzah(), str);
                        zzjl zzjlVarZzB = zzpgVar.zzB(str);
                        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                        if (zzjlVarZzB.zzo(zzjkVar)) {
                            zzhVar.zze(cursorQuery.getString(0));
                        }
                        zzhVar.zzg(cursorQuery.getString(1));
                        if (zzpgVar.zzB(str).zzo(zzjk.AD_STORAGE)) {
                            zzhVar.zzk(cursorQuery.getString(2));
                        }
                        zzhVar.zzF(cursorQuery.getLong(3));
                        zzhVar.zzo(cursorQuery.getLong(4));
                        zzhVar.zzq(cursorQuery.getLong(5));
                        zzhVar.zzs(cursorQuery.getString(6));
                        zzhVar.zzw(cursorQuery.getString(7));
                        zzhVar.zzy(cursorQuery.getLong(8));
                        zzhVar.zzA(cursorQuery.getLong(9));
                        zzhVar.zzE(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        zzhVar.zzO(cursorQuery.getLong(11));
                        zzhVar.zzQ(cursorQuery.getLong(12));
                        zzhVar.zzS(cursorQuery.getLong(13));
                        zzhVar.zzU(cursorQuery.getLong(14));
                        zzhVar.zzI(cursorQuery.getLong(15));
                        zzhVar.zzK(cursorQuery.getLong(16));
                        zzhVar.zzu(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        zzhVar.zzm(cursorQuery.getString(18));
                        zzhVar.zzY(cursorQuery.getLong(19));
                        zzhVar.zzW(cursorQuery.getLong(20));
                        zzhVar.zzab(cursorQuery.getString(21));
                        zzhVar.zzad(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                        zzhVar.zzC(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            zzhVar.zzah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (zzpgVar.zzB(str).zzo(zzjkVar)) {
                            zzhVar.zzi(cursorQuery.getString(28));
                        }
                        zzhVar.zzaj((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                        zzhVar.zzaE(cursorQuery.getLong(39));
                        zzhVar.zzaz(cursorQuery.getString(36));
                        zzhVar.zzal(cursorQuery.getLong(30));
                        zzhVar.zzan(cursorQuery.getLong(31));
                        zzaif.m9798a();
                        zzic zzicVar = this.zzu;
                        if (zzicVar.zzc().zzp(str, zzfy.zzaO)) {
                            zzhVar.zzap(cursorQuery.getInt(32));
                            zzhVar.zzax(cursorQuery.getLong(35));
                        }
                        zzhVar.zzar((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        zzhVar.zzaf(boolValueOf);
                        zzhVar.zzaB(cursorQuery.getInt(37));
                        zzhVar.zzaD(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            Preconditions.m3544h(string);
                        }
                        zzhVar.zzaG(string);
                        if (!cursorQuery.isNull(41)) {
                            zzhVar.zzat(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zzhVar.zzav(Long.valueOf(cursorQuery.getLong(42)));
                        }
                        zzhVar.zzaI(cursorQuery.getBlob(43));
                        if (!cursorQuery.isNull(44)) {
                            zzhVar.zzaK(cursorQuery.getInt(44));
                        }
                        if (zzicVar.zzc().zzp(str, zzfy.zzbj) && !cursorQuery.isNull(45)) {
                            zzhVar.zzaM(cursorQuery.getLong(45));
                        }
                        zzhVar.zzb();
                        if (cursorQuery.moveToNext()) {
                            zzicVar.zzaW().zzb().zzb("Got multiple records for app, expected one. appId", zzgu.zzl(str));
                        }
                        cursorQuery.close();
                        return zzhVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    this.zzu.zzaW().zzb().zzc("Error querying app. appId", zzgu.zzl(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    public final void zzv(zzh zzhVar, boolean z, boolean z2) {
        Preconditions.m3544h(zzhVar);
        zzg();
        zzay();
        String strZzc = zzhVar.zzc();
        Preconditions.m3544h(strZzc);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzc);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.zzg.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zzhVar.zzd());
        }
        contentValues.put("gmp_app_id", zzhVar.zzf());
        zzpg zzpgVar = this.zzg;
        if (zzpgVar.zzB(strZzc).zzo(zzjk.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zzhVar.zzj());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzG()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("app_version", zzhVar.zzr());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzx()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzz()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzD()));
        contentValues.put("day", Long.valueOf(zzhVar.zzN()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzP()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzR()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzT()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzH()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzJ()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzt()));
        contentValues.put("firebase_instance_id", zzhVar.zzl());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zzX()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzV()));
        contentValues.put("health_monitor_sample", zzhVar.zzZ());
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzac()));
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzB()));
        if (zzpgVar.zzB(strZzc).zzo(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zzhVar.zzh());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzak()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzam()));
        zzaif.m9798a();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzaO)) {
            contentValues.put("ad_services_version", Integer.valueOf(zzhVar.zzao()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zzhVar.zzaw()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zzhVar.zzaq()));
        contentValues.put("npa_metadata_value", zzhVar.zzae());
        contentValues.put("bundle_delivery_index", Long.valueOf(zzhVar.zzaF()));
        contentValues.put("sgtm_preview_key", zzhVar.zzay());
        contentValues.put("dma_consent_state", Integer.valueOf(zzhVar.zzaA()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zzhVar.zzaC()));
        contentValues.put("serialized_npa_metadata", zzhVar.zzaH());
        contentValues.put("client_upload_eligibility", Integer.valueOf(zzhVar.zzaL()));
        List listZzag = zzhVar.zzag();
        if (listZzag != null) {
            if (listZzag.isEmpty()) {
                zzicVar.zzaW().zze().zzb("Safelisted events should not be an empty list. appId", strZzc);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzag));
            }
        }
        if (zzicVar.zzc().zzp(null, zzfy.zzaK) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", zzhVar.zzas());
        contentValues.put("unmatched_uwa", zzhVar.zzau());
        contentValues.put("ad_campaign_info", zzhVar.zzaJ());
        if (zzicVar.zzc().zzp(strZzc, zzfy.zzbj)) {
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(zzhVar.zzaN()));
        }
        try {
            SQLiteDatabase sQLiteDatabaseZze = zze();
            if (sQLiteDatabaseZze.update("apps", contentValues, "app_id = ?", new String[]{strZzc}) == 0 && sQLiteDatabaseZze.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzicVar.zzaW().zzb().zzb("Failed to insert/update app (got -1). appId", zzgu.zzl(strZzc));
            }
        } catch (SQLiteException e) {
            this.zzu.zzaW().zzb().zzc("Error storing app. appId", zzgu.zzl(strZzc), e);
        }
    }

    @WorkerThread
    public final zzar zzw(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return zzx(j2, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    @WorkerThread
    public final zzar zzx(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.m3541e(str);
        zzg();
        zzay();
        String[] strArr = {str};
        zzar zzarVar = new zzar();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZze = zze();
                cursorQuery = sQLiteDatabaseZze.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j2) {
                        zzarVar.zzb = cursorQuery.getLong(1);
                        zzarVar.zza = cursorQuery.getLong(2);
                        zzarVar.zzc = cursorQuery.getLong(3);
                        zzarVar.zzd = cursorQuery.getLong(4);
                        zzarVar.zze = cursorQuery.getLong(5);
                        zzarVar.zzf = cursorQuery.getLong(6);
                        zzarVar.zzg = cursorQuery.getLong(7);
                    }
                    if (z) {
                        zzarVar.zzb += j3;
                    }
                    if (z2) {
                        zzarVar.zza += j3;
                    }
                    if (z3) {
                        zzarVar.zzc += j3;
                    }
                    if (z4) {
                        zzarVar.zzd += j3;
                    }
                    if (z5) {
                        zzarVar.zze += j3;
                    }
                    if (z6) {
                        zzarVar.zzf += j3;
                    }
                    if (z7) {
                        zzarVar.zzg += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(zzarVar.zza));
                    contentValues.put("daily_events_count", Long.valueOf(zzarVar.zzb));
                    contentValues.put("daily_conversions_count", Long.valueOf(zzarVar.zzc));
                    contentValues.put("daily_error_events_count", Long.valueOf(zzarVar.zzd));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(zzarVar.zze));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(zzarVar.zzf));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(zzarVar.zzg));
                    sQLiteDatabaseZze.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.zzu.zzaW().zze().zzb("Not updating daily counts, app is not known. appId", zzgu.zzl(str));
                }
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Error updating daily counts. appId", zzgu.zzl(str), e);
            }
            return zzarVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
    @WorkerThread
    public final zzaq zzy(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        Preconditions.m3541e(str);
        zzg();
        zzay();
        Cursor cursor = null;
        try {
            cursorQuery = zze().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            this.zzu.zzaW().zzb().zzb("Got multiple records for app config, expected one. appId", zzgu.zzl(str));
                        }
                        if (blob != null) {
                            zzaq zzaqVar = new zzaq(blob, string, string2);
                            cursorQuery.close();
                            return zzaqVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    this.zzu.zzaW().zzb().zzc("Error querying remote config. appId", zzgu.zzl(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0045  */
    @WorkerThread
    public final boolean zzz(com.google.android.gms.internal.measurement.zzid zzidVar, boolean z) {
        zzg();
        zzay();
        Preconditions.m3544h(zzidVar);
        Preconditions.m3541e(zzidVar.m10220A());
        Preconditions.m3546j(zzidVar.m10345p2());
        zzI();
        zzic zzicVar = this.zzu;
        long jCurrentTimeMillis = zzicVar.zzba().currentTimeMillis();
        long jM10348q2 = zzidVar.m10348q2();
        zzicVar.zzc();
        if (jM10348q2 >= jCurrentTimeMillis - zzal.zzI()) {
            long jM10348q3 = zzidVar.m10348q2();
            zzicVar.zzc();
            if (jM10348q3 > zzal.zzI() + jCurrentTimeMillis) {
                zzicVar.zzaW().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.m10220A()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.m10348q2()));
            }
        } else {
            zzicVar.zzaW().zze().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzgu.zzl(zzidVar.m10220A()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzidVar.m10348q2()));
        }
        try {
            byte[] bArrZzv = this.zzg.zzp().zzv(zzidVar.m9346i());
            zzic zzicVar2 = this.zzu;
            zzicVar2.zzaW().zzk().zzb("Saving bundle, size", Integer.valueOf(bArrZzv.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzidVar.m10220A());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzidVar.m10348q2()));
            contentValues.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bArrZzv);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (zzidVar.m10225B0()) {
                contentValues.put("retry_count", Integer.valueOf(zzidVar.m10229C0()));
            }
            try {
                if (zze().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzicVar2.zzaW().zzb().zzb("Failed to insert bundle (got -1). appId", zzgu.zzl(zzidVar.m10220A()));
                return false;
            } catch (SQLiteException e) {
                this.zzu.zzaW().zzb().zzc("Error storing bundle. appId", zzgu.zzl(zzidVar.m10220A()), e);
                return false;
            }
        } catch (IOException e2) {
            this.zzu.zzaW().zzb().zzc("Data loss. Failed to serialize bundle. appId", zzgu.zzl(zzidVar.m10220A()), e2);
            return false;
        }
    }
}
