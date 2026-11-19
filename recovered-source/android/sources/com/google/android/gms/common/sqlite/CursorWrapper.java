package com.google.android.gms.common.sqlite;

import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;

/* JADX INFO: loaded from: classes.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i2, CursorWindow cursorWindow) {
        throw null;
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        throw null;
    }

    @Override // android.database.CursorWrapper
    public final /* synthetic */ Cursor getWrappedCursor() {
        return null;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i2, int i3) {
        throw null;
    }
}
