package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.util.Pair;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
public final class zzkk extends GoogleApi {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f22584k = 0;

    static {
        Pair.create(new zzkm(), Tasks.m10776f(null));
    }

    /* JADX INFO: renamed from: e */
    public final void m10460e(final String str, final String[] strArr) {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzki
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i2 = zzkk.f22584k;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                Parcel parcelZza = zzktVar.zza();
                zzbn.m9820c(parcelZza, zzkjVar);
                parcelZza.writeString(str);
                parcelZza.writeInt(0);
                parcelZza.writeStringArray(strArr);
                parcelZza.writeByteArray(null);
                zzktVar.zzc(1, parcelZza);
            }
        };
        m3427d(0, builderM3484a.m3485a());
    }

    /* JADX INFO: renamed from: f */
    public final Task m10461f(final String str) {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i2 = zzkk.f22584k;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                Parcel parcelZza = zzktVar.zza();
                zzbn.m9820c(parcelZza, zzkjVar);
                parcelZza.writeString(str);
                zzktVar.zzc(5, parcelZza);
            }
        };
        return m3427d(0, builderM3484a.m3485a());
    }
}
