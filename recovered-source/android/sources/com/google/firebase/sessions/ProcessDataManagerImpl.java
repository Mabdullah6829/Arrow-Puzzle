package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0242F;
import p057d0.C6283e;
import p057d0.InterfaceC6281c;
import p058e0.AbstractC6318z;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessDataManagerImpl implements ProcessDataManager {
    private final Context appContext;
    private boolean hasGeneratedSession;
    private final int myPid;
    private final InterfaceC6281c myProcessDetails$delegate;
    private final InterfaceC6281c myProcessName$delegate;
    private final InterfaceC6281c myUuid$delegate;

    public ProcessDataManagerImpl(Context appContext, UuidGenerator uuidGenerator) {
        AbstractC6452k.m12181e(appContext, "appContext");
        AbstractC6452k.m12181e(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        final int i2 = 0;
        this.myProcessName$delegate = AbstractC0242F.m357n(new InterfaceC6487a(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ ProcessDataManagerImpl f24046t;

            {
                this.f24046t = this;
            }

            @Override // p078p0.InterfaceC6487a
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f24046t);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f24046t);
                }
            }
        });
        this.myPid = Process.myPid();
        this.myUuid$delegate = AbstractC0242F.m357n(new C6046c(uuidGenerator, 2));
        final int i3 = 1;
        this.myProcessDetails$delegate = AbstractC0242F.m357n(new InterfaceC6487a(this) { // from class: com.google.firebase.sessions.e

            /* JADX INFO: renamed from: t */
            public final /* synthetic */ ProcessDataManagerImpl f24046t;

            {
                this.f24046t = this;
            }

            @Override // p078p0.InterfaceC6487a
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ProcessDataManagerImpl.myProcessName_delegate$lambda$0(this.f24046t);
                    default:
                        return ProcessDataManagerImpl.myProcessDetails_delegate$lambda$2(this.f24046t);
                }
            }
        });
    }

    private final List<ProcessDetails> getAppProcessDetails() {
        return ProcessDetailsProvider.INSTANCE.getAppProcessDetails(this.appContext);
    }

    private final ProcessDetails getMyProcessDetails() {
        return (ProcessDetails) this.myProcessDetails$delegate.getValue();
    }

    private final boolean isProcessStale(ProcessDetails processDetails, ProcessData processData) {
        if (AbstractC6452k.m12177a(getMyProcessName(), processDetails.getProcessName())) {
            return (processDetails.getPid() == processData.getPid() && AbstractC6452k.m12177a(getMyUuid(), processData.getUuid())) ? false : true;
        }
        return processDetails.getPid() != processData.getPid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails myProcessDetails_delegate$lambda$2(ProcessDataManagerImpl processDataManagerImpl) {
        return ProcessDetailsProvider.INSTANCE.getMyProcessDetails(processDataManagerImpl.appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myProcessName_delegate$lambda$0(ProcessDataManagerImpl processDataManagerImpl) {
        return processDataManagerImpl.getMyProcessDetails().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String myUuid_delegate$lambda$1(UuidGenerator uuidGenerator) {
        String string = uuidGenerator.next().toString();
        AbstractC6452k.m12180d(string, "toString(...)");
        return string;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> generateProcessDataMap() {
        return ProcessDataManager.DefaultImpls.generateProcessDataMap(this);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public int getMyPid() {
        return this.myPid;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyProcessName() {
        return (String) this.myProcessName$delegate.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public String getMyUuid() {
        return (String) this.myUuid$delegate.getValue();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isColdStart(Map<String, ProcessData> processDataMap) {
        AbstractC6452k.m12181e(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> appProcessDetails = getAppProcessDetails();
        ArrayList arrayList = new ArrayList();
        for (ProcessDetails processDetails : appProcessDetails) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            C6283e c6283e = processData != null ? new C6283e(processDetails, processData) : null;
            if (c6283e != null) {
                arrayList.add(c6283e);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            C6283e c6283e2 = (C6283e) obj;
            if (!isProcessStale((ProcessDetails) c6283e2.f24308s, (ProcessData) c6283e2.f24309t)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public boolean isMyProcessStale(Map<String, ProcessData> processDataMap) {
        AbstractC6452k.m12181e(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(getMyProcessName());
        return (processData != null && processData.getPid() == getMyPid() && AbstractC6452k.m12177a(processData.getUuid(), getMyUuid())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public void onSessionGenerated() {
        this.hasGeneratedSession = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public Map<String, ProcessData> updateProcessDataMap(Map<String, ProcessData> map) {
        if (map == null) {
            return AbstractC6318z.m12127u(new C6283e(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid())));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(getMyProcessName(), new ProcessData(Process.myPid(), getMyUuid()));
        return AbstractC6318z.m12131y(linkedHashMap);
    }
}
