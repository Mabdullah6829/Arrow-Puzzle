package androidx.datastore;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String fileName) {
        AbstractC6452k.m12181e(context, "<this>");
        AbstractC6452k.m12181e(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(fileName));
    }
}
