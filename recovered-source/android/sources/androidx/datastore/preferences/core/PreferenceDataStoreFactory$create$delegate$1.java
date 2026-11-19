package androidx.datastore.preferences.core;

import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p078p0.InterfaceC6487a;
import p091y0.AbstractC6574d;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends AbstractC6453l implements InterfaceC6487a {
    final /* synthetic */ InterfaceC6487a $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(InterfaceC6487a interfaceC6487a) {
        super(0);
        this.$produceFile = interfaceC6487a;
    }

    @Override // p078p0.InterfaceC6487a
    public final File invoke() {
        File file = (File) this.$produceFile.invoke();
        AbstractC6452k.m12181e(file, "<this>");
        String name = file.getName();
        AbstractC6452k.m12180d(name, "getName(...)");
        if (AbstractC6574d.m12225D(name, "").equals("preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            AbstractC6452k.m12180d(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
