package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzieh {
    /* JADX INFO: renamed from: b */
    public static zzidz m8320b() {
        ClassLoader classLoader = zzieh.class.getClassLoader();
        if (zzidz.class.equals(zzidz.class)) {
            try {
                try {
                    return (zzidz) zzidz.class.cast(((zzieh) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).m8321a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzieh.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzidz) zzidz.class.cast(((zzieh) it.next()).m8321a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zzidu.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzidz"), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzidz) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzidz) zzidz.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract zzidz m8321a();
}
