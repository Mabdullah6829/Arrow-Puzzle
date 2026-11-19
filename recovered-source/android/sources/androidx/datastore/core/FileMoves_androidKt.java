package androidx.datastore.core;

import android.os.Build;
import java.io.File;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: loaded from: classes.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File toFile) {
        AbstractC6452k.m12181e(file, "<this>");
        AbstractC6452k.m12181e(toFile, "toFile");
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, toFile) : file.renameTo(toFile);
    }
}
