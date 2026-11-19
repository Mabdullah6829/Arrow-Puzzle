package com.google.firebase.crashlytics.internal.model.serialization;

import android.util.JsonReader;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.serialization.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5693a implements CrashlyticsReportJsonTransform.ObjectParser {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23630a;

    public /* synthetic */ C5693a(int i2) {
        this.f23630a = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser
    public final Object parse(JsonReader jsonReader) {
        switch (this.f23630a) {
            case 0:
                return CrashlyticsReportJsonTransform.parseEventFrame(jsonReader);
            case 1:
                return CrashlyticsReportJsonTransform.parseBuildIdMappingForArch(jsonReader);
            case 2:
                return CrashlyticsReportJsonTransform.parseCustomAttribute(jsonReader);
            case 3:
                return CrashlyticsReportJsonTransform.parseProcessDetails(jsonReader);
            case 4:
                return CrashlyticsReportJsonTransform.parseEvent(jsonReader);
            case 5:
                return CrashlyticsReportJsonTransform.parseEventThread(jsonReader);
            case 6:
                return CrashlyticsReportJsonTransform.parseEventBinaryImage(jsonReader);
            case 7:
                return CrashlyticsReportJsonTransform.parseFile(jsonReader);
            default:
                return CrashlyticsReportJsonTransform.parseEventRolloutsAssignment(jsonReader);
        }
    }
}
