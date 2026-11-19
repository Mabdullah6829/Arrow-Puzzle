package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.inject.Deferred;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class FirestoreMultiDbComponent implements FirebaseAppLifecycleListener, FirebaseFirestore.InstanceRegistry {
    private final FirebaseApp app;
    private final Deferred<InteropAppCheckTokenProvider> appCheckProvider;
    private final Deferred<InternalAuthProvider> authProvider;
    private final Context context;
    private final Map<String, FirebaseFirestore> instances = new HashMap();
    private final GrpcMetadataProvider metadataProvider;

    public FirestoreMultiDbComponent(@NonNull Context context, @NonNull FirebaseApp firebaseApp, @NonNull Deferred<InternalAuthProvider> deferred, @NonNull Deferred<InteropAppCheckTokenProvider> deferred2, @Nullable GrpcMetadataProvider grpcMetadataProvider) {
        this.context = context;
        this.app = firebaseApp;
        this.authProvider = deferred;
        this.appCheckProvider = deferred2;
        this.metadataProvider = grpcMetadataProvider;
        firebaseApp.addLifecycleEventListener(this);
    }

    @NonNull
    public synchronized FirebaseFirestore get(@NonNull String str) throws Throwable {
        try {
            try {
                FirebaseFirestore firebaseFirestoreNewInstance = this.instances.get(str);
                if (firebaseFirestoreNewInstance == null) {
                    firebaseFirestoreNewInstance = FirebaseFirestore.newInstance(this.context, this.app, this.authProvider, this.appCheckProvider, str, this, this.metadataProvider);
                    this.instances.put(str, firebaseFirestoreNewInstance);
                }
                return firebaseFirestoreNewInstance;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.google.firebase.FirebaseAppLifecycleListener
    public synchronized void onDeleted(String str, FirebaseOptions firebaseOptions) {
        ArrayList arrayList = new ArrayList(this.instances.entrySet());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Map.Entry entry = (Map.Entry) obj;
            ((FirebaseFirestore) entry.getValue()).terminate();
            Assert.hardAssert(!this.instances.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    @Override // com.google.firebase.firestore.FirebaseFirestore.InstanceRegistry
    public synchronized void remove(@NonNull String str) {
        this.instances.remove(str);
    }
}
