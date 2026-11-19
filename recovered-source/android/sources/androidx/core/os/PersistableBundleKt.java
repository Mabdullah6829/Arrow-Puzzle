package androidx.core.os;

import android.os.PersistableBundle;
import java.util.Map;
import p057d0.C6283e;

/* JADX INFO: loaded from: classes.dex */
public final class PersistableBundleKt {
    public static final PersistableBundle persistableBundleOf(C6283e... c6283eArr) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(c6283eArr.length);
        for (C6283e c6283e : c6283eArr) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, (String) c6283e.f24308s, c6283e.f24309t);
        }
        return persistableBundleCreatePersistableBundle;
    }

    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundleCreatePersistableBundle;
    }

    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
