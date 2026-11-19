package androidx.room.migration;

import androidx.sqlite.p048db.SupportSQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i2, int i3) {
        this.startVersion = i2;
        this.endVersion = i3;
    }

    public abstract void migrate(SupportSQLiteDatabase supportSQLiteDatabase);
}
