package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.collection.ArraySet;
import androidx.core.content.ContextCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zag;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.AttributionSourceWrapper;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {

    /* JADX INFO: renamed from: a */
    public final Context f4188a;

    /* JADX INFO: renamed from: b */
    public final String f4189b;

    /* JADX INFO: renamed from: c */
    public final AttributionSourceWrapper f4190c;

    /* JADX INFO: renamed from: d */
    public final Api f4191d;

    /* JADX INFO: renamed from: e */
    public final Api.ApiOptions f4192e;

    /* JADX INFO: renamed from: f */
    public final ApiKey f4193f;

    /* JADX INFO: renamed from: g */
    public final Looper f4194g;

    /* JADX INFO: renamed from: h */
    public final int f4195h;

    /* JADX INFO: renamed from: i */
    public final StatusExceptionMapper f4196i;

    /* JADX INFO: renamed from: j */
    public final GoogleApiManager f4197j;

    public static class Settings {

        /* JADX INFO: renamed from: c */
        public static final Settings f4198c;

        /* JADX INFO: renamed from: a */
        public final StatusExceptionMapper f4199a;

        /* JADX INFO: renamed from: b */
        public final Looper f4200b;

        public static class Builder {

            /* JADX INFO: renamed from: a */
            public ApiExceptionMapper f4201a;

            /* JADX INFO: renamed from: b */
            public Looper f4202b;
        }

        static {
            Builder builder = new Builder();
            if (builder.f4201a == null) {
                builder.f4201a = new ApiExceptionMapper();
            }
            if (builder.f4202b == null) {
                builder.f4202b = Looper.getMainLooper();
            }
            f4198c = new Settings(builder.f4201a, builder.f4202b);
        }

        public Settings(StatusExceptionMapper statusExceptionMapper, Looper looper) {
            this.f4199a = statusExceptionMapper;
            this.f4200b = looper;
        }
    }

    public GoogleApi(Context context, Api api, Api.ApiOptions.NotRequiredOptions notRequiredOptions, Settings settings) {
        Preconditions.m3545i(context, "Null context is not permitted.");
        Preconditions.m3545i(api, "Api must not be null.");
        Preconditions.m3545i(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        Preconditions.m3545i(applicationContext, "The provided context did not have an application context.");
        this.f4188a = applicationContext;
        int i2 = Build.VERSION.SDK_INT;
        String attributionTag = i2 >= 30 ? ContextCompat.getAttributionTag(context) : null;
        this.f4189b = attributionTag;
        this.f4190c = i2 >= 31 ? new AttributionSourceWrapper(context.getAttributionSource()) : null;
        this.f4191d = api;
        this.f4192e = notRequiredOptions;
        this.f4194g = settings.f4200b;
        this.f4193f = new ApiKey(api, notRequiredOptions, attributionTag);
        new zabq();
        GoogleApiManager googleApiManagerM3458d = GoogleApiManager.m3458d(applicationContext);
        this.f4197j = googleApiManagerM3458d;
        this.f4195h = googleApiManagerM3458d.f4253z.getAndIncrement();
        this.f4196i = settings.f4199a;
        zao zaoVar = googleApiManagerM3458d.f4244F;
        zaoVar.sendMessage(zaoVar.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: c */
    public final ClientSettings.Builder m3426c() {
        GoogleSignInAccount googleSignInAccountM3421h;
        GoogleSignInAccount googleSignInAccountM3421h2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        Api.ApiOptions apiOptions = this.f4192e;
        boolean z = apiOptions instanceof Api.ApiOptions.HasGoogleSignInAccountOptions;
        Account accountM3420j = null;
        if (z && (googleSignInAccountM3421h2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).m3421h()) != null) {
            String str = googleSignInAccountM3421h2.f4048u;
            if (str != null) {
                accountM3420j = new Account(str, "com.google");
            }
        } else if (apiOptions instanceof Api.ApiOptions.HasAccountOptions) {
            accountM3420j = ((Api.ApiOptions.HasAccountOptions) apiOptions).m3420j();
        }
        builder.f4414a = accountM3420j;
        Collection collectionM3369w = (!z || (googleSignInAccountM3421h = ((Api.ApiOptions.HasGoogleSignInAccountOptions) apiOptions).m3421h()) == null) ? Collections.EMPTY_SET : googleSignInAccountM3421h.m3369w();
        if (builder.f4415b == null) {
            builder.f4415b = new ArraySet();
        }
        builder.f4415b.addAll(collectionM3369w);
        Context context = this.f4188a;
        builder.f4417d = context.getClass().getName();
        builder.f4416c = context.getPackageName();
        return builder;
    }

    /* JADX INFO: renamed from: d */
    public final Task m3427d(int i2, TaskApiCall taskApiCall) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        GoogleApiManager googleApiManager = this.f4197j;
        googleApiManager.getClass();
        googleApiManager.m3460b(taskCompletionSource, taskApiCall.f4274c, this);
        zacc zaccVar = new zacc(new zag(i2, taskApiCall, taskCompletionSource, this.f4196i), googleApiManager.f4239A.get(), this);
        zao zaoVar = googleApiManager.f4244F;
        zaoVar.sendMessage(zaoVar.obtainMessage(4, zaccVar));
        return taskCompletionSource.f23216a;
    }
}
