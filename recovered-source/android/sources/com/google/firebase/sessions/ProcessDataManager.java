package com.google.firebase.sessions;

import java.util.Map;
import p058e0.C6314v;

/* JADX INFO: loaded from: classes2.dex */
public interface ProcessDataManager {

    public static final class DefaultImpls {
        public static Map<String, ProcessData> generateProcessDataMap(ProcessDataManager processDataManager) {
            return processDataManager.updateProcessDataMap(C6314v.f24339s);
        }
    }

    Map<String, ProcessData> generateProcessDataMap();

    int getMyPid();

    String getMyProcessName();

    String getMyUuid();

    boolean isColdStart(Map<String, ProcessData> map);

    boolean isMyProcessStale(Map<String, ProcessData> map);

    void onSessionGenerated();

    Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> map);
}
