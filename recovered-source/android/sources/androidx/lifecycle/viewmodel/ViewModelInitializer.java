package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final InterfaceC6498l initializer;

    public ViewModelInitializer(Class<T> clazz, InterfaceC6498l initializer) {
        AbstractC6452k.m12181e(clazz, "clazz");
        AbstractC6452k.m12181e(initializer, "initializer");
        this.clazz = clazz;
        this.initializer = initializer;
    }

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final InterfaceC6498l getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
