# nd4j-benchmark


This is a dedicated project for running nd4j benchmarks.

Run:
   
org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp -n YOUR NUMBER OF TRIALS -r csv of fully qualfied path of trials you want to run (eg: org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp)

A Gemm example (already baked in to the nd4j-perf module):

    java -cp lib/* org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp -n 10k -r org.nd4j.linalg.benchmark.gemm.GemmBenchmarkPerformer,org.nd4j.linalg.benchmark.gemm.GemmBenchmarkPerformer

Notice I specify gemm twice (this is just to demonstrate how you would run multiple classes)

You can also run this in intellij with an app configuration:
https://www.jetbrains.com/idea/help/creating-and-editing-run-debug-configurations.html

Specify org.nd4j.linalg.benchmark.app.BenchmarkRunnerApp as the main class

and your arguments in program arguments.

If you need more heap space (in your VM arguments) put:

-XmxMAX_HEAP_SPACE -XmsMINHEAP_SPACE

-Xmx2g -Xms2g


If you leave -r off, it will run every benchmark on the class path

To run particular backends just include them in your pom (the default right now for this is jcublas vs jblas)



