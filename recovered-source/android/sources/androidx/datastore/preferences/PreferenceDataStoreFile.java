package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final File preferencesDataStoreFile(Context context, String name) {
        AbstractC6452k.m12181e(context, "<this>");
        AbstractC6452k.m12181e(name, "name");
        return DataStoreFile.dataStoreFile(context, name.concat(".preferences_pb"));
    }
}
