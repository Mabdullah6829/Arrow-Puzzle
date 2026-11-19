package com.google.firebase.firestore.core;

import com.google.firebase.firestore.RealtimePipeline;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.pipeline.CollectionGroupSource;
import com.google.firebase.firestore.pipeline.CollectionSource;
import com.google.firebase.firestore.pipeline.DatabaseSource;
import com.google.firebase.firestore.pipeline.DocumentsSource;
import com.google.firebase.firestore.pipeline.InternalOptions;
import com.google.firebase.firestore.pipeline.LimitStage;
import com.google.firebase.firestore.pipeline.Ordering;
import com.google.firebase.firestore.pipeline.SortStage;
import com.google.firebase.firestore.pipeline.Stage;
import com.google.firebase.firestore.util.Assert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC6452k;
import p058e0.AbstractC6302j;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6307o;
import p058e0.C6290A;
import p058e0.C6291B;
import p058e0.C6313u;

/* JADX INFO: loaded from: classes2.dex */
public final class PipelineUtilKt {
    public static final RealtimePipeline asCollectionPipelineAtPath(RealtimePipeline pipeline, ResourcePath path) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        AbstractC6452k.m12181e(path, "path");
        List<Stage<?>> stages$com_google_firebase_firebase_firestore = pipeline.getStages$com_google_firebase_firebase_firestore();
        ArrayList arrayList = new ArrayList(AbstractC6307o.m12123u(stages$com_google_firebase_firebase_firestore, 10));
        for (Object collectionSource : stages$com_google_firebase_firebase_firestore) {
            if (collectionSource instanceof CollectionGroupSource) {
                collectionSource = new CollectionSource(path, pipeline.getSerializer$com_google_firebase_firebase_firestore(), InternalOptions.EMPTY);
            }
            arrayList.add(collectionSource);
        }
        return new RealtimePipeline(pipeline.getFirestore$com_google_firebase_firebase_firestore(), pipeline.getSerializer$com_google_firebase_firebase_firestore(), pipeline.getUserDataReader$com_google_firebase_firebase_firestore(), arrayList, null, 16, null);
    }

    public static final Integer getLastEffectiveLimit(RealtimePipeline pipeline) {
        Stage stage;
        AbstractC6452k.m12181e(pipeline, "pipeline");
        List<Stage<?>> rewrittenStages$com_google_firebase_firebase_firestore = pipeline.getRewrittenStages$com_google_firebase_firebase_firestore();
        AbstractC6452k.m12181e(rewrittenStages$com_google_firebase_firebase_firestore, "<this>");
        Iterator it = new C6291B(rewrittenStages$com_google_firebase_firebase_firestore).iterator();
        do {
            ListIterator listIterator = ((C6290A) it).f24319s;
            if (!listIterator.hasPrevious()) {
                return null;
            }
            stage = (Stage) listIterator.previous();
        } while (!(stage instanceof LimitStage));
        return Integer.valueOf(((LimitStage) stage).getLimit());
    }

    private static final List<Ordering> getLastEffectiveSortOrderings(RealtimePipeline realtimePipeline) {
        Stage stage;
        List<Stage<?>> rewrittenStages$com_google_firebase_firebase_firestore = realtimePipeline.getRewrittenStages$com_google_firebase_firebase_firestore();
        AbstractC6452k.m12181e(rewrittenStages$com_google_firebase_firebase_firestore, "<this>");
        Iterator it = new C6291B(rewrittenStages$com_google_firebase_firebase_firestore).iterator();
        do {
            ListIterator listIterator = ((C6290A) it).f24319s;
            if (!listIterator.hasPrevious()) {
                Assert.fail("RealtimePipeline must contain at least one Sort stage (ensured by RewriteStages).", new Object[0]);
                return C6313u.f24338s;
            }
            stage = (Stage) listIterator.previous();
        } while (!(stage instanceof SortStage));
        return AbstractC6302j.m12094E(((SortStage) stage).getOrders());
    }

    public static final String getPipelineCollection(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        if (getPipelineSourceType(pipeline) != PipelineSourceType.COLLECTION) {
            return null;
        }
        Assert.hardAssert(!pipeline.getStages$com_google_firebase_firebase_firestore().isEmpty(), "Pipeline source is Collection but stages are empty.", new Object[0]);
        Stage stage = (Stage) AbstractC6305m.m12116x(pipeline.getStages$com_google_firebase_firebase_firestore());
        if (stage instanceof CollectionSource) {
            return ((CollectionSource) stage).getPath$com_google_firebase_firebase_firestore().canonicalString();
        }
        return null;
    }

    public static final String getPipelineCollectionGroup(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        if (getPipelineSourceType(pipeline) != PipelineSourceType.COLLECTION_GROUP) {
            return null;
        }
        Assert.hardAssert(!pipeline.getStages$com_google_firebase_firebase_firestore().isEmpty(), "Pipeline source is CollectionGroup but stages are empty.", new Object[0]);
        Stage stage = (Stage) AbstractC6305m.m12116x(pipeline.getStages$com_google_firebase_firebase_firestore());
        if (stage instanceof CollectionGroupSource) {
            return ((CollectionGroupSource) stage).getCollectionId();
        }
        return null;
    }

    public static final String[] getPipelineDocuments(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        if (getPipelineSourceType(pipeline) != PipelineSourceType.DOCUMENTS) {
            return null;
        }
        Assert.hardAssert(!pipeline.getStages$com_google_firebase_firebase_firestore().isEmpty(), "Pipeline source is Documents but stages are empty.", new Object[0]);
        Stage stage = (Stage) AbstractC6305m.m12116x(pipeline.getStages$com_google_firebase_firebase_firestore());
        if (!(stage instanceof DocumentsSource)) {
            return null;
        }
        ResourcePath[] documents = ((DocumentsSource) stage).getDocuments();
        ArrayList arrayList = new ArrayList(documents.length);
        for (ResourcePath resourcePath : documents) {
            arrayList.add(resourcePath.canonicalString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final PipelineFlavor getPipelineFlavor(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        return PipelineFlavor.EXACT;
    }

    public static final PipelineSourceType getPipelineSourceType(RealtimePipeline pipeline) {
        AbstractC6452k.m12181e(pipeline, "pipeline");
        Assert.hardAssert(!pipeline.getStages$com_google_firebase_firebase_firestore().isEmpty(), "Pipeline must have at least one stage to determine its source.", new Object[0]);
        Stage stage = (Stage) AbstractC6305m.m12116x(pipeline.getStages$com_google_firebase_firebase_firestore());
        if (stage instanceof CollectionSource) {
            return PipelineSourceType.COLLECTION;
        }
        if (stage instanceof CollectionGroupSource) {
            return PipelineSourceType.COLLECTION_GROUP;
        }
        if (stage instanceof DatabaseSource) {
            return PipelineSourceType.DATABASE;
        }
        return stage instanceof DocumentsSource ? PipelineSourceType.DOCUMENTS : PipelineSourceType.UNKNOWN;
    }
}
