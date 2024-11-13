# Spark
## Github references :
https://github.com/backstreetbrogrammer/11_JavaSpark

## Chat GPT ref
### Apache Spark Working, its architecture, Action Filters , RDD : 
https://chatgpt.com/c/672ee643-75f4-8004-93e4-1a482d97f862


## Spark Over HDFS:
MapReduce requires files to be stored only in HDFS, while Spark can work on 
data stored in a variety of formats like HDFS, AWS S3, Cassandra, HBase etc.

Spark can perform operations up to 100X faster than MapReduce as MapReduce
wrights data in disk after and Spark wrights in Memory , Spark writes data 
on disk when memory is full

## Internal Working of spark
![SparkInternals.png](..%2F..%2F..%2F..%2F..%2FDownloads%2FSparkInternals.png)

STEP 1: The client submits spark user application code. When an application code is submitted, the driver implicitly converts user code that contains transformations and actions into a logically directed acyclic graph called DAG. At this stage, it also performs optimizations such as pipelining transformations.

STEP 2: After that, it converts the logical graph called DAG into physical execution plan with many stages. After converting into a physical execution plan, it creates physical execution units called tasks under each stage. Then the tasks are bundled and sent to the cluster.

STEP 3: Now the driver talks to the cluster manager and negotiates the resources. Cluster manager launches executors in worker nodes on behalf of the driver. At this point, the driver will send the tasks to the executors based on data placement. When executors start, they register themselves with drivers. So, the driver will have a complete view of executors that are executing the task.

STEP 4: During the course of execution of tasks, driver program will monitor the set of executors that runs. Driver node also schedules future tasks based on data placement.


## RDD stands for:

* Resilient: Fault tolerant and is capable of rebuilding data on failure
* Distributed: Distributed data among the multiple nodes in a cluster
* Dataset: Collection of partitioned data with values

## Transformation : 
Spark RDD transformation is a function that produces new RDD from the existing RDDs.

We can divide transformations into two types as below:

### Narrow Transformations : 
We apply narrow transformations on to a single partition of the parent RDD to generate a new RDD as data required to process the RDD is available on a single partition of the parent RDD. The examples for narrow transformations are:

1. map()
2. filter()
3. flatMap()
4. partition()
5. mapPartitions()

### Wide Transformations: 
We apply the wide transformation on multiple partitions to generate a new RDD.

1. reduceBy()
2. union()