package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import dalvik.system.DelegateLastClassLoader;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: androidx.webkit.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1804a {
    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ SafeBrowsingResponse m2702b(Object obj) {
        return (SafeBrowsingResponse) obj;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ DelegateLastClassLoader m2703c(ClassLoader classLoader, String str) {
        return new DelegateLastClassLoader(str, classLoader);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InMemoryDexClassLoader m2704d(ByteBuffer[] byteBufferArr, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBufferArr, classLoader);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2705e() {
    }
}
