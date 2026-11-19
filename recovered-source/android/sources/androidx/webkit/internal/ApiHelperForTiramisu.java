package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    public static ServiceInfo getServiceInfo(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    /* JADX INFO: renamed from: of */
    public static PackageManager.ComponentInfoFlags m2696of(long j2) {
        return PackageManager.ComponentInfoFlags.of(j2);
    }
}
