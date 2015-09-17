package org.nd4j.benchmark.iamax;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.impl.accum.IAMax;
import org.nd4j.linalg.benchmark.api.OpRunner;
import org.nd4j.linalg.factory.Nd4j;

/**
 * @author Adam Gibson
 */
public class IamaxOpRunner implements OpRunner {
    INDArray arr;

    public IamaxOpRunner() {
        Nd4j.factory().setOrder('f');
        arr = Nd4j.create(12000,12000);
    }

    @Override
    public void runOp() {
        //Nd4j.getBlasWrapper().iamax(arr);
        Nd4j.getExecutioner().exec(new IAMax(arr));
    }



}
