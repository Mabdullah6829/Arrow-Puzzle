package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, InterfaceC6498l initializer) {
        AbstractC6452k.m12181e(initializerViewModelFactoryBuilder, "<this>");
        AbstractC6452k.m12181e(initializer, "initializer");
        AbstractC6452k.m12184h();
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(InterfaceC6498l builder) {
        AbstractC6452k.m12181e(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
