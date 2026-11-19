package com.google.firebase.firestore.remote;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Consumer;
import com.google.firebase.firestore.util.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidConnectivityMonitor implements ConnectivityMonitor {
    private static final String LOG_TAG = "AndroidConnectivityMonitor";
    private final List<Consumer<ConnectivityMonitor.NetworkStatus>> callbacks = new ArrayList();

    @Nullable
    private final ConnectivityManager connectivityManager;
    private final Context context;

    @Nullable
    private Runnable unregisterRunnable;

    public class DefaultNetworkCallback extends ConnectivityManager.NetworkCallback {
        private DefaultNetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AndroidConnectivityMonitor.this.raiseCallbacks(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AndroidConnectivityMonitor.this.raiseCallbacks(false);
        }
    }

    public class NetworkReceiver extends BroadcastReceiver {
        private boolean wasConnected;

        private NetworkReceiver() {
            this.wasConnected = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zIsConnected = AndroidConnectivityMonitor.this.isConnected();
            if (AndroidConnectivityMonitor.this.isConnected() && !this.wasConnected) {
                AndroidConnectivityMonitor.this.raiseCallbacks(true);
            } else if (!zIsConnected && this.wasConnected) {
                AndroidConnectivityMonitor.this.raiseCallbacks(false);
            }
            this.wasConnected = zIsConnected;
        }
    }

    public AndroidConnectivityMonitor(Context context) {
        Assert.hardAssert(context != null, "Context must be non-null", new Object[0]);
        this.context = context;
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        configureBackgroundStateListener();
        configureNetworkMonitoring();
    }

    private void configureBackgroundStateListener() {
        Application application = (Application) this.context.getApplicationContext();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.google.firebase.firestore.remote.AndroidConnectivityMonitor.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.raiseForegroundNotification();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(@NonNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(@NonNull Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(@NonNull Activity activity) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.raiseForegroundNotification();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(@NonNull Activity activity) {
                if (atomicBoolean.compareAndSet(true, false)) {
                    AndroidConnectivityMonitor.this.raiseForegroundNotification();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(@NonNull Activity activity) {
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() { // from class: com.google.firebase.firestore.remote.AndroidConnectivityMonitor.2
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(@NonNull Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public void onTrimMemory(int i2) {
                if (i2 == 20) {
                    atomicBoolean.set(true);
                }
            }
        });
    }

    private void configureNetworkMonitoring() {
        if (this.connectivityManager != null) {
            DefaultNetworkCallback defaultNetworkCallback = new DefaultNetworkCallback();
            this.connectivityManager.registerDefaultNetworkCallback(defaultNetworkCallback);
            this.unregisterRunnable = new RunnableC5960c(2, this, defaultNetworkCallback);
        } else {
            NetworkReceiver networkReceiver = new NetworkReceiver();
            this.context.registerReceiver(networkReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.unregisterRunnable = new RunnableC5960c(3, this, networkReceiver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isConnected() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$0(DefaultNetworkCallback defaultNetworkCallback) {
        this.connectivityManager.unregisterNetworkCallback(defaultNetworkCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureNetworkMonitoring$1(NetworkReceiver networkReceiver) {
        this.context.unregisterReceiver(networkReceiver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void raiseCallbacks(boolean z) {
        synchronized (this.callbacks) {
            try {
                Iterator<Consumer<ConnectivityMonitor.NetworkStatus>> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().accept(z ? ConnectivityMonitor.NetworkStatus.REACHABLE : ConnectivityMonitor.NetworkStatus.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.firebase.firestore.remote.ConnectivityMonitor
    public void addCallback(Consumer<ConnectivityMonitor.NetworkStatus> consumer) {
        synchronized (this.callbacks) {
            this.callbacks.add(consumer);
        }
    }

    public void raiseForegroundNotification() {
        Logger.debug(LOG_TAG, "App has entered the foreground.", new Object[0]);
        if (isConnected()) {
            raiseCallbacks(true);
        }
    }

    @Override // com.google.firebase.firestore.remote.ConnectivityMonitor
    public void shutdown() {
        Runnable runnable = this.unregisterRunnable;
        if (runnable != null) {
            runnable.run();
            this.unregisterRunnable = null;
        }
    }
}
