package androidx.core.content;

import android.content.SharedPreferences;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesKt {
    public static final void edit(SharedPreferences sharedPreferences, boolean z, InterfaceC6498l interfaceC6498l) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC6498l.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, InterfaceC6498l interfaceC6498l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC6498l.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
