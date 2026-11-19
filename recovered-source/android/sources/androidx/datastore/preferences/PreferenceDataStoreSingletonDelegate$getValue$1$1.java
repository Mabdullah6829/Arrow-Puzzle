package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    @Override // p078p0.InterfaceC6487a
    public final File invoke() {
        Context applicationContext = this.$applicationContext;
        AbstractC6452k.m12180d(applicationContext, "applicationContext");
        return PreferenceDataStoreFile.preferencesDataStoreFile(applicationContext, this.this$0.name);
    }
}
