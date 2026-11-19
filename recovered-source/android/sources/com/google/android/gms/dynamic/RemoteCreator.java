package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteCreator<T> {

    /* JADX INFO: renamed from: a */
    public final String f4714a;

    /* JADX INFO: renamed from: b */
    public Object f4715b;

    public static class RemoteCreatorException extends Exception {
    }

    public RemoteCreator(String str) {
        this.f4714a = str;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo2949a(IBinder iBinder);

    /* JADX INFO: renamed from: b */
    public final Object m3698b(Context context) throws RemoteCreatorException {
        Context contextCreatePackageContext;
        if (this.f4715b == null) {
            Preconditions.m3544h(context);
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.f4161a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new RemoteCreatorException("Could not get remote context.");
            }
            try {
                this.f4715b = mo2949a((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.f4714a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new RemoteCreatorException("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new RemoteCreatorException("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new RemoteCreatorException("Could not instantiate creator.", e3);
            }
        }
        return this.f4715b;
    }
}
