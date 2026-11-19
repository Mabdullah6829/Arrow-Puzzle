package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Api<O extends ApiOptions> {

    /* JADX INFO: renamed from: a */
    public final AbstractClientBuilder f4175a;

    /* JADX INFO: renamed from: b */
    public final String f4176b;

    public static abstract class AbstractClientBuilder<T extends Client, O> extends BaseClientBuilder<T, O> {
        /* JADX INFO: renamed from: a */
        public Client mo3418a(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            return mo3419b(context, looper, clientSettings, obj, connectionCallbacks, onConnectionFailedListener);
        }

        /* JADX INFO: renamed from: b */
        public Client mo3419b(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface AnyClient {
    }

    public static class AnyClientKey<C extends AnyClient> {
    }

    public interface ApiOptions {

        /* JADX INFO: renamed from: i */
        public static final NoOptions f4177i = new NoOptions();

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            /* JADX INFO: renamed from: j */
            Account m3420j();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            /* JADX INFO: renamed from: h */
            GoogleSignInAccount m3421h();
        }

        public interface HasOptions extends ApiOptions {
        }

        public static final class NoOptions implements NotRequiredOptions {
            private NoOptions() {
                throw null;
            }
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    public static abstract class BaseClientBuilder<T extends AnyClient, O> {
    }

    public interface Client extends AnyClient {
        /* JADX INFO: renamed from: a */
        Set mo3422a();

        void connect(BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks);

        void disconnect();

        void disconnect(String str);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(IAccountAccessor iAccountAccessor, Set set);

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(BaseGmsClient.SignOutCallbacks signOutCallbacks);

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    public static final class ClientKey<C extends Client> extends AnyClientKey<C> {
    }

    public Api(String str, AbstractClientBuilder abstractClientBuilder, ClientKey clientKey) {
        this.f4176b = str;
        this.f4175a = abstractClientBuilder;
    }
}
