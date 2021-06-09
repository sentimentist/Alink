package com.alibaba.alink.pipeline.dataproc;

import org.apache.flink.ml.api.misc.param.Params;

import com.alibaba.alink.operator.batch.BatchOperator;
import com.alibaba.alink.operator.common.dataproc.AggLookupModelMapper;
import com.alibaba.alink.params.dataproc.AggLookupParams;
import com.alibaba.alink.pipeline.MapModel;

/**
 * model for VectorMatch.
 */
public class AggLookup extends MapModel <AggLookup>
	implements AggLookupParams <AggLookup> {

	public AggLookup(Params params) {
		super(AggLookupModelMapper::new, params);
	}

	public BatchOperator <?> getVectors() {
		return this.getModelData();
	}
}
