package com.google.android.gms.internal.measurement;

import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zacd;
import com.google.android.gms.common.api.internal.zaf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import p011H.AbstractC0253Q;
import p011H.C0262a;
import p011H.EnumC0244H;
import p011H.InterfaceC0238B;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmn implements zzmj {

    /* JADX INFO: renamed from: a */
    public final zzkk f22650a;

    public zzmn(zzkk zzkkVar) {
        this.f22650a = zzkkVar;
    }

    /* JADX INFO: renamed from: c */
    public static C0262a m10518c(Task task) {
        final zzkz zzkzVar = new zzkz();
        zzkzVar.f22597z = task;
        OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: com.google.android.gms.internal.measurement.zzla
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                boolean zIsCanceled = task2.isCanceled();
                zzkz zzkzVar2 = zzkzVar;
                if (zIsCanceled) {
                    zzkzVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzkzVar2.m437l(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzkzVar2.m438m(exception);
            }
        };
        EnumC0244H enumC0244H = EnumC0244H.f483s;
        task.addOnCompleteListener(enumC0244H, onCompleteListener);
        return AbstractC0253Q.m378a(zzkzVar, ApiException.class, new InterfaceC0238B() { // from class: com.google.android.gms.internal.measurement.zzml
            @Override // p011H.InterfaceC0238B
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                ApiException apiException = (ApiException) obj;
                throw new zzmk(apiException.getStatusCode(), apiException.getMessage(), apiException);
            }
        }, enumC0244H);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: a */
    public final C0262a mo10514a(zzpm zzpmVar) throws Throwable {
        final String string;
        final zzkk zzkkVar = this.f22650a;
        Looper looper = zzkkVar.f4194g;
        Preconditions.m3545i(looper, "Looper must not be null");
        final ListenerHolder listenerHolder = new ListenerHolder(looper, zzpmVar);
        String strM3655a = ProcessUtils.m3655a();
        if (strM3655a == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strM3655a.length() + 1;
            int iIdentityHashCode = System.identityHashCode(zzku.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strM3655a);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        RemoteCall remoteCall = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                zzka zzkaVar = new zzka(zzkkVar, listenerHolder);
                Parcel parcelZza = zzktVar.zza();
                parcelZza.writeString(string);
                zzbn.m9820c(parcelZza, zzkaVar);
                zzktVar.zzc(28, parcelZza);
            }
        };
        zzkh zzkhVar = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkh
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final /* synthetic */ void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i2 = zzkk.f22584k;
            }
        };
        RegistrationMethods.Builder builderM3481a = RegistrationMethods.m3481a();
        builderM3481a.f4269d = listenerHolder;
        builderM3481a.f4266a = remoteCall;
        builderM3481a.f4267b = zzkhVar;
        builderM3481a.f4270e = new Feature[]{zzjn.f22547b};
        builderM3481a.f4271f = false;
        RegistrationMethods registrationMethodsM3482a = builderM3481a.m3482a();
        Preconditions.m3545i(registrationMethodsM3482a.f4263a.f4260a.f4257b, "Listener has already been released.");
        UnregisterListenerMethod unregisterListenerMethod = registrationMethodsM3482a.f4264b;
        Preconditions.m3545i(unregisterListenerMethod.f4279a, "Listener has already been released.");
        RegisterListenerMethod registerListenerMethod = registrationMethodsM3482a.f4263a;
        Runnable runnable = registrationMethodsM3482a.f4265c;
        GoogleApiManager googleApiManager = zzkkVar.f4197j;
        googleApiManager.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        googleApiManager.m3460b(taskCompletionSource, 0, zzkkVar);
        zacc zaccVar = new zacc(new zaf(new zacd(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource), googleApiManager.f4239A.get(), zzkkVar);
        zao zaoVar = googleApiManager.f4244F;
        zaoVar.sendMessage(zaoVar.obtainMessage(8, zaccVar));
        return m10518c(taskCompletionSource.f23216a);
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: b */
    public final C0262a mo10515b(final zzme zzmeVar) {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                int i2 = zzkk.f22584k;
                zzkj zzkjVar = new zzkj(taskCompletionSource);
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                byte[] bArrM9346i = zzmeVar.m9346i();
                Parcel parcelZza = zzktVar.zza();
                zzbn.m9820c(parcelZza, zzkjVar);
                parcelZza.writeByteArray(bArrM9346i);
                zzktVar.zzc(31, parcelZza);
            }
        };
        builderM3484a.f4277c = new Feature[]{zzjn.f22546a};
        builderM3484a.f4276b = false;
        TaskApiCall taskApiCallM3485a = builderM3484a.m3485a();
        final zzkk zzkkVar = this.f22650a;
        return m10518c(zzkkVar.m3427d(0, taskApiCallM3485a).continueWithTask(EnumC0244H.f483s, new Continuation() { // from class: com.google.android.gms.internal.measurement.zzke
            @Override // com.google.android.gms.tasks.Continuation
            /* JADX INFO: renamed from: a */
            public final Object mo170a(Task task) {
                boolean z = task.getException() instanceof UnsupportedApiCallException;
                zzme zzmeVar2 = zzmeVar;
                zzkk zzkkVar2 = zzkkVar;
                if (z) {
                    return zzkkVar2.m10461f(zzmeVar2.m10480A());
                }
                if (!(task.getException() instanceof ApiException)) {
                    return task;
                }
                ApiException apiException = (ApiException) task.getException();
                apiException.getClass();
                return apiException.getStatusCode() == 29514 ? zzkkVar2.m10461f(zzmeVar2.m10480A()) : task;
            }
        }));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: d */
    public final C0262a mo10516d() {
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        final zzkk zzkkVar = this.f22650a;
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            /* JADX INFO: renamed from: a */
            public final void mo3483a(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
                zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
                zzjy zzjyVar = new zzjy(zzkkVar, taskCompletionSource);
                Parcel parcelZza = zzktVar.zza();
                zzbn.m9820c(parcelZza, zzjyVar);
                zzktVar.zzc(27, parcelZza);
            }
        };
        builderM3484a.f4277c = new Feature[]{zzjn.f22548c};
        builderM3484a.f4276b = false;
        return m10518c(zzkkVar.m3427d(0, builderM3484a.m3485a()));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: m */
    public final C0262a mo10517m(String str) {
        str.getClass();
        return m10518c(this.f22650a.m10461f(str));
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final C0262a zza(final String str) {
        str.getClass();
        TaskApiCall.Builder builderM3484a = TaskApiCall.m3484a();
        builderM3484a.f4275a = new RemoteCall() { // from class: com.google.android.gms.internal.measurement.zzkb
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
                parcelZza.writeString("");
                parcelZza.writeString(null);
                zzktVar.zzc(11, parcelZza);
            }
        };
        return m10518c(this.f22650a.m3427d(0, builderM3484a.m3485a()).continueWith(EnumC0244H.f483s, new zzmm()));
    }
}
