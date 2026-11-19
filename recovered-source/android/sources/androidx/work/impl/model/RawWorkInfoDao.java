package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.sqlite.p048db.SupportSQLiteQuery;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface RawWorkInfoDao {
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(SupportSQLiteQuery supportSQLiteQuery);

    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(SupportSQLiteQuery supportSQLiteQuery);
}
