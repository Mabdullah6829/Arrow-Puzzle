package com.google.android.gms.internal.measurement;

import androidx.webkit.ProxyConfig;
import androidx.work.WorkRequest;
import com.google.firebase.firestore.util.ExponentialBackoff;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagu implements zzagt {

    /* JADX INFO: renamed from: a */
    public static final zzpo f22157a = new zzpo(zzagr.f22154d, 81);

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: A */
    public final long mo9722A() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.client.min_time_after_boot_seconds", 55, 90L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: B */
    public final long mo9723B() {
        return ((Long) f22157a.m10587b("measurement.monitoring.sample_period_millis", 29, 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: C */
    public final long mo9724C() {
        return ((Long) f22157a.m10587b("measurement.alarm_manager.minimum_interval", 27, ExponentialBackoff.DEFAULT_BACKOFF_MAX_DELAY_MS).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: D */
    public final long mo9725D() {
        return ((Long) f22157a.m10587b("measurement.upload.max_events_per_day", 71, 100000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: E */
    public final long mo9726E() {
        return ((Long) f22157a.m10587b("measurement.upload.realtime_upload_interval", 33, WorkRequest.MIN_BACKOFF_MILLIS).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: F */
    public final long mo9727F() {
        return ((Long) f22157a.m10587b("measurement.upload.stale_data_deletion_interval", 53, 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: G */
    public final String mo9728G() {
        return (String) f22157a.m10588c(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: H */
    public final boolean mo9729H() {
        return ((Boolean) f22157a.m10586a(31, "measurement.config.notify_trigger_uris_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: I */
    public final long mo9730I() {
        return ((Long) f22157a.m10587b("measurement.upload.backoff_period", 63, 43200000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: J */
    public final long mo9731J() {
        return ((Long) f22157a.m10587b("measurement.sgtm.batch.long_queuing_threshold", 40, 240000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: K */
    public final String mo9732K() {
        return (String) f22157a.m10588c(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: L */
    public final long mo9733L() {
        return ((Long) f22157a.m10587b("measurement.upload.refresh_blacklisted_config_interval", 34, 604800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: M */
    public final String mo9734M() {
        return (String) f22157a.m10588c(44, "measurement.sgtm.service_upload_apps_list", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: N */
    public final long mo9735N() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.min_delay_after_broadcast", 49, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: O */
    public final long mo9736O() {
        return ((Long) f22157a.m10587b("measurement.sgtm.batch.retry_interval", 41, 1800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: P */
    public final long mo9737P() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.min_delay_after_startup", 50, 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: Q */
    public final long mo9738Q() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.max_queue_time", 57, 864000000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: R */
    public final long mo9739R() {
        return ((Long) f22157a.m10587b("measurement.upload.retry_time", 77, 1800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: S */
    public final long mo9740S() {
        return ((Long) f22157a.m10587b("measurement.sgtm.batch.retry_max_count", 42, 10L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: T */
    public final long mo9741T() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.max_queued_batches", 47, 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: U */
    public final long mo9742U() {
        return ((Long) f22157a.m10587b("measurement.service_client.idle_disconnect_millis", 36, 5000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: V */
    public final long mo9743V() {
        return ((Long) f22157a.m10587b("measurement.upload.max_batch_size", 75, 65536L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: W */
    public final String mo9744W() {
        return (String) f22157a.m10588c(56, "measurement.rb.attribution.uri_authority", "google-analytics.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: X */
    public final long mo9745X() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.batches_retrieval_limit", 46, 5L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: Y */
    public final long mo9746Y() {
        return ((Long) f22157a.m10587b("measurement.redaction.app_instance_id.ttl", 62, 7200000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: Z */
    public final long mo9747Z() {
        return ((Long) f22157a.m10587b("measurement.upload.max_queue_time", 73, 518400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: a */
    public final String mo9748a() {
        return (String) f22157a.m10588c(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: a0 */
    public final long mo9749a0() {
        return ((Long) f22157a.m10587b("measurement.upload.window_interval", 79, 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: b */
    public final long mo9750b() {
        return ((Long) f22157a.m10587b("measurement.config.cache_time", 5, 86400000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: b0 */
    public final long mo9751b0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_public_events_per_day", 72, 50000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: c */
    public final String mo9752c() {
        return (String) f22157a.m10588c(7, "measurement.config.url_authority", "app-measurement.com").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: c0 */
    public final String mo9753c0() {
        return (String) f22157a.m10588c(80, "measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: d */
    public final long mo9754d() {
        return ((Long) f22157a.m10587b("measurement.max_bundles_per_iteration", 3, 100L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: d0 */
    public final long mo9755d0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_error_events_per_day", 69, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: e */
    public final String mo9756e() {
        return (String) f22157a.m10588c(13, "measurement.rb.attribution.event_params", "value|currency").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: e0 */
    public final String mo9757e0() {
        return (String) f22157a.m10588c(60, "measurement.rb.attribution.uri_scheme", ProxyConfig.MATCH_HTTPS).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: f */
    public final long mo9758f() {
        return ((Long) f22157a.m10587b("measurement.lifetimevalue.max_currency_tracked", 17, 4L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: f0 */
    public final long mo9759f0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_events_per_bundle", 70, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: g */
    public final String mo9760g() {
        return (String) f22157a.m10588c(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: g0 */
    public final long mo9761g0() {
        return ((Long) f22157a.m10587b("measurement.sdk.attribution.cache.ttl", 61, 604800000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: h */
    public final long mo9762h() {
        return ((Long) f22157a.m10587b("measurement.upload.max_event_parameter_value_length", 19, 500L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: h0 */
    public final String mo9763h0() {
        return (String) f22157a.m10588c(78, "measurement.upload.url", "https://app-measurement.com/a").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: i */
    public final String mo9764i() {
        return (String) f22157a.m10588c(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: i0 */
    public final long mo9765i0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_bundles", 67, 100L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: j */
    public final long mo9766j() {
        return ((Long) f22157a.m10587b("measurement.upload.google_signal_max_queue_time", 15, 605000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: j0 */
    public final long mo9767j0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_conversions_per_day", 68, WorkRequest.MIN_BACKOFF_MILLIS).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: k */
    public final long mo9768k() {
        return ((Long) f22157a.m10587b("measurement.experiment.max_ids", 21, 50L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: k0 */
    public final String mo9769k0() {
        return (String) f22157a.m10588c(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: l */
    public final long mo9770l() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.max_trigger_uris_queried_at_once", 25, 0L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: l0 */
    public final long mo9771l0() {
        return ((Long) f22157a.m10587b("measurement.upload.retry_count", 76, 6L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: m */
    public final long mo9772m() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.retry_max_wait", 52, 21600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: m0 */
    public final long mo9773m0() {
        return ((Long) f22157a.m10587b("measurement.upload.interval", 65, 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: n */
    public final long mo9774n() {
        return ((Long) f22157a.m10587b("measurement.dma_consent.max_daily_dcu_realtime_events", 18, 1L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: n0 */
    public final long mo9775n0() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.max_retry_delay_seconds", 54, 16L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: o */
    public final long mo9776o() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.retry_interval", 51, 600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: o0 */
    public final long mo9777o0() {
        return ((Long) f22157a.m10587b("measurement.upload.initial_upload_delay_time", 64, 15000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: p */
    public final long mo9778p() {
        return ((Long) f22157a.m10587b("measurement.sgtm.batch.retry_max_wait", 43, 21600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: p0 */
    public final long mo9779p0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_bundle_size", 66, 65536L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: q */
    public final long mo9780q() {
        return ((Long) f22157a.m10587b("measurement.sgtm.upload.min_delay_after_background", 48, 600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: q0 */
    public final long mo9781q0() {
        return ((Long) f22157a.m10587b("measurement.upload.max_realtime_events_per_day", 74, 10L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: r */
    public final long mo9782r() {
        return ((Long) f22157a.m10587b("measurement.store.max_stored_events_per_app", 20, 100000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: s */
    public final long mo9783s() {
        return ((Long) f22157a.m10587b("measurement.rb.max_trigger_registrations_per_day", 24, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: t */
    public final long mo9784t() {
        return ((Long) f22157a.m10587b("measurement.upload.minimum_delay", 28, 500L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: u */
    public final long mo9785u() {
        return ((Long) f22157a.m10587b("measurement.service_client.reconnect_millis", 38, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: v */
    public final long mo9786v() {
        return ((Long) f22157a.m10587b("measurement.audience.filter_result_max_count", 22, 200L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: w */
    public final String mo9787w() {
        return (String) f22157a.m10588c(32, "measurement.rb.attribution.app_allowlist", "").get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: x */
    public final long mo9788x() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.client.min_ad_services_version", 26, 7L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: y */
    public final long mo9789y() {
        return ((Long) f22157a.m10587b("measurement.rb.attribution.notify_app_delay_millis", 30, 3000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    /* JADX INFO: renamed from: z */
    public final long mo9790z() {
        return ((Long) f22157a.m10587b("measurement.upload.max_item_scoped_custom_parameters", 23, 27L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zza() {
        return ((Long) f22157a.m10587b("measurement.ad_id_cache_time", 0, WorkRequest.MIN_BACKOFF_MILLIS).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzb() {
        return ((Long) f22157a.m10587b("measurement.app_uninstalled_additional_ad_id_cache_time", 1, 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzc() {
        return ((Boolean) f22157a.m10586a(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final String zzh() {
        return (String) f22157a.m10588c(8, "measurement.config.url_scheme", ProxyConfig.MATCH_HTTPS).get();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzi() {
        return ((Long) f22157a.m10587b("measurement.upload.debug_upload_interval", 9, 1000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final boolean zzj() {
        return ((Boolean) f22157a.m10586a(10, "measurement.config.default_flag_values", true).get()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzk() {
        return ((Long) f22157a.m10587b("45769094", 11, 3600000L).get()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzagt
    public final long zzl() {
        return ((Long) f22157a.m10587b("measurement.session.engagement_interval", 12, 3600000L).get()).longValue();
    }
}
