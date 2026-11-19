package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadn {
    /* JADX INFO: renamed from: b */
    public static zzadf m9548b() {
        ClassLoader classLoader = zzadn.class.getClassLoader();
        if (zzadf.class.equals(zzadf.class)) {
            try {
                try {
                    return (zzadf) zzadf.class.cast(((zzadn) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null)).m9549a());
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zzadn.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zzadf) zzadf.class.cast(((zzadn) it.next()).m9549a()));
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(zzada.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzadf"), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (zzadf) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zzadf) zzadf.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract zzadf m9549a();
}
