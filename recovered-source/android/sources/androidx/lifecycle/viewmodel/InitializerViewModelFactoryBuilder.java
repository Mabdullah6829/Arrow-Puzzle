package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.InterfaceC6445d;
import p078p0.InterfaceC6498l;
import p088w0.InterfaceC6548c;

/* JADX INFO: loaded from: classes.dex */
@ViewModelFactoryDsl
public final class InitializerViewModelFactoryBuilder {
    private final List<ViewModelInitializer<?>> initializers = new ArrayList();

    public final <T extends ViewModel> void addInitializer(InterfaceC6548c clazz, InterfaceC6498l initializer) {
        AbstractC6452k.m12181e(clazz, "clazz");
        AbstractC6452k.m12181e(initializer, "initializer");
        List<ViewModelInitializer<?>> list = this.initializers;
        Class clsMo12175a = ((InterfaceC6445d) clazz).mo12175a();
        AbstractC6452k.m12179c(clsMo12175a, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        list.add(new ViewModelInitializer<>(clsMo12175a, initializer));
    }

    public final ViewModelProvider.Factory build() {
        ViewModelInitializer[] viewModelInitializerArr = (ViewModelInitializer[]) this.initializers.toArray(new ViewModelInitializer[0]);
        return new InitializerViewModelFactory((ViewModelInitializer[]) Arrays.copyOf(viewModelInitializerArr, viewModelInitializerArr.length));
    }
}
