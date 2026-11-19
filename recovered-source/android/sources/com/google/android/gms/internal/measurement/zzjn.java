package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjn {

    /* JADX INFO: renamed from: a */
    public static final Feature f22546a;

    /* JADX INFO: renamed from: b */
    public static final Feature f22547b;

    /* JADX INFO: renamed from: c */
    public static final Feature f22548c;

    /* JADX INFO: renamed from: d */
    public static final Feature[] f22549d;

    static {
        Feature feature = new Feature("commit_to_configuration_v2_api", -1, 1L, true);
        f22546a = feature;
        Feature feature2 = new Feature("get_serving_version_api", -1, 1L, true);
        Feature feature3 = new Feature("get_experiment_tokens_api", -1, 1L, true);
        Feature feature4 = new Feature("register_flag_update_listener_api", -1, 2L, true);
        f22547b = feature4;
        Feature feature5 = new Feature("sync_after_api", -1, 1L, true);
        Feature feature6 = new Feature("sync_after_for_application_api", -1, 1L, true);
        Feature feature7 = new Feature("set_app_wide_properties_api", -1, 1L, true);
        Feature feature8 = new Feature("set_runtime_properties_api", -1, 1L, true);
        Feature feature9 = new Feature("get_storage_info_api", -1, 1L, true);
        f22548c = feature9;
        f22549d = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }
}
